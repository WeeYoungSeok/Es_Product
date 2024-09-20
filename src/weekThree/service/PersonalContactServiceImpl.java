package weekThree.service;

import weekThree.domain.PersonalContact;
import weekThree.view.InputView;

public class PersonalContactServiceImpl implements ContactInterface<PersonalContact> {

    @Override
    public PersonalContact addContact() {
        while (true) {
            try {
                return new PersonalContact(InputView.getNameInput(),
                        InputView.getPhoneNumberInput(),
                        InputView.getRelationshipInput());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println();
            }
        }
    }
}
