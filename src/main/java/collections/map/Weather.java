package com.company.collections.map;
//13. Данные об осадках
//1. city - название города, где производились наблюдения;
//2. rainfall - количество осадков которые выпали в этом городе за период наблюдения.
//Необходимо реализовать метод так, чтобы в результате вернулся список объектов Info
// в котором будет указано имя города наблюдения и общее количество осадков за период наблюдения.
import java.util.*;

public class Weather {
    public static List<Info> editData(List<Info> list) {
        List<Info> rsl = new ArrayList<>();
      Map<String, Integer> map = new HashMap<>();
        for (Info info : list) {
            map.computeIfPresent(info.getCity(), (k, v) -> v + info.getRainfall());
            map.putIfAbsent(info.getCity(), info.getRainfall());
        }
        for (String str : map.keySet()) {
            rsl.add(new Info(str, map.get(str)));
        }
        return rsl;
    }

    public static class Info {
        private String city;

        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall
                   && Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}
