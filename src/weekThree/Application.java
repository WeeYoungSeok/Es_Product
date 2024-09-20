package weekThree;

import weekThree.domain.AddressBook;
import weekThree.service.BusinessContactServiceImpl;
import weekThree.service.PersonalContactServiceImpl;
import weekThree.view.InputView;
import weekThree.view.constans.ErrorMessage;
import weekThree.view.constans.MenuMessage;
import weekThree.view.constans.OutputMessage;

public class Application {
    private static final AddressBook addressBook = new AddressBook();
    private static final BusinessContactServiceImpl businessContactService = new BusinessContactServiceImpl();
    private static final PersonalContactServiceImpl personalContactService = new PersonalContactServiceImpl();

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        while (true) {
            try {
                // 메뉴 선택
                choiceMenu(InputView.getMenuSelection());
            } catch (NumberFormatException e) {
                System.out.println();
                System.out.println(ErrorMessage.MENU_INPUT_NOT_NUMBER.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println();
                System.out.println(e.getMessage());
            } finally {
                System.out.println();
            }
        }
    }

    public static void choiceMenu(int menuNumber) {
        switch (MenuMessage.fromNumber(menuNumber)) {
            case BUSINESS_CONTACT_ADD: {
                addressBook.addContact(businessContactService.addContact());
                break;
            }
            case PRIVATE_CONTACT_ADD: {
                addressBook.addContact(personalContactService.addContact());
                break;
            }
            case CONTACT_PRINT: {
                addressBook.displayContacts();
                break;
            }
            case CONTACT_SEARCH: {
                addressBook.searchContact(InputView.getSearchNameInput());
                break;
            }
            case EXIT: {
                System.out.println(OutputMessage.EXIT.getMessage());
                System.exit(0);
                break;
            }
        }
    }
}
