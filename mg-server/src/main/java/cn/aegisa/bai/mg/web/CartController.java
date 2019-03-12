package cn.aegisa.bai.mg.web;

import cn.aegisa.bai.mg.interceptor.UserContext;
import cn.aegisa.bai.mg.vo.common.ApiResponse;
import cn.aegisa.bai.mg.vo.user.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author daegis@yeah.net
 * @serial
 * @since 2019-02-26 14:10
 */
@Controller
@Slf4j
@RequestMapping("/cart")
public class CartController {

    @RequestMapping("/list")
    @ResponseBody
    public ApiResponse getCartList() {
        UserInfo user = UserContext.getUser();
        if (user == null) {
            return ApiResponse.fail("用户未登录");
        }
        return ApiResponse.success("pending");
    }
}
