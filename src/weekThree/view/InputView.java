package weekThree.view;

import weekThree.validation.StringValidation;
import weekThree.view.constans.InputMessage;
import weekThree.view.constans.MenuMessage;
import weekThree.view.validation.InputValidation;

import java.util.Scanner;

public class InputView {

    private static final Scanner sc = new Scanner(System.in);

    public static Integer menuPrintAndGetSelectNumber() {
        for (MenuMessage message : MenuMessage.values()) {
            System.out.println(message.getMessage());
        }
        System.out.print(InputMessage.MENU_CHOICE.getMessage());
        String menuNumber = sc.nextLine();
        StringValidation.isEmpty(menuNumber);
        InputValidation.menuSelectNumberValidation(menuNumber.trim());
        return Integer.parseInt(menuNumber);
    }
}
