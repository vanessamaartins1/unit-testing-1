package school.cesar.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    public void calculate_callAmountForEight() {
        class FactorialSpy extends Factorial {
            public int callAmount = 0;

            @Override
            public int calculate(int number) {
                callAmount++;
                return super.calculate(number);
            }
        }

        FactorialSpy spy = new FactorialSpy();
        spy.calculate(8);

        Assertions.assertEquals(8,spy.callAmount);

    }
}
