package weekThree.view;

import weekThree.validation.StringValidation;
import weekThree.view.constans.InputMessage;
import weekThree.view.constans.MenuMessage;
import weekThree.view.validation.InputValidation;

import java.util.Scanner;

public class InputView {

    private static final Scanner sc = new Scanner(System.in);

    public static Integer getMenuSelection() {
        for (MenuMessage message : MenuMessage.values()) {
            System.out.println(message.getMessage());
        }
        System.out.print(InputMessage.MENU_CHOICE.getMessage());
        String menuNumberStr = sc.nextLine();
        StringValidation.isEmpty(menuNumberStr.trim());
        int menuNumber = Integer.parseInt(menuNumberStr);
        InputValidation.menuSelectNumberValidation(menuNumber);
        return menuNumber;
    }
}
