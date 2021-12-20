package com.fx.cglib;

import lombok.Data;

/**
 * @author Administrator
 */
@Data
public class UserDao {


    public String getName(String name) {
        System.out.println(name);
        return name;
    }


}
