package com.cn.hx.wwj.web.pooh.module.util.wwjUtil;

import java.util.UUID;

/**
 * 获取UUID
 */
public class MyUUID {
    public static String[] chars = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
            "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
            "U", "V", "W", "X", "Y", "Z" };
        //生成8位的UUID
    public static String getUUID(){
        //return UUID.randomUUID().toString().replace("-", "").trim();
        StringBuffer shortBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            shortBuffer.append(chars[x % 0x3E]);
        }
        return shortBuffer.toString();
    }
    public static String getUUID32(){
        return UUID.randomUUID().toString().replace("-", "").trim();
    }

    public static String createSessionId() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }

    public static void main(String[] args) {

        System.out.println(createSessionId());
        System.out.println(getUUID32());

    }
}
