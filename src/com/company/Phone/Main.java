package com.company.Phone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);

        Phone phone1 = new Phone();
        phone1.setNumber("+7-902-106-84-37");
        phone1.setModel("Xiaomi Redmi 6");
        phone1.setWeight(0.384);
        Phone phone2 = new Phone("+7-917-503-56-11","Huawei P40", 0.302);
        Phone phone3 = new Phone("+7-985-358-05-96","Samsung A10", 0.317);
        Phone[] phone = new Phone[]{phone1, phone2, phone3};

        for (Phone value : phone) {
            System.out.println("Номер телефона: " + value.getNumber());
            System.out.println("Модель телефона: " + value.getModel());
            System.out.println("Вес телефона: " + value.getWeight());
            System.out.println("__________________________________________________________________");
        }

        phone1.receiveCall("Анна");
        System.out.println();
        phone2.receiveCall("Роман");
        System.out.println();
        phone3.receiveCall("Дмитрий");
        System.out.println();

        phone1.receiveCall("Максим", "+7-911-111-11-11");
        System.out.println();

        phone1.sendMessage("+7-999-999-99-99","+7-999-888-77-66");

    }
}
