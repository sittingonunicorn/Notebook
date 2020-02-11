package controller;

import model.Model;
import view.View;

import java.util.Scanner;

public class Controller implements regExes {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public String inputStringValueWithScannerAndCheck(Scanner sc, String userQuery, String regex) {
        String str;
        view.printMessage(userQuery + regex);
        while (!(sc.hasNext() && (str = sc.nextLine()).matches(regex))) {
            view.printMessage(View.WRONG_INPUT);
            view.printMessage(userQuery + regex);
        }
        return str;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        model.setLastname(inputStringValueWithScannerAndCheck(sc, View.INPUT_LASTNAME, LASTNAME_REGEX_UA));
        model.setNickname(inputStringValueWithScannerAndCheck(sc, View.INPUT_NICKNAME, NICKNAME_REGEX));

    }


}