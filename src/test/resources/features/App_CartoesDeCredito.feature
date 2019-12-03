#language: pt
Funcionalidade: Acessar menu Cartões de Crédito
Como usuário
quero adicionar um ou mais cartões de crédito
para realizar pagamento de despesas

Contexto: Acessar a tela Cartões de Crédito
Dado que o usuário acesse a tela de Cartões de Crédito

#REG - 201 - ADICIONAR CARTÃO DE CRÉDITO
@REG-201 @android
Cenário: Adicionar cartão de crédito
Dado que o usuário adicione um novo cartão
Então devera validar o cartão cadastrado	

#REG - 202 - ADICIONAR NOVA DESPESA
@REG-202 @android
Cenário: Adicionar nova despesa
	Dado que o usuário adicione uma nova despesa no cartão
	E escolhe entre repetir ou parcelar despesa
	Então deverá ser validado o cadastro de despesa
	
#REG - 203 - ADICIONAR CRÉDITO/ESTORNO
@REG-203 @android
Cenário: Adicionar novo crédito ou estorno
	Dado que o usuário adicione um novo crédito ou estorno
	Então deverá ser validado o cadastro do crédito ou estorno
	
#REG - 204 - EDITAR CARTÃO
@REG-204 @android
Cenário: Alterar cartão de crédito
	Dado que o usuário acesse a opção editar cartão
	E alterar os dados do cartão
	Então de deverá ser validado as alterações do cartão

#REG - 205 - PAGAR FATURA
@REG-205 @android
	Cenário: Pagar fatura cartao
	Dado que o usuário tenha uma despesa cadastrada
	E realize o pagamento da despesa
	Então deverá ser validado o pagamento da despesa
	
	#REG - 206 - EXCLUIR CARTÃO DE CRÉDITO
	@REG-206 @android
	Cenário: Deletar cartão de crédito
	Dado que o usuário tenha um cartão de crédito cadastrado
	E que o usuário acesse a opção editar cartão
	E escolha remover o cartão
	Então deverá ser validado a exclusão do cartão
	
	
	
	