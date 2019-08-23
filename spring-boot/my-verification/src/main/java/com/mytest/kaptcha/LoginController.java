package com.mytest.kaptcha;

/**
 * 登录入口
 *
 * @param username 用户名
 * @param password 密码
 * @param code     验证码
 * @param response 回调json数据 成功返回200，失败返回500
 */

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.time.ZoneId;


@RestController
@RequestMapping("/login")
class LoginController {


    @ApiOperation("生成验证码")
    @GetMapping("/getCode")
    public void getCode(HttpServletResponse response, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        //利用图片工具生成图片
        //第一个参数是生成的验证码，第二个参数是生成的图片
        Object[] objs = VerifyUtil.createImage();
        //将验证码存入Session
        session.setAttribute("imageCode", objs[0]);

        //将图片输出给浏览器
        BufferedImage image = (BufferedImage) objs[1];
        response.setContentType("image/png");
        OutputStream os = response.getOutputStream();
        ImageIO.write(image, "png", os);
    }

    @ApiOperation("生成验证码2")
    @RequestMapping(value = "/getImage", method = RequestMethod.GET)
    public void authImage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        // 生成随机字串
        String verifyCode = VerifyUtil.generateVerifyCode(4);
        // 存入会话session
        HttpSession session = request.getSession(true);
        // 删除以前的
        session.removeAttribute("verCode");
        session.removeAttribute("codeTime");
        session.setAttribute("verCode", verifyCode.toLowerCase());
        session.setAttribute("codeTime", LocalDateTime.now());
        // 生成图片
        int w = 100, h = 30;
        OutputStream out = response.getOutputStream();
        VerifyUtil.outputImage(w, h, out, verifyCode);
    }

    @ApiOperation("校验验证码2")
    @RequestMapping(value = "validImage", method = RequestMethod.GET)
    public String validImage(HttpServletRequest request, HttpSession session) {
        String code = request.getParameter("code");
        Object verCode = session.getAttribute("verCode");
        if (null == verCode) {
            request.setAttribute("errmsg", "验证码已失效，请重新输入");
            return "验证码已失效，请重新输入";
        }
        String verCodeStr = verCode.toString();
        LocalDateTime localDateTime = (LocalDateTime) session.getAttribute("codeTime");
        long past = localDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        long now = LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        if (verCodeStr == null || code == null || code.isEmpty() || !verCodeStr.equalsIgnoreCase(code)) {
            request.setAttribute("errmsg", "验证码错误");
            return "验证码错误";
        } else if ((now - past) / 1000 / 60 > 5) {
            request.setAttribute("errmsg", "验证码已过期，重新获取");
            return "验证码已过期，重新获取";
        } else {
            //验证成功，删除存储的验证码
            session.removeAttribute("verCode");
            return "200";
        }
    }

    @RequestMapping(value="/authImage",method=RequestMethod.GET)
    public String authImage(){
        return "authImage";
    }

}
