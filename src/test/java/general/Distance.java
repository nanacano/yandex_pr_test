package general;

/*
расстояния до пункта назначения:
 */
public enum Distance {

    MORETHAN30(300.0),
    LOWERTHAN30(200.0),
    LOWERTHAN10(100.0),
    LOWERTHAN2(50.0);

    Distance(double priceAddition){
        this.priceAddition = priceAddition;

    }

    private double priceAddition;

    public double getPriceAddition(){
        return this.priceAddition;
    }
}
