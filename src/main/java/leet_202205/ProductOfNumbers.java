package leet_202205;

import java.util.ArrayList;
import java.util.List;

/**
 * 1352. 最后 K 个数的乘积
 * @Author wanys
 * @Date 2022/5/22 1:15 PM
 * @Version 1.0
 **/
public class ProductOfNumbers {
    private List<Integer> products;
    public ProductOfNumbers() {
        products = new ArrayList<>();
        products.add(1);

    }

    public void add(int num) {
        if(num == 0){
            products.clear();// 清空list
            products.add(1);
        } else {
            products.add(products.get(products.size() - 1) * num);
        }
    }

    public int getProduct(int k) {
        if(products.size()<=k)
            return 0;
        //因为product里边维护的就是积，除以前边第k个，就可以
        return products.get(products.size()-1)/products.get(products.size()-1-k);
    }
}
