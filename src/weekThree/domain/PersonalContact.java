package weekThree.domain;

import weekThree.validation.StringValidation;
import weekThree.view.constans.OutputMessage;

public class PersonalContact extends Contact {
    private String relationship;

    public PersonalContact(String name, String phoneNumber, String relationship) {
        super(name, phoneNumber);
        StringValidation.isEmpty(relationship);
        this.relationship = relationship;
    }

    public String getRelationship() {
        return relationship;
    }

    @Override
    public void print() {
        System.out.println(String.format(OutputMessage.CONTACT_PRINT_PRIVATE.getMessage(), super.getName(), super.getPhoneNumber(), this.relationship));
    }
}
