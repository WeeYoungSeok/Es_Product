package weekThree.service;

import weekThree.domain.BusinessContact;
import weekThree.view.InputView;

public class BusinessContactServiceImpl implements ContactInterface<BusinessContact> {

    @Override
    public BusinessContact addContact() {
        return new BusinessContact(InputView.getNameInput(),
                InputView.getPhoneNumberInput(),
                InputView.getCompanyNameInput());
    }
}
