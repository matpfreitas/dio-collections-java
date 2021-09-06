package com.dio.matheus;

import java.util.HashMap;
import java.util.Map;

public class CollectionsMap {

    public static void main(String[] args) {

        Map<String, String> estadosBrasil = new HashMap<>();

        estadosBrasil.put("AC", "Acre");
        estadosBrasil.put("AL", "Alagoas");
        estadosBrasil.put("AP", "Amapá");
        estadosBrasil.put("AM", "Amazonas");
        estadosBrasil.put("BA", "Bahia");
        estadosBrasil.put("CE", "Ceará");
        estadosBrasil.put("ES", "Espírito Santo");
        estadosBrasil.put("GO", "Goiás");
        estadosBrasil.put("MA", "Maranhão");
        estadosBrasil.put("MT", "Mato Grosso");
        estadosBrasil.put("MS", "Mato Grosso do Sul");
        estadosBrasil.put("MG", "Minas Gerais");
        estadosBrasil.put("PA", "Pará");
        estadosBrasil.put("PB", "Paraíba");
        estadosBrasil.put("PR", "Paraná");
        estadosBrasil.put("PE", "Pernambuco");
        estadosBrasil.put("PI", "Piauí");
        estadosBrasil.put("RJ", "Rio de Janeiro");
        estadosBrasil.put("RN", "Rio Grande do Norte");
        estadosBrasil.put("RS", "Rio Grande do Sul");
        estadosBrasil.put("RO", "Rondônia");
        estadosBrasil.put("RR", "Roraima");
        estadosBrasil.put("SC", "Santa Catarina");
        estadosBrasil.put("SP", "São Paulo");
        estadosBrasil.put("SE", "Sergipe");
        estadosBrasil.put("TO", "Tocantins");

        System.out.println(estadosBrasil);

        estadosBrasil.remove("MG");

        System.out.println(estadosBrasil);

        estadosBrasil.put("DF", "Distrito Federal");

        System.out.println(estadosBrasil);

        System.out.println("Número de Estados: " + estadosBrasil.size());

         for (String key : estadosBrasil.keySet()) {

            System.out.println(estadosBrasil.get(key) + "--" + key);

        }

        System.out.println("Santa Catarina existe no map? " + estadosBrasil.containsKey("SC"));

        System.out.println("Maranhão existe no map? " + estadosBrasil.containsValue("Maranhão"));

    }

}
