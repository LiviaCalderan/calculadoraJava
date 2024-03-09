package br.com.calderan.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {

	void valorAlterado(String novoValor); // publico por padrao por ser interface
}
