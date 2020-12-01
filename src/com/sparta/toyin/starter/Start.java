package com.sparta.toyin.starter;

import com.sparta.toyin.Factory.PhoneFactory;
import com.sparta.toyin.Printer;
import com.sparta.toyin.phone.Phone;

public class Start {

    public static void start() {

        Phone phone = PhoneFactory.createPhone();
        Printer.print(phone.sendText());
    }
    // write your code here
    // modelling out mobile phones
    // sim, screen etc
    // behaviour - calling, sending messages
    // instantiate phones
    // use factory pattern to create phones - apple, android
    // interface - phone > applePhone > AndroidPhone - sim,processor,camera - actions - take pictures, send messages, make calls
}
