package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<User> userStream = Stream.generate(User::generateRandomUser);

        List<User> users = userStream
                .limit(20)
                .filter(user -> user.getAge() > 18)
                .filter(user -> user.getEmail() != null && !user.getEmail().isEmpty())
                .toList();

        List<String> males = users.stream()
                .filter(user -> user.getGender().equalsIgnoreCase("male"))
                .map(User::getName)
                .toList();
        List<String> females = users.stream()
                .filter(user -> user.getGender().equalsIgnoreCase("female"))
                .map(User::getName)
                .toList();

//        ArrayList<String> femaleNames = new ArrayList<>();
//        ArrayList<String> maleNames = new ArrayList<>();
//        for (User user : users) {
//            if (user.getGender().equalsIgnoreCase("male")) {
//                maleNames.add(user.getName());
//            } else {
//                femaleNames.add(user.getName());
//            }
//        }

//        System.out.println("male names = " + maleNames);
//        System.out.println("female names = " + femaleNames);

        System.out.println("male names = " + males);
        System.out.println("female names = " + females);
    }
}