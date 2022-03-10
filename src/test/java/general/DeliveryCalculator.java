package general;

import org.junit.jupiter.api.Test;

public class DeliveryCalculator {


    /*
    функцию расчёта стоимости доставки
    если возвращает -1 значит нельзя доставлять
     */
    public static double calculate(Distance distance, Dimensions dimensions
            , Workload workload, CargoFragility fragility){
        System.out.println("distance:" + distance + " " +  distance.getPriceAddition());
        System.out.println("dimensions:" +dimensions + " " + dimensions.getPriceAddition());
        System.out.println("workload:"+ workload + " " + workload.getPriceMultiplier());
        System.out.println("fragility:"+fragility + " " + fragility.getPriceAddition());

        if (distance == Distance.MORETHAN30 && fragility == CargoFragility.YES){
            return -1.0;
        }

        double sum = (distance.getPriceAddition() + dimensions.getPriceAddition() + fragility.getPriceAddition())
                * workload.getPriceMultiplier();
        System.out.println("(before check)sum " + sum);
        if (sum < 400.0){
            return 400.0;
        }

        return Math.round(sum);
    }
}
