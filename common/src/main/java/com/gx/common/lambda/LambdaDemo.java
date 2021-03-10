package com.gx.common.lambda;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author guoxun
 */
public class LambdaDemo {

    public static void main(String[] args) {

        LambdaDemo lambdaDemo = new LambdaDemo();
        List<User> userList = Lists.newArrayList();
        try {
            User user1 = lambdaDemo.new User("1", "GX", "27");
            User user2 = lambdaDemo.new User("1", "GX", "27");
            User user3 = lambdaDemo.new User("1", "GX", "27");
            User user4 = lambdaDemo.new User("1", "GX", "27");


            User user5 = lambdaDemo.new User("1", "GX", "27");
            User user6 = lambdaDemo.new User("1", "GX", "27");
            User user7 = lambdaDemo.new User("1", "GX", "27");
            User user8 = lambdaDemo.new User("1", "GX", "27");
            User user9 = user8;
            User user10 = lambdaDemo.new User("2", "GX", "27");


            userList.add(user1);
            userList.add(user2);
            userList.add(user3);
            userList.add(user4);
            userList.add(user5);
            userList.add(user6);
            userList.add(user7);
            userList.add(user8);
            userList.add(user9);
            userList.add(user10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        userList = userList.stream().distinct().collect(Collectors.toList());
        System.out.println(userList.size());
        userList = userList.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(e -> e.getName()))), ArrayList::new));
        System.out.println(userList.size());

    }

    class User {

        public User(String id, String name, String age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public User() {
        }

        String name;

        String age;

        String id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

}
