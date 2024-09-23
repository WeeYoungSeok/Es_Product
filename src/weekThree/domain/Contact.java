package weekThree.domain;

import weekThree.contants.Regx;
import weekThree.validation.StringValidation;
import weekThree.view.constans.ErrorMessage;
import weekThree.view.constans.OutputMessage;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        validation(name, phoneNumber);
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    private void validation(String name, String phoneNumber) {
        // 빈 값 검사
        StringValidation.isEmpty(name);
        StringValidation.isEmpty(phoneNumber);
        // 전화 번호 형식 검사
        phoneNumberValidation(phoneNumber);

    }

    private void phoneNumberValidation(String phoneNumber) {
        if (!phoneNumber.matches(Regx.PHONE_NUMBER_REGX.getPattern())) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_PHONE_NUMBER_FORMAT.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void print() {
        System.out.print(String.format(OutputMessage.CONTACT_PRINT.getMessage(), this.name, this.phoneNumber));
    }
}
