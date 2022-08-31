package com.titxu.auth.authentication.domain.models.entity;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import com.titxu.auth.authentication.domain.client.enums.LoginCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 应用模块名称: LoginEntity
 * @author lxue
 * @version 1.0
 * @since 2022/8/31 15:29
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LoginEntity extends BaseEntity{
    private String username;
    private String password;

    /**
     * 盐
     */
    private String salt;

    /**
     * 加密算法
     */
    private EncryptionAlgorithmV encryptionAlgorithmV;

    /**
     * 校验密码
     * @param pwd 需要验证的密码
     * todo 暂时只有验证密码,后期可扩展
     *            次数限制
     *           达标错误锁定账号
     */
    public void login(String pwd){
        boolean isCheck = StrUtil.equals(password, encryptionAlgorithmV.getPasswordEncoder().encoder(pwd, salt));
        if (!isCheck) {
            throw new ServiceException(LoginCode.CHECK_ERROR);
        }

    }

    /**
     * 密码加密
     */
    public void encryptPassword() {
        this.setSalt(RandomUtil.randomString(8));
        this.setPassword(encryptionAlgorithmV.getPasswordEncoder().encoder(password, salt));
    }



}
