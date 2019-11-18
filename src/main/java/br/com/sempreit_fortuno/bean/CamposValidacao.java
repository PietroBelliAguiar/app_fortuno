package br.com.sempreit_fortuno.bean;

/**
 * @author SempreIT
 *
 */
public class CamposValidacao {

	private String tarifaSmilesClubVoo;
	private String tarifaSmilesVoo;
	private String tarifaSmilesVooViajeFacil;
	private String tarifaSmilesMoneyClubMilhasVoo;
	private String tarifaSmilesMoneyClubDinheiroVoo;
	private String tarifaSmilesMoneyDinheiroVoo;
	private String tarifaSmilesMoneyMilhasVoo;
	private String tarifaSmilesMoneyDinheiroVooViajeFacil;
	private String tarifaSmilesMoneyMilhasVooViajeFacil;
	private String resumoPagamentoBilheteEmReais;
	private String resumoPagamentoBilheteEmMilhas;
	private String resumoPagamentoTaxaEmbarqueEmReais;
	private String resumoPagamentoTaxaEmbarqueEmMilhas;
	private String resumoPagamentoTotalEmReais;
	private String resumoPagamentoTotalEmMilhas;
	private String taxaEmbarqueMilhas;
	private String taxaEmbarqueSmilesAndMoney;
	private String taxaEmbarqueDinheiro;
	private String taxaCobradaCompanhia;
	private String pnrIdaTelaSucesso;
	private String pnrIdaTelaSucesso2;
	private String pnrIdaExtrato;
	private String qtdMilhasEmissaoExtrato;
	private String dataPedidoExtrato;
	private String qtdMilhasCompraExtrato;
	private String dataDoPedidoExtrato;
	private String dataPesquisaExtrato;
	private String dataPedidoMeusPedidos;
	private String numPedidoMeusPedidos;
	private String nomeProdutoMeusPedidos;
	private String valorTotalPedidoMeusPedidos;
	private String valorTotalMilhasEmissaoMeusPedidos;
	private String valorTotalDinheiroEmissaoMeusPedidos;
	private String statusPedidoMeusPedidos;
	private String compraMilhasBonus;
	private String compraMilhasTotal;
	private String compraValorTotal;
	private String comprarValorDesconto;
	private String comprarValorSubtotal;
	private String dataPedidoSucesso;
	private String localizadorExtrato;
	private String valorTaxaViajeFacil;
	private String reativarMilhasBonus;
	private String reativarMilhasTotal;
	private String reativarValorTotal;
	private String transferirMilhasBonus;
	private String transferirMilhasTotal;
	private String transferirValorTotal;
	private String emissaoPlanoClube;
	private String emissaoValorPlanoClube;
	private String userMilhas;
	private String reembolsoMilhas;
	private String milhasTotalUber;
	private String valorReaisCreditoUber;
	private String qtdPassageiroFavorito;
	private String nomePassageiroFavoritoEditado;
	private String nomePassageiroFavorito;
	private String reembolsoDinheiro;
	private String taxaCancelamento;
	private String TotalAPagar;
	private String MilhasInicial;
	private String StartDateTransacao;
	private String EndDateTransacao;
	private String NumeroSmilesUsuarioLogado;
	private String TaxaEmbarque;
	private String LocalizadorReserva;
	private String PnrCancelamento;
	private String TarifaSmilesVooViajeFacilVolta;
	private String DescontoEmissaoPlanoClubeSmiles;
	private String valorMilhasBagagem;
	private String valorReaisBagagem;
	private String valorMilhasAssento;
	private String valorReaisAssento;
	private String valorClube;
	private String valorMilhasClube;
	private String valorMilhasReembolso;
	private String valorViajeFacil;
	private String valorMoneyQuitacaoViajeFacil;
	private String valorMilhasQuitacaoViajeFacil;
	private String valorBonusQuitacaoViajeFacil;
	private String resumoPagamentoDescontoMilhas;
	private String companhiaVolta;
	private String valorReaisAssentoReembolso;
	private String valorPrimeiraBagagem;
	private String valorSegundaBagagem;
	private String valorTerceiraBagagem;
	private String valorQuartaBagagem;
	private String regCenario;
	private String valorTarifaDiamante;
	private boolean flagTarifaTetoDiamante = false;
	private String valorTarifaTetoDiamante;
	
	public String getValorTarifaTetoDiamante() {
		return valorTarifaTetoDiamante;
	}
	public void setValorTarifaTetoDiamante(String valorTarifaTetoDiamante) {
		this.valorTarifaTetoDiamante = valorTarifaTetoDiamante;
	}
	public boolean isFlagTarifaTetoDiamante() {
		return flagTarifaTetoDiamante;
	}
	public void setFlagTarifaTetoDiamante(boolean flagTarifaTetoDiamante) {
		this.flagTarifaTetoDiamante = flagTarifaTetoDiamante;
	}
	public String getValorTarifaDiamante() {
		return valorTarifaDiamante;
	}
	public void setValorTarifaDiamante(String valorTarifaDiamante) {
		this.valorTarifaDiamante = valorTarifaDiamante;
	}
	public String getRegCenario() {
		return regCenario;
	}
	public void setRegCenario(String regCenario) {
		this.regCenario = regCenario;
	}
	public String getValorPrimeiraBagagem() {
		return valorPrimeiraBagagem;
	}
	public void setValorPrimeiraBagagem(String valorPrimeiraBagagem) {
		this.valorPrimeiraBagagem = valorPrimeiraBagagem;
	}
	public String getValorSegundaBagagem() {
		return valorSegundaBagagem;
	}
	public void setValorSegundaBagagem(String valorSegundaBagagem) {
		this.valorSegundaBagagem = valorSegundaBagagem;
	}
	public String getValorTerceiraBagagem() {
		return valorTerceiraBagagem;
	}
	public void setValorTerceiraBagagem(String valorTerceiraBagagem) {
		this.valorTerceiraBagagem = valorTerceiraBagagem;
	}
	public String getValorQuartaBagagem() {
		return valorQuartaBagagem;
	}
	public void setValorQuartaBagagem(String valorQuartaBagagem) {
		this.valorQuartaBagagem = valorQuartaBagagem;
	}
	public String getValorReaisAssentoReembolso() {
		return valorReaisAssentoReembolso;
	}
	public void setValorReaisAssentoReembolso(String valorReaisAssentoReembolso) {
		this.valorReaisAssentoReembolso = valorReaisAssentoReembolso;
	}
	public String getCompanhiaVolta() {
		return companhiaVolta;
	}
	public void setCompanhiaVolta(String companhiaVolta) {
		this.companhiaVolta = companhiaVolta;
	}
	public String getResumoPagamentoDescontoMilhas() {
		return resumoPagamentoDescontoMilhas;
	}
	public void setResumoPagamentoDescontoMilhas(String resumoPagamentoDescontoMilhas) {
		this.resumoPagamentoDescontoMilhas = resumoPagamentoDescontoMilhas;
	}
	public String getValorBonusQuitacaoViajeFacil() {
		return valorBonusQuitacaoViajeFacil;
	}
	public void setValorBonusQuitacaoViajeFacil(String valorBonusQuitacaoViajeFacil) {
		this.valorBonusQuitacaoViajeFacil = valorBonusQuitacaoViajeFacil;
	}
	public String getValorMoneyQuitacaoViajeFacil() {
		return valorMoneyQuitacaoViajeFacil;
	}
	public void setValorMoneyQuitacaoViajeFacil(String valorMoneyQuitacaoViajeFacil) {
		this.valorMoneyQuitacaoViajeFacil = valorMoneyQuitacaoViajeFacil;
	}
	public String getValorMilhasQuitacaoViajeFacil() {
		return valorMilhasQuitacaoViajeFacil;
	}
	public void setValorMilhasQuitacaoViajeFacil(String valorMilhasQuitacaoViajeFacil) {
		this.valorMilhasQuitacaoViajeFacil = valorMilhasQuitacaoViajeFacil;
	}
	public String getValorMilhasReembolso() {
		return valorMilhasReembolso;
	}
	public void setValorMilhasReembolso(String valorMilhasReembolso) {
		this.valorMilhasReembolso = valorMilhasReembolso;
	}
	public String getValorMilhasClube() {
		return valorMilhasClube;
	}
	public String getValorViajeFacil() {
		return valorViajeFacil;
	}
	public void setValorViajeFacil(String valorViajeFacil) {
		this.valorViajeFacil = valorViajeFacil;
	}
	public void setValorMilhasClube(String valorMilhasClube) {
		this.valorMilhasClube = valorMilhasClube;
	}
	public String getValorClube() {
		return valorClube;
	}
	public void setValorClube(String valorClube) {
		this.valorClube = valorClube;
	}
	public String getValorMilhasAssento() {
		return valorMilhasAssento;
	}
	public void setValorMilhasAssento(String valorMilhasAssento) {
		this.valorMilhasAssento = valorMilhasAssento;
	}
	public String getValorReaisAssento() {
		return valorReaisAssento;
	}
	public void setValorReaisAssento(String valorReaisAssento) {
		this.valorReaisAssento = valorReaisAssento;
	}
	
	public String getDescontoEmissaoPlanoClubeSmiles() {
		return DescontoEmissaoPlanoClubeSmiles;
	}
	public void setDescontoEmissaoPlanoClubeSmiles(String descontoEmissaoPlanoClubeSmiles) {
		DescontoEmissaoPlanoClubeSmiles = descontoEmissaoPlanoClubeSmiles ;
	}
	public String getValorReaisBagagem() {
		return valorReaisBagagem;
	}
	public void setValorReaisBagagem(String valorReaisBagagem) {
		this.valorReaisBagagem = valorReaisBagagem;
	}
	public String getValorMilhasBagagem() {
		return valorMilhasBagagem;
	}
	public void setValorMilhasBagagem(String valorMilhasBagagem) {
		this.valorMilhasBagagem = valorMilhasBagagem;
	}
	public String getPnrIdaTelaSucesso2() {
		return pnrIdaTelaSucesso2;
	}
	public void setPnrIdaTelaSucesso2(String pnrIdaTelaSucesso2) {
		this.pnrIdaTelaSucesso2 = pnrIdaTelaSucesso2;
	}
	public String getTaxaCobradaCompanhia() {
		return taxaCobradaCompanhia;
	}
	public void setTaxaCobradaCompanhia(String taxaCobradaCompanhia) {
		this.taxaCobradaCompanhia = taxaCobradaCompanhia;
	}
	public String getComprarValorSubtotal() {
		return comprarValorSubtotal;
	}
	public void setComprarValorSubtotal(String comprarValorSubtotal) {
		this.comprarValorSubtotal = comprarValorSubtotal;
	}
	public String getComprarValorDesconto() {
		return comprarValorDesconto;
	}
	public void setComprarValorDesconto(String comprarValorDesconto) {
		this.comprarValorDesconto = comprarValorDesconto;
	}
	public String getPnrCancelamento() {
		return PnrCancelamento;
	}
	public void setPnrCancelamento(String PnrCancelamento) {
		this.PnrCancelamento = PnrCancelamento;
	}
	
	public String getLocalizadorReserva() {
		return LocalizadorReserva;
	}
	public void setLocalizadorReserva(String localizadorReserva) {
		LocalizadorReserva = localizadorReserva;
	}
	public String getNumeroSmilesUsuarioLogado() {
		return NumeroSmilesUsuarioLogado;
	}
	public void setNumeroSmilesUsuarioLogado(String numeroSmilesUsuarioLogado) {
		NumeroSmilesUsuarioLogado = numeroSmilesUsuarioLogado;
	}
	public String getStartDateTransacao() {
		return StartDateTransacao;
	}
	public void setStartDateTransacao(String startDateTransacao) {
		StartDateTransacao = startDateTransacao;
	}
	public String getEndDateTransacao() {
		return EndDateTransacao;
	}
	public void setEndDateTransacao(String endDateTransacao) {
		EndDateTransacao = endDateTransacao;
		}
	public String getTaxaEmbarque() {
		return TaxaEmbarque;
	}
	public void setTaxaEmbarque(String TaxaEmbarque) {
		this.TaxaEmbarque = TaxaEmbarque;
	}
	public String getMilhasInicial() {
		return MilhasInicial;
	}
	public void setMilhasInicial(String MilhasInicial) {
		this.MilhasInicial = MilhasInicial;
	}	
	public String getTotalAPagar() {
		return TotalAPagar;
	}
	public void setTotalAPagar(String TotalAPagar) {
		this.TotalAPagar = TotalAPagar;
	}
	public String getTaxaCancelamento() {
		return taxaCancelamento;
	}
	public void setTaxaCancelamento(String taxaCancelamento) {
		this.taxaCancelamento = taxaCancelamento;
	}
	public String getReembolsoDinheiro() {
		return reembolsoDinheiro;
	}
	public void setReembolsoDinheiro(String reembolsoDinheiro) {
	}
	public String getReembolsoMilhas() {
		return reembolsoMilhas;
	}
	public void setReembolsoMilhas(String reembolsoMilhas) {
		this.reembolsoMilhas = reembolsoMilhas;
	}
	public String getUserMilhas() {
		return userMilhas;
	}
	public void setUserMilhas(String userMilhas) {
		this.userMilhas = userMilhas;
	}

	public String getValorReaisCreditoUber() {
		return valorReaisCreditoUber;
	}

	public void setValorReaisCreditoUber(String valorReaisCreditoUber) {
		this.valorReaisCreditoUber = valorReaisCreditoUber;
	}

	public String getMilhasTotalUber() {
		return milhasTotalUber;
	}

	public void setMilhasTotalUber(String milhasTotalUber) {
		this.milhasTotalUber = milhasTotalUber;
	}

	public String getTarifaSmilesVooViajeFacil() {
		return tarifaSmilesVooViajeFacil;
	}

	public String getTarifaSmilesVooViajeFacilVolta() {
		return TarifaSmilesVooViajeFacilVolta;
	}
	public void setTarifaSmilesVooViajeFacilVolta(String tarifaSmilesVooViajeFacilVolta) {
		TarifaSmilesVooViajeFacilVolta = tarifaSmilesVooViajeFacilVolta;
	}
	public void setTarifaSmilesVooViajeFacil(String tarifaSmilesVooViajeFacil) {
		this.tarifaSmilesVooViajeFacil = tarifaSmilesVooViajeFacil;
	}

	public String getTarifaSmilesMoneyDinheiroVooViajeFacil() {
		return tarifaSmilesMoneyDinheiroVooViajeFacil;
	}

	public void setTarifaSmilesMoneyDinheiroVooViajeFacil(String tarifaSmilesMoneyDinheiroVooViajeFacil) {
		this.tarifaSmilesMoneyDinheiroVooViajeFacil = tarifaSmilesMoneyDinheiroVooViajeFacil;
	}

	public String getTarifaSmilesMoneyMilhasVooViajeFacil() {
		return tarifaSmilesMoneyMilhasVooViajeFacil;
	}

	public void setTarifaSmilesMoneyMilhasVooViajeFacil(String tarifaSmilesMoneyMilhasVooViajeFacil) {
		this.tarifaSmilesMoneyMilhasVooViajeFacil = tarifaSmilesMoneyMilhasVooViajeFacil;
	}

	public String getEmissaoValorPlanoClube() {
		return emissaoValorPlanoClube;
	}

	public void setEmissaoValorPlanoClube(String emissaoValorPlanoClube) {
		this.emissaoValorPlanoClube = emissaoValorPlanoClube;
	}

	public String getEmissaoPlanoClube() {
		return emissaoPlanoClube;
	}

	public void setEmissaoPlanoClube(String emissaoPlanoClube) {
		this.emissaoPlanoClube = emissaoPlanoClube;
	}

	public String getTransferirMilhasBonus() {
		return transferirMilhasBonus;
	}

	public void setTransferirMilhasBonus(String transferirMilhasBonus) {
		this.transferirMilhasBonus = transferirMilhasBonus;
	}

	public String getTransferirMilhasTotal() {
		return transferirMilhasTotal;
	}

	public void setTransferirMilhasTotal(String transferirMilhasTotal) {
		this.transferirMilhasTotal = transferirMilhasTotal;
	}

	public String getTransferirValorTotal() {
		return transferirValorTotal;
	}

	public void setTransferirValorTotal(String transferirValorTotal) {
		this.transferirValorTotal = transferirValorTotal;
	}

	public String getReativarMilhasBonus() {
		return reativarMilhasBonus;
	}

	public void setReativarMilhasBonus(String reativarMilhasBonus) {
		this.reativarMilhasBonus = reativarMilhasBonus;
	}

	public String getReativarMilhasTotal() {
		return reativarMilhasTotal;
	}

	public void setReativarMilhasTotal(String reativarMilhasTotal) {
		this.reativarMilhasTotal = reativarMilhasTotal;
	}

	public String getReativarValorTotal() {
		return reativarValorTotal;
	}

	public void setReativarValorTotal(String reativarValorTotal) {
		this.reativarValorTotal = reativarValorTotal;
	}

	public String getValorTaxaViajeFacil() {
		return valorTaxaViajeFacil;
	}

	public void setValorTaxaViajeFacil(String valorTaxaViajeFacil) {
		this.valorTaxaViajeFacil = valorTaxaViajeFacil;
	}

	public String getLocalizadorExtrato() {
		return localizadorExtrato;
	}

	public void setLocalizadorExtrato(String localizadorExtrato) {
		this.localizadorExtrato = localizadorExtrato;
	}

	public String getDataPedidoSucesso() {
		return dataPedidoSucesso;
	}

	public void setDataPedidoSucesso(String dataPedidoSucesso) {
		this.dataPedidoSucesso = dataPedidoSucesso;
	}

	public String getCompraMilhasBonus() {
		return compraMilhasBonus;
	}

	public void setCompraMilhasBonus(String compraMilhasBonus) {
		this.compraMilhasBonus = compraMilhasBonus;
	}

	public String getCompraMilhasTotal() {
		return compraMilhasTotal;
	}

	public void setCompraMilhasTotal(String compraMilhasTotal) {
		this.compraMilhasTotal = compraMilhasTotal;
	}

	public String getCompraValorTotal() {
		return compraValorTotal;
	}

	public void setCompraValorTotal(String compraValorTotal) {
		this.compraValorTotal = compraValorTotal;
	}

	public String getStatusPedidoMeusPedidos() {
		return statusPedidoMeusPedidos;
	}

	public void setStatusPedidoMeusPedidos(String statusPedidoMeusPedidos) {
		this.statusPedidoMeusPedidos = statusPedidoMeusPedidos;
	}

	public String getValorTotalMilhasEmissaoMeusPedidos() {
		return valorTotalMilhasEmissaoMeusPedidos;
	}

	public void setValorTotalMilhasEmissaoMeusPedidos(String valorTotalMilhasEmissaoMeusPedidos) {
		this.valorTotalMilhasEmissaoMeusPedidos = valorTotalMilhasEmissaoMeusPedidos;
	}

	public String getValorTotalDinheiroEmissaoMeusPedidos() {
		return valorTotalDinheiroEmissaoMeusPedidos;
	}

	public void setValorTotalDinheiroEmissaoMeusPedidos(String valorTotalDinheiroEmissaoMeusPedidos) {
		this.valorTotalDinheiroEmissaoMeusPedidos = valorTotalDinheiroEmissaoMeusPedidos;
	}

	public String getDataPedidoMeusPedidos() {
		return dataPedidoMeusPedidos;
	}

	public void setDataPedidoMeusPedidos(String dataPedidoMeusPedidos) {
		this.dataPedidoMeusPedidos = dataPedidoMeusPedidos;
	}

	public String getNumPedidoMeusPedidos() {
		return numPedidoMeusPedidos;
	}

	public void setNumPedidoMeusPedidos(String numPedidoMeusPedidos) {
		this.numPedidoMeusPedidos = numPedidoMeusPedidos;
	}

	public String getNomeProdutoMeusPedidos() {
		return nomeProdutoMeusPedidos;
	}

	public void setNomeProdutoMeusPedidos(String nomeProdutoMeusPedidos) {
		this.nomeProdutoMeusPedidos = nomeProdutoMeusPedidos;
	}

	public String getValorTotalPedidoMeusPedidos() {
		return valorTotalPedidoMeusPedidos;
	}

	public void setValorTotalPedidoMeusPedidos(String valorTotalPedidoMeusPedidos) {
		this.valorTotalPedidoMeusPedidos = valorTotalPedidoMeusPedidos;
	}

	public String getDataPesquisaExtrato() {
		return dataPesquisaExtrato;
	}

	public void setDataPesquisaExtrato(String dataPesquisaExtrato) {
		this.dataPesquisaExtrato = dataPesquisaExtrato;
	}

	public String getDataDoPedidoExtrato() {
		return dataDoPedidoExtrato;
	}

	public void setDataDoPedidoExtrato(String dataDoPedidoExtrato) {
		this.dataDoPedidoExtrato = dataDoPedidoExtrato;
	}

	public String getQtdMilhasCompraExtrato() {
		return qtdMilhasCompraExtrato;
	}

	public void setQtdMilhasCompraExtrato(String qtdMilhasCompraExtrato) {
		this.qtdMilhasCompraExtrato = qtdMilhasCompraExtrato;
	}

	public String getDataPedidoExtrato() {
		return dataPedidoExtrato;
	}

	public void setDataPedidoExtrato(String dataPedidoExtrato) {
		this.dataPedidoExtrato = dataPedidoExtrato;
	}

	public String getQtdMilhasEmissaoExtrato() {
		return qtdMilhasEmissaoExtrato;
	}

	public void setQtdMilhasEmissaoExtrato(String qtdMilhasEmissaoExtrato) {
		this.qtdMilhasEmissaoExtrato = qtdMilhasEmissaoExtrato;
	}

	public String getPnrIdaTelaSucesso() {
		return pnrIdaTelaSucesso;
	}

	public void setPnrIdaTelaSucesso(String pnrIdaTelaSucesso) {
		this.pnrIdaTelaSucesso = pnrIdaTelaSucesso;
	}

	public String getPnrIdaExtrato() {
		return pnrIdaExtrato;
	}

	public void setPnrIdaExtrato(String pnrIdaExtrato) {
		this.pnrIdaExtrato = pnrIdaExtrato;
	}

	public String getTaxaEmbarqueMilhas() {
		return taxaEmbarqueMilhas;
	}

	public void setTaxaEmbarqueMilhas(String taxaEmbarqueMilhas) {
		this.taxaEmbarqueMilhas = taxaEmbarqueMilhas;
	}

	public String getTaxaEmbarqueSmilesAndMoney() {
		return taxaEmbarqueSmilesAndMoney;
	}

	public void setTaxaEmbarqueSmilesAndMoney(String taxaEmbarqueSmilesAndMoney) {
		this.taxaEmbarqueSmilesAndMoney = taxaEmbarqueSmilesAndMoney;
	}

	public String getTaxaEmbarqueDinheiro() {
		return taxaEmbarqueDinheiro;
	}

	public void setTaxaEmbarqueDinheiro(String taxaEmbarqueDinheiro) {
		this.taxaEmbarqueDinheiro = taxaEmbarqueDinheiro;
	}

	public String getTarifaSmilesClubVoo() {
		return tarifaSmilesClubVoo;
	}

	public void setTarifaSmilesClubVoo(String tarifaSmilesClubVoo) {
		this.tarifaSmilesClubVoo = tarifaSmilesClubVoo;
	}

	public String getTarifaSmilesVoo() {
		return tarifaSmilesVoo;
	}

	public void setTarifaSmilesVoo(String tarifaSmilesVoo) {
		this.tarifaSmilesVoo = tarifaSmilesVoo;
	}

	public String getTarifaSmilesMoneyMilhasVoo() {
		return tarifaSmilesMoneyMilhasVoo;
	}

	public void setTarifaSmilesMoneyMilhasVoo(String tarifaSmilesMoneyMilhasVoo) {
		this.tarifaSmilesMoneyMilhasVoo = tarifaSmilesMoneyMilhasVoo;
	}

	public String getTarifaSmilesMoneyClubMilhasVoo() {
		return tarifaSmilesMoneyClubMilhasVoo;
	}

	public void setTarifaSmilesMoneyClubMilhasVoo(String tarifaSmilesMoneyClubMilhasVoo) {
		this.tarifaSmilesMoneyClubMilhasVoo = tarifaSmilesMoneyClubMilhasVoo;
	}

	public String getTarifaSmilesMoneyClubDinheiroVoo() {
		return tarifaSmilesMoneyClubDinheiroVoo;
	}

	public void setTarifaSmilesMoneyClubDinheiroVoo(String tarifaSmilesMoneyClubDinheiroVoo) {
		this.tarifaSmilesMoneyClubDinheiroVoo = tarifaSmilesMoneyClubDinheiroVoo;
	}

	public String getTarifaSmilesMoneyDinheiroVoo() {
		return tarifaSmilesMoneyDinheiroVoo;
	}

	public void setTarifaSmilesMoneyDinheiroVoo(String tarifaSmilesMoneyDinheiroVoo) {
		this.tarifaSmilesMoneyDinheiroVoo = tarifaSmilesMoneyDinheiroVoo;
	}

	public String getResumoPagamentoBilheteEmReais() {
		return resumoPagamentoBilheteEmReais;
	}

	public void setResumoPagamentoBilheteEmReais(String resumoPagamentoBilheteEmReais) {
		this.resumoPagamentoBilheteEmReais = resumoPagamentoBilheteEmReais;
	}

	public String getResumoPagamentoBilheteEmMilhas() {
		return resumoPagamentoBilheteEmMilhas;
	}

	public void setResumoPagamentoBilheteEmMilhas(String resumoPagamentoBilheteEmMilhas) {
		this.resumoPagamentoBilheteEmMilhas = resumoPagamentoBilheteEmMilhas;
	}

	public String getResumoPagamentoTaxaEmbarqueEmReais() {
		return resumoPagamentoTaxaEmbarqueEmReais;
	}

	public void setResumoPagamentoTaxaEmbarqueEmReais(String resumoPagamentoTaxaEmbarqueEmReais) {
		this.resumoPagamentoTaxaEmbarqueEmReais = resumoPagamentoTaxaEmbarqueEmReais;
	}

	public String getResumoPagamentoTaxaEmbarqueEmMilhas() {
		return resumoPagamentoTaxaEmbarqueEmMilhas;
	}

	public void setResumoPagamentoTaxaEmbarqueEmMilhas(String resumoPagamentoTaxaEmbarqueEmMilhas) {
		this.resumoPagamentoTaxaEmbarqueEmMilhas = resumoPagamentoTaxaEmbarqueEmMilhas;
	}

	public String getResumoPagamentoTotalEmReais() {
		return resumoPagamentoTotalEmReais;
	}

	public void setResumoPagamentoTotalEmReais(String resumoPagamentoTotalEmReais) {
		this.resumoPagamentoTotalEmReais = resumoPagamentoTotalEmReais;
	}

	public String getResumoPagamentoTotalEmMilhas() {
		return resumoPagamentoTotalEmMilhas;
	}

	public void setResumoPagamentoTotalEmMilhas(String resumoPagamentoTotalEmMilhas) {
		this.resumoPagamentoTotalEmMilhas = resumoPagamentoTotalEmMilhas;
	}

	public String getQtdPassageiroFavorito() {
		return qtdPassageiroFavorito;
	}

	public void setQtdPassageiroFavorito(String qtdPassageiroFavorito) {
		this.qtdPassageiroFavorito = qtdPassageiroFavorito;
	}
	
	public String getNomePassageiroFavoritoEditado() {
		return nomePassageiroFavoritoEditado;
	}
	public void setNomePassageiroFavoritoEditado(String nomePassageiroFavoritoEditado) {
		this.nomePassageiroFavoritoEditado = nomePassageiroFavoritoEditado;
	}
	
	public String getNomePassageiroFavorito() {
		return nomePassageiroFavorito;
	}
	public void setNomePassageiroFavorito(String nomePassageiroFavorito) {
		this.nomePassageiroFavorito = nomePassageiroFavorito;
	}

}
