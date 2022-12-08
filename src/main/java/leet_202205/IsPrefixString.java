package leet_202205;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author wanys
 * @Date 2022/5/20 8:38 PM
 * @Version 1.0
 **/
public class IsPrefixString {
    public boolean isPrefixString(String s, String[] words) {
        String wordPre="";
       for(String str:words){
           wordPre+=str;
           if(s.equals(wordPre))
               return true;
           if(wordPre.length()>s.length())
               return false;
       }
       return false;

    }
}
