package com.titxu.auth.authentication.domain.client.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * @author lxue
 */

@AllArgsConstructor
@Getter
public enum  LoginCode  implements IBaseCode {

    /**
     *
     */
    CHECK_ERROR(1000, "检验不通过", HttpStatus.UNAUTHORIZED),
    ;
    private final int code;
    private final String message;
    private final HttpStatus httpStatus;
}