package tp.poo.rental;

import java.util.Objects;

public class Car extends Locomotion {
    private String Model;

    public Car(String brand,int years){
        if (brand == null){
            throw new NullPointerException("Already connected");
        }
        this.Model = brand;
        this.years = years;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(Model, car.Model);
    }

    @Override
    public String toString() {
        return Model +" "+ years;
    }

    @Override
    public int ExpirationDate() {
        return 2;
    }

    public Car get(){
        return this;
    }


    public Boolean isPresent(){
        return this != null;
    }

    public String getModel() {
        return Model;
    }
}
