package com.myfirstproject.Practice;

import com.github.javafaker.Faker;
import org.junit.Test;

public class Homework08 {
    @Test
    public void fake(){
        Faker fake =new Faker();
       String zero= fake.name().firstName();
        System.out.println(zero);
       String one= fake.name().fullName();
        System.out.println(one);
        String phone=fake.phoneNumber().cellPhone();
        String address=fake.address().buildingNumber();
        System.out.println(phone);

    }


}