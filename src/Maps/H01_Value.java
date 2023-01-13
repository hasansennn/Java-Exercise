package Maps;

import Maps2.MapMethodDepo;

import java.util.Map;

public class H01_Value {
    public static void main(String[] args) {

        // mapOlustur method'u bize bir map donduruyor
        // biz o class'daki map'i kullanmak istiyoruz ama
        // her seferinde o class'a gidip o map'i yeniden olusturmamiz isimize yaramaz

        // Bu class'da bir map olusturmak istedigimizde
        // new HashMap<>() yaziyoruz
        // ancak bu bize bos bir map getiriyor
        // bu kodun yerine mapMethodDepo'dan ogrenciMapOlustur method'unu calistirirsak
        // bize dolu bir map getirir
        // biz de onu icinde oldugumuz class'da olusturdugumuz ogrenciMap'e atama yapariz

        //Map<Integer,String> doktorlarMap= MapMethodMemory.doktorlarMapOlustur();
       // doktorlarMap.put(107, "Muharrem,7,Goz");
       // System.out.println(doktorlarMap);

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

    }

}

