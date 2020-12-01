package com.sparta.toyin.Factory;

import com.sparta.toyin.phone.AndroidPhone;
import com.sparta.toyin.phone.ApplePhone;
import com.sparta.toyin.phone.Phone;

import java.util.Scanner;

public class PhoneFactory {

    public static Phone createPhone() {
        System.out.println("Please enter 0 for an Android phone and 1 for an Apple phone");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        if (userChoice == 0) {
            return new AndroidPhone();
        } else {
            return new ApplePhone();
        }

    }
}
