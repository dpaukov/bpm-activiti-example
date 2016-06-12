package org.paukov.service;

import org.springframework.stereotype.Service;

@Service
public class StringService {

    public String method1(String userName) {
    	String result = "Method1..." + userName;
        System.out.println(result);
        return result;
    }

    public void method2(String var) {
        System.out.println("Method2 ... " + var);
    }

    public void method3(String var) {
        System.out.println("Method3 ..." + var);
    }
}
