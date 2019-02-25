package cn.aegisa.bai.mg.vo.common;

import lombok.Data;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 2019/2/22 23:05
 */
@Data
public class ApiResponse {
    private Integer code;
    private String msg;
    private Object data;

    public static ApiResponse success(Object data) {
        ApiResponse response = new ApiResponse();
        response.setCode(1);
        response.setMsg("success");
        response.setData(data);
        return response;
    }

    public static ApiResponse fail(String msg) {
        ApiResponse response = new ApiResponse();
        response.setCode(-1);
        response.setMsg(msg);
        return response;
    }
}
