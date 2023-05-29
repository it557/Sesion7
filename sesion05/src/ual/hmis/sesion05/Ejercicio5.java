package ual.hmis.sesion05;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static  <T extends Comparable<T>> List<T> union(List<T> list1, List<T> list2) {
        ArrayList<T> res = new ArrayList<>();
        if (list1 == null || list1.isEmpty()) {
            if (list2!=null)res.addAll(list2);
            return res;
        }
        if (list2==null || list2.size()==0) {
            if (list1!=null)res.addAll(list1);
            return res;
        }
        int pos1=0, pos2=0;
        while(pos1<list1.size() || pos2<list2.size()) {
            if(pos1 >= list1.size()) {
                if (! res.contains(list2.get(pos2))) res.add(list2.get(pos2));
                pos2++;
                continue;
            }
            if(pos2 >= list2.size()){
                if(!res.contains(list1.get(pos1)))res.add(list1.get(pos1));
                pos1++;
                continue;
            }
            int cmp = list1.get(pos1).compareTo(list2.get(pos2));
            if (cmp<=0) res.add(list1.get(pos1++));
            if (cmp>0) res.add(list2.get(pos2++));
            if (cmp==0) pos2++;
        }
        return res;
    }
}
