package furkanSorular;

import java.util.Arrays;

public class soru2_arrayTerstenYazdirma {
    public static void main(String[] args) {

        /*
        2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
         */

        /*
        Meali:  2. String array oluşturun ve sınıf arkadaşlarınızın adlarını saklayın (10)
             her öğrencinin adını ters çevirin ve ayrı satırlara yazdırın
             eski:
             array = {java, piton, c#}
         çıktı:
         avaj
         nohtyp
         #c
        */

        String[] sinifarkadas = {"Hasan", "Hüseyin", "Ahmet", "Mehmet", "Ali", "Veli", "Hakan", "OmerYigit", "Zeynep", "Fatma"};
        // System.out.println(Arrays.toString(sinifarkadas));
        for (String arkadas : sinifarkadas) {
            for (int i = arkadas.length() - 1; i >= 0; i--) {
                System.out.print(arkadas.charAt(i));
            }
            System.out.println(" ");
        }
    }
}
