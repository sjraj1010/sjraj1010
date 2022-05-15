package com.polymorphism;

public class Aplication_form_II {

	public void application_Form_II(String Full_Name , String Fathers_Name) {
	System.out.println(Full_Name+"   "+Fathers_Name);
	}
	public void application_Form_II(long Date_Of_Birth ,	String Place_Of_Birth) {
		System.out.println(Date_Of_Birth+"  "+Place_Of_Birth);
	}
	public void application_Form_II(String Address, long Aadhar_Number){
		System.out.println(Address+"   "+Aadhar_Number);
	}
	public void application_Form_II(long Pancard_Number , short Application_Number) {
		System.out.println(Pancard_Number+"   "+Application_Number);
	}
	public void application_Form_II(float Height, Float Weight) {
		System.out.println(Height+"   "+Weight);
	}
	public void application_Form_II(int Contact_Number, int Father_Contact_Number) {
		System.out.println(Contact_Number+"  "+Father_Contact_Number);
	}
			//Syntex =====create main method
			public static void main(String[] args) {
				
				Aplication_form_II A = new Aplication_form_II();
				
				A.application_Form_II("Rajarajan", "Janagarajan");
				A.application_Form_II("10_10_1990", "Madurai");
				A.application_Form_II("PlotNo_3,Thirupathi_Nagar", "91222738373");
				A.application_Form_II("Dpppr36363g", "53835383");
				A.application_Form_II("160.1", "70.2");
				A.application_Form_II("8807626704", "8667689625");
	}
	}
