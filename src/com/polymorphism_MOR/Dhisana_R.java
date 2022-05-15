package com.polymorphism_MOR;

public class Dhisana_R extends TATA_CONSULTANCY_SERVICES {
	@Override
	public void employment_Application(String Full_Name, long Contact_Number) {
		// TODO Auto-generated method stub
		super.employment_Application(Full_Name, Contact_Number);
		}
	@Override
	public void employment_Application(long D_O_B, String Email_Id) {
		// TODO Auto-generated method stub
		super.employment_Application(D_O_B, Email_Id);
		}
	@Override
	public void employment_Application(String Position_Applier_For, byte Experience_In_years) {
		// TODO Auto-generated method stub
		super.employment_Application(Position_Applier_For, Experience_In_years);
		}
	@Override
	public void employment_Application(String Current_Employer, Long Salary) {
		// TODO Auto-generated method stub
		super.employment_Application(Current_Employer, Salary);
		}
	@Override
	public void employment_Application(String Area_Of_Studty, String Address) {
		// TODO Auto-generated method stub
		super.employment_Application(Area_Of_Studty, Address);
		}
							// syntex-MAINMETHOD
	public static void main(String[] args) {
		
		Dhisana_R R = new Dhisana_R();
		
		R.employment_Application("Dhisna R", "8667689625");
		R.employment_Application("17-01-2021", "dhisanaraj@gmail.com");
		R.employment_Application("Software Engineer", "2_Years" );
		R.employment_Application("IBM", "12,00000");
		R.employment_Application("Robatics", "Kodaikannal");
		}
		}
