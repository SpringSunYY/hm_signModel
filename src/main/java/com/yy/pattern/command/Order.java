package com.yy.pattern.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @Project: design_patterns
 * @Package: com.yy.pattern.command
 * @Author: YY
 * @CreateTime: 2024-09-30  15:43
 * @Description: Order
 * @Version: 1.0
 */
public class Order {
    // 餐桌号码
    private int diningTable;

    // 用来存储餐名并记录份数
    private Map<String, Integer> foodDic = new HashMap<String, Integer>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDic() {
        return foodDic;
    }

    public void setFoodDic(String name, int num) {
        foodDic.put(name,num);
    }
}
