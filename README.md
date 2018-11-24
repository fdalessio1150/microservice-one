# microservice-one

Objetivo deste microserviço:
* Receber um payload em JSON e transformar em objeto
* Transmitir o objeto como JSON para outro microserviço
* Comunicar com outro microserviço utilizando o Feign e Service Discovery
* Implementar Hystrix como fallback em diferentes pontos da aplicação para aumentar a resiliência do serviço

TO-DO:
* Implementar controle de Exception caso receba um erro de outro microserviço
* Testes unitários

Como testar:
* Subir o Service-Dicovery
* Subir microservice-one e microservice-two
* Configurar o application.properties conforme exemplo disponível do repositório resources

Passando o payload em Json:
curl -H "Content-Type:application/json" -kvX POST "http://localhost:8080/v1/call-service-two/50" \
-d '{
    "id": "ab9ca49a-2fb5-4fd3-84ec-4095b560058f",
    "nome": "Felipe"
}'

Passando uma lista em Json:
curl -H "Content-Type:application/json" -kvX POST "http://localhost:8080/v1/call-service-two-list/400" \
-d '
[
    {
        "id": "ab9ca49a-2fb5-4fd3-84ec-4095b560058f",
        "nome": "Felipe"
    },
	{
        "id": "f43a3737-b564-4674-912d-6860f9e62c17",
        "nome": "Michelle"
    }
]'

Para testar caso de fallback do serviço 2:
curl -H "Content-Type:application/json" -kvX POST "http://localhost:8080/v1/call-service-two/1100" \
-d '{
    "id": "ab9ca49a-2fb5-4fd3-84ec-4095b560058f",
    "nome": "Felipe"
}'

Repare que a resposta deve ser:
"Fallback do serviço 2 ativado."


