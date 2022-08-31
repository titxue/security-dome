package com.titxu.auth.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author lxue
 * @version 1.0
 * @className JwtProperties
 * @description TODO
 * @date 2022/8/29 16:17
 */
@Component
@ConfigurationProperties(prefix = "user")
public class ManageProperties {
    private String username;
    private String password;
}
