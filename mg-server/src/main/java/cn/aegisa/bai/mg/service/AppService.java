package cn.aegisa.bai.mg.service;

import cn.aegisa.bai.mg.vo.base.AppBase;
import cn.aegisa.bai.mg.vo.base.IndexInfo;

/**
 * @author daegis@yeah.net
 * @serial
 * @since 2019-02-27 19:20
 */
public interface AppService {
    IndexInfo getAppIndexInfo();

    AppBase getAppBaseInfo();
}
