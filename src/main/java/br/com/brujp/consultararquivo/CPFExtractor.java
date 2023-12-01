package br.com.brujp.consultararquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CPFExtractor {
    public static void main(String[] args) {
        String caminhoDoArquivo = "/Users/brunopinto/Documents/Documentos/embossing.txt";
        List<String> cpfs = extrairCPFsDoArquivo(caminhoDoArquivo);

        // Imprime os CPFs extraídos
        for (String cpf : cpfs) {
            System.out.println(cpf);
        }
    }

    public static List<String> extrairCPFsDoArquivo(String caminhoDoArquivo) {
        List<String> cpfs = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoDoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if (linha.length() >= 34) { // Certifique-se de que a linha tenha tamanho suficiente
                    String cpf = linha.substring(33, 48);
                    cpfs.add(cpf);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cpfs;
    }
}