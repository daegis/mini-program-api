package cn.aegisa.bai.mg.web;

import cn.aegisa.bai.mg.service.UserService;
import cn.aegisa.bai.mg.vo.common.ApiResponse;
import cn.aegisa.bai.mg.vo.user.LoginResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author daegis@yeah.net
 * @serial
 * @since 2019-02-26 14:05
 */
@Controller
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public Object doLogin(HttpServletRequest request) {
        String code = request.getParameter("code");
        LoginResult result = userService.doLogin(code);
        if (result.isSuccess()) {
            return ApiResponse.success(result);
        }
        return ApiResponse.fail("登录失败");
    }
}
