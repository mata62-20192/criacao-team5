## Atividade: Factory Method e Abstract Factory

Este é um sistema para gerar documentação em dois formatos: HTML e [Markdown](http://commonmark.org/help/). A geração da documentação é feita na classe `CriadorDocumentacao`, que cria um documento em três partes: `Cabecalho`, `Corpo` e `Rodape`. Leia atentamente a classe `CriadorDocumentacao` antes de continuar lendo este documento.

**Discussão em aula**. Suponha que queremos adicionar um novo formato, LaTeX. Quais classes é preciso alterar? Se `CriadorDocumentacao` fosse parte de uma biblioteca (que você não pode alterar), como você adicionaria um novo formato?

### Factory Method

**Atividade**. Crie um pacote `ufba.factorymethod`, com uma cópia das classes `CriadorDocumentacao` e `Main`, e aplique o padrão Factory Method para tornar a classe `CriadorDocumentacao` independente do formato da documentação.

**Discussão em aula**. E agora, como você faria para adicionar um novo formato sem alterar a classe `CriadorDocumentacao`?

### Abstract Factory

**Atividade**. Crie um pacote `ufba.abstractfactory`, com uma cópia das classes `CriadorDocumentacao` e `Main`, e aplique o padrão Abstract Factory para tornar a classe `CriadorDocumentacao` independente do formato da documentação.

**Discussão em aula**. E agora, como você faria para adicionar um novo formato sem alterar a classe `CriadorDocumentacao`?

**Discussão em aula**. Quais os prós e os contas de cada solução (Factory Method vs Abstract Factory)?

### Correção automática

Execute o script `corrige.sh` para verificar se você implementou os padrões corretamente. Leia o código-fonte do script para entender como usá-lo.
