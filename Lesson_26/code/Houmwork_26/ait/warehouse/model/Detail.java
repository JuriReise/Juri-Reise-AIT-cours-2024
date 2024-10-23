package Houmwork_26.ait.warehouse.model;

public abstract class Detail {

    protected long barCode;
    protected double size;
    protected String material;
    protected String vendor;
    protected double weight;

    public Detail(long barCode, double size, String material, String vendor, double weight){

        this.barCode = barCode;
        this.size = size;
        this.material = material;
        this.vendor = vendor;
        this.weight = weight;
    }

    // Геттеры и сеттеры
    public long getBarCode() {
        return barCode;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Абстрактный метод
    public abstract void printInfo();
}
