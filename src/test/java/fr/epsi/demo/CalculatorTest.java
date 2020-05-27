package fr.epsi.demo;



import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.rules.ExpectedException;


public class CalculatorTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @DisplayName("Verification addition")
    @ParameterizedTest(name = "{index} => a={0}, b={1}, sum={2}")
    @CsvSource({
            "1, 1, 2",
            "2, 3, 5"
    })
    public void should_return_correct_result_when_operator_add_is_used(int a, int b, int sum) throws UnknownOperatorException {
        int result =  Calculator.calculate(a,b, "+");
        Assertions.assertEquals(sum, result);
    }


    @Test
    public void should_return_correct_result_when_operator_div_is_used() throws UnknownOperatorException {
        int result = Calculator.calculate(10,2, "/");
        Assertions.assertEquals(5, result);
    }

    @Test
    public void should_return_correct_result_when_operator_multi_is_used() throws UnknownOperatorException {
        int result = Calculator.calculate(10,2, "*");
        Assertions.assertEquals(20, result);
    }

    @Test
    public void should_return_correct_result_when_operator_subs_is_used() throws UnknownOperatorException {
        int result = Calculator.calculate(10,2, "-");
        Assertions.assertEquals(8, result);
    }

    @Test(expected = UnknownOperatorException.class)
    public void should_return_exception_when_operator_not_supported() throws UnknownOperatorException{
        //expectedException.expect(UnknownOperatorException.class);
         int result = Calculator.calculate(10, 3, "%");
        System.out.println(result);
        //Assertions.assertThrows(UnknownOperatorException.class, () -> Calculator.calculate(4,5,"%"));





    }
}
