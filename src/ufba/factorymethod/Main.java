package ufba.factorymethod;

public class Main {

	public static void main(String[] args) {
		CriadorDocumentacao criador1 = new CriadorDocumentacaoHTML();
		CriadorDocumentacao criador2 = new CriadorDocumentacaoMarkdown();
		System.out.println(criador1.geraDocumentacao("Exercicio", "Team 5", "We are the champions"));
		System.out.println(criador2.geraDocumentacao("Exercicio", "Team 5", "Yes we can"));
	}

}
