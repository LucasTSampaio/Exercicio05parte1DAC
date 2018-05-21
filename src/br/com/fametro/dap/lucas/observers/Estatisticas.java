package br.com.fametro.dap.lucas.observers;

import br.com.fametro.dap.lucas.subjects.Subject;

public class Estatisticas implements Observer, ExibeElemento {

	private float temp;
	private float tempMax;
	private float tempMin;
	private float umid;
	private float pressao;
	private Subject climaDados;

	public Estatisticas(Subject climaDados) {
		this.climaDados = climaDados;
		climaDados.registerObserver(this);
	}

	@Override
	public void exibir() {
		System.out.println("\nFUNCEME - Estatisticas: temp. máxima de " + tempMax + " ºC /"
				+ "temp. mínima: " + tempMin + " ºC");

	}

	@Override
	public void update(float temp, float umid, float pressao) {
		this.tempMax = temp + 3;
		this.tempMin = temp - 3;

		exibir();

	}

}
