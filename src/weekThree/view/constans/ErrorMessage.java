package weekThree.view.constans;

public enum ErrorMessage {
    BLANK("빈 값은 입력 불가능 합니다."),
    INVALID_MENU_SELECTION("메뉴는 1 ~ " + MenuMessage.values().length + "사이의 숫자만 입력 가능합니다."),
    MENU_INPUT_NOT_NUMBER("메뉴는 숫자만 입력 가능합니다."),
    INVALID_PHONE_NUMBER_FORMAT("전화전호 형식을 맞춰 입력해주세요.\n01x-xxxx(3자리 가능)-xxxx");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
