package de.gliderpilot.spock;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class JUnitTest {

    // subject
    private List<String> list = new ArrayList<>();

    @Test
    public void is_empty_after_creation() {
        // expect
        assertTrue(list.isEmpty());
    }

    @Test
    public void size_is_one_after_adding_one_element() {
        // when
        list.add("Paul");

        // then
        assertThat(list.size(), is(1));
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
