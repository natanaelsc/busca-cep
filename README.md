<h1>Busca CEP</h1>
API Java Spring com ReactiveWeb para consumo do webservice de busca de CEP da <b>ViaCEP</b>

<h2>O que é?</h2>
Pequena API Rest para consulta de CEP através do WebService da ViaCEP. Projeto desenvolvido junto ao VSCode utilizando o Spring com Java 8. O objetivo do projeto foi
somente para teste do WebService e pratica de consumo de serviços externos.

<h2>Dica!</h2>
O ViaCEP é um serviço gratuito que serve como exemplo para muitos, então não vamos sobrecarregar o serviço com consultas repetitivas, pode usar uma estrutura de consultas internas/externas, onde em nossa base de dados consultamos a tabela CEP e caso não exista consultamos o ViaCEP, depois que a consulta do ViaCEP retornar (caso o CEP exista) cadastramos ele e nossa própria tabela de CEP.
Pode-se até criar um TIMESTAMP para registrar data que o CEP foi criado/atualizado para que a cada um determinado tempo o mesmo seja atualizado novamente através do ViaCEP.
Se todos fizerem o melhor pensando no próximo vamos ter um excelente serviço rápido e estável.
(https://gitlab.com/parg/ViaCEP)

<h4>Referência</h4>
ViaCEP (https://viacep.com.br/)
