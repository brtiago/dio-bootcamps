package edu.tiago.optional.teste;

import edu.tiago.optional.repository.Motoristas;
import edu.tiago.optional.model.Caminhao;
import edu.tiago.optional.model.Motorista;
import edu.tiago.optional.model.Seguro;



public class ConsultaCobertura {

    public static void main(String[] args) {
        Motoristas motoristas = new Motoristas();
        // Motorista motorista = motoristas.porNome("João");

        //String cobertura = motorista.getCaminhao().getSeguro().getCobertura();
		/*String cobertura = "Sem seguro";
		if (motorista != null) {
			Caminhao caminhao = motorista.getCaminhao();
			if (caminhao != null) {
				Seguro seguro = caminhao.getSeguro();
				if (seguro != null) {
					cobertura = seguro.getCobertura();
				}
			}
		}*/

        String cobertura = motoristas.porNome("João")
                .flatMap(Motorista::getCaminhao)
                .flatMap(Caminhao::getSeguro)
                .map(Seguro::getCobertura)
                .orElse("Sem cobertua");

        System.out.println("A cobertura é: " + cobertura);
    }

}