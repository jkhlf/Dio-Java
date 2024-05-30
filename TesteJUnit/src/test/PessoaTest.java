package test;

import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Test;

import construtores.Pessoa;

public class PessoaTest {

    @Test
    public void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assert.assertEquals(24, jessica.getIdade());
    }

    @Test
    public void deveRetornarSeEhMaiorDeIdade() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assert.assertTrue(jessica.ehMaiorDeIdade());

        Pessoa joao = new Pessoa("João", LocalDateTime.now());
        Assert.assertFalse(joao.ehMaiorDeIdade());
    }

    @Test
    public void validaIgualdade() {
        Pessoa pessoa = new Pessoa("Pessoa 1", LocalDateTime.now());
        Assert.assertSame(pessoa, pessoa);
    }

}