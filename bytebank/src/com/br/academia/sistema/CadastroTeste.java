package com.br.academia.sistema;

import java.util.ArrayList;
import java.util.List;

public class CadastroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Cliente> cliente = new ArrayList<Cliente>();
		Cliente c1 = new Cliente("Diego"," 10/06/92", "11111111111"," sao marcos");
		Cliente c2 = new Cliente("joao" , " 10/06/92" , "22222222222" , " sao marcos");
		cliente.add(c1);
		cliente.add(c2);
		
		for (Cliente c : cliente) {
			System.out.println(c.toString());
			}
		
		

	}

}
