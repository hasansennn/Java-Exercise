package furkanSorular;

import java.util.Arrays;

public class soru1_arrayBasHarfYazdirma {
    public static void main(String[] args) {

        /*
        1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
         */

        /*
        1. sınıf arkadaşları adında bir array oluşturun ve sınıf arkadaşlarınızdan 10 tanesinin tam adını kaydedin
             her sınıf arkadaşının baş harflerini ayrı satırlara yazdır
         */
        String[] sinifArk = new String[10];

        sinifArk[0]="Hasan";
        sinifArk[1]="Hüseyin";
        sinifArk[2]= "Ahmet";
        sinifArk[3]= "Mehmet";
        sinifArk[4]= "Ali";
        sinifArk[5]= "Veli";
        sinifArk[6]= "Hakan";
        sinifArk[7]="OmerYigit";
        sinifArk[8]="Zeynep";
        sinifArk[9]="Fatma";
        System.out.println(Arrays.toString(sinifArk));
        for (String basHarf : sinifArk) {
            System.out.print(basHarf.charAt(0)); // HHAMAVHOZF
        }
    }
}
