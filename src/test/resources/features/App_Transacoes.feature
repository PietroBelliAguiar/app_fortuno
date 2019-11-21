# language : pt

	Funcionalidade: Acessar Transações
	Como usuário 
	quero acessar transações 
	para realizar novas transações 
	
	Contexto: Abrir Transações
	Dado que o usuário abra o menu Transações 
	
	#REG-401-ABRIR NOVA TRANSFERÊNCIA
	@REG-401 @android
	Cenário: Abrir nova transferência
		Dado que o usuário abra a tela de nova transferência
		E coloque o valor necessário
		E transfira o valor para outra carteira
		Entao devera validar a transferência 
		
	#REG-402-ABRIR NOVA RECEITA
	@REG-402 @android
	Cenário: Abrir nova receita
		Dado que o usuário abra a tela de nova receita
		E coloque as informações necessárias para a receita
		Então devera validar a receita
	
	#REG-403-ABRIR NOVA DESPESA
	@REG-403 @android
	Cenário: Abrir nova despesa
		Dado que o usuário abra a tela de nova despesa
		E coloque as informações necessárias para a despesa
		Então devera validar a nova despesa
		
	#REG-404-ABRIR NOVA DESPESA DO CARTÃO 
	@REG-404 @android
	Cenário: Abrir nova despesa do cartão
		Dado que o usuário abra a tela de nova despesa do cartão
		E declare as informações necessárias para o cartão
		Então devera validar a despesa do cartão


