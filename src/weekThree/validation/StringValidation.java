package weekThree.validation;

import weekThree.view.constans.ErrorMessage;

public class StringValidation {
    public static void isEmpty(String txt) {
        if (txt.isEmpty() || txt.isBlank()) {
            throw new IllegalArgumentException(ErrorMessage.BLANK.getMessage());
        }
    }
}
