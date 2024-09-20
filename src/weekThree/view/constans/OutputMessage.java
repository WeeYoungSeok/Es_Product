package weekThree.view.constans;

public enum OutputMessage {
    CONTACT_PRINT_BUSINESS("이름: %s, 전화번호: %s, 회사명: %s"),
    CONTACT_PRINT_PRIVATE("이름: %s, 전화번호: %s, 관계: %s"),

    CONTACT_EMPTY("연락처가 비어있습니다."),
    CONTACT_NOT_FOUND("연락처를 찾을 수 없습니다."),

    EXIT("프로그램을 종료합니다.");

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
