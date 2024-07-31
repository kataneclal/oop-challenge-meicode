package gpk.andrew.oopchallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);

        Patient patient = new Patient("Steve", 23);

        Eye left_eye = new Eye("Left eye", "short sighted", "left", "blue");
        Eye right_eye = new Eye("Right eye", "normal", "left", "blue");
        Heart heart = new Heart("Heart", "normal", 70);
        Stomach stomach = new Stomach("Stomach", "PUD", "hungry");
        Skin skin = new Skin("Skin", "frostbitten");

        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        boolean hasFinished = false;
        byte choiceNumber;

        while (!hasFinished) {
            System.out.println("Choose an option: ");
            System.out.println("\t1. " + left_eye.getName() +
                    "\n\t2. " + right_eye.getName() +
                    "\n\t3. " + heart.getName() +
                    "\n\t4. " + stomach.getName() +
                    "\n\t5. " + skin.getName() +
                    "\n\t6. Quit");
            choiceNumber = write.nextByte();
            switch (choiceNumber) {
                //Left eye case
                case 1: {
                    System.out.println("Name: " + left_eye.getName() + "\nMedical condition: " + left_eye.getMedicalCondition() + "\nColor: " + left_eye.getColor());
                    System.out.println("\t1. Close the eye");
                    byte closeTheEyeNumber = write.nextByte();
                    if (closeTheEyeNumber == 1) {
                        System.out.println(left_eye.getName() + " closed.");
                        break;
                    } else {
                        break;
                    }
                }
                //Right eye case
                case 2:{
                    System.out.println("Name: " + right_eye.getName() + "\nMedical condition: " + right_eye.getMedicalCondition() + "\nColor: " + right_eye.getColor());
                    System.out.println("\t1. Close the eye");
                    byte closeTheEyeNumber = write.nextByte();
                    if (closeTheEyeNumber == 1) {
                        System.out.println(right_eye.getName() + " closed.");
                        break;
                    } else {
                        break;
                    }
                }
                //Heart case
                case 3: {
                    System.out.println("Name: " + heart.getName() + "\nMedical condition: " + heart.getMedicalCondition() + "\nHeart rate: " + heart.getHeartRate());
                    System.out.println("\t1. Change the heart rate");
                    byte changeHeartRateChoiceNumber = write.nextByte();
                    if (changeHeartRateChoiceNumber == 1) {
                        System.out.print("Enter the number of the heart rate: ");
                        heart.setHeartRate(write.nextInt());
                        System.out.println("Heart rate changed to: " + heart.getHeartRate());
                        break;
                    } else {
                        break;
                    }
                }
                //Stomach case
                case 4: {
                    System.out.println("Name: " + stomach.getName() + "\nMedical condition: " + stomach.getMedicalCondition() + "\nState: " + stomach.getState());
                    System.out.println("\t1. Digest");
                    byte digestNumber = write.nextByte();
                    if (digestNumber == 1) {
                        System.out.println("Digesting has begun...");
                        if (stomach.getState().equals("hungry")) {
                            System.out.println("Nothing to digest.");
                            break;
                        }
                        else break;
                    } else {
                        break;
                    }
                }
                //Skin case
                case 5: {
                    System.out.println("Name: " + skin.getName() + "\nMedical condition: " + skin.getMedicalCondition());
                    break;
                }
                //Quit the examination case
                case 6:  {
                    hasFinished = true;
                    break;
                }
            }
        }
    }
}
