package furkanSorular;

public class soru4_arrayDereceNotlar {

    public static void main(String[] args) {

        /*
        4. given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];
         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A
         */

        /*
        4. aşağıdaki array verildiğinde:
       String [] adlar = {"Anna", "Nancy", "Sarah"};
        int [] puanlar = {90, 75, 80};
        char [] dereceler = new char[adlar.length];

          1. Öğrencilerin notlarını dereceler adlı array'de saklayabilen bir program yazınız.
          2. her öğrencinin not raporunu ayrı satırlarda yazdırın
          Eski:
          Anna'nın puanı 90 ve notu A
         */
        String [] isimler = {"Anna", "Nancy", "Sarah"};
        int [] puanlar = {90, 75, 80};
        char [] dereceler = new char[isimler.length];

        for (int i = 0; i < isimler.length; i++) {
            String isim=isimler[i];
            int puan=puanlar[i];


            System.out.println(isim + " 'in" + " puani " + puan + " ve notu " + dereceler );
        }
    }
}