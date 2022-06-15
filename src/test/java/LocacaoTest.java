import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 ** created by: jorge.lessa
 */
class LocacaoTest {

    @Test
    void deveCalcularValorPagamentoPixMaisDe10Diarias()
    {
        Jogo j1 = new Jogo("FIFA 22", 2.0);
        Locacao locacao = new Locacao(j1, 15);
        assertEquals(27, locacao.calcularPagamentoPix());
    }

    @Test
    void deveCalcularValorPagamentoPix10Diarias()
    {
        Jogo j1 = new Jogo("FIFA 22", 2.0);
        Locacao locacao = new Locacao(j1, 10);
        assertEquals(20, locacao.calcularPagamentoPix());
    }

    @Test
    void deveCalcularValorPagamentoCartaoCredito()
    {
        Jogo j1 = new Jogo("FIFA 22", 2.0);
        Locacao locacao = new Locacao(j1, 10);
        assertEquals(22, locacao.calcularPagamentoCartaoCredito());
    }

    @Test
    void deveCalcularValorPagamentoCartaoDebito()
    {
        Jogo j1 = new Jogo("FIFA 22", 2.0);
        Locacao locacao = new Locacao(j1, 10);
        assertEquals(21, locacao.calcularPagamentoCartaoDebito());
    }

    @Test
    void deveCalcularValorPagamentoDinheiro()
    {
        Jogo j1 = new Jogo("FIFA 22", 2.0);
        Locacao locacao = new Locacao(j1, 10);
        assertEquals(19, locacao.calcularPagamentoDinheiro());
    }

}