package test;

import org.junit.Assert;
import org.junit.Test;

import construtores.Conta;


public class ContaTest {

    @Test
    public void validaSaldo() {
        Conta conta = new Conta("123456", 100);
        Assert.assertNotNull(conta);

        conta.lancaCredito(50);

        Assert.assertEquals(150, conta.getSaldo());

        conta.lancaDebito(50);

        Assert.assertEquals(100, conta.getSaldo());

        Assert.assertNotEquals(101, conta.getSaldo());

        conta = null;
        Assert.assertNull(conta);
    }

    
    @Test 
    public void validarLancamentos () {
         int [] primieiroLance = {10, 20, 30, 40, 50};
         int [] segundoLance = {120, 230, 530, 440, 100};

        // Assert.assertArrayEquals(primieiroLance, segundoLance);
        Assert.assertNotEquals(primieiroLance, segundoLance);
        Assert.assertNotNull(primieiroLance);
     }


    //  @Before
    //  do somenthing 
    //  @Test 
    //  do somenthing 
    //  @After 
    //  do somenthing


    //  @Enable...
    // Assume.


    // Throw new IllegalArgumentException ("o valor deve ...")
    // Assert.assertThorws(IllegalArgumentException.class, () -> 
    //                     lambda );

    // @TestMethodOrder ()
    // MethodName, Random
    // @DisplayName()
    // @Order ()
}