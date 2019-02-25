package cn.aegisa.bai.mg.vo.base;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 2019/2/23 18:44
 */
@Data
public class IndexInfo {
    private Map<String, Object> items = new HashMap<>();
    private List<Object> newest = new ArrayList<>();
    private List<Object> best = new ArrayList<>();
}
