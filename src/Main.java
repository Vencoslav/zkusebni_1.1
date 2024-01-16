import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> seznam = new ArrayList<>();//seznam s datovím typem string = text

        seznam.add("Ivan");
        seznam.add("Klaudie");
        seznam.add("Karel");
        seznam.add("Jindra");
        seznam.add("Adam");

        //ručně přidaná jména

        System.out.println("Seznam jmen:"+seznam);

        System.out.println("Jmena delší jak 4: ");
        for(String jmeno : seznam){//ciklu který vytvoří položku jméno s datovým tipem string který je součástí senzamu
            if(jmeno.length() > 4){// podmínka pokud má jména více písmen jak 4
                System.out.println(jmeno);// vypíše položku podle podmínky
            }
        }

        System.out.println("Jména začínající na písmeno K: ");
        for(int i = 0; i < seznam.size(); i++){// to samé jako předešlý ciklus akotrát delší verze
            String jmeno = seznam.get(i);
            if(jmeno.startsWith("K")){
                System.out.println(jmeno);
            }
        }
    }
}
















