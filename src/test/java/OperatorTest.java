import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperatorTest {

    private Operator operator = new Operator();


    @Test
    public void isValidNumber(){
       assertEquals(operator.getOperator("691131446"), Operator.ORANGE);
       assertEquals(operator.getOperator("691131446"), Operator.ORANGE);
       assertEquals(operator.getOperator("661131446"), Operator.NEXTTEL);
       assertEquals(operator.getOperator("678986466"), Operator.MTN);
       assertEquals(operator.getOperator("650986466"), Operator.MTN);
       assertEquals(operator.getOperator("651986466"), Operator.MTN);
       assertEquals(operator.getOperator("652986466"), Operator.MTN);
       assertEquals(operator.getOperator("653986466"), Operator.MTN);
       assertEquals(operator.getOperator("654986466"), Operator.MTN);
       assertEquals(operator.getOperator("655986466"), Operator.ORANGE);
       assertEquals(operator.getOperator("656986466"), Operator.ORANGE);
       assertEquals(operator.getOperator("657986466"), Operator.ORANGE);
       assertEquals(operator.getOperator("658986466"), Operator.ORANGE);
       assertEquals(operator.getOperator("659986466"), Operator.ORANGE);

        assertEquals(operator.getOperator("680986466"), Operator.MTN);
        assertEquals(operator.getOperator("681986466"), Operator.MTN);
        assertEquals(operator.getOperator("682986466"), Operator.MTN);

    }

    @Test
    public void isInvalid(){
        assertEquals(operator.getOperator("66"), Operator.UNKNOWN);
    }
}
