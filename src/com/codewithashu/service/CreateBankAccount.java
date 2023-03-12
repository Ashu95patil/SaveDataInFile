package com.codewithashu.service;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.codewithashu.entity.Account;

/*
* 
* @apiNote this Application  created the multiple api for createfile ,createAccount ,retrivefile,updateAccount the
* data through the BankAccount.
* 
* @author Ashwini Patil
* @see create file
* @see create account
* @see retrive account
* @see update account
* @since 
* 
*
*/
public class CreateBankAccount implements AccountService {

	Account acc = new Account();
	Scanner sc = new Scanner(System.in);

	public String filename = "E:\\Amruta.txt";

	@Override
	public void createNewFile() {
		System.out.println("create new file");

		String filename = sc.next();
		File database = new File(filename);

		try {

			if (database.createNewFile() == true) {

				try {
					FileWriter writer = new FileWriter(filename, true);
					writer.append("account_Id= " + " , " + " password=" + " , " + "first_Name" + " , " + " middle_Name "
							+ " , " + " last_name=" + " , " + " date_of_birth=" + " , " + " pan=" + " , " + " address="
							+ " , " + " State=" + " , " + " city=" + " , " + " zip_Code=" + " , " + " account_Balance="
							+ " , " + " status=");
					writer.append("\n");
					writer.close();
					System.out.println("file created succefully!");
				} catch (IOException e) {
					System.out.println(e);
				}

			} else {

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void creatAccount() {
		System.out.println("Enter your Account No");
		String accno = sc.next();
		acc.setAccount_Id(accno);

		System.out.println("Enter your FirstName");
		String fname = sc.next();
		acc.setFirst_Name(fname);

		System.out.println("Enter your LastName");
		String lname = sc.next();
		acc.setLast_name(lname);

		System.out.println("Enter your Date of birth");
		String dob = sc.next();
		acc.setDate_of_birth(dob);

		System.out.println("Enter Your Password");
		String pass = sc.next();
		acc.setPassword(pass);

		System.out.println("Enter your Address");
		String add = sc.next();
		acc.setAddress(add);

		System.out.println("Enter your Pan No");
		String panNo = sc.next();
		acc.setPan(panNo);

		System.out.println("Enter Your State");
		String state = sc.next();
		acc.setState(state);

		System.out.println("Enter your City");
		String city = sc.next();
		acc.setCity(city);

		System.out.println("Enter your Zipcode");
		int zipcode = sc.nextInt();
		acc.setZip_Code(zipcode);

		System.out.println("Enter you want to Deposit ");
		double deposit = sc.nextDouble();
		acc.setAccount_Balance(deposit);

		try {
			FileWriter writer = new FileWriter(filename, true);
			writer.append(acc.toString());
			writer.append("\n");
			writer.close();
			System.out.println("file added succefully!");
		} catch (IOException e) {
			System.out.println(e);
		}

		System.out.println("************Your Account Created Successfully***************");

	}

	public void getfileByname() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			System.out.println("please enter file name  to get the record");
			String searchKey = sc.next();
			String line;
			while ((line = reader.readLine()) != null) {
				if (line.contains(searchKey)) {
					System.out.println(line);

				} else {
					System.out.println("File not exist.. please create new Account....!!");
				}

			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void updateAccountdetails() {

		ArrayList<Object> arrayList = new ArrayList<>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			System.out.println("please enter any filename to update the record");
			String searchKey = sc.next();
			String line;
			while ((line = reader.readLine()) != null) {
				if (line.contains(searchKey)) {
					System.out.println("enter the text you want to change");
					String oldValue = sc.next();
					System.out.println("enter the new text you want to change");
					String newValue = sc.next();
					arrayList.add(line.replace(oldValue, newValue));

				} else {
					arrayList.add(line);
					System.out.println("file not exist.. please create new Account..!!");
				}

			}

		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			FileWriter writer = new FileWriter(filename);
			for (int i = 0; i < arrayList.size(); i++) {
				writer.append((CharSequence) arrayList.get(i));
				writer.append("\n");
			}
			writer.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		CreateBankAccount createBankAccount = new CreateBankAccount();

		createBankAccount.createNewFile();
		createBankAccount.creatAccount();

	}

}
