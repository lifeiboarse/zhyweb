package com.binzhou.pay.utils;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class UUIDGenerator {
    public static void main(String[] args) {
        String orderNo = UUIDGenerator.getOrderNo();
        System.out.println("orderNo = [" + orderNo + "]");
    }
    public static String getOrderNo()
    {
        String orderNo="";
        String str;
        SimpleDateFormat sf=new SimpleDateFormat("yyyyMMddHHmmss");
        String date=sf.format(new Date());
        String min=date+"00001";
        String max=date+"99999";
        List<String> sList =Arrays.asList();
        if (sList.size()==0){
            str=min;
            orderNo=str;
        }else {
            String ss=(String)sList.get(sList.size()-1);
            String sss=  ss.substring(ss.length()-5,ss.length());
            int i=Integer.parseInt(sss);
            i++;
            String s = String.valueOf(i);
            str= date+numString(s);
            orderNo=str;
        }
        return orderNo;
    }
    private  static String  numString(String str){//递归生成后五位字符串
        if (str.length()==5){
            return str;
        }else{
            return numString("0"+str);
        }
    }

}
