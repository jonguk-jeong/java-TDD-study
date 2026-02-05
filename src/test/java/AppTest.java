import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @Test
    void t1() {
        App app = new App();
        int rst = app.plus(1, 2);

        assertThat(rst).isEqualTo(3);   // rst 실행해서 3이 나오면 참
    }
}

// assertThat Alt + Enter 누르고 3번째