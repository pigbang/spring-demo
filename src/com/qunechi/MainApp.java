package com.qunechi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by bond on 2018/8/9.
 */
public class MainApp {

    @Autowired
    Preson preson;


    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        TextEditor obj = (TextEditor) context.getBean("textEditor");
//        obj.spellChecker();
        preson.getName();
    }
}
