package arrays;

import java.util.HashSet;

public class Collections {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);
        conjunto.add(4);
        conjunto.add(5);

        System.out.println(conjunto.size());
        System.out.print(conjunto.contains(1));
        System.out.print(conjunto.remove(3));
        System.out.print(conjunto.size());
        System.out.print(conjunto.add("Matheus"));
        System.out.println(conjunto.size());
        System.out.print(conjunto.contains("Matheus"));
        System.out.println(conjunto);


    } 
}
