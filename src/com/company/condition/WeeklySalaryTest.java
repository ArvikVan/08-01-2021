package com.company.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class WeeklySalaryTest {
    @Test
    public void calculateIs250() {
        int[] hours = {5, 5, 5, 5, 5, 5, 0};
        int rsl = WeeklySalary.calculate(hours);
        assertThat(rsl, is(350));
    }

    @Test
    public void calculateIs400() {
        int[] hours = {8, 8, 8, 8, 8, 0, 0};
        int rsl = WeeklySalary.calculate(hours);
        assertThat(rsl, is(400));
    }

    @Test
    public void calculateIs410() {
        int[] hours = {10, 10, 10, 0, 8, 0, 9};
        int rsl = WeeklySalary.calculate(hours);
        assertThat(rsl, is(600));
    }

    @Test
    public void calculateIs690() {
        int[] hours = {10, 0, 12, 0, 8, 12, 4};
        int rsl = WeeklySalary.calculate(hours);
        assertThat(rsl, is(690));
    }
}