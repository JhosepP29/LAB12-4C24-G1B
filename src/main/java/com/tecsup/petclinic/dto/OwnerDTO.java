package com.tecsup.petclinic.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author jhosep
 *
 */
public class OwnerDTO {

	private long id;
	private String firstName;
	private String lastName;
	private String telephone;
	
	public OwnerDTO( String first_name, String last_name, String telephone) {
		super();
		this.firstName = first_name;
		this.lastName = last_name;
		this.telephone = telephone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String first_name) {
		this.firstName = first_name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String last_name) {
		this.lastName = last_name;
	}

	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	
	@Override
	public String toString() {
		return "OwnerDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", telephone=" + telephone
				+ "]";
	}

}
