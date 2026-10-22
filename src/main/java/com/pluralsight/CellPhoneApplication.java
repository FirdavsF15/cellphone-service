package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //create instance of CellPhone class
        CellPhone telly = new CellPhone();

        System.out.print("What is the serial number? ");
        int serialNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();
        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();

        telly.setSerialNumber(serialNumber);
        telly.setModel(model);
        telly.setCarrier(carrier);
        telly.setPhoneNumber(phoneNumber);
        telly.setOwner(owner);



    }
}


