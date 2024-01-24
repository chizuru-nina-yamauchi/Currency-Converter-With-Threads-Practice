import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void shouldConvertUSDToEURWithGivenRate(){
        assertDoesNotThrow(() ->{
            double result = Main.performCurrencyConversion(100,"USD", "EUR");
            assertEquals(85, result, 0.01); // assume a conversion rate: 0.85

                }

        );
    }


}