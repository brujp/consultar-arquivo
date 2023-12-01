package br.com.brujp.consultararquivo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.List;

public class CPFExtractorTest {

	@Test
	public void testExtrairCPFsDoArquivo() {
		// Caminho para um arquivo de teste
		String caminhoDoArquivoDeTeste = "/Users/brunopinto/Documents/Documentos/embossing.txt";

		// Execute a função de extração
		List<String> cpfs = CPFExtractor.extrairCPFsDoArquivo(caminhoDoArquivoDeTeste);

		// Verifica se a quantidade de CPFs extraídos é a esperada
		assertEquals("Número esperado de CPFs", 2, cpfs.size());

		// Verifica se os CPFs extraídos estão corretos
		assertEquals("Primeiro CPF", "465 514 428 97 ", cpfs.get(0));
		assertEquals("Segundo CPF", "151 736 738 77 ", cpfs.get(1));
	}
}
