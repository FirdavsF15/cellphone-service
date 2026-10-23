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

        /*
        System.out.printf("""
                The phone's serial number is %d
                Model: %s
                Carrier: %s
                Phone Number:  %s
                Owned by %s
                """, telly.getSerialNumber(), telly.getModel(), telly.getCarrier(), telly.getPhoneNumber(), telly.getOwner() );
        */

        //testing out dial method from CellPhone class
        //telly.dial("646-975-8267");

        //second instance of CellPhone class
        CellPhone trapPhone = new CellPhone(123123,"Samsung flip", "verizon", "123-456-7890", "kvadrat");


        display(trapPhone);
        display(telly);

        trapPhone.dial(telly.getPhoneNumber());
        System.out.println();
        telly.dial(trapPhone.getPhoneNumber());

    }

    public static void display(CellPhone phone){
        System.out.printf("""
                The phone's serial number is %d
                Model: %s
                Carrier: %s
                Phone Number:  %s
                Owned by %s
                """, phone.getSerialNumber(), phone.getModel(), phone.getCarrier(), phone.getPhoneNumber(), phone.getOwner() );
        System.out.println();
    }
}


