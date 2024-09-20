package weekThree.domain;

import weekThree.validation.StringValidation;
import weekThree.view.constans.OutputMessage;

public class BusinessContact extends Contact {
    private String company;

    public BusinessContact(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        StringValidation.isEmpty(company);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public void print() {
        System.out.println(String.format(OutputMessage.CONTACT_PRINT_BUSINESS.getMessage(), super.getName(), super.getPhoneNumber(), this.company));
    }
}
