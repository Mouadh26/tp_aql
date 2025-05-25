package test_tp0;

import org.example.tp0.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    @Test
    void transfer_UpdatesBalancesCorrectly() {
        BankAccount acc1 = new BankAccount(1000, 0.05);
        BankAccount acc2 = new BankAccount(500, 0.05);
        acc1.transfer(200, acc2);
        assertEquals(800, acc1.getBalance());
        assertEquals(700, acc2.getBalance());
    }

    @Test
    void addInterest_CalculatesCorrectly() {
        BankAccount acc = new BankAccount(1000, 0.05);
        acc.addInterest();
        assertEquals(1050, acc.getBalance(), 0.01);
    }
}