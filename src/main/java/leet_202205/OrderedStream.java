package leet_202205;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author wanys
 * @Date 2022/5/22 12:10 PM
 * @Version 1.0
 **/
public class OrderedStream {

    int ptr = 1;
    String[] os;

    public OrderedStream(int n) {
        os = new String[n + 1];

    }

    public List<String> insert(int idKey, String value) {
        os[idKey] = value;
        LinkedList<String> list = new LinkedList<String>();
        while (ptr < os.length && os[ptr] != null) {
            list.add(os[ptr]);
            ptr++;
        }
        return list;

    }

}
