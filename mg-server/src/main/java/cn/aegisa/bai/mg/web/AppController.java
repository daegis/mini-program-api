package cn.aegisa.bai.mg.web;

import cn.aegisa.bai.mg.service.AppService;
import cn.aegisa.bai.mg.vo.base.AppBase;
import cn.aegisa.bai.mg.vo.base.IndexInfo;
import cn.aegisa.bai.mg.vo.common.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 2019/2/22 22:53
 */
@RestController
@Slf4j
@RequestMapping("/app")
public class AppController {

    @Autowired
    private AppService appService;

    @RequestMapping("/base")
    public ApiResponse getBaseInfo() {
        AppBase base = appService.getAppBaseInfo();
        return ApiResponse.success(base);
    }

    @RequestMapping("/index")
    public ApiResponse getIndexInfo() {
        IndexInfo indexInfo = appService.getAppIndexInfo();
        return ApiResponse.success(indexInfo);
    }

}
