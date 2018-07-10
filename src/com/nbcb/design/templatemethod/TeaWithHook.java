package com.nbcb.design.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CoffeineBeverageWithHook {

    public void brew(){
        System.out.println("Steeping the tea");
    }


    public void addCondiments(){
        System.out.println("Add Lemon!");
    }


    /**
     * 是否添加东西在子类中定义
     * @return
     */
    public boolean customerWantsCondiments(){

        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else{
            return false;
        }

    }

    /**
     * 根据用户输入内容，返回结果
     * @return
     */
    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like add lemon to your tea: (y/n)?");
        BufferedReader in = new BufferedReader((new InputStreamReader(System.in)));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO error reading you input!");
        }
        if(answer == null){
            return "no";
        }
        return answer;
    }
}
