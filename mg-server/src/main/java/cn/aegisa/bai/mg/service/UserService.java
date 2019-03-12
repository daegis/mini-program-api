package cn.aegisa.bai.mg.service;

import cn.aegisa.bai.mg.vo.user.LoginResult;

/**
 * @author daegis@yeah.net
 * @serial
 * @since 2019-02-26 14:35
 */
public interface UserService {
    LoginResult doLogin(String code);
}
