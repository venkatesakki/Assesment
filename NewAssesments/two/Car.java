package com.assesment;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable{
	String regNumber;
	String model;
	String createdTimeFields;
	public static int count=0;
	public Car()
	{
		regNumber="23-37-39383";
		model="audi";
		createdTimeFields="23.58.32";
		count++;
	}
	public Car(String regNumber, String model, String createdTimeFields) {
		super();
		this.regNumber = regNumber;
		this.model = model;
		this.createdTimeFields = createdTimeFields;
		count++;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCreatedTimeFields() {
		return createdTimeFields;
	}
	public void setCreatedTimeFields(String createdTimeFields) {
		this.createdTimeFields = createdTimeFields;
	}
	
	@Override
	public String toString() {
		return "Car [regNumber=" + regNumber + ", model=" + model + ", createdTimeFields=" + createdTimeFields + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(createdTimeFields, model, regNumber);
	}
	@Override
	public boolean equals(Object obj) {
		return (boolean)obj;
	}
	
	

}
