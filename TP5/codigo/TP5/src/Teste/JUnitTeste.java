package Teste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import controle.*;

class JUnitTeste {
	int i =1;
	String[] dados = new String[50];;
	ControleDados d = new ControleDados();
	@Test
	void testInserirEditarCliente() {
		dados[0] =  String.valueOf(i);
		dados[1] =  "a";
		dados[2] =  "a";
		dados[3] =  String.valueOf(i);
		dados[4] =  "111.111.111-11";
		dados[5] =  "1.111.111";
		dados[6] =  String.valueOf(i);
		
		assertTrue(d.inserirEditarCliente(dados));
		dados[4] =  "111.11111111";
		assertFalse(d.inserirEditarCliente(dados));
		i=i+99191929;
		dados[3] =  String.valueOf(i);
		dados[4] =  "111.111.111-11";
		dados[6] =  String.valueOf(i);
		assertTrue(d.inserirEditarCliente(dados));
	}

	@Test
	void testInserirEditarSapato() {
		dados[0] =  String.valueOf(i);
		dados[1] =  String.valueOf(i);
		dados[2] =  "a";
		dados[3] =  "a";
		dados[4] =  String.valueOf(i);
		dados[5] =  "a";
		dados[6] =  String.valueOf(i);
		
		assertTrue(d.inserirEditarSapato(dados));
		i=i+99191929;
		dados[3] =  "1";
		dados[4] =  String.valueOf(i);
		dados[5] =  String.valueOf(i);
		dados[6] =  String.valueOf(i);
		dados[7] =  String.valueOf(i);
		assertTrue(d.inserirEditarSapato(dados));
	}

	@Test
	void testInserirEditarLoja() {
		
		dados[1] =  "a";
		dados[2] =  "a";
		dados[3] =  "11.111.111/1111-11";
		dados[4] =  String.valueOf(i);
		dados[5] =  String.valueOf(i);
		dados[6] =  String.valueOf(i);
		dados[7] =  String.valueOf(i);
		
		assertTrue(d.inserirEditarLoja(dados));
		dados[3] =  "11111.111111111";
		assertFalse(d.inserirEditarLoja(dados));
		i=i+99191929;
		dados[3] =  "11.111.111/1111-11";
		dados[4] =  String.valueOf(i);
		dados[5] =  String.valueOf(i);
		dados[6] =  String.valueOf(i);
		dados[7] =  String.valueOf(i);
		assertTrue(d.inserirEditarLoja(dados));
		
	}

}
