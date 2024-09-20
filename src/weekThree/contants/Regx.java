package weekThree.contants;

public enum Regx {
    PHONE_NUMBER_REGX("^01[0-9]-\\d{3,4}-\\d{4}$");

    private String pattern;

    Regx(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }
}
