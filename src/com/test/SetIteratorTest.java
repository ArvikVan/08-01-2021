package com.test;

import com.company.collections.coll.SetIterator;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SetIteratorTest {
    @Test
    public void main() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        SetIterator.main(null);
        String ln = System.lineSeparator();
        String expected = "Next element exist? - true." + ln
                + "five" + ln
                + "Next element exist? - true." + ln
                + "four" + ln
                + "Next element exist? - true." + ln
                + "one" + ln
                + "Next element exist? - true." + ln
                + "three" + ln
                + "Next element exist? - true." + ln
                + "two" + ln;
        assertThat(out.toString(), is(expected));
    }
}