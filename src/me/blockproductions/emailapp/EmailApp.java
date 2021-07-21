package me.blockproductions.emailapp;

import java.util.Scanner;

public class EmailApp {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alternateEmail;

    public EmailApp(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("EMAIL CREATED" + this.firstName + " " + this.lastName);

        this.department = setDepartment();
        System.out.println("Department: " + this.department);
    }

    private String setDepartment() {
        System.out.println("DEPARTMENT CODES\n1. for sales\n2. for Development\n3. for Accounting\n4. for none\n Enter the department code:" );

        Scanner scanner = new Scanner(System.in);
        int depChoice = scanner.nextInt();

        switch (depChoice) {
            case 1:
                return "Sales";
            case 2:
                return "Development";
            case 3:
                return "For accounting";
            case 4:
                return "none";
            default:
                System.out.println("hello hello, an error occured!");
        }

        return null;
    }

}
