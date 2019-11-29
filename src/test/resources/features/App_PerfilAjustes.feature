#language:pt

Funcionalidade: Acessar perfil pessoal e ajusta-lo 
Como usuário
Quero ajustar meu perfil de acordo com as opções apresentadas na tela
Para realizar as mudanças requisitadas

Contexto: Acessar Perfil & Ajustes
Dado que o usuário acesse o menu Perfil  Ajustes

#REG-801-ACESSAR PERFIL AJUSTES
@REG-801 @android
Cenário: Acessar Perfil Ajustes
Dado que o usuário coloque as mudanças requisitadas
Então deverá validar a apresentação da tela Perfil Ajustes 

#REG-802-ACESSAR MIGRAR PARA PREMIUM
@REG-802 @android

Cenário: Acessar Migrar para premium
Dado que o usuário acesse a tela migrar para premium
Então deverá validar o acesso à tela