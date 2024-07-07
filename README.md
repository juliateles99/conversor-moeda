
# Conversor de Moedas


- [Sobre o desafio](#sobre-o-desafio)
- [1) Configurando o ambiente de trabalho](#configuracao)
- [2) Conhecendo a API para trazer dados](#api-dados)
- [3) Importando a biblioteca Gson no IntelliJ](#gson)


### Sobre o desafio

Neste emocionante desafio de programação, convidamos você a construir o seu próprio Conversor de Moedas. Você aprenderá a fazer requisições a uma API de taxas de câmbio, a manipular dados JSON e, por fim, a filtrar e exibir as moedas de interesse. Prepare-se para uma experiência prática e empolgante no desenvolvimento Java!

OBJETIVO: Desenvolver um Conversor de Moedas que ofereça interação textual (via console) com os usuários, proporcionando no mínimo 6 opções distintas de conversões de moedas em um menu. A taxa de conversão não será estática, mas sim dinamicamente obtida por meio de uma API, garantindo dados precisos e em tempo real para uma experiência mais atualizada e eficaz.



Os passos para completar este desafio serão detalhados a seguir e estarão disponíveis na seção adjacente:

Configuração do Ambiente Java;

Criação do Projeto;

Consumo da API;

Análise da Resposta JSON;

Filtro de Moedas;

Exibição de Resultados aos Usuários;

Prepare-se para se envolver em uma experiência prática e emocionante no desenvolvimento Java!



Vamos trabalhar com o sistema ágil de desenvolvimento utilizando o Trello da seguinte forma:

A coluna "Pronto pra iniciar" apresenta os cartões com os elementos ainda não desenvolvidos;

Já na coluna "Desenvolvendo" ficarão os elementos que você estiver desenvolvendo no momento. Ao iniciar uma tarefa, você poderá mover o cartão que contém a tarefa para esta coluna.

No "Pausado" estarão os elementos que você começou a desenvolver, porém não concluiu ainda. Por exemplo, se você começou a desenvolver a tarefa de um card, mas decidiu pausar para se concentrar primeiro em outra parte do projeto;

Por fim, a coluna "Concluído" terá os elementos já concluídos.

O Trello é uma ferramenta de uso individual para você controlar o andamento das suas atividades, mas ela não será avaliada.

Bom projeto!

### 1) Configurando o ambiente de trabalho

Descrição detalhada do Desafio 2.Nesta primeira fase, mergulharemos na configuração do ambiente de desenvolvimento Java para o nosso desafio de construção do Conversor de Moedas. Certifique-se de ter os seguintes programas, arquivos e versões:

Java JDK: versão: 11 em diante -Download the Latest Java LTS Free

Biblioteca Gson 2.10.1 em diante -Maven Central Repository Search

Postman -Download Postman | Get Started for Free

IDE (Ambiente de desenvolvimento integrado) IntelliJ IDEA- opcional -Baixe o IntelliJ IDEA – O principal IDE para Java e Kotlin

### 2) Conhecendo a API para trazer dados

Neste passo crucial, é fundamental compreender melhor a API de taxas de câmbio, revisar a sua documentação e aprender como obter a chave da API. Esta chave é essencial para realizar pedidos e obter dados atualizados. Certifique-se de seguir cuidadosamente as instruções fornecidas pela API Exchange Rate API ou outra semelhante que tenha escolhido.

link: https://www.exchangerate-api.com/

### 3) Importando a biblioteca Gson no IntelliJ

Para importar a biblioteca Gson no IntelliJ, siga estes passos:

Abra o seu projeto no IntelliJ.

Clique com o botão direito na pasta do projeto no painel esquerdo.

Selecione "Abrir Configurações do Módulo" no menu de contexto.

Na janela que se abre, vá para a aba "Dependências".

Clique no sinal de "+" no canto inferior esquerdo e escolha "Biblioteca".

Procure por "gson" na caixa de pesquisa.

Selecione a versão do Gson que deseja utilizar.

Clique em "OK" para fechar a janela.

Agora, a biblioteca Gson está adicionada ao seu projeto e você pode começar a usá-la importando suas classes nos seus arquivos Java. Por exemplo:
