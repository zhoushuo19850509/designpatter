package com.nbcb.design.singleton;

/**
 * �������Ҫ��������֤ChocolateBoilder �ĵ���ģʽ�ڶ��߳��»�������
 */
public class ThreadTest {
    public static void main(String[] args){

        // �������ɸ��̣߳�ÿ���̶߳���ͨ��getInstance()��������ȡChocolateBoiler����ʵ��
        for(int i = 0 ; i < 5 ; i++){
            StartChoclateBoiler startChoclate = new StartChoclateBoiler();
            startChoclate.start();;
        }

    }
}
