package weekThree;

import weekThree.view.InputView;
import weekThree.view.constans.ErrorMessage;
import weekThree.view.constans.MenuMessage;

public class Application {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        while (true) {
            // 메뉴 선택
            int menuNumber = menuPrintAndGetMenuNumber();
            // 메뉴 번호가 종료라면 프로그램 종료
            if (isExit(menuNumber)) {
                break;
            }
        }
    }

    public static boolean isExit(int number) {
        return number == MenuMessage.values().length;
    }

    public static int menuPrintAndGetMenuNumber() {
        while (true) {
            try {
                return InputView.menuPrintAndGetSelectNumber();
            } catch (NumberFormatException e) {
                System.out.println(ErrorMessage.MENU_INPUT_NOT_NUMBER.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println();
            }
        }
    }
}
