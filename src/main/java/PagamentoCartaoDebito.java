/*
 ** created by: jorge.lessa
 */
public class PagamentoCartaoDebito implements IMetodoPagamento{

    public Double calcularValor(Double valorDiaria, Integer numeroDiarias) {
        return (valorDiaria * numeroDiarias) * 1.05;
    }
}
