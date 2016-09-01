/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Laboratorio
 */
@Entity
@Table(name = "slave_relay_log_info", catalog = "mysql", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SlaveRelayLogInfo.findAll", query = "SELECT s FROM SlaveRelayLogInfo s"),
    @NamedQuery(name = "SlaveRelayLogInfo.findByNumberoflines", query = "SELECT s FROM SlaveRelayLogInfo s WHERE s.numberoflines = :numberoflines"),
    @NamedQuery(name = "SlaveRelayLogInfo.findByRelaylogpos", query = "SELECT s FROM SlaveRelayLogInfo s WHERE s.relaylogpos = :relaylogpos"),
    @NamedQuery(name = "SlaveRelayLogInfo.findByMasterlogpos", query = "SELECT s FROM SlaveRelayLogInfo s WHERE s.masterlogpos = :masterlogpos"),
    @NamedQuery(name = "SlaveRelayLogInfo.findBySqldelay", query = "SELECT s FROM SlaveRelayLogInfo s WHERE s.sqldelay = :sqldelay"),
    @NamedQuery(name = "SlaveRelayLogInfo.findByNumberofworkers", query = "SELECT s FROM SlaveRelayLogInfo s WHERE s.numberofworkers = :numberofworkers"),
    @NamedQuery(name = "SlaveRelayLogInfo.findById", query = "SELECT s FROM SlaveRelayLogInfo s WHERE s.id = :id")})
public class SlaveRelayLogInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Number_of_lines")
    private int numberoflines;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Relay_log_name")
    private String relaylogname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Relay_log_pos")
    private long relaylogpos;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Master_log_name")
    private String masterlogname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Master_log_pos")
    private long masterlogpos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Sql_delay")
    private int sqldelay;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Number_of_workers")
    private int numberofworkers;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;

    public SlaveRelayLogInfo() {
    }

    public SlaveRelayLogInfo(Integer id) {
        this.id = id;
    }

    public SlaveRelayLogInfo(Integer id, int numberoflines, String relaylogname, long relaylogpos, String masterlogname, long masterlogpos, int sqldelay, int numberofworkers) {
        this.id = id;
        this.numberoflines = numberoflines;
        this.relaylogname = relaylogname;
        this.relaylogpos = relaylogpos;
        this.masterlogname = masterlogname;
        this.masterlogpos = masterlogpos;
        this.sqldelay = sqldelay;
        this.numberofworkers = numberofworkers;
    }

    public int getNumberoflines() {
        return numberoflines;
    }

    public void setNumberoflines(int numberoflines) {
        this.numberoflines = numberoflines;
    }

    public String getRelaylogname() {
        return relaylogname;
    }

    public void setRelaylogname(String relaylogname) {
        this.relaylogname = relaylogname;
    }

    public long getRelaylogpos() {
        return relaylogpos;
    }

    public void setRelaylogpos(long relaylogpos) {
        this.relaylogpos = relaylogpos;
    }

    public String getMasterlogname() {
        return masterlogname;
    }

    public void setMasterlogname(String masterlogname) {
        this.masterlogname = masterlogname;
    }

    public long getMasterlogpos() {
        return masterlogpos;
    }

    public void setMasterlogpos(long masterlogpos) {
        this.masterlogpos = masterlogpos;
    }

    public int getSqldelay() {
        return sqldelay;
    }

    public void setSqldelay(int sqldelay) {
        this.sqldelay = sqldelay;
    }

    public int getNumberofworkers() {
        return numberofworkers;
    }

    public void setNumberofworkers(int numberofworkers) {
        this.numberofworkers = numberofworkers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(object instanceof SlaveRelayLogInfo)) {
            return false;
        }
        SlaveRelayLogInfo other = (SlaveRelayLogInfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.controlador.SlaveRelayLogInfo[ id=" + id + " ]";
    }
    
}
