package com.company.Reader;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Reader reader1 = new Reader("Иванов И.И.", 25648, "Институт цифровых технологий",
                LocalDate.of(2000,10,10),"+7-911-911-11-99");

        Reader reader2 = new Reader("Петров В.В.");

        System.out.println("ФИО: " + reader1.getName());
        System.out.println("Номер читательского билета: " + reader1.getPersonnelNumber());
        System.out.println("Дата рождения: " + reader1.getBirthDate());
        System.out.println("Факультет: " + reader1.getDepartment());
        System.out.println("Номер телефона: " + reader1.getPhoneNumber());
        System.out.println("------------------------------------------------------");

        reader1.takeBook();
        reader1.returnBook();
        System.out.println();

        reader2.takeBook(3);
        reader2.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader2.returnBook(3);
        reader2.returnBook("Приключения", "Словарь", "Энциклопедия");
        System.out.println();

        Book book1 = new Book("Приключения");
        Book book2 = new Book("Словарь");
        Book book3 = new Book("Энциклопедия");
        Book[] books = new Book[]{book1, book2, book3};

        reader2.takeBook(books);
        reader2.returnBook(books);



    }
}
