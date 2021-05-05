package com.company.collections.map;

import org.junit.Test;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static com.company.collections.map.Weather.Info;

public class WeatherTest {
    @Test
    public void editData() {
        List<Info> list = List.of(
                new Info("Minsk", 25), new Info("Brest", 5), new Info("Grodna", 33),
                new Info("Gomel", 26), new Info("Minsk", 15), new Info("Vitebsk", 18),
                new Info("Grodna", 18), new Info("Brest", 18), new Info("Gomel", 40),
                new Info("Minsk", 55), new Info("Vitebsk", 36), new Info("Minsk", 30),
                new Info("Gomel", 15), new Info("Grodna", 15), new Info("Brest", 40)
        );
        List<Info> rsl = Weather.editData(list);
        List<Info> expected = List.of(
                new Info("Gomel", 81),
                new Info("Vitebsk", 54),
                new Info("Brest", 63),
                new Info("Grodna", 66),
                new Info("Minsk", 125)
        );
        assertThat(rsl, is(expected));
    }
}