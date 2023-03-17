package tp.poo.rental;

public class Camel extends Locomotion {


    public Camel(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return  "camel "+ years;
    }


    @Override
    public int ExpirationDate() {
        return 5;
    }
}
