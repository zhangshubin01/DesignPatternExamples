package com.padtast.designpatternexamples.single_case;



/**
 * 单例模式
 * Created by zhangshubin on 2018/3/20.
 */

public class Singleton {

    /**
     * volatile解释
     * http://blog.sina.com.cn/s/blog_4e1e357d0101i486.html
     *
     */
    private static volatile Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    public static volatile String HOME = "http://carcsms.zuche.com/";
    public static volatile String HOME_PATH = HOME + "carcsms/";
    /**
     * 取车数据验证接口
     */
    public static volatile String TAKECAR_PARA_VALIDATE_PATH = HOME_PATH + "pad_pickup/takecarParaValidate";

     public static void test(){
         Singleton.HOME = "sdsd";
         System.out.print(Singleton.TAKECAR_PARA_VALIDATE_PATH);
     }

}