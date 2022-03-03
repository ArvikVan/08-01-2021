package condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int salary = 0;
        int pererabotka;

        for (int i = 0; i < 7; i++) {
            if ((hours[i] <= 8) && ((i != 5) && (i != 6))) {
                salary = salary + hours[i] * 10;
            } else if ((hours[i] > 8) && ((i != 5) && (i != 6))) {
                pererabotka = hours[i] - 8;
                salary += 80 + pererabotka * 15;
            } else if ((i == 5) && (hours[i] <= 8)) {
                salary += hours[i] * 20;
            } else if ((i == 5) && (hours[i] > 8)) {
                pererabotka = hours[i] - 8;
                salary += 160 + pererabotka * 30;
            } else if ((i == 6) && (hours[i] <= 8)) {
                salary += hours[i] * 20;
            } else if ((i == 6) && (hours[i] > 8)) {
                pererabotka = hours[i] - 8;
                salary += 160 + pererabotka * 30;
            }
        } return salary;
    }

}
