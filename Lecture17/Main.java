package Lecture17;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 0);
        list.add(1);

        list.add(2);

        System.out.println(list);

        list.remove(2);

        list.get(1);
        System.out.println(list);
        list.remove(2);

        int element = list.get(1);
        System.out.println(element);

        list.size();

        Collections.sort(list);
        
    }
}
