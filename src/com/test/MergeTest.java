package com.test;

import com.company.collections.map.Merge;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MergeTest {
    @Test
    public void collectData() {
        Map<Integer, String> names = new HashMap<>(Map.of(1, "name1", 2, "name2"));
        List<Merge.User> users = List.of(
                new Merge.User(1, "name1", "surname1"),
                new Merge.User(2, "name2", "surname2"),
                new Merge.User(3, "name3", "surname3"),
                new Merge.User(4, "name4", "surname4")
        );
        Map<Integer, String> rsl = Merge.collectData(names, users);
        Map<Integer, String> expected = Map.of(
                1, "name1 surname1",
                2, "name2 surname2",
                3, "name3 surname3",
                4, "name4 surname4"
        );
        assertThat(rsl, is(expected));
    }
}