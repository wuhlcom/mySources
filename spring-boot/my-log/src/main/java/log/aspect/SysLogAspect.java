package log.aspect;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//



        import cn.hutool.json.JSONUtil;
        import com.google.common.collect.Maps;
        import com.zhilutec.fc.common.core.constant.CommonConstants;
        import com.zhilutec.fc.common.core.util.R;
        import com.zhilutec.fc.common.log.annotation.SysLog;
        import com.zhilutec.fc.common.log.event.SysLogEvent;
        import com.zhilutec.fc.common.log.util.SysLogUtils;
        import java.io.Serializable;
        import java.util.Map;
        import org.apache.commons.lang.StringUtils;
        import org.aspectj.lang.ProceedingJoinPoint;
        import org.aspectj.lang.annotation.Around;
        import org.aspectj.lang.annotation.Aspect;
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.springframework.context.ApplicationEventPublisher;
        import org.springframework.web.multipart.MultipartFile;

@Aspect
public class SysLogAspect {
    private static final Logger log = LoggerFactory.getLogger(SysLogAspect.class);
    private final ApplicationEventPublisher publisher;

    @Around("@annotation(sysLog)")
    public Object around(ProceedingJoinPoint point, SysLog sysLog) {
        try {
            String strClassName = point.getTarget().getClass().getName();
            String strMethodName = point.getSignature().getName();
            log.debug("[Class name]:{},[method]:{}", strClassName, strMethodName);
            com.zhilutec.fc.admin.api.entity.SysLog logVo = SysLogUtils.getSysLog();
            logVo.setTitle(sysLog.value());
            MultipartFile multipartFile;
            if (point.getArgs().length > 0) {
                Object arg = point.getArgs()[0];
                if (arg instanceof MultipartFile) {
                    multipartFile = (MultipartFile)((MultipartFile)point.getArgs()[0]);
                    Map<String, Object> fileMap = Maps.newHashMap();
                    fileMap.put("contentType", multipartFile.getContentType());
                    fileMap.put("name", multipartFile.getName());
                    fileMap.put("originalFilename", multipartFile.getOriginalFilename());
                    fileMap.put("size", multipartFile.getSize());
                    logVo.setParams((!StringUtils.isEmpty(logVo.getParams()) ? logVo.getParams() + "; " : "") + JSONUtil.toJsonStr(fileMap));
                } else if (arg instanceof Serializable) {
                    logVo.setParams((!StringUtils.isEmpty(logVo.getParams()) ? logVo.getParams() + "; " : "") + JSONUtil.toJsonStr(arg));
                }
            }

            Long startTime = System.currentTimeMillis();
            multipartFile = null;
            boolean var14 = false;

            Object obj;
            Long endTime;
            label134: {
                try {
                    var14 = true;
                    obj = point.proceed();
                    if (null != obj) {
                        if (obj instanceof Serializable) {
                            logVo.setResult(JSONUtil.toJsonStr(obj));
                            if (obj instanceof R) {
                                if (((R)obj).getCode() == CommonConstants.FAIL.intValue()) {
                                    logVo.setType("1");
                                    logVo.setException(((R)obj).getMsg());
                                    var14 = false;
                                } else {
                                    var14 = false;
                                }
                            } else {
                                var14 = false;
                            }
                        } else {
                            var14 = false;
                        }
                    } else {
                        var14 = false;
                    }
                    break label134;
                } catch (Exception var15) {
                    log.error("服务器出错了，请联系管理员..." + var15.getMessage(), var15);
                    logVo.setType("1");
                    logVo.setException(var15.getClass().getName() + " : " + (var15.getCause() != null ? var15.getCause().getMessage() : var15.getMessage()));
                    obj = R.fail("服务器出错了，请联系管理员...");
                    logVo.setResult(JSONUtil.toJsonStr(obj));
                    var14 = false;
                } finally {
                    if (var14) {
                        Long endTime = System.currentTimeMillis();
                        logVo.setTime(endTime.longValue() - startTime.longValue());
                        this.publisher.publishEvent(new SysLogEvent(logVo));
                    }
                }

                endTime = System.currentTimeMillis();
                logVo.setTime(endTime.longValue() - startTime.longValue());
                this.publisher.publishEvent(new SysLogEvent(logVo));
                return obj;
            }

            endTime = System.currentTimeMillis();
            logVo.setTime(endTime.longValue() - startTime.longValue());
            this.publisher.publishEvent(new SysLogEvent(logVo));
            return obj;
        } catch (Throwable var17) {
            throw var17;
        }
    }

    public SysLogAspect(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }
}
