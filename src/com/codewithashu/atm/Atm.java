package com.codewithashu.atm;

import java.util.Scanner;

import com.codewithashu.service.CreateBankAccount;

/*
* 
* @apiNote this Application  created the multiple api for  retrivefile,updateAccount the
* data get the BankAccount.
* 
* @author Ashwini Patil

* @see retrive account
* @see update account
* @since 
* 
*
*/

public class Atm {

	public static void main(String[] args) {

		CreateBankAccount accountservice = new CreateBankAccount();
		boolean flag = true;

		Scanner input = new Scanner(System.in).useDelimiter("\n");

		while (flag) {

			System.out.println("====================================================");
			System.out.println("Account Details System in Java Using Text File" + "");
			System.out.println("====================================================");
			System.out.println("[1] View File ");
			System.out.println("[2] Update Account Details");

			System.out.println("[3] Quit Program");
			System.out.println("====================================================");
			System.out.println("********-----!!!!*******Choose your Option******!!!!------*********");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				accountservice.getfileByname();
				break;
			case 2:
				accountservice.updateAccountdetails();

				break;

			case 3:
				flag = false;

				System.out.println("*******!!!!!!*********Thanks for using Bank Services*********!!!!!!**********");

			}
		}

	}
}
