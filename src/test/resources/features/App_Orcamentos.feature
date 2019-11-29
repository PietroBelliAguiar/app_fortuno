#language:pt

Funcionalidade: Acessar menu orçamentos
Como usuário
Quero colocar um orçamento e uma meta para atingir 
Para realizar meus objetivos financeiros 

Contexto: Acessar a tela Orçamentos
Dado que o usuário acesse a tela Orçamentos

#REG-501-ADICIONAR ORÇAMENTOS
@REG-501 @android
Cenário: Adicionar um ou mais orçamentos
Dado que o usuário adicione um ou mais orçamentos
E coloque os valores necessários
Então deverá validar os dados

#REG-502-ABRIR MENU GRÁFICOS
@REG-502 @android
Cenário: Abrir menu gráficos
Dado que o usuário abra o menu gráficos
Então devera validar a apresentação