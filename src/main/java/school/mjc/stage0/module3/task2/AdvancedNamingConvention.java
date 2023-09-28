package school.mjc.stage0.module3.task2;

public class advancedNamingConvention {
    private static final int adult_age = 18;

    private int AGE;
    private int phoneNumber;

    void CAllToFriend() {
        System.out.println("Calling to Friend" + AGE + phoneNumber);
    }

    void callByNumber(int Number) {
        System.out.println("Calling by number" + Number);
    }
}
