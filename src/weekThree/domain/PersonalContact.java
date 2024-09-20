package weekThree.domain;

import weekThree.validation.StringValidation;

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
}
