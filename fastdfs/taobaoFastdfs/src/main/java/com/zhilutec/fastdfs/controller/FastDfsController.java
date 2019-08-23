package com.zhilutec.fastdfs.controller;


import com.alibaba.fastjson.JSONObject;
import com.github.tobato.fastdfs.domain.FileInfo;
import com.zhilutec.fastdfs.service.IFastDFSClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.List;


@RestController
@RequestMapping("/fdfs/")
public class FastDfsController {
    @Autowired
    private IFastDFSClientService dfsClient;

    // Logger log = Logger.getLogger(FastDfsController.class);

    // 上传文件
    @RequestMapping(value = "upload", method = RequestMethod.POST)
    public String upload(MultipartHttpServletRequest requestFile) throws Exception {
        try {
            JSONObject rsJson=new JSONObject();
            List<MultipartFile> files = requestFile.getFiles("file");
            for (MultipartFile file : files) {
                String fileUrl = dfsClient.uploadFile(file);
                System.out.println(fileUrl);
                rsJson.put("ok",fileUrl);
            }
            return rsJson.toJSONString();
        } catch (Exception e) {
            e.printStackTrace();
            return "failed";
        }
    }


    @RequestMapping(value = "info", method = RequestMethod.POST)
    public String info(@RequestBody JSONObject jsonObject) throws Exception {
        try {
            JSONObject rsJson=new JSONObject();
            System.out.println(jsonObject);
            String group = jsonObject.getString("groupName");
            String path = jsonObject.getString("path");
            FileInfo fileInfo = dfsClient.getFileInfo(group, path);
            rsJson.put("ok",fileInfo);
            System.out.println(fileInfo);
            return rsJson.toJSONString();
        } catch (Exception e) {
            e.printStackTrace();
            return "failed";
        }
    }
}
