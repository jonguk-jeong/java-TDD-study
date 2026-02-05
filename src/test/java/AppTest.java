import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @Test
    @DisplayName("1 + 2 = 3")
    void t1() {
        App app = new App();
        int rst = app.plus(1, 2);

        assertThat(rst).isEqualTo(3);   // rst 실행해서 3이 나오면 참
    }

    @Test
    @DisplayName("10 + 20 = 30")
    void t2() {
        App app = new App();
        int rst = app.plus(10, 20);

        assertThat(rst).isEqualTo(30);   // rst 실행해서 30이 나오면 참
    }

    @Test
    @DisplayName("0 + 5 = 5")
    void t3() {
        App app = new App();
        int rst = app.plus(0, 5);

        assertThat(rst).isEqualTo(5);
    }
}

// assertThat Alt + Enter 누르고 import static
// import static org.assertj.core.api.Assertions.assertThat;
// 맥은 option + Enter