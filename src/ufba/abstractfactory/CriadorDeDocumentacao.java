package ufba.abstractfactory;

import java.sql.Date;

public class CriadorDeDocumentacao {
	private FabricaDeDocumentacao fabrica;

	public CriadorDeDocumentacao(FabricaDeDocumentacao fabrica) {
		this.fabrica = fabrica;
	}

	public void setFabrica(FabricaDeDocumentacao fabrica) {
		this.fabrica = fabrica;
	}

	public void criaDocumentacao(String titulo, String empresa, String texto) {
		Cabecalho cabecalho = fabrica.criaCabecalho();
		Corpo corpo = fabrica.criaCorpo();
		Rodape rodape = fabrica.criaRodape();

		cabecalho.setTitulo(titulo);
		cabecalho.setEmpresa(empresa);
		corpo.setText(texto);
		rodape.setData(new Date(System.currentTimeMillis()));
		// rodape.setData(new Date());

	}
}
