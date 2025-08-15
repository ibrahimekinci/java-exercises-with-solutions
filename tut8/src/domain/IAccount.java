/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
import exception.*;
/**
 *
 * @author pc
 */
/**
 * Interface for common account operations.
 */
public interface IAccount {

    void withdraw(double amount) throws CustomException;

    double getBalance();
}
