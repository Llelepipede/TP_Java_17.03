package tp.poo.rental;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CarRental {

    private List<Locomotion> LocomotionList;

    public CarRental(){
        this.LocomotionList = new ArrayList<>();
    }

    public void add(Locomotion car){
        Objects.requireNonNull(car, "car must not be null");
        LocomotionList.add(car);
    }
    public void remove(Locomotion car){
        System.out.println("tested");
        Objects.requireNonNull(car, "car must not be null");
        System.out.println("tested");
        for (int i = 0; i < LocomotionList.size(); i++) {
            if (LocomotionList.get(i).equals(car) && car.getClass() == LocomotionList.get(i).getClass()){
                LocomotionList.remove(i);
                return;
            }
        }
    }

    public List<Locomotion> toSell(){
        List<Locomotion> ret = new ArrayList<>();
        int currentYear = LocalDate.now().getYear();
        for (int i = 0; i < LocomotionList.size(); i++) {
            if (LocomotionList.get(i).getYears() <= currentYear - LocomotionList.get(i).ExpirationDate() ){
                ret.add(LocomotionList.get(i));
            }
        }
        return ret;
    }

    @Override
    public String toString() {
        String ret = "";
        for (int i = 0; i < LocomotionList.size(); i++) {
            ret+= LocomotionList.get(i).toString();
            ret += i != LocomotionList.size()-1 ? "\n":"";
        }
        return ret;
    }

    public Car findACarByModel(String model){
        for (int i = 0; i < LocomotionList.size(); i++) {
            if (LocomotionList.get(i) instanceof Car){
                Car car = (Car) LocomotionList.get(i);
                if (car.getModel() == model){
                    return car;
                }
            }
        }
        return null;


    }
}


