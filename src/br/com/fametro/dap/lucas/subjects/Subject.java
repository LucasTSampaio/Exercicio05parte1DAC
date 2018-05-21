package br.com.fametro.dap.lucas.subjects;

import br.com.fametro.dap.lucas.observers.Observer;

public interface Subject {

	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
	
}
