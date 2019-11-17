package ufba.app;

public class Main {

	public static void main(String[] args) {
		CriadorDocumentacao criador = new CriadorDocumentacao(TipoDocumento.MARKDOWN);
		System.out.println(criador.geraDocumentacao());
	}

}
