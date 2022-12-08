package leet_202205;

import java.util.List;

/**
 * 1773. 统计匹配检索规则的物品数量
 * @Author wanys
 * @Date 2022/5/21 1:48 PM
 * @Version 1.0
 **/
public class CountMatches {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(List<String> item:items){
            String typeName=item.get(0);
            String colorName=item.get(1);
            String name=item.get(2);
            if(ruleKey.equals("type")&&ruleValue.equals(typeName)){//类型
                count++;
            }else if(ruleKey.equals("color")&&ruleValue.equals(colorName)){//颜色
                count++;
            }else if(ruleKey.equals("name")&&ruleValue.equals(name)){//名字
                count++;
            }

        }
        return count;
    }

}
