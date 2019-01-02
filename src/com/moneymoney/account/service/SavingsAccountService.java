package com.moneymoney.account.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import com.moneymoney.account.SavingsAccount;
import com.moneymoney.exception.AccountNotFoundException;

public interface SavingsAccountService {

	SavingsAccount createNewAccount(String accountHolderName,
			double accountBalance, boolean salary)
			throws ClassNotFoundException, SQLException;

	SavingsAccount getAccountById(int accountNumber)
			throws ClassNotFoundException, SQLException;

	SavingsAccount getAccountByName(String accountHolderName)
			throws ClassNotFoundException, SQLException;

	List<SavingsAccount> getAccountByBalance(double minmumBalance,
			double maximumBalance) throws ClassNotFoundException, SQLException;

	SavingsAccount deleteAccount(int accountNumber)
			throws ClassNotFoundException, SQLException;

	double checkAccountBalance(int accountNumber)
			throws  ClassNotFoundException,
			SQLException;

	List<SavingsAccount> getAllSavingsAccount() throws ClassNotFoundException,
			SQLException;

	void fundTransfer(SavingsAccount sender, SavingsAccount receiver,
			double amount) throws ClassNotFoundException, SQLException;

	void deposit(SavingsAccount account, double amount)
			throws ClassNotFoundException, SQLException;

	void withdraw(SavingsAccount account, double amount)
			throws ClassNotFoundException, SQLException;

	List<SavingsAccount> sortAllSavingsAccount(int choice)
			throws ClassNotFoundException, SQLException;
	
	SavingsAccount updateAccount(int accountNumber, int userChoice,
			String nameORSalary) throws ClassNotFoundException, SQLException;
}