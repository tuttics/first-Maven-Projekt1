
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BMICalculatorTest {

    @Test
    public void testConstructor() {
        BMICalculator bmiCalc = new BMICalculator("Max", "Mustermann", 180, 75, 'm');
        assertEquals("Max", bmiCalc.getFirstname());
        assertEquals("Mustermann", bmiCalc.getLastname());
        assertEquals(180, bmiCalc.getBodyHeight());
        assertEquals(75, bmiCalc.getBodyWeight());
        assertEquals('m', bmiCalc.getGender());
    }

    @Test
    public void testCalculateBMI() {
        BMICalculator bmiCalc = new BMICalculator("Anna", "Musterfrau", 170, 70, 'w');
        assertEquals(24.22, bmiCalc.calculateBMI(), 0.01);
    }

    @Test
    public void testCalculateBMICategory() {
        BMICalculator bmiCalc1 = new BMICalculator("Enoch", "Mabombo", 180, 120, 'm');
        BMICalculator bmiCalc2 = new BMICalculator("MAria", "Mbsuri", 170, 70, 'w');

        assertEquals(2, bmiCalc1.calculateBMICategory()); // männlich
        assertEquals(1, bmiCalc2.calculateBMICategory()); // weiblich
    }

    @Test
    public void testGetBMICategoryName() {
        BMICalculator bmiCalc = new BMICalculator("Max", "Mustermann", 180, 120, 'm');
        assertEquals("Sehr starkes Übergewicht", bmiCalc.getBMICategoryName());
    }
}

