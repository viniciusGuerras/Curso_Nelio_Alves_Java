package exercicios.exercicioFiles.application;

import java.io.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        File inFile = new File("//Users//viniciusguerra//IdeaProjects//JavaExercises//src//main//java//exercicios//exercicioFiles//files//inFile.txt");
        File outFile = new File("//Users//viniciusguerra//IdeaProjects//JavaExercises//src//main//java//exercicios//exercicioFiles//files//outFile.txt");

        try(BufferedReader bf = new BufferedReader(new FileReader(inFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))){

            String line;
            while ((line = bf.readLine()) != null){
                String[] rawLine = line.split(",");
                String writeLine = rawLine[0] + ", $ " + String.format("%.2f", Double.parseDouble(rawLine[1]) * Integer.parseInt(rawLine[2]));
                bw.write(writeLine);
                bw.newLine();
            }
        }
        catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Erro ao rodar: " + e.getMessage());
        }
    }
}
