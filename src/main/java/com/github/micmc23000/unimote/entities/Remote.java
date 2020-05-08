/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.micmc23000.unimote.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "remote")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Remote.findAll", query = "SELECT r FROM Remote r"),
	@NamedQuery(name = "Remote.findByKeyNumber", query = "SELECT r FROM Remote r WHERE r.keyNumber = :keyNumber"),
	@NamedQuery(name = "Remote.findByKeyName", query = "SELECT r FROM Remote r WHERE r.keyName = :keyName"),
	@NamedQuery(name = "Remote.findByIrCode", query = "SELECT r FROM Remote r WHERE r.irCode = :irCode")})
public class Remote implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "keyNumber")
	private Integer keyNumber;
	@Size(max = 45)
    @Column(name = "keyName")
	private String keyName;
	@Size(max = 16)
    @Column(name = "irCode")
	private String irCode;

	public Remote() {
	}

	public Remote(Integer keyNumber) {
		this.keyNumber = keyNumber;
	}

	public Integer getKeyNumber() {
		return keyNumber;
	}

	public void setKeyNumber(Integer keyNumber) {
		this.keyNumber = keyNumber;
	}

	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public String getIrCode() {
		return irCode;
	}

	public void setIrCode(String irCode) {
		this.irCode = irCode;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (keyNumber != null ? keyNumber.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Remote)) {
			return false;
		}
		Remote other = (Remote) object;
		if ((this.keyNumber == null && other.keyNumber != null) || (this.keyNumber != null && !this.keyNumber.equals(other.keyNumber))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.github.micmc23000.unimotejpademo.service.Remote[ keyNumber=" + keyNumber + " ]";
	}
	
}
