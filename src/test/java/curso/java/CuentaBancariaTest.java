package curso.java;

import curso.java.exceptions.InvalidAmountException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CuentaBancariaTest {

    @Test
    @DisplayName("GetBalance Caso Saldo inicial")
    void getBalance_SaldoInicial_DebeSer0(){
        CuentaBancaria cuenta = new CuentaBancaria();

        int result = cuenta.getBalance();

        assertEquals(0,result);
    }

    @Test
    void depositar_Depositar10_Balance10() throws InvalidAmountException{
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(10);

        int balance = cuenta.getBalance();
        assertEquals(10, balance);
    }

    @Test
    void depositar_DepositarMenos10_DebeFallar(){
        CuentaBancaria cuenta = new CuentaBancaria();
        assertThrows(InvalidAmountException.class, () -> cuenta.depositar(-10));

    }
}
