package com.ulices.fundamentos.colecciones;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        //1
        List<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(5);
        numbers.add(3);
        numbers.add(5);
        numbers.add(10);
        numbers.add(1);

        //2
        System.out.println(numbers);
        numbers.remove(5);
        System.out.println(numbers);
        numbers.remove(Integer.valueOf(5));
        System.out.println(numbers);
        //La diferencia de eliminación de ambos metodos es que con remove(indice) elimina el numero en esa posición
        //con remove.valueOf(number) elimina la primera coincidencia

        //3
        //Ascendente
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);

        //Descendente
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);

        //3
        List<Integer> numbers2 = List.of(1,2,3,4, 5);
        try {
            numbers2.add(4);
        }catch (UnsupportedOperationException e){

            System.out.println("Ha ocurrido un erorr: " + e.getClass().getName());
        }
    }
}
