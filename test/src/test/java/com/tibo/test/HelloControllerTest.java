package com.tibo.test;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloControllerTest {
    @Test
    public void testIndex() {
        HelloController helloController= new HelloController();

        String resultIndex = helloController.index();

        assertThat(resultIndex).isEqualTo("Hello !");
    }
}
