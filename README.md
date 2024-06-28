Português - BR

Testes automatizados no site da Amazon.com.br

1) Teste de login:

    1.1) Testando o acesso com o email errado;

    1.2) Testando o acesso com a senha errada;

    1.3) Testando o acesso com o email e a senha corretos.
   
2) Teste de fluxo de login e seleção de item:

    2.1) Realiza login

    2.2) Procura por kindle na busca

    2.3) Seleciona o primeiro objeto no resultado

    2.4) Adiciona ao carrinho

    2.5) Valida se o item foi adicionado ao carrinho

3) Contexto da construção do teste:

    3.1) Teste construído em page object model (POM), separado em page elements, page actions e page. Além disso, há o arquivo de teste.

    3.2) Page elements: responsável por organizar os seletores dos elementos, facilita na manutenção dos elementos capturados

    3.3) Page actions: responsável por organizar os métodos das ações do teste, facilita no reuso em diversos testes

    3.4) Page: responsável pelo apontamento e ordenação dos métodos, mesmo que seja algo repetitivo, ajuda no direcionamento durante as manutenções.

   
English

Automated tests on the Amazon.com.br website

1) Login Test:

    1.1) Testing access with the wrong email;

    1.2) Testing access with the wrong password;

    1.3) Testing access with the correct email and password.
   
2) Login flow and item selection testing:

    2.1) Log in

    2.2) Search for kindle in the search

    2.3) Selects the first object in the result

    2.4) Add to cart

    2.5) Validates whether the item has been added to the cart

3) Test construction context:

    3.1) Test built on page object model (POM), separated into page elements, page actions and page. Additionally, there is the test file.

    3.2) Page elements: responsible for organizing the element selectors, facilitates the maintenance of captured elements

    3.3) Page actions: responsible for organizing test action methods, facilitating reuse in different tests

    3.4) Page: responsible for pointing out and ordering the methods, even if it is repetitive, it helps with guidance during maintenance.
