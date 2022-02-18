package Z3;

import java.io.File;

public class file {
    public static String[] pliki(File katalog,String rozszerzenie){
        String[] wszystkie_pliki = katalog.list((dir,name)->!name.endsWith(rozszerzenie));
        return wszystkie_pliki;
    }
}
