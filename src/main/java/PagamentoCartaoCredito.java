/*
 ** created by: jorge.lessa
 */
public class PagamentoCartaoCredito implements IMetodoPagamento{

    public Double calcularValor(Double valorDiaria, Integer numeroDiarias) {
        return (valorDiaria * numeroDiarias) * 1.1;
    }
}
