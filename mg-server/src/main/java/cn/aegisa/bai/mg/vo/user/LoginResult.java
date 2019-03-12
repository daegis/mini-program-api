package cn.aegisa.bai.mg.vo.user;

import lombok.Data;

/**
 * @author daegis@yeah.net
 * @serial
 * @since 2019-02-26 14:37
 */
@Data
public class LoginResult {
    private boolean success;
    private String token;
    private Integer userId;
}
