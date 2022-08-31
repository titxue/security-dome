package com.titxu.auth.authentication.domain.client;

import com.titxu.auth.authentication.domain.client.enums.EncryptionAlgorithmEnum;
import com.titxu.auth.authentication.domain.models.entity.BaseEntity;
import lombok.Data;

/**
 * 应用模块名称: UserCmd
 *
 * @author lxue
 * @version 1.0
 * @since 2022/8/31 15:40
 */
@Data
public class LoginCmd extends BaseEntity {

    private String username;
    private String password;

    /**
     * 盐
     */
    private String salt;

    /**
     * 加密算法
     */
    private EncryptionAlgorithmEnum encryptionAlgorithmEnum;
}
