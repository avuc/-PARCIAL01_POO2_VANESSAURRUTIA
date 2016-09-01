/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Laboratorio
 */
@Embeddable
public class GtidSlavePosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "domain_id")
    private int domainId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sub_id")
    private long subId;

    public GtidSlavePosPK() {
    }

    public GtidSlavePosPK(int domainId, long subId) {
        this.domainId = domainId;
        this.subId = subId;
    }

    public int getDomainId() {
        return domainId;
    }

    public void setDomainId(int domainId) {
        this.domainId = domainId;
    }

    public long getSubId() {
        return subId;
    }

    public void setSubId(long subId) {
        this.subId = subId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) domainId;
        hash += (int) subId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GtidSlavePosPK)) {
            return false;
        }
        GtidSlavePosPK other = (GtidSlavePosPK) object;
        if (this.domainId != other.domainId) {
            return false;
        }
        if (this.subId != other.subId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.controlador.GtidSlavePosPK[ domainId=" + domainId + ", subId=" + subId + " ]";
    }
    
}
