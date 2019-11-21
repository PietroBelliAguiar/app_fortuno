# language : pt

	Funcionalidade: Realizar Transferencia
	Como usuário
	quero realizar uma transferencia
	para validar as funcionalidades referentes a ela
	
	Contexto: Acessar o menu +
	Dado que o usuário acesse o menu de opções adicionais
	Então deverá ser validada a apresentação das opções

	
	#REG - 401 - REALIZAR TRANSFERENCIA
	@REG-401  @android
	
	Cenário: Realizar Transferencia
	Dado que o usuário acesse a tela de Transferência
	E digite um valor a ser transferido
	E selecione uma data válida
	E valide o valor apresentado no saldo da carteira
	E selecione as carteiras para a transação
	E opte por finalizar a transferência
	Então deverá validar a mensagem de sucesso da Transferência
	