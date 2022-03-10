package general;

/*
загруженности службы доставки
 */
public enum Workload {

    VERYHIGH(1.6),
    HIGH(1.4),
    INCREASED(1.2),
    DEFAULT(1.0);

    Workload(double priceMultiplier){
        this.priceMultiplier = priceMultiplier;

    }

    private double priceMultiplier;

    public double getPriceMultiplier(){
        return this.priceMultiplier;
    }
}
