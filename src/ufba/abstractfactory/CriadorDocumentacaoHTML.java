package ufba.factorymethod;

import java.util.Date;

import ufba.elementos.html.CabecalhoHTML;
import ufba.elementos.html.CorpoHTML;
import ufba.elementos.html.RodapeHTML;


public class CriadorDocumentacaoHTML extends CriadorDocumentacao{
	
	
	public CriadorDocumentacaoHTML() {
		this.cabecalho = new CabecalhoHTML();
		this.corpo = new CorpoHTML();
		this.rodape = new RodapeHTML();
	}

	@Override
	public String geraDocumentacao(String titulo, String empresa, String texto) {
		cabecalho.setEmpresa(empresa);
		cabecalho.setTitulo(titulo);
		corpo.setTexto(texto);
		rodape.setData(new Date());
		return cabecalho.getOutput() + corpo.getOutput() + rodape.getOutput();
	}	
}
