package com.company.Phone;

public class Phone {

    private String number;
    private String model;
    private double weight;

    /**
     * Конструктор без параметров
     */
    public Phone() {
    }

    /**
     * Конструктор с двумя параметрами
     * @param number - номер телефона
     * @param model - модель телефона
     */
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    /**
     * Конструктор с тремя параметрам, созданый через конструктор с двумя параметрами
     * @param number - номер телефона
     * @param model - модель телефона
     * @param weight - вес телефона
     */
    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    // Конструктор с тремя параметрами
    /*public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }*/

    /**
     * Выводит на консоль сообщение “Звонит {name}”
     * @param name - имя звонящего
     * @return номер телефона
     */
    public String receiveCall(String name){
        System.out.println("Звонит " + name);
        System.out.println(getNumber());
        return getNumber();
    }

    /**
     * Перегруженный метод receiveCall
     * @param name - имя звонящего
     * @param number - номер телефона
     * @return номер телефона
     */
    public String receiveCall(String name, String number){
        System.out.println("Звонит " + name);
        System.out.println(number);
        return number;
    }

    // или так:
    /*public void receiveCall(String name, String number){
        System.out.println("Звонит " + name);
        System.out.println(number);
    }*/

    /**
     * Отправляет сообщения на номера телефонов
     * @param numbers - номера телефонов
     */
    public void sendMessage(String... numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Номер телефона: " + numbers[i]);
            System.out.println("Сообщение: \"Привет! Как дела?\" ");
        }
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
