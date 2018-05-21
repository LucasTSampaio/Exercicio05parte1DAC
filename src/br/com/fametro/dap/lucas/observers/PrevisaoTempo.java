package br.com.fametro.dap.lucas.observers;

import br.com.fametro.dap.lucas.subjects.Subject;

public class PrevisaoTempo implements Observer, ExibeElemento {

	private float temp;
	private float umid;
	private float pressao;
	private Subject climaDados;

	public PrevisaoTempo(Subject climaDados) {
		this.climaDados = climaDados;
		climaDados.registerObserver(this);
	}

	@Override
	public void exibir() {

		System.out.println("\nFUNCEME - Previsão do tempo para amanhã: " + temp + " ºC / " + umid + " de umidade / "
				+ pressao + " de pressão atmosferica");
	}

	@Override
	public void update(float temp, float umid, float pressao) {
		this.temp = temp + 10;
		this.umid = umid + 10;
		this.pressao = pressao + 10;
		exibir();

	}

}
