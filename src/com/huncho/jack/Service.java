package com.huncho.jack;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Service {
    //    dependency
    ProfileData profileData = new ProfileData();


    private void requestUserData() {
//        Scanner initialisation
        Scanner scanner = new Scanner(System.in);
//        Welcome message
        System.out.println("Very warm welcome to my fitness app");

//        Enter first name
        System.out.println("Please enter your first name");
        profileData.setFirstName(scanner.next());

//        Enter last name
        System.out.println("Please enter your last name");
        profileData.setLastName(scanner.next());

//        Select gender
        System.out.println("Please select your gender" + "\n" +
                "1. Male" + "\n" +
                "2. Female");
        int genderChoice = scanner.nextInt();
//        If 1, then male, if 2, then female
        if (genderChoice == 1) {
            profileData.setGender("Male");
        } else if (genderChoice == 2) {
            profileData.setGender("Female");
        }

//        Enter date of birth
        System.out.println("Please enter your date of birth (DD-MM-YYYY)");
        String dateOfBirthString = scanner.next();

//        Create a formatter of 08-05-1998
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

//        Format the string "08-05-1998" to a Localdate object 08-05-1998
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString, formatter);
        profileData.setDateOfBirth(dateOfBirth);

//        Calculate age = 2022 - 1998
        Integer age = LocalDate.now().getYear() - dateOfBirth.getYear();
        profileData.setAge(age);

//        Enter weight
        System.out.println("Please enter your weight (KG)");
        Integer weight = scanner.nextInt();
        profileData.setWeight(weight);

//        Enter height
        System.out.println("Please enter your height (CM)");
        Integer height = scanner.nextInt();
        profileData.setHeight(height);

//        Get result of BMI calculation
        String result = calculateBmi();
        profileData.setResultBmi(result);

//        enter MHR
        System.out.println("Please enter your maximum heart rate (beats/minute)");
        Integer mhr = scanner.nextInt();
        profileData.setMhr(mhr);

//        Enter RHR
        System.out.println("Please enter your resting heart rate (beats/minute)");
        Integer rhr = scanner.nextInt();
        profileData.setRhr(rhr);

//        Calculate VO2MAX
        double vo2Max = 15.3 * mhr / rhr;
        profileData.setVo2Max(vo2Max);

//        Loop through deviceList
        System.out.println("Which device would you like to use?");
        //            1 <= 3
        //            2 <= 3
        //            3 <= 3
        for (int i = 1; i <= profileData.deviceList.size(); i++) {
            System.out.println(i + " " + profileData.getDeviceList().get(i));
        }

//        Ask for device number
        System.out.println("Enter a number");
        int deviceNumber = scanner.nextInt();

//        Get device name
        String deviceName = profileData.getDeviceList().get(deviceNumber);
        profileData.setDeviceName(deviceName);

//        Print profileData
        System.out.println(profileData.toString());
    }

    private String calculateBmi() {
        Integer height = profileData.getHeight();
        Integer weight = profileData.getWeight();
        double bmi = ((weight * 100 * 100) / (height * height));
        profileData.setBmi(bmi);

        String result = "";
        if (bmi < 18.5) {
            result = Bmi.Underweight.toString();
        } else if (bmi >= 18.5 && bmi < 25) {
            result = Bmi.NormalWeight.toString();
        } else if (bmi >= 25 && bmi < 30) {
            result = Bmi.OverWeight.toString();
        } else {
            result = Bmi.Obese.toString();
        }
        return result;
    }

    public void initialise() {
        requestUserData();
    }
}
