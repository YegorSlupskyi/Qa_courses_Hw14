package org.example;
import java.util.Random;

class User {
    private final String name;
    private final int age;
    private final String email;
    private final String gender;

    public User(String name, int age, String email, String gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public static User generateRandomUser() {
        Random random = new Random();
        String[] maleNames = {"John", "Bill", "Bob"};
        String[] femaleNames = {"Clara", "Kate", "Monica"};
        String[] genders = {"male", "female"};

        String gender = genders[random.nextInt(genders.length)];
        String name = gender.equals("male")
                ? maleNames[random.nextInt(maleNames.length)]
                : femaleNames[random.nextInt(femaleNames.length)];

        return new User(name, random.nextInt(50) + 10, "email@example.com", gender);
    }
}