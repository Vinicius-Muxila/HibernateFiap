package br.com.fiap.teste;

import jakarta.persistence.Persistence;

public class BancoTeste {
	
	public static void main(String[] args) {

        Persistence.createEntityManagerFactory("smartcities").createEntityManager();

   }

}
