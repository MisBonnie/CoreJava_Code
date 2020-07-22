package com.zzxx.string;

public class Demo01Matches {
    public static void main(String[] args) {
        String str = "ssseeeww@xxx.com.cn.edu.cc";
        // \w{6,18}@\w{3,8}(\.\w{2,6})+
        String regex = "^\\w{6,18}@\\w{3,8}(\\.\\w{2,6})+$";
        boolean m = str.matches(regex);
        System.out.println(m);

        String emailRegEx = "^[a-zA-Z0-9_.-]+@([a-zA-Z0-9-]+\\.)+[a-zA-Z0-9]{2,4}$";
        String email = ".-@-.aa";
        boolean m1 = email.matches(emailRegEx);
        System.out.println(m1);

        String regex2 = "\\w{4}"; // \w{4}
        String str2 = "abcdee";
        System.out.println(str2.matches(regex2));
    }
}
