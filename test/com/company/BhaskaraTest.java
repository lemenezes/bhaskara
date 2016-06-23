package com.company;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class BhaskaraTest {

    @Test
    public void shouldGetX1IsThree() {

        Bhaskara bhaskara = new Bhaskara(1, -5, 6);
        assertThat(bhaskara.getX1(), is(3));

    }

    @Test
    public void shouldReturnGetX2isTwo() {

        Bhaskara bhaskara = new Bhaskara(1, -5, 6);
        assertThat(bhaskara.getX2(), is(2));
    }

}
