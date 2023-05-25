// B201202002
// AYSE NUR YILMAZ
// SWE202 SOFTWARE VERIFICATION AND VALIDATION
// HOMEWORK 1
// https://github.com/aysenrr?tab=repositories


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDivision6() {

        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5, 0),
                "IllegalArgumentException expected."
        );
    }

    @ParameterizedTest
    @CsvSource({"10,2,5",
            "10,4,2.5",
            "12.5,5,2.5",
            "10,2.5,4",
            "12.5,2.5,5"})

    void Division(double x, double y, double result){
        assertEquals(result,Calculator.divide(x,y));
    }


}