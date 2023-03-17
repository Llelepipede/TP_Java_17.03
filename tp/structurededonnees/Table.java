package tp.structurededonnees;

import java.util.Comparator;
import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Table<E>{

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

    public <T,R> HashMap<T,R[]> groupBy(Comparable<T> value, Comparator<T> pfunc){
        HashMap<T,R[]> ret = new HashMap<>();
        for (int i = 0; i < data.length; i++) {

        }
        return ret;
    }

}
