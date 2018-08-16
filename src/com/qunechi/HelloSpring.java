package com.qunechi;

/**
 * Created by bond on 2018/8/9.
 */
public class HelloSpring {
    private String message;

    public void getMessage() {
        System.out.println("Your message : " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init(){
        System.out.println("this is init method");
    }

    public void destroy(){
        System.out.println("this is destroy method");
    }
}
