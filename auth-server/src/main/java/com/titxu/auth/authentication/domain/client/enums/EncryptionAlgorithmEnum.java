package com.titxu.auth.authentication.domain.client.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author lxue
 */

@AllArgsConstructor
@Getter
public enum EncryptionAlgorithmEnum {
    /**
     *
     */
    MD5(0, "MD5"),;

    private int code;
    private String value;
}