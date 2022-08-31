package com.titxu.auth.authentication.domain.models.repository;

import com.titxu.auth.authentication.domain.models.entity.LoginEntity;

import java.util.Optional;

/**
 * 应用模块名称: LoginUserRepository
 *
 * @author lxue
 * @version 1.0
 * @since 2022/8/31 16:53
 */
public interface LoginUserRepository {
    /**
     * 通过用户名查找登陆用户
     * @param username 用户名
     * @return LoginEntity 登陆用户
     */
    Optional<LoginEntity> findByUsername(String username);
}
