package weekThree.view.validation;

import weekThree.view.constans.ErrorMessage;
import weekThree.view.constans.MenuMessage;

public class InputValidation {

    public static void menuSelectNumberValidation(String menuNumber) {
        menuNumberRangeValidation(menuNumber);
    }

    public static void menuNumberRangeValidation(String menuNumber) {
        if (!MenuMessage.isValidMenu(Integer.parseInt(menuNumber))) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_MENU_SELECTION.getMessage());
        }
    }
}
