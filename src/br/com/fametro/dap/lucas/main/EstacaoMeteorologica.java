package br.com.fametro.dap.lucas.main;

import br.com.fametro.dap.lucas.observers.CondicoesAtuais;
import br.com.fametro.dap.lucas.observers.Estatisticas;
import br.com.fametro.dap.lucas.observers.PrevisaoTempo;
import br.com.fametro.dap.lucas.subjects.ClimaDados;

public class EstacaoMeteorologica {

	public static void main(String[] args) {

		ClimaDados climaDados = new ClimaDados();
		CondicoesAtuais condicoesAtuais = new CondicoesAtuais(climaDados);

		Estatisticas estatisticas = new Estatisticas(climaDados);

		PrevisaoTempo previsaoTempo = new PrevisaoTempo(climaDados);

		// Envia os dados

		climaDados.setMedidas(28, 70, 45);
		climaDados.notifyObservers();
	}

}
