/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Laboratorio
 */
@Entity
@Table(name = "gtid_slave_pos", catalog = "mysql", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GtidSlavePos.findAll", query = "SELECT g FROM GtidSlavePos g"),
    @NamedQuery(name = "GtidSlavePos.findByDomainId", query = "SELECT g FROM GtidSlavePos g WHERE g.gtidSlavePosPK.domainId = :domainId"),
    @NamedQuery(name = "GtidSlavePos.findBySubId", query = "SELECT g FROM GtidSlavePos g WHERE g.gtidSlavePosPK.subId = :subId"),
    @NamedQuery(name = "GtidSlavePos.findByServerId", query = "SELECT g FROM GtidSlavePos g WHERE g.serverId = :serverId"),
    @NamedQuery(name = "GtidSlavePos.findBySeqNo", query = "SELECT g FROM GtidSlavePos g WHERE g.seqNo = :seqNo")})
public class GtidSlavePos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GtidSlavePosPK gtidSlavePosPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "server_id")
    private int serverId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "seq_no")
    private long seqNo;

    public GtidSlavePos() {
    }

    public GtidSlavePos(GtidSlavePosPK gtidSlavePosPK) {
        this.gtidSlavePosPK = gtidSlavePosPK;
    }

    public GtidSlavePos(GtidSlavePosPK gtidSlavePosPK, int serverId, long seqNo) {
        this.gtidSlavePosPK = gtidSlavePosPK;
        this.serverId = serverId;
        this.seqNo = seqNo;
    }

    public GtidSlavePos(int domainId, long subId) {
        this.gtidSlavePosPK = new GtidSlavePosPK(domainId, subId);
    }

    public GtidSlavePosPK getGtidSlavePosPK() {
        return gtidSlavePosPK;
    }

    public void setGtidSlavePosPK(GtidSlavePosPK gtidSlavePosPK) {
        this.gtidSlavePosPK = gtidSlavePosPK;
    }

    public int getServerId() {
        return serverId;
    }

    public void setServerId(int serverId) {
        this.serverId = serverId;
    }

    public long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(long seqNo) {
        this.seqNo = seqNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gtidSlavePosPK != null ? gtidSlavePosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GtidSlavePos)) {
            return false;
        }
        GtidSlavePos other = (GtidSlavePos) object;
        if ((this.gtidSlavePosPK == null && other.gtidSlavePosPK != null) || (this.gtidSlavePosPK != null && !this.gtidSlavePosPK.equals(other.gtidSlavePosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.controlador.GtidSlavePos[ gtidSlavePosPK=" + gtidSlavePosPK + " ]";
    }
    
}
