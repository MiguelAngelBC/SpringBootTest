package com.example.demo.user.vo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idUser;
	private String name;
	private String email;
	private int phone;
	private Date datecreate;
	private boolean deleted= false;
	
	public User() {}
	
	public User(int i, String name, String email, int j, Date datecreate, boolean deleted) {
		this.setIdUser(i);
		this.setName(name);
		this.setEmail(email);
		this.setPhone(j);
		this.setDatecreate(datecreate);
		this.setDeleted(deleted);
	}
	public User(String name, String email, int phone, Date datecreate, boolean deleted) {
		this.setName(name);
		this.setEmail(email);
		this.setPhone(phone);
		this.setDatecreate(datecreate);
		this.setDeleted(deleted);
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int i) {
		this.idUser = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int j) {
		this.phone = j;
	}
	public Date getDatecreate() {
		return datecreate;
	}
	public void setDatecreate(Date datecreate) {
		this.datecreate = datecreate;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", name=" + name + ", email=" + email + ", phone=" + phone + ", datecreate="
				+ datecreate + ", deleted=" + deleted + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datecreate == null) ? 0 : datecreate.hashCode());
		result = prime * result + (deleted ? 1231 : 1237);
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + idUser;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + phone;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (datecreate == null) {
			if (other.datecreate != null)
				return false;
		} else if (!datecreate.equals(other.datecreate))
			return false;
		if (deleted != other.deleted)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (idUser != other.idUser)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone != other.phone)
			return false;
		return true;
	}
	
	
	
}
