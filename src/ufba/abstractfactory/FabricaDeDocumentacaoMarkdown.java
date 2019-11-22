package ufba.abstractfactory;

import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;
import ufba.elementos.markdown.CabecalhoMarkdown;
import ufba.elementos.markdown.CorpoMarkdown;
import ufba.elementos.markdown.RodapeMarkdown;

public class FabricaDeDocumentacaoMarkdown extends FabricaDeDocumentacao {

	@Override
	public Cabecalho criaCabecalho() {
		return new CabecalhoMarkdown();
	}

	@Override
	public Corpo criaCorpo() {
		return new CorpoMarkdown();
	}

	@Override
	public Rodape criaRodape() {
		return new RodapeMarkdown();
	}

}
