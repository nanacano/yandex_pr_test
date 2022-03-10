package general;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeliveryCalculatorTest {


    @Test
    public void deliveryCalcTest0(){
        double result = DeliveryCalculator.calculate(Distance.MORETHAN30, Dimensions.SMALL
                , Workload.DEFAULT, CargoFragility.YES);
        System.out.println(result);
        Assertions.assertEquals(-1.0, result);
    }


    @Test
    public void deliveryCalcTest1(){
        double result = DeliveryCalculator.calculate(Distance.LOWERTHAN2, Dimensions.SMALL
                , Workload.DEFAULT, CargoFragility.NO);
        System.out.println(result);
        Assertions.assertEquals(400.0, result);
    }

    @Test
    public void deliveryCalcTest2(){
        double result = DeliveryCalculator.calculate(Distance.LOWERTHAN10, Dimensions.SMALL
                , Workload.HIGH, CargoFragility.NO);
        Assertions.assertEquals(400.0, result);
    }

    @Test
    public void deliveryCalcTest3(){
        double result = DeliveryCalculator.calculate(Distance.LOWERTHAN30, Dimensions.LARGE
                , Workload.DEFAULT, CargoFragility.NO);
        Assertions.assertEquals(400.0, result);
    }

    @Test
    public void deliveryCalcTest4(){
        double result = DeliveryCalculator.calculate(Distance.MORETHAN30, Dimensions.LARGE
                , Workload.VERYHIGH, CargoFragility.NO);
        Assertions.assertEquals(800.0, result);
    }

}
