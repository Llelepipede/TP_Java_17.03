package tp.poo.rental;

import java.util.Objects;

public abstract class Locomotion implements ExpirationToSell{

    protected int years;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Locomotion that = (Locomotion) o;
        return years == that.years;
    }

    @Override
    public int hashCode() {
        return Objects.hash(years);
    }

    public int getYears() {
        return years;
    }
}
