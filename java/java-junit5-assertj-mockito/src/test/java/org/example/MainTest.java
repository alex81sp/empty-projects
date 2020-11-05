package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void shouldSayHello() {
        Assertions.assertThat("Say bye").isEqualTo("Say hello");
    }

}