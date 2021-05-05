package com.company.condition;

public class AttackRook {
    public static boolean check(String left, String right) {
        if (left.charAt(0) == right.charAt(0)) {
            return true;
        } else if (left.charAt(1) == right.charAt(1)) {
            return true;
        }
        return false;
    }
}
