package calculator.object;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DelimitersTest {

    @Test
    void 커스텀_구분자_사용_테스트() {
        // given
        String input = "//;\\n1;2;3";
        Delimiters delimiters = new Delimiters(input);
        // when
        List<String> result = delimiters.getDelimiters();
        String inputStr = delimiters.getPureString();

        // then
        assertThat(result).containsExactly(";", ",", ":");
        assertThat(inputStr).isEqualTo("1;2;3");
    }

    @Test
    void 기본_구분자_사용_테스트() {
        // given
        String input = "1,2;3";
        Delimiters delimiters = new Delimiters(input);

        // when
        List<String> result = delimiters.getDelimiters();
        String inputStr = delimiters.getPureString();


        // then
        assertThat(result).containsExactly(",", ":");
        assertThat(inputStr).isEqualTo("1,2;3");

    }
}