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
@Table(name = "slave_worker_info", catalog = "mysql", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SlaveWorkerInfo.findAll", query = "SELECT s FROM SlaveWorkerInfo s"),
    @NamedQuery(name = "SlaveWorkerInfo.findById", query = "SELECT s FROM SlaveWorkerInfo s WHERE s.id = :id"),
    @NamedQuery(name = "SlaveWorkerInfo.findByRelaylogpos", query = "SELECT s FROM SlaveWorkerInfo s WHERE s.relaylogpos = :relaylogpos"),
    @NamedQuery(name = "SlaveWorkerInfo.findByMasterlogpos", query = "SELECT s FROM SlaveWorkerInfo s WHERE s.masterlogpos = :masterlogpos"),
    @NamedQuery(name = "SlaveWorkerInfo.findByCheckpointrelaylogpos", query = "SELECT s FROM SlaveWorkerInfo s WHERE s.checkpointrelaylogpos = :checkpointrelaylogpos"),
    @NamedQuery(name = "SlaveWorkerInfo.findByCheckpointmasterlogpos", query = "SELECT s FROM SlaveWorkerInfo s WHERE s.checkpointmasterlogpos = :checkpointmasterlogpos"),
    @NamedQuery(name = "SlaveWorkerInfo.findByCheckpointseqno", query = "SELECT s FROM SlaveWorkerInfo s WHERE s.checkpointseqno = :checkpointseqno"),
    @NamedQuery(name = "SlaveWorkerInfo.findByCheckpointgroupsize", query = "SELECT s FROM SlaveWorkerInfo s WHERE s.checkpointgroupsize = :checkpointgroupsize")})
public class SlaveWorkerInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
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
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Checkpoint_relay_log_name")
    private String checkpointrelaylogname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Checkpoint_relay_log_pos")
    private long checkpointrelaylogpos;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Checkpoint_master_log_name")
    private String checkpointmasterlogname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Checkpoint_master_log_pos")
    private long checkpointmasterlogpos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Checkpoint_seqno")
    private int checkpointseqno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Checkpoint_group_size")
    private int checkpointgroupsize;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "Checkpoint_group_bitmap")
    private byte[] checkpointgroupbitmap;

    public SlaveWorkerInfo() {
    }

    public SlaveWorkerInfo(Integer id) {
        this.id = id;
    }

    public SlaveWorkerInfo(Integer id, String relaylogname, long relaylogpos, String masterlogname, long masterlogpos, String checkpointrelaylogname, long checkpointrelaylogpos, String checkpointmasterlogname, long checkpointmasterlogpos, int checkpointseqno, int checkpointgroupsize, byte[] checkpointgroupbitmap) {
        this.id = id;
        this.relaylogname = relaylogname;
        this.relaylogpos = relaylogpos;
        this.masterlogname = masterlogname;
        this.masterlogpos = masterlogpos;
        this.checkpointrelaylogname = checkpointrelaylogname;
        this.checkpointrelaylogpos = checkpointrelaylogpos;
        this.checkpointmasterlogname = checkpointmasterlogname;
        this.checkpointmasterlogpos = checkpointmasterlogpos;
        this.checkpointseqno = checkpointseqno;
        this.checkpointgroupsize = checkpointgroupsize;
        this.checkpointgroupbitmap = checkpointgroupbitmap;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getCheckpointrelaylogname() {
        return checkpointrelaylogname;
    }

    public void setCheckpointrelaylogname(String checkpointrelaylogname) {
        this.checkpointrelaylogname = checkpointrelaylogname;
    }

    public long getCheckpointrelaylogpos() {
        return checkpointrelaylogpos;
    }

    public void setCheckpointrelaylogpos(long checkpointrelaylogpos) {
        this.checkpointrelaylogpos = checkpointrelaylogpos;
    }

    public String getCheckpointmasterlogname() {
        return checkpointmasterlogname;
    }

    public void setCheckpointmasterlogname(String checkpointmasterlogname) {
        this.checkpointmasterlogname = checkpointmasterlogname;
    }

    public long getCheckpointmasterlogpos() {
        return checkpointmasterlogpos;
    }

    public void setCheckpointmasterlogpos(long checkpointmasterlogpos) {
        this.checkpointmasterlogpos = checkpointmasterlogpos;
    }

    public int getCheckpointseqno() {
        return checkpointseqno;
    }

    public void setCheckpointseqno(int checkpointseqno) {
        this.checkpointseqno = checkpointseqno;
    }

    public int getCheckpointgroupsize() {
        return checkpointgroupsize;
    }

    public void setCheckpointgroupsize(int checkpointgroupsize) {
        this.checkpointgroupsize = checkpointgroupsize;
    }

    public byte[] getCheckpointgroupbitmap() {
        return checkpointgroupbitmap;
    }

    public void setCheckpointgroupbitmap(byte[] checkpointgroupbitmap) {
        this.checkpointgroupbitmap = checkpointgroupbitmap;
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
        if (!(object instanceof SlaveWorkerInfo)) {
            return false;
        }
        SlaveWorkerInfo other = (SlaveWorkerInfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.controlador.SlaveWorkerInfo[ id=" + id + " ]";
    }
    
}
