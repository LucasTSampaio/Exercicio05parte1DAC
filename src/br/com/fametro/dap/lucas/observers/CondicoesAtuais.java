package br.com.fametro.dap.lucas.observers;

import br.com.fametro.dap.lucas.subjects.Subject;

public class CondicoesAtuais implements Observer, ExibeElemento {

	private float temp;
	private float umid;
	private float pressao;
	private Subject climaDados;

	public CondicoesAtuais(Subject climaDados) {
		this.climaDados = climaDados;
		climaDados.registerObserver(this);
	}

	public void update(float temp, float umid, float pressao) {
		this.temp = temp;
		this.umid = umid;
		this.pressao = pressao;
		exibir();
	}

	public void exibir() {
		System.out.println("FUNCEME - Condições atuais: " + temp + " ºC e " + umid + " de umidade, e " + pressao
				+ " de pressão atmosferica");
	}

}
