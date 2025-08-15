/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg16303_ibrahimekinci_tut8_task2;

import domain.ChequeAccount;
import domain.IAccount;
import exception.*;

/**
 *
 * @author pc
 */
public class Main {

    private static void handleException(Exception e) {
        if (e instanceof ICustomException customException) {
            System.out.printf("Domain Error: %s%n", customException.getMessage());
        } else {
            System.out.printf("Unexpected Error: %s%n", e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // === ACCOUNT INITIALIZATION ===
            System.out.println("=== ACCOUNT INITIALIZATION ===");
            IAccount cheque = new ChequeAccount(1000.00);
            System.out.printf("Cheque Account: $%.2f%n", cheque.getBalance());

            System.out.println("Attempting 3 withdrawals: $400 + $300 + $300...");
            try {
                cheque.withdraw(400);
                System.out.printf("After $400 -> Balance: $%.2f%n", cheque.getBalance());
                cheque.withdraw(300);
                System.out.printf("After $300 -> Balance: $%.2f%n", cheque.getBalance());
                System.out.printf("just trying for $350 (should fail) -> Balance: $%.2f%n", cheque.getBalance());
                cheque.withdraw(350); // should fail

            } catch (Exception e) {
                handleException(e);
            }

            System.out.printf("Final cheque account Balance: $%.2f%n", cheque.getBalance());

        } catch (Exception e) {
            handleException(e);
        }

    }

}
