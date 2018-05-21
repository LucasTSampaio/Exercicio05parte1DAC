package br.com.fametro.dap.lucas.subjects;

import java.util.ArrayList;

import br.com.fametro.dap.lucas.observers.Observer;

public class ClimaDados implements Subject {

	private ArrayList observers;
	private float temp;
	private float umid;
	private float pressao;

	public ClimaDados() {
		observers = new ArrayList();
	}

	@Override
	public void registerObserver(Observer o) {

		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(o);
		}

	}

	@Override
	public void notifyObservers() {

		for (int i = 0; i < observers.size(); i++) {
			Observer obs = (Observer) observers.get(i);
			obs.update(temp, umid, pressao);
		}
	}

	public void medidasAlteradas() {
		notifyObservers();
	}

	public void setMedidas(float t, float u, float p) {
		temp = t;
		umid = u;
		pressao = p;
	}

}
