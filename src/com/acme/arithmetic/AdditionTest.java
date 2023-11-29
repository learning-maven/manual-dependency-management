package com.acme.arithmetic;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AdditionTest {

    @Test
    public void hopefully_basic_addition_works() {
        assertThat(2+2, equalTo(4));
    }
}
