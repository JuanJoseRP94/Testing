package curso.java;

import curso.java.exceptions.InvalidAmountException;

public class CuentaBancaria {

    int balance;

    CuentaBancaria(){
        balance = 0;
    }
    public int getBalance(){
        return balance;
    }
    public void depositar(int cantidad) throws InvalidAmountException {
        if (cantidad < 0){
            throw new InvalidAmountException("No se puede depositar una cantidad negativa");
        }
        balance += cantidad;
    }
}
