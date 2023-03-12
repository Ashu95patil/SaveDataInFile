package com.codewithashu.entity;


public class Account {
	
	private String account_Id;
	private String password;
	private String	first_Name;
	private String middle_Name;
	private String last_name; 
	private String	date_of_birth ; 
	private String 	pan; 
	private String	address; 
	private String	State;
	private String	city ;
	private int	zip_Code ;
	private double  account_Balance;
	
	private Integer status;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String account_Id, String password, String first_Name, String middle_Name, String last_name,
			String date_of_birth, String pan, String address, String state, String city, int zip_Code,
			double account_Balance, Integer status) {
		super();
		this.account_Id = account_Id;
		this.password = password;
		this.first_Name = first_Name;
		this.middle_Name = middle_Name;
		this.last_name = last_name;
		this.date_of_birth = date_of_birth;
		this.pan = pan;
		this.address = address;
		State = state;
		this.city = city;
		this.zip_Code = zip_Code;
		this.account_Balance = account_Balance;
		this.status = status;
	}

	public String getAccount_Id() {
		return account_Id;
	}

	public void setAccount_Id(String account_Id) {
		this.account_Id = account_Id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getMiddle_Name() {
		return middle_Name;
	}

	public void setMiddle_Name(String middle_Name) {
		this.middle_Name = middle_Name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZip_Code() {
		return zip_Code;
	}

	public void setZip_Code(int zip_Code) {
		this.zip_Code = zip_Code;
	}

	public double getAccount_Balance() {
		return account_Balance;
	}

	public void setAccount_Balance(double account_Balance) {
		this.account_Balance = account_Balance;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Account [account_Id=" + account_Id + ", password=" + password + ", first_Name=" + first_Name
				+ ", middle_Name=" + middle_Name + ", last_name=" + last_name + ", date_of_birth=" + date_of_birth
				+ ", pan=" + pan + ", address=" + address + ", State=" + State + ", city=" + city + ", zip_Code="
				+ zip_Code + ", account_Balance=" + account_Balance + ", status=" + status + "]";
	}

	


}
