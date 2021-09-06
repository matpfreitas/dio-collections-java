package com.dio.matheus;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionsQueue {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");

        System.out.println(fila);

        Iterator<String> iteratorFila = fila.iterator();

        while (iteratorFila.hasNext()) {
            System.out.println("<>" + iteratorFila.next());
        }

        System.out.println("Primeiro da fila sem remover: " + fila.peek());
        System.out.println(fila);

        System.out.println("Primeiro da fila removendo: " + fila.poll());
        System.out.println(fila);

        fila.add("Daniel");
        System.out.println(fila);

        System.out.println("Tamanho da fila: " + fila.size());

        System.out.println("Fila está vazia? " + fila.isEmpty());

        System.out.println("Fila contém Carlos? " + fila.contains("Carlos"));

    }

}
