package com.example.demo.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数字号码按键输出字母
 *
 * @author luzy
 * @date 20/10/19 18:17
 */
public class LetterCombination {

    private final static String[] DICT = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> run(String digits) {
        List<String> returnList = new ArrayList<>();
        if (digits.trim().length() == 0){
            return returnList;
        }
        String[] numberArr = digits.split("");
        for (int i = 0; i < numberArr.length; i++) {
            //单次处理的数字
            Integer number = Integer.parseInt(numberArr[i]);
            List<String> temp = new ArrayList<>();
            //该数字的字母数组
            String[] wordArr = DICT[number].split("");
            if (returnList.size() == 0) {
                //处理第一次放入
                temp.addAll(Arrays.asList(wordArr));
            }else{
                //让之前存入的字母组与该次数组组合
                for (String str : returnList){
                    for (String s1 : wordArr){
                        temp.add(str + s1);
                    }
                }
            }//if else end
            returnList = temp;
        }
        return returnList;
    }
}
