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
@Table(name = "masterremote")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Masterremote.findAll", query = "SELECT m FROM Masterremote m"),
	@NamedQuery(name = "Masterremote.findByKeyID", query = "SELECT m FROM Masterremote m WHERE m.keyID = :keyID"),
	@NamedQuery(name = "Masterremote.findByKeyName", query = "SELECT m FROM Masterremote m WHERE m.keyName = :keyName")})
public class Masterremote implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "keyID")
	private Integer keyID;
	@Size(max = 45)
    @Column(name = "keyName")
	private String keyName;

	public Masterremote() {
	}

	public Masterremote(Integer keyID) {
		this.keyID = keyID;
	}

	public Integer getKeyID() {
		return keyID;
	}

	public void setKeyID(Integer keyID) {
		this.keyID = keyID;
	}

	public String getKeyName() {
		return keyName;
	}

	

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (keyID != null ? keyID.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Masterremote)) {
			return false;
		}
		Masterremote other = (Masterremote) object;
		if ((this.keyID == null && other.keyID != null) || (this.keyID != null && !this.keyID.equals(other.keyID))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.github.micmc23000.unimotejpademo.service.Masterremote[ keyID=" + keyID + " ]";
	}
	
}
