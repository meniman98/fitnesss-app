package com.huncho.jack;

import com.huncho.jack.enums.Bmi;
import com.huncho.jack.enums.CoachType;
import com.huncho.jack.model.Activity;
import com.huncho.jack.model.Coach;
import com.huncho.jack.model.ProfileData;
import com.huncho.jack.model.Running;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Service {
    //    dependencies
    ProfileData profileData = new ProfileData();
    Scanner scanner = new Scanner(System.in);
    Coach john = new Coach(1, "John", "Smith", CoachType.FITNESS_COACH);
    Coach henry = new Coach(2, "Henry", "Jones", CoachType.PERSONAL_TRAINER);
    Coach emma = new Coach(3, "Emma", "Brown", CoachType.PHYSIOTHERAPIST);

    // 1
    private void requestUserData() {
//        Scanner initialisation

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
        checkIfNumber();
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
        checkIfNumber();
        Integer weight = scanner.nextInt();
        profileData.setWeight(weight);

//        Enter height
        System.out.println("Please enter your height (CM)");
        checkIfNumber();
        Integer height = scanner.nextInt();
        profileData.setHeight(height);

//        Get result of BMI calculation
        String result = calculateBmi();
        profileData.setResultBmi(result);

//        enter MHR
        System.out.println("Please enter your maximum heart rate (beats/minute)");
        checkIfNumber();
        Integer mhr = scanner.nextInt();
        profileData.setMhr(mhr);

//        Enter RHR
        System.out.println("Please enter your resting heart rate (beats/minute)");
        checkIfNumber();
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
        for (int i = 1; i <= profileData.getDeviceList().size(); i++) {
            System.out.println(i + " " + profileData.getDeviceList().get(i));
        }

//        Ask for device number
        System.out.println("Enter a number");
        checkIfNumber();
        int deviceNumber = scanner.nextInt();

//        Get device name
        String deviceName = profileData.getDeviceList().get(deviceNumber);
        profileData.setInstallationDevice(deviceName);

//        Print profileData

        System.out.println(profileData.toString());
        System.out.println("Are all details correct?" + "\n"
                + "1. Yes" + "\n"
                + "2. No"
        );
        int choice = scanner.nextInt();
        choice = validatedChoice(choice);

        if (choice == 2) {
//            recursion
            requestUserData();
        }
//        if choice is 1, then continue without doing anything else


    }

    // 2
    private void requestActivityDetails() {
        showActivities();
//        Show all coaches and select one
        System.out.println("Select which coach you'd like to train with");
        List<Coach> coachArrayList = List.of(john, henry, emma);
        for (Coach coach : coachArrayList) {
            System.out.println(coach.toString());
        }
        checkIfNumber();
        int coachChoice = scanner.nextInt();
        Coach selectedCoach = coachArrayList.get(coachChoice - 1);

        showActivities();
//        select an activity
        System.out.println("Select one of the following activities");
        int activityChoice = scanner.nextInt();

//        print activity
        switch (activityChoice) {
            case 1:
//                Execute this code if running was selected
                System.out.println("You've chosen running");
                Running runningActivity = new Running(selectedCoach);
                profileData.getChosenActivityList().add("Running");
                askGeneralQuestions(runningActivity);

//                Ask for pace
                System.out.println("Please enter your pace per KM");
                Double pace = scanner.nextDouble();
                runningActivity.setPace(pace);

//                Ask for distance
                System.out.println("Please enter your distance per KM");
                Double distance = scanner.nextDouble();
                runningActivity.setDistance(distance);

//                Print all activity details out
                System.out.println(runningActivity + "\n" +
                        "Duration " + runningActivity.getDuration() + "\n" +
                        "Pace " + runningActivity.getPace());
                break;
            case 2:
                System.out.println("You've chosen cycling");
                break;
            case 3:
                System.out.println("You've chosen swimming");
                break;
            case 4:
                System.out.println("You've chosen weightlifting");
                break;
        }

//        You've chosen this coach
        System.out.println("You've chosen " + "" + selectedCoach.toString());

//        Would you like to continue?
        System.out.println("Would you like to choose another activity?" + "\n" +
                "1. Yes, choose another activity" + "\n" +
                "2. No, this is all");
        int choice = scanner.nextInt();
        choice = validatedChoice(choice);
//        Check for number 1 or 2
        if (choice == 1) {
//            recursion
            requestActivityDetails();
        }
        if (choice == 2) {
            System.out.println("Next section will be the graph production");
        }

    }

    // 3
    private void askGeneralQuestions(Activity activity) {
        scanner.nextLine();
        System.out.println("Please enter your activity description");
        String description = scanner.nextLine();
        activity.setDescription(description);

        System.out.println("Please enter the date");
        String date = scanner.nextLine();
        activity.setDate(date);

        System.out.println("Please enter the time");
        String time = scanner.nextLine();
        activity.setTime(time);

        System.out.println("Please enter the duration");
        String duration = scanner.nextLine();
        activity.setDuration(duration);

        System.out.println("Please select the device you used");
//        i = 1
//        device size = 3
//        1. 1 < 3
//        2. 2 < 3
//        3. 3 <= 3
        for (int i = 1; i <= activity.getDeviceList().size(); i++) {
            System.out.println(i + " " + activity.getDeviceList().get(i));
        }
        int deviceChoice = scanner.nextInt();
        activity.setActivityDevice(activity.getDeviceList().get(deviceChoice));

    }

    //    4
    private void produceGraph() {
        ArrayList<LocalDate> dateList = new ArrayList<>();
        ArrayList<Double> weightList = new ArrayList<>();
        HashMap<Double, String> bmiAndResultMap = new LinkedHashMap<>();
//        For loop, 10 times
        for (int i = 0; i < 3; i++) {
            System.out.println(i+1 + ".Enter the date");
            String dateInString = scanner.next();

//        Create a formatter of 08-05-1998
//        I want my date in this format dd-MM-yyyy
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

//        Format the string "08-05-1998" to a Localdate object 08-05-1998
            LocalDate date = LocalDate.parse(dateInString, formatter);

            System.out.println(i+1 + ".Enter your weight");
            Double weight = scanner.nextDouble();

            dateList.add(date);
            weightList.add(weight);
        }
        System.out.println(dateList);
        System.out.println(weightList);

        for (Double weight : weightList) {
//            Remember to remove
            profileData.setHeight(170);
            Double bmi = ((weight * 100 * 100) /
                    (profileData.getHeight() * profileData.getHeight()));
            String bmiKeyword = determineBmiKeyword(bmi);
            bmiAndResultMap.put((double) Math.round(bmi), bmiKeyword);
        }
            System.out.println(bmiAndResultMap);

        for (int i = 0; i < 3; i++) {
//            Registration list
            Double bmi = (Double) bmiAndResultMap.keySet().toArray()[i];
            String format =  MessageFormat.format("{0} - {1} {2} {3}",
                    dateList.get(i),
                    weightList.get(i),
                    bmi,
                    bmiAndResultMap.get(bmi));
            System.out.println(format);
        }

//                double bmi = ((weight * 100 * 100) / (height * height));
    }

    // main method
    public void initialise() {
//        requestUserData();
//        requestActivityDetails();
        produceGraph();
    }

    //    Helper methods
    private int validatedChoice(int choice) {
        while (choice != 1 && choice != 2) {
            System.out.println("Please select 1 or 2");
            choice = scanner.nextInt();
        }
        return choice;
    }

    private void showActivities() {
        System.out.println("The following are available activities you may do: " + "\n" +
                "1. Running" + "\n" +
                "2. Cycling" + "\n" +
                "3. Swimming" + "\n" +
                "4. Weightlifting");
    }

    private void checkIfNumber() {
        while (!scanner.hasNextInt()) {
            System.out.println("That's not a number! Try again!");
            scanner.next();
        }
    }

    private String calculateBmi() {
        Integer height = profileData.getHeight();
        Integer weight = profileData.getWeight();
        double bmi = ((weight * 100 * 100) / (height * height));
        profileData.setBmi(bmi);
        return determineBmiKeyword(bmi);
    }

    private String determineBmiKeyword(double bmi) {
        String result;
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
}
