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
        super.print();
        System.out.println(String.format(OutputMessage.RELATION_PRINT.getMessage(), this.relationship));
    }
}
