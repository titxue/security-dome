package com.titxu.auth.authentication.domain.service.impl;

import com.titxu.auth.authentication.domain.client.LoginCmd;
import com.titxu.auth.authentication.domain.service.ILoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 应用模块名称: LoginServiceImpl
 *
 * @author lxue
 * @version 1.0
 * @since 2022/8/31 15:37
 */
@Service
@Slf4j
public class LoginServiceImpl implements ILoginService {

    @Override
    public String login(LoginCmd loginCmd) {
        return null;
    }
}
