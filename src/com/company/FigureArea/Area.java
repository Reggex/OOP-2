package com.company.FigureArea;

public interface Area {

    /**
     * Метод вычисления площади.
     * @return 0.
     */
    public default double calculateArea(){
        return 0;
    }
}
