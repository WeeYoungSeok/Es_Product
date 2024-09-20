package weekThree.service;

import weekThree.domain.BusinessContact;
import weekThree.view.InputView;

public class BusinessContactServiceImpl implements ContactInterface<BusinessContact> {

    @Override
    public BusinessContact addContact() {
        while (true) {
            try {
                return new BusinessContact(InputView.getNameInput(),
                        InputView.getPhoneNumberInput(),
                        InputView.getCompanyNameInput());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println();
            }
        }
    }
}
