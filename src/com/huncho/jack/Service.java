package com.huncho.jack;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Service {
    ProfileData profileData = new ProfileData();

    public void requestProfileData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Very warm welcome to my fitness app");

        System.out.println("Please enter your first name");
        profileData.setFirstName(scanner.next());

        System.out.println("Please enter your last nane");
        profileData.setLastName(scanner.next());

        System.out.println("Please select your gender" + "\n" +
                "1. Male" + "\n" +
                "2. Female");
        int genderChoice = scanner.nextInt();
        if (genderChoice == 1) {
            profileData.setGender("Male");
        } else if (genderChoice == 2) {
            profileData.setGender("Female");
        }
        System.out.println(profileData.getGender());


        System.out.println("Please enter your date of birth (DD-MM-YYYY)");
        String dateOfBirthString = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        "08-05-1998"
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString, formatter);
        System.out.println(dateOfBirth);


        int age = LocalDate.now().getYear() - dateOfBirth.getYear();
        System.out.println(age);

    }

    public void initialise() {
        requestProfileData();
    }
}
