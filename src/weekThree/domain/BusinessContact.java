package weekThree.domain;

import weekThree.validation.StringValidation;

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
}
