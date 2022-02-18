package Z1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class redukujTest {
    public static void main(String [] args){
        LinkedList<Integer> L1 = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        LinkedList<LocalDate> LD1 = new LinkedList<>(List.of(LocalDate.of(2001,01,01),
                LocalDate.of(2002,02,02),
                LocalDate.of(2003,03,03),
                LocalDate.of(2004,04,04),
                LocalDate.of(2005,05,05),
                LocalDate.of(2006,06,06)));
        System.out.println("\n\nLinkedList Liczby:");
        System.out.println(L1);
        System.out.println("\nPo redukcji:");
        Z1.funkcja.redukuj(L1,2);
        System.out.println(L1);
        System.out.println("\n\nLinkedList daty:");
        System.out.println(LD1);
        System.out.println("\nPo redukcji:");
        Z1.funkcja.redukuj(LD1,2);
        System.out.println(LD1);
    }
}
