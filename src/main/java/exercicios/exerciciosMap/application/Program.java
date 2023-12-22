package exercicios.exerciciosMap.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Program {
    public static void main(String[] args){
        String path = "src/main/java/exercicios/exerciciosMap/files/in.txt";
        Map<String, Integer> candidates = new HashMap<String, Integer>();
        Set<String> candidatesNames = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = br.readLine()) != null){
                String[] infos = line.split(",");
                candidatesNames.add(infos[0]);
                if(candidates.containsKey(infos[0])){
                    candidates.put(infos[0], (Integer.parseInt(infos[1]) + candidates.get(infos[0])));
                }
                else{
                    candidates.put(infos[0], Integer.parseInt(infos[1]));
                }
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }




        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
