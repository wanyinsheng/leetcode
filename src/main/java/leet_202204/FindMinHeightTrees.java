package leet_202204;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * 310. 最小高度树
 * @Author wanys
 * @Date 2022/4/6 2:40 PM
 * @Version 1.0
 **/
public class FindMinHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {

        List<Integer> ans = new ArrayList<Integer>();

        return ans;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/yinshengwan/Documents/ws/hadoop-22/leetcode/target/classes/leet_202204/tt.properties");
        //System.out.println(file);
        System.out.println(new FindMinHeightTrees().tt());;

    }
    public String tt() throws IOException {
        System.out.println(this.getClass().getClassLoader());
        URL resource = this.getClass().getClassLoader().getResource("tt.properties");
        InputStream inputStream = resource.openStream();
        InputStream inStream1 = this.getClass().getClassLoader().getResourceAsStream("tt.properties");

        System.out.println(inStream1);
        Properties pro=new Properties();

        //String path = FindMinHeightTrees.class.getResource("").getPath()   + "leet_202204/tt.properties";
      //  System.out.println(path);
       // InputStream inStream = new FileInputStream(new File(path));
       // System.out.println(inStream);
       // URL url = new URL(path);
      //  InputStream inStream11 = url.openStream();

       pro.load(inputStream);


        return pro.getProperty("aa");

    }
}
