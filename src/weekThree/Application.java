package weekThree;

import weekThree.domain.AddressBook;
import weekThree.view.InputView;
import weekThree.view.constans.ErrorMessage;
import weekThree.view.constans.MenuMessage;

public class Application {
    private final AddressBook addressBook = new AddressBook();

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        while (true) {
            // 메뉴 선택
            choiceMenu(menuPrintAndGetMenuNumber());
        }
    }

    public static boolean isExit(int number) {
        return number == MenuMessage.values().length;
    }

    public static int menuPrintAndGetMenuNumber() {
        while (true) {
            try {
                return InputView.getMenuSelection();
            } catch (NumberFormatException e) {
                System.out.println(ErrorMessage.MENU_INPUT_NOT_NUMBER.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println();
            }
        }
    }

    public static void choiceMenu(int menuNumber) {
        // 종료 먼저 확인
        if (isExit(menuNumber)) {
            System.exit(0);
        }
    }
}
