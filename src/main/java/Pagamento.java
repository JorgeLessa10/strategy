/*
 ** created by: jorge.lessa
 */
public class Pagamento {

    private Double valor;
    private Integer quantidadeDias;

    public Pagamento(Double valor, Integer quantidadeDias) {
        this.valor = valor;
        this.quantidadeDias = quantidadeDias;
    }

    public Double calcular(IMetodoPagamento metodoPagamento)
    {
        return metodoPagamento.calcularValor(this.valor, this.quantidadeDias);
    }
}
