package com.nbcb.design.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CoffeineBeverageWithHook {

    public void brew(){
        System.out.println("Dripping Coffee through filter");
    }


    public void addCondiments(){
        System.out.println("Add some Sugar and Milk!");
    }

    /**
     * �Ƿ���Ӷ����������ж���
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
     * �����û��������ݣ����ؽ��
     * @return
     */
    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like add milk and sugar to your coffee: (y/n)?");
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
