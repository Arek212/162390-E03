package Z3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class fileTest {
    public static void main(String[] agrs) throws IOException{
        File katalog1 = new File("src/Z3/");
        String[] podkatalog = file.pliki(katalog1,"txt");
        ArrayList<String> podkatalogArray = new ArrayList<>(List.of(podkatalog));
        System.out.println(podkatalogArray+"\n");
    }
}
