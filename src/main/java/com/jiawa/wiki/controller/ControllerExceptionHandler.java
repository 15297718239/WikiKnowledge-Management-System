package com.jiawa.wiki.controller;

import com.jiawa.wiki.resp.CommonResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 统一异常处理、数据预处理等
 *
 * @author yangtengyu
 */
@RestControllerAdvice
public class ControllerExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(ControllerExceptionHandler.class);

    /**
     * 参数校验 -> 异常统一处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public CommonResp validExceptionHandler(BindException e) {
        CommonResp commonResp = new CommonResp();
        LOG.warn("参数校验失败：{}", e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
        commonResp.setSuccess(false);
        commonResp.setMessage(e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
        return commonResp;
    }

    /**
     * 校验异常统一处理
     * @param e
     * @return
     */
//    @ExceptionHandler(value = BusinessException.class)
//    public CommonResp validExceptionHandler(BusinessException e) {
//        CommonResp commonResp = new CommonResp();
//        LOG.warn("业务异常：{}", e.getCode().getDesc());
//        commonResp.setSuccess(false);
//        commonResp.setMessage(e.getCode().getDesc());
//        return commonResp;
//    }

    /**
     * 校验异常统一处理
     * @param e
     * @return
     */
//    @ExceptionHandler(value = Exception.class)
//    public CommonResp validExceptionHandler(Exception e) {
//        CommonResp commonResp = new CommonResp();
//        LOG.error("系统异常：", e);
//        commonResp.setSuccess(false);
//        commonResp.setMessage("系统出现异常，请联系管理员");
//        return commonResp;
//    }
}
