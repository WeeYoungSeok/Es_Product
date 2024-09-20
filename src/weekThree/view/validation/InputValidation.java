package weekThree.view.validation;

import weekThree.view.constans.MenuMessage;

public class InputValidation {

    public static void menuSelectNumberValidation(int menuNumber) {
        MenuMessage.fromNumber(menuNumber);
    }
}
