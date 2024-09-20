package weekThree.view.constans;

public enum MenuMessage {
    BUSINESS_CONTACT_ADD("1. 비즈니스 연락처 추가"),
    PRIVATE_CONTACT_ADD("2. 개인 연락처 추가"),
    CONTACT_PRINT("3. 연락처 출력"),
    CONTACT_SEARCH("4. 연락처 검색"),
    EXIT("5. 종료"),
    ;

    private String message;

    MenuMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    // 메뉴 범위를 확인하는 메서드
    public static boolean isValidMenu(int choice) {
        return choice >= 1 && choice <= MenuMessage.values().length;
    }
}
