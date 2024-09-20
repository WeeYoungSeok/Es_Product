package weekThree.service;

import weekThree.domain.PersonalContact;
import weekThree.view.InputView;

public class PersonalContactServiceImpl implements ContactInterface<PersonalContact> {

    @Override
    public PersonalContact addContact() {
        return new PersonalContact(InputView.getNameInput(),
                InputView.getPhoneNumberInput(),
                InputView.getRelationshipInput());
    }
}
