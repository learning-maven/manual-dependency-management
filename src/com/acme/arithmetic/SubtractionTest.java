package com.acme.arithmetic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SubtractionTest {

    @Test
    public void hopefully_basic_subtraction_works() {
        assertThat(4-2, equalTo(2));
    }
}
