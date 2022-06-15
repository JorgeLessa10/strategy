/*
 ** created by: jorge.lessa
 */
public class PagamentoDinheiro implements IMetodoPagamento{

    public Double calcularValor(Double valorDiaria, Integer numeroDiarias) {
        return (valorDiaria * numeroDiarias) * 0.95;
    }
}
