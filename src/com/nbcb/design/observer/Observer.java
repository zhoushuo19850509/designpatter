package com.nbcb.design.observer;

/**
 * �۲��� ����ӿ�
 */
public interface Observer {

    /**
     * ���󷽷�1 ����
     * ���²��������¶ȡ�ʪ�ȡ�ѹǿ
     */
    public void update(float temp,
                       float humidity,
                       float pressure);
}
