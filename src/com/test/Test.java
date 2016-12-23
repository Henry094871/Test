package com.test;

import java.math.BigDecimal;
import java.util.Date;

public class Test {

    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis());
//        String time= String.valueOf(System.currentTimeMillis());
//        String urls="http://mail.163.com/dashi/activity/act10/orange/ajax/apply.do?callback=jQuery17206848681597286124_"+time+"&uid=herry094871%40163.com&type=web&from=mail&_="+time+"\"";
//        try {
//            
//            URL url=new URL(urls);
//            while(true) {
//                InputStream is= url.openStream();
//                
//                System.out.println(is.toString());
//            }
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        Date date=new Date(15800043111L);
//        System.out.println(date);
//        
//        Long l=Long.valueOf(null);
//        System.out.println(l);
        double   f   =   1.555; 
        BigDecimal   b   =   new   BigDecimal(-1); 
        System.out.println("b="+b);
        //保留2位小数
        BigDecimal c = b.setScale(1,   BigDecimal.ROUND_HALF_UP);
        Double   f1   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue(); 
        System.out.println(c);
        //f1=null;
        System.out.println(f1>1.55?true:false);
        
        
        
    }
    
    
    
}
