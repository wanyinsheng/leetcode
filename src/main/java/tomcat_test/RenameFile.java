package tomcat_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @Author wanys
 * @Date 2023/1/6 07:13
 * @Version 1.0
 **/
public class RenameFile {
    public static void main(String[] args) throws FileNotFoundException {
        File directory = new File("/Users/yinshengwan/Documents/ws/leetcode/src/main/java/tomcat_test/2022");

        if(directory.isDirectory()){
            File[] files = directory.listFiles();


            System.out.println(files.length);
            for(File file : files){
                System.out.println(file.getName());
                //System.out.println(file.getName().lastIndexOf("."));
                String newFileName=file.getName().substring(file.getName().lastIndexOf(".")-4,file.getName().lastIndexOf("."))+file.getName().substring(0,file.getName().lastIndexOf(".")-4)+".pdf";
                file.renameTo(new File("/Users/yinshengwan/Documents/ws/leetcode/src/main/java/tomcat_test/2022/"+newFileName));
            }

        }


    }
    public static void rename(File file){
        String path=file.getAbsolutePath();
        System.out.println(path);
        if(path.indexOf(".")>=0){
            path.substring(0,path.indexOf("."));
        }

    }
}
