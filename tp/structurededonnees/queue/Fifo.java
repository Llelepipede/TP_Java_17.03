package tp.structurededonnees.queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;

public class Fifo {

    private int tail;
    private int head;
    private Object[] data;

    public Fifo(int size) {
        if (size  <= 0){
            throw new IllegalArgumentException();

        }else {
            this.data = new Object[size];
            head = 0;
            tail = 0;
        }

    }

    private void Grow(int newSize){
        Object[] ret = new Object[newSize];
        for (int i = 0; i < data.length; i++) {
            ret[i] = data[i];
        }
        data = ret;
    }

    public void Slide(int diff){
        if ((diff < 0 && tail + diff >= 0) || (diff > 0 && head + diff <= data.length)){
            if (diff < 0){
                for (int y = 0; y < (diff < 0 ? -diff:diff) ; y++) {
                    for (int i = 0; i < data.length-1; i++) {

                        var temp = data[i];
                        data[i] = data[i+1];
                        data[i+1] = temp;
                    }
                }
            }
            if (diff > 0){
                for (int i = 0; i < data.length-1; i++) {
                    var temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                }
            }
            tail+=diff;
            head+=diff;
        }else{
            System.out.println("probleme de slide");
        }
    }

    public void offer(Object added){

        Objects.requireNonNull(added);
        if (head ==data.length) {
            if (tail != 0){
                Slide(tail * -1);
            }else {
//                Grow(data.length+10);
                throw new IllegalStateException();
            }
        }
        data[head] = added;
        head+=1;
    }


    public Object poll(){
        if (tail == head){
            throw new IllegalStateException();
        }else {
            return data[tail++];
        }
    }

    @Override
    public String toString() {
        String ret ="[";
        for (int i = tail; i < head; i++) {
            ret += data[i].toString();
            if (i!=head-1)
                ret += ", ";
        }
        ret+="]";
        return ret;
    }

    public int size(){
        return head - tail;
    }
    public boolean isEmpty(){
        return head == tail ? true : false;
    }
}
