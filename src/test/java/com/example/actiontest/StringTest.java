package com.example.actiontest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {

    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split_1() {
        String[] actual = "1,2".split(",");
        assertThat(actual).containsExactly("1", "2");
    }

    @Test
    void split_2() {
        String[] actual = "1".split(",");
        assertThat(actual).contains("1");
    }

    @Test
    void substring() {
        String s = "(1,2)";
        String actual = s.substring(1, s.length() -1);
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt - 인덱스 범위 초과")
    void charAt() {
        assertThatThrownBy(() -> "abc".charAt(4)).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("out of range: 4");
    }

}
