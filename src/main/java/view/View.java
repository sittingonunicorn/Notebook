package view;

import java.util.ArrayList;

public class View {
    public static final String INPUT_LASTNAME = "Input lastname in format ";
    public static final String INPUT_NICKNAME = "Input nickname in format ";
    public static final String WRONG_INPUT = "Wrong input!";


    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessage(String message, String message2) {
        System.out.println(message + message2);
    }

    public void printMessageAndInt(String message, int number) {
        System.out.println(message + number);
    }

    public void printMessageAndInt(String message, int number, String message2) {
        System.out.println(message + number + message2);
    }

    public void printMessageAndInt(String message, int number1, int number2) {
        System.out.println(message + number1 + " and " + number2);
    }

    public void printMessageAndArrayList(String message, ArrayList arrayList) {
        System.out.println(message + stringArrayList(arrayList));
    }

    public String stringArrayList(ArrayList<Integer> arrayList) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            result.append(arrayList.get(i) + ", ");
        }
        result.append(arrayList.get(arrayList.size() - 1));
        return result.toString();
    }

}