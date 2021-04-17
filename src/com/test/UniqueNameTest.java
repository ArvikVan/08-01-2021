package com.test;

import com.company.collections.coll.UniqueName;
import com.company.collections.coll.User;
import org.junit.Test;

import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UniqueNameTest {
    @Test
    public void collectUniqueName() {
        List<com.company.collections.coll.User> users = List.of(
                new User(1, "name1"),
                new User(2, "name2"),
                new User(3, "name1"),
                new User(4, "name3"),
                new User(5, "name5"),
                new User(6, "name3")
        );
        int rsl = UniqueName.collectUniqueName(users);
        int expected = 4;
        assertThat(rsl, is(expected));
    }
}