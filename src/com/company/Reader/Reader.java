package com.company.Reader;

import java.time.LocalDate;

public class Reader {

    private String name;
    private int personnelNumber;
    private String department;
    private LocalDate birthDate;
    private String phoneNumber;

    /**
     * Конструктор с параметрами.
     * @param name - ФИО.
     * @param personnelNumber - номер читательского билета.
     * @param department - название факультета.
     * @param birthDate - дата рождения.
     * @param phoneNumber - номер телефона.
     */
    public Reader(String name, int personnelNumber, String department, LocalDate birthDate, String phoneNumber) {
        this.name = name;
        this.personnelNumber = personnelNumber;
        this.department = department;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public Reader(){
    }

    public Reader(String name) {
        this.name = name;
    }

    /**
     * Читатель взял книгу.
     */
    public void takeBook() {
        System.out.println(name + " взял книгу");
    }

    /**
     * Читатель вернул книгу.
     */
    public void returnBook() {
        System.out.println(name + " вернул книгу");
    }

    /**
     * Читатель взял некоторое количество книг.
     * @param quantityBook - количество книг.
     */
    public void takeBook(int quantityBook) {
        System.out.println(name + " взял " + quantityBook + " книг(-и)");
    }

    /**
     * Читатель вернул некоторое количество книг.
     * @param quantityBook - количество книг.
     */
    public void returnBook(int quantityBook) {
        System.out.println(name + " вернул " + quantityBook + " книг(-и)");
    }

    /**
     * Перечисление книг, которые взял читатель.
     * @param books - название книг.
     */
    public void takeBook(String... books) {
        System.out.print(name + " взял книги: ");
        for (int i = 0; i < books.length; i++) {
            if (i==(books.length-1)){
                System.out.println(books[i]);
            } else {
                System.out.print(books[i] + ", ");
            }
        }
    }

    /**
     * Перечисление книг, которые вернул читатель.
     * @param books - название книг.
     */
    public void returnBook(String... books) {
        System.out.print(name + " вернул книги: ");
        for (int i = 0; i < books.length; i++) {
            if (i==(books.length-1)){
                System.out.println(books[i]);
            } else {
                System.out.print(books[i] + ", ");
            }
        }
    }

    /**
     * Перечисление книг, которые взял читатель.
     * @param books - название книг.
     */
    public void takeBook(Book[] books) {
        System.out.print(name + " взял книги: ");
        for (int i = 0; i < books.length; i++) {
            if (i==(books.length-1)){
                System.out.println(books[i].getTitle());
            } else {
                System.out.print(books[i].getTitle() + ", ");
            }
        }
    }

    /**
     * Перечисление книг, которые вернул читатель.
     * @param books - название книг.
     */
    public void returnBook(Book[] books) {
        System.out.print(name + " вернул книги: ");
        for (int i = 0; i < books.length; i++) {
            if (i==(books.length-1)){
                System.out.println(books[i].getTitle());
            } else {
                System.out.print(books[i].getTitle() + ", ");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public void setPersonnelNumber(int personnelNumber) {
        this.personnelNumber = personnelNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
