/*
 ** created by: jorge.lessa
 */
public class PagamentoPix implements IMetodoPagamento{

    public Double calcularValor(Double valorDiaria, Integer numeroDiarias) {
        Double valorFinal = valorDiaria * numeroDiarias;
        if (numeroDiarias > 10)
        {
            valorFinal = valorFinal * 0.9;
        }
        return valorFinal;
    }
}
