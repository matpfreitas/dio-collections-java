package com.dio.matheus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsList {

    public static void main(String[] args) {

        List<String> listaNomes = new ArrayList<>();

        listaNomes.add("Juliana");
        listaNomes.add("Pedro");
        listaNomes.add("Carlos");
        listaNomes.add("Larissa");
        listaNomes.add("João");

        System.out.println(listaNomes);

        for (String escreverNome : listaNomes) {
            System.out.println("<>" + escreverNome);
        }

        listaNomes.set(listaNomes.indexOf("Carlos"), "Roberto");

        System.out.println(listaNomes);

        System.out.println("Nome Posição 1: " + listaNomes.get(1));

        listaNomes.remove(3);
        System.out.println(listaNomes);

        listaNomes.remove("João");
        System.out.println(listaNomes);

        int tamanho = listaNomes.size();
        System.out.println("Quantidade de itens na lista: " + tamanho);

        boolean temJuliano = listaNomes.contains("Juliano");
        System.out.println("Contém o nome Juliano? " + temJuliano);

        List<String> listaNomes2 = new ArrayList<>();
        listaNomes2.add("Ismael");
        listaNomes2.add("Rodrigo");

        listaNomes.addAll(listaNomes2);
        System.out.println(listaNomes);

        Collections.sort(listaNomes);
        System.out.println(listaNomes);

    }

}
