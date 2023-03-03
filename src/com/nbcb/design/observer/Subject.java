package com.nbcb.design.observer;

/**
 * ���۲��� ����ӿ�
 */
public interface Subject {
    /**
     * �ӿڷ���1 ע��۲���
     */
    public void registerObserver(Observer observer);

    /**
     * �Ƴ��۲���
     */
    public void removeObserver(Observer observer);

    /**
     * ֪ͨ�۲���
     */
    public void notifyObservers();
}
