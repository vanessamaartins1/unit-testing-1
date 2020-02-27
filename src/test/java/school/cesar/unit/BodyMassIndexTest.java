package school.cesar.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BodyMassIndexTest {

    @Test
    public void calculate_bmiUnder17_SeverelyUnderweight(){
        Assertions.assertEquals("Severely underweight", BodyMassIndex.calculate(16.9f));
    }

    @Test
    public void calculate_bmiBetween17And18Dot5_Underweight(){
        Assertions.assertEquals("Underweight", BodyMassIndex.calculate(18.49f));
    }

    @Test
    public void calculate_bmiBetween18Dot5And25_HealthyWeight(){
        Assertions.assertEquals("Healthy Weight", BodyMassIndex.calculate(24.9f));
    }

    @Test
    public void calculate_bmiBetween25And30_Overweight(){
        Assertions.assertEquals("Overweight", BodyMassIndex.calculate(29.9f));
    }

    @Test
    public void calculate_bmi30AndOver_Obese(){
        Assertions.assertEquals("Obese", BodyMassIndex.calculate(30));
    }
}
