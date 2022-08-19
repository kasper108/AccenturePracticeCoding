package Day4.Collection.ArrayList;

import java.util.List;

public class Print {
    public void printStringList(List<String> list){
        for(String element : list){
            System.out.print(element + " ");
        }
        System.out.println("\t");
        System.out.println("=======================================");
    }
}
