/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.micmc23000.unimotejpademo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author michael
 */
@Entity
@Table(name = "usercommand")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Usercommand.findAll", query = "SELECT u FROM Usercommand u"),
	@NamedQuery(name = "Usercommand.findById", query = "SELECT u FROM Usercommand u WHERE u.id = :id"),
	@NamedQuery(name = "Usercommand.findByName", query = "SELECT u FROM Usercommand u WHERE u.name = :name"),
	@NamedQuery(name = "Usercommand.findByDescription", query = "SELECT u FROM Usercommand u WHERE u.description = :description"),
	@NamedQuery(name = "Usercommand.findByIRCode", query = "SELECT u FROM Usercommand u WHERE u.iRCode = :iRCode")})
public class Usercommand implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
	private Integer id;
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Name")
	private String name;
	@Size(max = 45)
    @Column(name = "Description")
	private String description;
	@Size(max = 500)
    @Column(name = "IRCode")
	private String iRCode;

	public Usercommand() {
	}

	public Usercommand(Integer id) {
		this.id = id;
	}

	public Usercommand(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIRCode() {
		return iRCode;
	}

	public void setIRCode(String iRCode) {
		this.iRCode = iRCode;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Usercommand)) {
			return false;
		}
		Usercommand other = (Usercommand) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.github.micmc23000.unimotejpademo.Usercommand[ id=" + id + " ]";
	}
	
}
