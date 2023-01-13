package Maps;

import java.util.HashMap;
import java.util.Map;

public class H02_MapMethodMemory {

    public static Map<Integer, String> doktorlarMapOlustur() {

        Map<Integer, String> doktorlarMap = new HashMap<>();

        doktorlarMap.put(100, "Hasan,San,5,Dahiliye");
        doktorlarMap.put(101, "Hasan,Can,6,Nöroloji");
        doktorlarMap.put(102, "Fatma,San,7,KBB");
        doktorlarMap.put(103, "Osman,Can,8,Uroloji");
        doktorlarMap.put(104, "Orhan,Cavdar,9,Cerrah");


        return doktorlarMap;
    }
}