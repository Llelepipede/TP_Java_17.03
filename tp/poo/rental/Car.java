package tp.poo.rental;

public class Car extends Locomotion {
    private String Model;

    public Car(String brand,int years){
        this.Model = brand;
        this.years = years;
    }

    @Override
    public String toString() {
        return Model +" "+ years;
    }

    @Override
    public int ExpirationDate() {
        return 2;
    }

    public String getModel() {
        return Model;
    }
}
