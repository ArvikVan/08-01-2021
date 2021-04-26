package com.test;

import com.company.stream.DistinctForObject;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DistinctForObjectTest {

    @Test
    public void test() {
        DistinctForObject.User user1 = new DistinctForObject.User("A", 20);
        DistinctForObject.User user2 = new DistinctForObject.User("B", 20);
        DistinctForObject.User user3 = new DistinctForObject.User("A", 21);
        DistinctForObject.User user4 = new DistinctForObject.User("A", 20);
        assertEquals(
                List.of(user1, user2, user3),
                DistinctForObject.distinct(List.of(
                        user1, user2, user3, user4
                ))
        );
    }

}