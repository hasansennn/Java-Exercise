package furkanSorular;

import java.util.Arrays;

public class soru3_arrays_IndexContains {
    public static void main(String[] args) {
/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        1. find out the first index number of "Gloves"
        2. find out if "iPad" is contained in the item list
        3. Print the report of each shopping item
            name - price - #ID
 */

        /*
       Soru 3. Aşağıdaki array verildiğinde:
         String[] öğeler = {"Ayakkabılar", "Ceket", "Eldivenler", "AirPods", "iPad", "iPhone 12 kılıfı" };
         double[] fiyatlar = {99,99, 150,0, 9,99, 250,0 , 439,50, 39,99};
         int[] itemIDs = {12345 , 12346, 12347, 12348, 12349, 12350};


         1. "Eldivenler" in ilk array numarasını bulun  // 2
         2. Öğe listesinde "iPad" olup olmadığını öğrenin  // true
         3. Her alışveriş ürününün raporunu yazdırın
             ad - fiyat - #ID
         */

        String[] ögeler = {"Ayakkabılar", "Ceket", "Eldivenler", "AirPods", "iPad", "iPhone 12 kılıfı" };
        double[] fiyatlar = {99,99, 150,0, 9,99, 250,0 , 439,50, 39,99};
        int[] itemIDs =     {12345 , 12346, 12347, 12348, 12349, 12350};

        String[] ogeler = {"Ayakkabılar", "Ceket", "Eldivenler", "AirPods", "iPad", "iPhone 12 kılıfı" };
        int index = Arrays.asList(ogeler).indexOf("Eldivenler");
        System.out.println(index); // Output: 2

        boolean contains = Arrays.asList(ogeler).contains("iPad");
        System.out.println(contains); // Output: true

        for (int i = 0; i < ogeler.length; i++) {
            String oge = ogeler[i];
            double fiyat = fiyatlar[i];
            int id = itemIDs[i];
            System.out.println(oge + " - " + fiyat + " - #" + id);

            /*
            Ayakkabılar - 99.0 - #12345
            Ceket - 99.0 - #12346
            Eldivenler - 150.0 - #12347
            AirPods - 0.0 - #12348
            iPad - 9.0 - #12349
            iPhone 12 kılıfı - 99.0 - #12350
             */
        }
        }
    }
