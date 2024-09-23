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
        super.print();
        System.out.println(String.format(OutputMessage.BUSINESS_PRINT.getMessage(), this.company));
    }
}
