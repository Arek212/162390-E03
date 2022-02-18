package Z1;

import java.util.LinkedList;

public class funkcja {
    public static <T extends  Comparable<T>> void redukuj(LinkedList<?> tab, int n){
        for (int i = n-1; i<tab.size();i=i+n){
            tab.remove(i);
            i--;
        }
    }
}
