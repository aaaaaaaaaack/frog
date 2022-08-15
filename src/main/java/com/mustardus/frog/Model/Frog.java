package com.mustardus.frog.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_info")
public class Frog {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "frog_id")
	int id;
	
	@Column(name = "\"scName\"")
	String sciName;

	@Column(name = "local_name")
	String localName;

	@Column(name = "color")
	String color;

	@Column(name = "info")
	String info;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSciName() {
		return sciName;
	}

	public void setSciName(String sciName) {
		this.sciName = sciName;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Frog [id=" + id + ", sciName=" + sciName + ", localName=" + localName + ", color=" + color + ", info="
				+ info + "]";
	}
	

	
}
