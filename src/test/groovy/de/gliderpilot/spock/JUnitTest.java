package de.gliderpilot.spock;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class JUnitTest {

    // subject
    private List<String> list = new ArrayList<>();

    // issue #1234
    @Test
    public void is_empty_after_creation() {
        // expect
        assertTrue(list.isEmpty());
    }

    // issue #123
    @Test
    public void size_is_one_after_adding_one_element() {
        // when
        list.add("Paul");

        // then
        assertThat(list.size(), is(1));
    }

    @Test
    public void contains_the_element_after_insertion() {
        // when
        list.add("Paul");

        // then
        assertNotNull(list.stream().filter(entry -> entry.equals("Paul")).findFirst().get());
    }

    @Test
    public void may_contain_duplicates() {
        // when
        list.add("Paul");
        list.add("Paul");

        // then
        assertThat(list.size(), is(2));
    }
}
