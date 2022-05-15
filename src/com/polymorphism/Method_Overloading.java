package com.polymorphism;

public class Method_Overloading {

			public void application_details(String First_Name, String Last_Name) {
			
				System.out.println(First_Name  +" "+Last_Name);
			}
			public void application_details(long Application_Number, byte age) {
			System.out.println(Application_Number  +"  "+age);
			}
			public void application_details(long Aadhar_Number, String Pan_Number) {
			System.out.println(Aadhar_Number+"  "+Pan_Number);
			}
			public void application_details(long Date_Of_Birth, float Height) {
				System.out.println(Date_Of_Birth +"  "+ Height);
			}
			public void application_details(long Account_Number, long CIF_Number) {
				System.out.println(Account_Number+"  "+ CIF_Number);
			}
			public void application_details(String Qualification,  int Year_Of_Passing) {
				System.out.println(Qualification+"  "+ Year_Of_Passing);
			}
			
			public static void main(String[] args) {
				Method_Overloading M = new Method_Overloading();
				M.application_details("Rajarajan", "S_J");
				M.application_details("1999927272", "31");
				M.application_details("98272636363", "DPPR76577");
				M.application_details("10_10-1991", "160");
				M.application_details("11166676667", "653736373");
				M.application_details("ME", "2015");
			}			
			}
