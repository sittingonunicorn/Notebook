/**
 * Package contains methods and fields to control input data and to provide the association of View and Model.
 */

package controller;

import model.Model;
import view.View;

import java.util.Scanner;

/**
 * Class provides association of Model and View classes.
 */
public class Controller implements regExes {
    /**
     * Model instance.
     */
    private Model model;
    /**
     * View instance.
     */
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