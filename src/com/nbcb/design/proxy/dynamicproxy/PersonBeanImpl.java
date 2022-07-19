package com.nbcb.design.proxy.dynamicproxy;

public class PersonBeanImpl implements PersonBean {

    private String name;
    private String gender;
    private String interests;
    private int rating;
    private int ratingCount = 0;

    public PersonBeanImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getGender() {
        return this.gender;
    }

    @Override
    public String getInterests() {
        return this.interests;
    }

    /**
     * 获取本人的平均分
     * @return
     */
    @Override
    public int getHotOrNotRating() {
        if(ratingCount == 0){
            return 0;
        }
        return rating / ratingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    /**
     * 增加评分
     * @param rating
     */
    @Override
    public void setHotOrNotRating(int rating) {
        this.rating +=rating;
        this.ratingCount++;
    }
}
