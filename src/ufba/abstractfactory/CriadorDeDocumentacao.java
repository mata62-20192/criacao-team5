package ufba.abstractfactory;

import java.sql.Date;

import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;

public class CriadorDeDocumentacao {
	private FabricaDeDocumentacao fabrica;

	public CriadorDeDocumentacao(FabricaDeDocumentacao fabrica) {
		this.fabrica = fabrica;
	}

	public void setFabrica(FabricaDeDocumentacao fabrica) {
		this.fabrica = fabrica;
	}

	public String criaDocumentacao(String titulo, String empresa, String texto) {
		Cabecalho cabecalho = fabrica.criaCabecalho();
		Corpo corpo = fabrica.criaCorpo();
		Rodape rodape = fabrica.criaRodape();

		cabecalho.setTitulo(titulo);
		cabecalho.setEmpresa(empresa);
		corpo.setTexto(texto);
		rodape.setData(new Date(System.currentTimeMillis()));
		// rodape.setData(new Date());
		
		return cabecalho.getOutput() + corpo.getOutput() + rodape.getOutput();

	}
}
