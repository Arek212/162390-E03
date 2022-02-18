package Z2;

import java.util.LinkedHashSet;
import java.util.*;

public class usun {
    public static void main(String[] args){
        LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>(List.of(1,2,3,4,5,6,7));
        System.out.println("\nLinked Has set:"+lhs1);
        System.out.println("\nLinked Hash Set po usunięciu elementu:");
        Iterator<Integer> it1 = lhs1.iterator();
        int przedostatni1=6;
        while(it1.hasNext()){
            int value = it1.next();
            if(przedostatni1==value)it1.remove();
        }
        System.out.println(lhs1);
        LinkedHashSet<Double> lhs2 = new LinkedHashSet<>(List.of(8.5,9.4,10.3,11.2));
        System.out.println("\nLinked Has set:"+lhs2);
        System.out.println("\nLinked Hash Set po usunięciu elementu:");
        Iterator<Double> it2 = lhs2.iterator();
        double przedostatni2=10.3;
        while(it2.hasNext()){
            Double value = it2.next();
            if(przedostatni2==value)it2.remove();
        }
        System.out.println(lhs2);
        LinkedHashSet<Integer> lhs3 = new LinkedHashSet<>(List.of(16,17,18));
        System.out.println("\nLinked Has set:"+lhs3);
        System.out.println("\nLinked Hash Set po usunięciu elementu:");
        Iterator<Integer> it3 = lhs3.iterator();
        int przedostatni3=6;
        while(it3.hasNext()){
            int value = it3.next();
            if(przedostatni1==value)it3.remove();
        }
        System.out.println(lhs1);
    }
}
