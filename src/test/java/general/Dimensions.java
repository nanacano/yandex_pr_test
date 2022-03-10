package general;
/*
габаритов груза:
 */
public enum Dimensions {

    LARGE(200.0),
    SMALL(100.0);

    Dimensions(double priceAddition){
        this.priceAddition = priceAddition;

    }

    private double priceAddition;

    public double getPriceAddition(){
        return this.priceAddition;
    }
}
