package java基础.src.案例.普通案例;

import java.util.ArrayList;
import java.util.List;

public class paper {

    public static void main(String[] args) {

    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> lst = new ArrayList<>();
        if(rowIndex == 1){
            List<Integer> l = new ArrayList<>();
            l.add(1);
            return l;
        }else{
            lst.add(1);
            List<Integer> pre = getRow(rowIndex-1);
            for(int i=1;i<rowIndex-1;i++){
                lst.add(pre.get(i-1)+pre.get(i));
            }
            lst.add(1);
        }
        return lst;
}

}
