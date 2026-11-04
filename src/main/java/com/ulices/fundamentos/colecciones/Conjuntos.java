package com.ulices.fundamentos.colecciones;

import java.util.*;

public class Conjuntos {

    public static void main(String[] args) {
        List<String> names = List.of("ana", "luis", "ana","zoe", "beto", "luis");

        //1 Quitar duplicados
        Set<String> uniqueNames =new LinkedHashSet<>(names);

        //p: [ana, luis, zoe, beto]
        System.out.println(uniqueNames);

        //2 Quitar duplicados
        Set<String> uniqueNamesOrder =new TreeSet<>(names);
        //p: [ana, beto, luis, zoe]
        System.out.println(uniqueNamesOrder);

        //3
        //p: 4
        System.out.println(uniqueNamesOrder.size());
    }

}
