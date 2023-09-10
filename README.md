# Hear Me Out - DevOps e Cloud Computing - Sprint 3

 ## Sobre a solução  
 O App "HearMeOut" resolveria o problema de acessibilidade para usuários com deficiência visual na plataforma da Plusoft, permitindo que eles possam interagir com os diversos segmentos da empresa (saúde, seguros, agronegócio, serviços, bens de consumo, educação, telecom, financeiro, utilities e varejo) de forma mais fácil e intuitiva por meio de um chatbot com funcionalidades de voz.
Com a criação de um chatbot em forma de áudio, essas pessoas terão a possibilidade de tirar suas dúvidas e receber informações de forma mais acessível e inclusiva. A iniciativa busca, portanto, promover a igualdade de oportunidades e o acesso à informação para pessoas com deficiência visual.
Nesse caso, a iniciativa também promove a inclusão e acessibilidade para um público mais amplo, ampliando o alcance e a utilidade do serviço oferecido. A acessibilidade deve ser uma preocupação de todos, e a inclusão de opções de áudio pode tornar o chatbot mais acessível e eficiente para diferentes públicos.

## Desenho de arquitetura  
![devops-sprint2](https://github.com/trcosta97/crud-user-hearmeout/assets/101136329/70150ebd-d7cc-47c3-b7d4-9655c9736b7e)

## Benefício em relação ao negócio
- Acessibilidade Aprimorada  
- Igualdade de Oportunidades  
- Independência e Autonomia  
- Ampla Adoção  
- Economia de Tempo e Esforço  
- Ampliação da Base de Clientes  
- Responsabilidade Social e Imagem Corporativa  
- Conveniência para Todos  
Em resumo, o projeto "HearMeOut" não apenas atende a uma necessidade importante de acessibilidade para pessoas com deficiência visual, mas também oferece vantagens comerciais, sociais e de imagem corporativa para a Plusoft. Ao investir na acessibilidade e na inclusão, a empresa está alinhada com os valores contemporâneos de diversidade e igualdade, ao mesmo tempo em que amplia sua base de clientes e melhora a experiência do usuário para todos os públicos.

## JSON para a API:
### Cadastro de usuário:
URL: "/user"  
VERBO: POST  
```console
  {
  "name": "string",
  "cpf": "string",
  "email": "string",
  "password": "string",
  "address": {
    "number": "string",
    "street": "string",
    "city": "string",
    "cep": "string",
    "province": "AC",
    "complement": "string"
  },
  "gender": "MASCULINE"
}
```

### Atualização de usuário:
URL: "/user"    
VERBO: PUT    
```console
{
  "email": "string",
  "password": "string"
}
```

### Pesquisa de usuário:
URL: "/user/{id}" sendo {id} o id do usuário pesquisado    
VERBO: GET   

### Listagem de usuários:
URL: "/user/"   
VERBO: GET  

### Exclusão lógica de usuário:
URL: "/user/{id}" sendo {id} o id do usuário excluído  
VERBO: DELETE 
