package cn.aegisa.bai.mg.interceptor;

import cn.aegisa.bai.mg.vo.user.UserInfo;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author xianyingda@guazi.com
 * @serial
 * @since 2019-01-11 17:13
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserContext {
    private static ThreadLocal<UserInfo> userPool = new ThreadLocal<>();

    public static void setUser(UserInfo user) {
        userPool.set(user);
    }

    public static UserInfo getUser() {
        return userPool.get();
    }

    public static void finish() {
        userPool.remove();
    }
}
