package weekThree.view.constans;

public enum MenuMessage {
    BUSINESS_CONTACT_ADD(1, "1. 비즈니스 연락처 추가"),
    PRIVATE_CONTACT_ADD(2, "2. 개인 연락처 추가"),
    CONTACT_PRINT(3, "3. 연락처 출력"),
    CONTACT_SEARCH(4, "4. 연락처 검색"),
    EXIT(5, "5. 종료"),
    ;

    private final int number;
    private final String message;

    MenuMessage(int number, String message) {
        this.number = number;
        this.message = message;
    }

    public int getNumber() {
        return number;
    }

    public String getMessage() {
        return message;
    }

    // 메뉴 범위를 확인하는 메서드
    public static boolean isValidMenu(int choice) {
        return choice >= 1 && choice <= MenuMessage.values().length;
    }

    // 주어진 번호에 해당하는 enum 값을 가져오는 메서드
    public static MenuMessage fromNumber(int number) {
        for (MenuMessage menu : MenuMessage.values()) {
            if (menu.getNumber() == number) {
                return menu;
            }
        }
        throw new IllegalArgumentException(ErrorMessage.INVALID_MENU_SELECTION.getMessage());
    }
}
