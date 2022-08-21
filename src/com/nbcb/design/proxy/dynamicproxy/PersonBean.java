package com.nbcb.design.proxy.dynamicproxy;

/**
 *
 */
public interface PersonBean {

    String getName();
    String getGender();
    String getInterests();

    /**
     * 获取本人的平均分
     * @return
     */
    int getHotOrNotRating();

    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setHotOrNotRating(int rating);


}
