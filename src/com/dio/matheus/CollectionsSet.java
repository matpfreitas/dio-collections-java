package com.dio.matheus;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionsSet {

    public static void main(String[] args) {

        Set<Integer> testeSet = new HashSet<>();
//        Set<Integer> testeSet = new LinkedHashSet<>();
//        Set<Integer> testeSet = new TreeSet<>();

        testeSet.add(3);
        testeSet.add(88);
        testeSet.add(20);
        testeSet.add(44);
        testeSet.add(3);

        System.out.println(testeSet);

        for (Integer navegacaoSet : testeSet) {
            System.out.println("<>" + navegacaoSet);
        }

        testeSet.remove(3);
        System.out.println(testeSet);

        testeSet.add(23);
        System.out.println(testeSet);

        System.out.println("Tamanho do set: " + testeSet.size());

        System.out.println("Set está vazio? " + testeSet.isEmpty());

    }

}
