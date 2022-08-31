package com.titxu.auth.authentication.domain.client.enums;

import org.springframework.http.HttpStatus;


/**
 * @author lxue
 */
public interface IBaseCode {
    /**
     * 获取操作吗
     * @return code
     */
    int getCode();

    /**
     * 获取操作结果信息
     * @return massage
     */
    String getMessage();

    /**
     * 获取HTTP状态码
     * @return 空
     */
    default HttpStatus getHttpStatus(){
        return null;
    }
}