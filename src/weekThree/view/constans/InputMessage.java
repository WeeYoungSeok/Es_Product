package weekThree.view.constans;

public enum InputMessage {
    MENU_CHOICE("메뉴를 선택해주세요: ↵"),

    // 비지니스 연락처 추가
    BUSINESS_NAME("이름을 입력하세요: ↵"),
    BUSINESS_CONTACT("전화번호를 입력하세요: ↵"),
    BUSINESS_COMPANY_NAME("회사명을 입력하세요: ↵"),

    // 개인 연락처 추가
    PRIVATE_NAME("이름을 입력하세요: ↵"),
    PRIVATE_CONTACT("전화번호를 입력하세요: ↵"),
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
