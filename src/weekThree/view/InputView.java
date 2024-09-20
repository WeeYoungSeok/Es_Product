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

    public static String getNameInput() {
        System.out.print(InputMessage.NAME.getMessage());
        return sc.nextLine();
    }

    public static String getPhoneNumberInput() {
        System.out.print(InputMessage.CONTACT.getMessage());
        return sc.nextLine();
    }

    public static String getCompanyNameInput() {
        System.out.print(InputMessage.BUSINESS_COMPANY_NAME.getMessage());
        return sc.nextLine();
    }
}
