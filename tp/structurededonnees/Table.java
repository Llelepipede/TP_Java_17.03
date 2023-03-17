package tp.structurededonnees;

import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Table<E> {

    private E[] data;
    private Table(E ...args){
        this.data = args;
    }

    public static Table of(Object ...args){
        for (Object elem:
             args) {
            if (elem == null){
                throw new NullPointerException();
            }
        }
        return new Table(args);
    }

    public int size(){
        return data.length;
    }

    public <T,R> HashMap<T,R[]> groupBy(E Function, Function<T,R> pfunc){
            HashMap<T,R[]> ret = new HashMap<>();

            return ret;
    }


}
