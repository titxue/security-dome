package com.titxu.auth.authentication.domain.service;

import com.titxu.auth.authentication.domain.client.LoginCmd;

/**
 * 应用模块名称: LoginService
 *
 * @author lxue
 * @version 1.0
 * @since 2022/8/31 15:36
 */
public interface ILoginService {

    String login(LoginCmd loginCmd);
}
