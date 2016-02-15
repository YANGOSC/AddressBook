package com.hpe.yanliu.addressbook;

/**
 * 将获取的手机通讯录封装起来
 */
public class PhoneInfo {
    private String name;
    //number是String类型是因为会有地区之分，+86
    private String number;
    //构造函数
    public PhoneInfo(String name,String number){
        setName(name);
        setNumber(number);
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getNumber() {

        return number;
    }

    public String getName() {

        return name;
    }
}
