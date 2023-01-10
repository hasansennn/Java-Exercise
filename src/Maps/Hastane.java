package Maps;

import java.util.HashMap;
import java.util.Map;

public class Hastane {
    public static void main(String[] args) {
        Map<Integer,String> doktorlarMap=new HashMap<>();

        doktorlarMap.put(100,"Hasan,San,5,Dahiliye");
        doktorlarMap.put(101,"Hasan,Can,6,Nöroloji");
        doktorlarMap.put(102,"Fatma,San,7,KBB");
        doktorlarMap.put(103,"Osman,Can,8,Uroloji");
        doktorlarMap.put(104,"Orhan,Cavdar,9,Cerrah");


        System.out.println(doktorlarMap);
        // {100=Hasan,Sen,5,Dahiliye, 101=Hasan,Can,6,Nöroloji, 102=Fatma,Sen,7,KBB, 103=Osman,Can,8,Uroloji, 104=Orhan,Cavdar,9,Cerrah}
        System.out.println(doktorlarMap.size());//5
        System.out.println(doktorlarMap.containsKey(105)); //false
    }
}
