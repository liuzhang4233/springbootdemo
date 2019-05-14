package demo.test.math;

import java.util.HashSet;
import java.util.Set;

//去除重复字符
public class Distants {

    public static void main(String[] args) {
        String s = "alsjdjpwelesd";
        Set set = new HashSet();
        for (int i = 0; i < s.length(); i++) {
            if(set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
        }
    }
}
