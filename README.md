# projeto-final-testing-II
Projeto final de Caio Castro e Jeziel.

Projeto avaliativo da aula de Testing II. Com o objetivo de medir nosso aprendizado, nosso professor, Tiago Gomes, nos deu o desafio de criar casos de testes para este site(<em>https://parabank.parasoft.com/parabank/index.htm</em>). O projeto foi dividido em duas partes, o Front e o Back. No Front, utilizamos o <em>design pattern</em> chamado <em>Page Object Model</em> junto com o Selenium, e testamos as principais funcionalidades para assegurar o correto funcionamento do site. Para o Back, usamos a ferramenta RestAssured para interagir com a Endpoint(<em>https://parabank.parasoft.com/parabank</em>) que nos foi dada e assim construir os casos de testes necessários.


## Como rodar o projeto

<ol>
  <li>Clone o projeto</li>
  <li>Instale o <a href="https://www.jetbrains.com/pt-br/idea/download/#section=linux">IntelliJ Community</a></li>
  <li>Abra o projeto no IntelliJ e baixe as dependências presente no <em>pom.xml</em></li>
</ol>


### Front 
<em>DISCLAIMER</em> O Driver que o teste utiliza é o Edgedriver, driver do Microsoft Edge.
<ol>
  <li>Vá na pasta Tests que fica em: <em>src/test/java/front/Tests</li>
  <li>Execute o teste NewRegistration</li>
  <li>Execute o restante na ordem que preferir</li>
</ol>

### Back
<em>DISCLAIMER</em> Nossos testes do Back ficaram simples demais porque não entendemos muito bem o funcionamento do Endpoint da API e acredito que rodá-los pode gerar testes falhos, mas caso ainda queira rodá-los, aqui está o passo a passo.
<ol>
  <li>Abra o arquivo parabankAPI que fica em: <em>src/test/java/back/</li>
  <li>Execute qualquer teste que tenha a notação @Test acima</li>
</ol>
