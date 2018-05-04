import org.omg.CORBA.Object;

import java.util.Map;


public class MapExamples {

    private static void soutMap(Map<?extends Object,?extends Object> map) {
        for (Map.Entry<? extends Object, ? extends Object> entry : map.entrySet()) 
        {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("key= " + key + ", value= " + value);
        }
        System.out.println();
    }

}
