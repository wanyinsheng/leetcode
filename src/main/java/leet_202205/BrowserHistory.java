package leet_202205;

/**
 * 1472. 设计浏览器历史记录
 * @Author wanys
 * @Date 2022/5/22 12:30 PM
 * @Version 1.0
 **/
public class BrowserHistory {
    int curr=-1;//未初始化首页
    String[] browse=new String[101];
    int end=0;//下一个将要访问的索引
    public BrowserHistory(String homepage) {
        curr++;
        browse[curr]=homepage;//首页之后curr就成了0
        end=curr;


    }

    public void visit(String url) {
        browse[curr++]=url;
        end++;
    }

    public String back(int steps) {
        curr=curr>steps?curr-steps:0;//最多只能回退到首页
        return browse[curr];
    }

    public String forward(int steps) {
        curr=curr+steps<end?curr+steps:end;
        return browse[curr];
    }

}
