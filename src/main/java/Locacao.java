/*
 ** created by: jorge.lessa
 */
public class Locacao {

    private Jogo jogo;
    private Integer quantidadeDeDias;

    public Locacao(Jogo jogo, Integer quantidadeDeDias) {
        this.jogo = jogo;
        this.quantidadeDeDias = quantidadeDeDias;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public Integer getQuantidadeDeDias() {
        return quantidadeDeDias;
    }

    public void setQuantidadeDeDias(Integer quantidadeDeDias) {
        this.quantidadeDeDias = quantidadeDeDias;
    }

    public Double calcularPagamentoPix()
    {
        Pagamento pagamento = new Pagamento(this.getJogo().getValorDiaria(), this.getQuantidadeDeDias());
        return pagamento.calcular(new PagamentoPix());
    }

    public Double calcularPagamentoDinheiro()
    {
        Pagamento pagamento = new Pagamento(this.getJogo().getValorDiaria(), this.getQuantidadeDeDias());
        return pagamento.calcular(new PagamentoDinheiro());
    }

    public Double calcularPagamentoCartaoDebito()
    {
        Pagamento pagamento = new Pagamento(this.getJogo().getValorDiaria(), this.getQuantidadeDeDias());
        return pagamento.calcular(new PagamentoCartaoDebito());
    }

    public Double calcularPagamentoCartaoCredito()
    {
        Pagamento pagamento = new Pagamento(this.getJogo().getValorDiaria(), this.getQuantidadeDeDias());
        return pagamento.calcular(new PagamentoCartaoCredito());
    }
}
