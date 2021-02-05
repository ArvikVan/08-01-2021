package com.company.oop.legasy;

import java.util.Arrays;

public class enumEx2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(DayOfWeek.values()));
        //.values() возвращает перечень всего что находится в enum
        int sundayIndex = DayOfWeek.SUNDAY.ordinal();
        System.out.println(".ordinal() " + sundayIndex);
        //.ordinal() возвращает индекс искомого
    }
    private ScholarSchedule scholarSchedule;
    private boolean goToSchool;
    public void wakeup(){
        if (this.scholarSchedule.getDayOfWeek()==DayOfWeek.SATURDAY){
            System.out.println("Ura i can sleep more...");
        }else System.out.println("Again at school");
    }

}

enum DayOfWeek{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}