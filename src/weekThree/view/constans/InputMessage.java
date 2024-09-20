package weekThree.view.constans;

public enum InputMessage {
    MENU_CHOICE("메뉴를 선택해주세요: ↵"),

    // 이름 및 연락처
    NAME("이름을 입력하세요: ↵"),
    CONTACT("전화번호를 입력하세요: ↵"),

    // 비지니스
    BUSINESS_COMPANY_NAME("회사명을 입력하세요: ↵"),

    // 개인
    PRIVATE_RELATION("이름을 입력하세요: ↵"),

    // 연락처 검색
    NAME_SEARCH("검색할 이름을 입력하세요: ↵");

    private final String message;

    InputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
