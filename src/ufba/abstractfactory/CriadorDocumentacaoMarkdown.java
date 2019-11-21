package ufba.factorymethod;

import java.util.Date;

import ufba.elementos.markdown.CabecalhoMarkdown;
import ufba.elementos.markdown.CorpoMarkdown;
import ufba.elementos.markdown.RodapeMarkdown;

public class CriadorDocumentacaoMarkdown extends CriadorDocumentacao {

	public CriadorDocumentacaoMarkdown() {
		this.cabecalho = new CabecalhoMarkdown();
		this.corpo = new CorpoMarkdown();
		this.rodape = new RodapeMarkdown();
	}

	@Override
	public String geraDocumentacao(String titulo, String empresa, String texto) {
		cabecalho.setEmpresa(empresa);
		cabecalho.setTitulo(titulo);
		corpo.setTexto(texto);
		rodape.setData(new Date());
		rodape.setData(new Date());
		return cabecalho.getOutput() + corpo.getOutput() + rodape.getOutput();
	}

}
