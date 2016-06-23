package com.company;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by lmiglio on 6/22/16.
 */
public class DeltaTest {

    @Test
    public void shouldDelta() {

        Delta delta = new Delta(1, -5, 6);
        assertThat(delta.deltaCalc(), is(1));

    }

    @Test
    public void shouldDeltaNegative() {

        Delta delta = new Delta(1, 1, 1);
        assertThat(delta.deltaCalc(), is(-3));

    }

}
