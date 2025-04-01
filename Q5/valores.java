package Q5;

import java.util.*;

public class valores{
    public static void main(String[] args){
        LinkedList<Integer> numeros = new LinkedList<Integer>();
        numeros.add(10);
        numeros.add(4);
        numeros.add(7);
        numeros.add(2);
        numeros.add(9);

        ListIterator <Integer> iterator = numeros.listIterator();
        
        while (iterator.hasNext()){
            if (iterator.next() > 5){
                iterator.set(99);
            }
        }
        Collections.shuffle(numeros);
        System.out.println(numeros);
    }
}