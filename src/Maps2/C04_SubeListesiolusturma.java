package Maps2;

import java.util.Map;

public class C04_SubeListesiolusturma {

    public static void main(String[] args) {


            // verilen sinif ve sube ismi ile sinif listesini yazdiran method olusturun

            Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

            MapMethodDepo.sinifListesiYazdirma(ogrenciMap,"10","k");
        }
    }


