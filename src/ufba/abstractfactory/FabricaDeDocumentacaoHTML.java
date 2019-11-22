package ufba.abstractfactory;

import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;
import ufba.elementos.html.CabecalhoHTML;
import ufba.elementos.html.CorpoHTML;
import ufba.elementos.html.RodapeHTML;

public class FabricaDeDocumentacaoHTML extends FabricaDeDocumentacao {

	@Override
	public Cabecalho criaCabecalho() {
		return new CabecalhoHTML();
	}

	@Override
	public Corpo criaCorpo() {
		return new CorpoHTML();
	}

	@Override
	public Rodape criaRodape() {
		return new RodapeHTML();
	}

}
