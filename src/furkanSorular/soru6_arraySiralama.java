package furkanSorular;

import java.util.Arrays;

public class soru6_arraySiralama {

    public static void main(String[] args) {

        //6. Tüm sıfırları arrayi sonuna taşıyabilen bir program yazınız.
      //  input: array = {10, 0, 5, 0, 1, 0};
       // output:{10, 5, 1, 0, 0, 0}

        int [] arr={10, 0, 5, 0, 1, 0};
        int[] sifirSonda = arr.clone();

        for (int i = 0; i< arr.length; i++) {
            for (int j = i+1; j < sifirSonda.length ; j++) {
                if (sifirSonda[i] < sifirSonda[j]) {
                    int temp = sifirSonda[i];
                    sifirSonda[i] = sifirSonda[j];
                    sifirSonda[j] = temp;
            }

            }
        }
        System.out.println(Arrays.toString(sifirSonda));

        }
    }

