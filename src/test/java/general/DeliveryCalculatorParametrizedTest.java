package general;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class DeliveryCalculatorParametrizedTest {


    @ParameterizedTest
    @MethodSource("provideDataForDeliveryCalc_workloadDEFAULT")
    void DeliveryCalcTest1_workloadDEFAULT(double expectedResult, Distance distance
            , Dimensions dimensions ,Workload workload, CargoFragility fragility ) {
        double actualResult = DeliveryCalculator.calculate(distance, dimensions, workload, fragility);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("provideDataForDeliveryCalc_workloadINCREASED")
    void DeliveryCalcTest2_workloadINCREASED(double expectedResult, Distance distance
            , Dimensions dimensions ,Workload workload, CargoFragility fragility ) {
        double actualResult = DeliveryCalculator.calculate(distance, dimensions, workload, fragility);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("provideDataForDeliveryCalc_workloadHIGH")
    void DeliveryCalcTest3_workloadHIGH(double expectedResult, Distance distance
            , Dimensions dimensions ,Workload workload, CargoFragility fragility ) {
        double actualResult = DeliveryCalculator.calculate(distance, dimensions, workload, fragility);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("provideDataForDeliveryCalc_workloadVERYHIGH")
    void DeliveryCalcTest4_workloadVERYHIGH(double expectedResult, Distance distance
            , Dimensions dimensions ,Workload workload, CargoFragility fragility ) {
        double actualResult = DeliveryCalculator.calculate(distance, dimensions, workload, fragility);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    /*
    Workload.DEFAULT
     */
    private static Stream<Arguments> provideDataForDeliveryCalc_workloadDEFAULT() {
        return Stream.of(
                Arguments.of(400.0, Distance.LOWERTHAN2, Dimensions.SMALL, Workload.DEFAULT, CargoFragility.NO),
                Arguments.of(400.0, Distance.LOWERTHAN2, Dimensions.LARGE, Workload.DEFAULT, CargoFragility.NO),
                Arguments.of(450.0, Distance.LOWERTHAN2, Dimensions.SMALL, Workload.DEFAULT, CargoFragility.YES),
                Arguments.of(550.0, Distance.LOWERTHAN2, Dimensions.LARGE, Workload.DEFAULT, CargoFragility.YES),

                Arguments.of(400.0, Distance.LOWERTHAN10, Dimensions.SMALL, Workload.DEFAULT, CargoFragility.NO),
                Arguments.of(400.0, Distance.LOWERTHAN10, Dimensions.LARGE, Workload.DEFAULT, CargoFragility.NO),
                Arguments.of(500.0, Distance.LOWERTHAN10, Dimensions.SMALL, Workload.DEFAULT, CargoFragility.YES),
                Arguments.of(600.0, Distance.LOWERTHAN10, Dimensions.LARGE, Workload.DEFAULT, CargoFragility.YES),

                Arguments.of(400.0, Distance.LOWERTHAN30, Dimensions.SMALL, Workload.DEFAULT, CargoFragility.NO),
                Arguments.of(400.0, Distance.LOWERTHAN30, Dimensions.LARGE, Workload.DEFAULT, CargoFragility.NO),
                Arguments.of(600.0, Distance.LOWERTHAN30, Dimensions.SMALL, Workload.DEFAULT, CargoFragility.YES),
                Arguments.of(700.0, Distance.LOWERTHAN30, Dimensions.LARGE, Workload.DEFAULT, CargoFragility.YES),

                Arguments.of(400.0, Distance.MORETHAN30, Dimensions.SMALL, Workload.DEFAULT, CargoFragility.NO),
                Arguments.of(500.0, Distance.MORETHAN30, Dimensions.LARGE, Workload.DEFAULT, CargoFragility.NO),
                Arguments.of(-1.0, Distance.MORETHAN30, Dimensions.SMALL, Workload.DEFAULT, CargoFragility.YES),
                Arguments.of(-1.0, Distance.MORETHAN30, Dimensions.LARGE, Workload.DEFAULT, CargoFragility.YES)
        );
    }

    /*
    Workload.INCREASED
     */
    private static Stream<Arguments> provideDataForDeliveryCalc_workloadINCREASED() {
        return Stream.of(
                Arguments.of(400.0, Distance.LOWERTHAN2, Dimensions.SMALL, Workload.INCREASED, CargoFragility.NO),
                Arguments.of(400.0, Distance.LOWERTHAN2, Dimensions.LARGE, Workload.INCREASED, CargoFragility.NO),
                Arguments.of(540.0, Distance.LOWERTHAN2, Dimensions.SMALL, Workload.INCREASED, CargoFragility.YES),
                Arguments.of(660.0, Distance.LOWERTHAN2, Dimensions.LARGE, Workload.INCREASED, CargoFragility.YES),

                Arguments.of(400.0, Distance.LOWERTHAN10, Dimensions.SMALL, Workload.INCREASED, CargoFragility.NO),
                Arguments.of(400.0, Distance.LOWERTHAN10, Dimensions.LARGE, Workload.INCREASED, CargoFragility.NO),
                Arguments.of(600.0, Distance.LOWERTHAN10, Dimensions.SMALL, Workload.INCREASED, CargoFragility.YES),
                Arguments.of(720.0, Distance.LOWERTHAN10, Dimensions.LARGE, Workload.INCREASED, CargoFragility.YES),

                Arguments.of(400.0, Distance.LOWERTHAN30, Dimensions.SMALL, Workload.INCREASED, CargoFragility.NO),
                Arguments.of(480.0, Distance.LOWERTHAN30, Dimensions.LARGE, Workload.INCREASED, CargoFragility.NO),
                Arguments.of(720.0, Distance.LOWERTHAN30, Dimensions.SMALL, Workload.INCREASED, CargoFragility.YES),
                Arguments.of(840.0, Distance.LOWERTHAN30, Dimensions.LARGE, Workload.INCREASED, CargoFragility.YES),

                Arguments.of(480.0, Distance.MORETHAN30, Dimensions.SMALL, Workload.INCREASED, CargoFragility.NO),
                Arguments.of(600.0, Distance.MORETHAN30, Dimensions.LARGE, Workload.INCREASED, CargoFragility.NO),
                Arguments.of(-1.0, Distance.MORETHAN30, Dimensions.SMALL, Workload.INCREASED, CargoFragility.YES),
                Arguments.of(-1.0, Distance.MORETHAN30, Dimensions.LARGE, Workload.INCREASED, CargoFragility.YES)
        );
    }

    /*
Workload.HIGH
 */
    private static Stream<Arguments> provideDataForDeliveryCalc_workloadHIGH() {
        return Stream.of(
                Arguments.of(400.0, Distance.LOWERTHAN2, Dimensions.SMALL, Workload.HIGH, CargoFragility.NO),
                Arguments.of(400.0, Distance.LOWERTHAN2, Dimensions.LARGE, Workload.HIGH, CargoFragility.NO),
                Arguments.of(630.0, Distance.LOWERTHAN2, Dimensions.SMALL, Workload.HIGH, CargoFragility.YES),
                Arguments.of(770.0, Distance.LOWERTHAN2, Dimensions.LARGE, Workload.HIGH, CargoFragility.YES),

                Arguments.of(400.0, Distance.LOWERTHAN10, Dimensions.SMALL, Workload.HIGH, CargoFragility.NO),
                Arguments.of(420.0, Distance.LOWERTHAN10, Dimensions.LARGE, Workload.HIGH, CargoFragility.NO),
                Arguments.of(700.0, Distance.LOWERTHAN10, Dimensions.SMALL, Workload.HIGH, CargoFragility.YES),
                Arguments.of(840.0, Distance.LOWERTHAN10, Dimensions.LARGE, Workload.HIGH, CargoFragility.YES),

                Arguments.of(420.0, Distance.LOWERTHAN30, Dimensions.SMALL, Workload.HIGH, CargoFragility.NO),
                Arguments.of(560.0, Distance.LOWERTHAN30, Dimensions.LARGE, Workload.HIGH, CargoFragility.NO),
                Arguments.of(840.0, Distance.LOWERTHAN30, Dimensions.SMALL, Workload.HIGH, CargoFragility.YES),
                Arguments.of(980.0, Distance.LOWERTHAN30, Dimensions.LARGE, Workload.HIGH, CargoFragility.YES),

                Arguments.of(560.0, Distance.MORETHAN30, Dimensions.SMALL, Workload.HIGH, CargoFragility.NO),
                Arguments.of(700.0, Distance.MORETHAN30, Dimensions.LARGE, Workload.HIGH, CargoFragility.NO),
                Arguments.of(-1.0, Distance.MORETHAN30, Dimensions.SMALL, Workload.HIGH, CargoFragility.YES),
                Arguments.of(-1.0, Distance.MORETHAN30, Dimensions.LARGE, Workload.HIGH, CargoFragility.YES)
        );
    }


    /*
Workload.VERYHIGH
 */
    private static Stream<Arguments> provideDataForDeliveryCalc_workloadVERYHIGH() {
        return Stream.of(
                Arguments.of(400.0, Distance.LOWERTHAN2, Dimensions.SMALL, Workload.VERYHIGH, CargoFragility.NO),
                Arguments.of(400.0, Distance.LOWERTHAN2, Dimensions.LARGE, Workload.VERYHIGH, CargoFragility.NO),
                Arguments.of(720.0, Distance.LOWERTHAN2, Dimensions.SMALL, Workload.VERYHIGH, CargoFragility.YES),
                Arguments.of(880.0, Distance.LOWERTHAN2, Dimensions.LARGE, Workload.VERYHIGH, CargoFragility.YES),

                Arguments.of(400.0, Distance.LOWERTHAN10, Dimensions.SMALL, Workload.VERYHIGH, CargoFragility.NO),
                Arguments.of(480.0, Distance.LOWERTHAN10, Dimensions.LARGE, Workload.VERYHIGH, CargoFragility.NO),
                Arguments.of(800.0, Distance.LOWERTHAN10, Dimensions.SMALL, Workload.VERYHIGH, CargoFragility.YES),
                Arguments.of(960.0, Distance.LOWERTHAN10, Dimensions.LARGE, Workload.VERYHIGH, CargoFragility.YES),

                Arguments.of(480.0, Distance.LOWERTHAN30, Dimensions.SMALL, Workload.VERYHIGH, CargoFragility.NO),
                Arguments.of(640.0, Distance.LOWERTHAN30, Dimensions.LARGE, Workload.VERYHIGH, CargoFragility.NO),
                Arguments.of(960.0, Distance.LOWERTHAN30, Dimensions.SMALL, Workload.VERYHIGH, CargoFragility.YES),
                Arguments.of(1120.0, Distance.LOWERTHAN30, Dimensions.LARGE, Workload.VERYHIGH, CargoFragility.YES),

                Arguments.of(640.0, Distance.MORETHAN30, Dimensions.SMALL, Workload.VERYHIGH, CargoFragility.NO),
                Arguments.of(800.0, Distance.MORETHAN30, Dimensions.LARGE, Workload.VERYHIGH, CargoFragility.NO),
                Arguments.of(-1.0, Distance.MORETHAN30, Dimensions.SMALL, Workload.VERYHIGH, CargoFragility.YES),
                Arguments.of(-1.0, Distance.MORETHAN30, Dimensions.LARGE, Workload.VERYHIGH, CargoFragility.YES)
        );
    }
}
