package ufba.app;

import java.util.Date;

import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;
import ufba.elementos.html.CabecalhoHTML;
import ufba.elementos.html.CorpoHTML;
import ufba.elementos.html.RodapeHTML;
import ufba.elementos.markdown.CabecalhoMarkdown;
import ufba.elementos.markdown.CorpoMarkdown;
import ufba.elementos.markdown.RodapeMarkdown;

public class CriadorDocumentacao {
	private TipoDocumento tipoDocumento;
	
	public CriadorDocumentacao(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	public String geraDocumentacao() {
		Cabecalho cabecalho;
		Corpo corpo;
		Rodape rodape;
		
		if (tipoDocumento == TipoDocumento.HTML) {
			cabecalho = new CabecalhoHTML();
		} else {
			cabecalho = new CabecalhoMarkdown();
		}
		
		cabecalho.setTitulo("Padroes de projeto");
		cabecalho.setEmpresa("Universidade Federal da Bahia");
		
		if (tipoDocumento == TipoDocumento.HTML) {
			corpo = new CorpoHTML();
		} else {
			corpo = new CorpoMarkdown();
		}
		
		corpo.setTexto("Aula de padroes de projeto na disciplina Engenharia de Software I.");
		
		if (tipoDocumento == TipoDocumento.HTML) {
			rodape = new RodapeHTML();
		} else {
			rodape = new RodapeMarkdown();
		}
		
		rodape.setData(new Date());
		
		return cabecalho.getOutput() + corpo.getOutput() + rodape.getOutput();
	}
}
