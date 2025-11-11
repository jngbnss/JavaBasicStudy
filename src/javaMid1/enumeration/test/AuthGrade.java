package javaMid1.enumeration.test;

public enum AuthGrade {
    Guest(1,"손님"),LOGIN(2,"로그인 회원"),ADMIN(3,"관리자");

    private int level;
    private String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }
}
