package weekThree;

import weekThree.domain.AddressBook;
import weekThree.service.BusinessContactServiceImpl;
import weekThree.service.PersonalContactServiceImpl;
import weekThree.view.InputView;
import weekThree.view.constans.ErrorMessage;
import weekThree.view.constans.MenuMessage;

public class Application {
    private static final AddressBook addressBook = new AddressBook();
    private static final BusinessContactServiceImpl businessContactService = new BusinessContactServiceImpl();
    private static final PersonalContactServiceImpl personalContactService = new PersonalContactServiceImpl();

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

        switch (MenuMessage.fromNumber(menuNumber)) {
            case BUSINESS_CONTACT_ADD: {
                addressBook.addContact(businessContactService.addContact());
                break;
            }
            case PRIVATE_CONTACT_ADD: {
                addressBook.addContact(personalContactService.addContact());
                break;
            }
        }
    }
}
