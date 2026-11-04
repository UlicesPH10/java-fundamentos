package com.ulices.fundamentos.colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Frecuencias {
    public static void main(String[] args) {
        String text = """ 
                En la profundidad de los bosques antiguos, 
                la naturaleza respira a su propio ritmo sin preocuparse por el tiempo humano.
                 El susurro de las hojas al viento y el correr del agua cristalina crean una
                  melodia constante que calma el espiritu, recordandonos la belleza de las cosas
                   mas simples de la vida.¿Te gustaria usar este parrafo para probar tu codigo
                    de frecuencias o prefieres que lo organicemos dentro de un bloque de texto multilinea en Java?
                """;
        String[] words = text.toLowerCase().replaceAll("[^a-záéíóúñü\\s]", " ").trim().split("\\s+");

        // Versión 1: getOrDefault
        Map<String, Integer> frecGetOrDefault = new HashMap<>();
        for (String word : words) {
            frecGetOrDefault.put(word, frecGetOrDefault.getOrDefault(word, 0) + 1);
        }

         // Versión 2: merge
        Map<String, Integer> frecMerge = new HashMap<>();
        for (String word : words) {
            frecMerge.merge(word, 1, Integer::sum);
        }

        System.out.println(frecGetOrDefault);
        System.out.println(frecMerge);
        System.out.println("¿Iguales? " + frecGetOrDefault.equals(frecMerge));   // debe imprimir true

         // Inciso 3: ordenado alfabéticamente
        Map<String, Integer> frecOrdenada = new TreeMap<>(frecMerge);
        System.out.println(frecOrdenada);
    }
}
