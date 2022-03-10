package general;

/*
хрупкости груза.
 */
public enum CargoFragility {

    YES(300.0),
    NO(0.0);

    CargoFragility(double priceAddition){
        this.priceAddition = priceAddition;

    }

    private double priceAddition;

    public double getPriceAddition(){
        return this.priceAddition;
    }
}
