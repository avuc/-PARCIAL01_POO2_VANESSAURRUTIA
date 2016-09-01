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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Laboratorio
 */
@Entity
@Table(name = "host", catalog = "mysql", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Host.findAll", query = "SELECT h FROM Host h"),
    @NamedQuery(name = "Host.findByHost", query = "SELECT h FROM Host h WHERE h.hostPK.host = :host"),
    @NamedQuery(name = "Host.findByDb", query = "SELECT h FROM Host h WHERE h.hostPK.db = :db"),
    @NamedQuery(name = "Host.findBySelectpriv", query = "SELECT h FROM Host h WHERE h.selectpriv = :selectpriv"),
    @NamedQuery(name = "Host.findByInsertpriv", query = "SELECT h FROM Host h WHERE h.insertpriv = :insertpriv"),
    @NamedQuery(name = "Host.findByUpdatepriv", query = "SELECT h FROM Host h WHERE h.updatepriv = :updatepriv"),
    @NamedQuery(name = "Host.findByDeletepriv", query = "SELECT h FROM Host h WHERE h.deletepriv = :deletepriv"),
    @NamedQuery(name = "Host.findByCreatepriv", query = "SELECT h FROM Host h WHERE h.createpriv = :createpriv"),
    @NamedQuery(name = "Host.findByDroppriv", query = "SELECT h FROM Host h WHERE h.droppriv = :droppriv"),
    @NamedQuery(name = "Host.findByGrantpriv", query = "SELECT h FROM Host h WHERE h.grantpriv = :grantpriv"),
    @NamedQuery(name = "Host.findByReferencespriv", query = "SELECT h FROM Host h WHERE h.referencespriv = :referencespriv"),
    @NamedQuery(name = "Host.findByIndexpriv", query = "SELECT h FROM Host h WHERE h.indexpriv = :indexpriv"),
    @NamedQuery(name = "Host.findByAlterpriv", query = "SELECT h FROM Host h WHERE h.alterpriv = :alterpriv"),
    @NamedQuery(name = "Host.findByCreatetmptablepriv", query = "SELECT h FROM Host h WHERE h.createtmptablepriv = :createtmptablepriv"),
    @NamedQuery(name = "Host.findByLocktablespriv", query = "SELECT h FROM Host h WHERE h.locktablespriv = :locktablespriv"),
    @NamedQuery(name = "Host.findByCreateviewpriv", query = "SELECT h FROM Host h WHERE h.createviewpriv = :createviewpriv"),
    @NamedQuery(name = "Host.findByShowviewpriv", query = "SELECT h FROM Host h WHERE h.showviewpriv = :showviewpriv"),
    @NamedQuery(name = "Host.findByCreateroutinepriv", query = "SELECT h FROM Host h WHERE h.createroutinepriv = :createroutinepriv"),
    @NamedQuery(name = "Host.findByAlterroutinepriv", query = "SELECT h FROM Host h WHERE h.alterroutinepriv = :alterroutinepriv"),
    @NamedQuery(name = "Host.findByExecutepriv", query = "SELECT h FROM Host h WHERE h.executepriv = :executepriv"),
    @NamedQuery(name = "Host.findByTriggerpriv", query = "SELECT h FROM Host h WHERE h.triggerpriv = :triggerpriv")})
public class Host implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HostPK hostPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Select_priv")
    private String selectpriv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Insert_priv")
    private String insertpriv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Update_priv")
    private String updatepriv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Delete_priv")
    private String deletepriv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Create_priv")
    private String createpriv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Drop_priv")
    private String droppriv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Grant_priv")
    private String grantpriv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "References_priv")
    private String referencespriv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Index_priv")
    private String indexpriv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Alter_priv")
    private String alterpriv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Create_tmp_table_priv")
    private String createtmptablepriv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Lock_tables_priv")
    private String locktablespriv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Create_view_priv")
    private String createviewpriv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Show_view_priv")
    private String showviewpriv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Create_routine_priv")
    private String createroutinepriv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Alter_routine_priv")
    private String alterroutinepriv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Execute_priv")
    private String executepriv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Trigger_priv")
    private String triggerpriv;

    public Host() {
    }

    public Host(HostPK hostPK) {
        this.hostPK = hostPK;
    }

    public Host(HostPK hostPK, String selectpriv, String insertpriv, String updatepriv, String deletepriv, String createpriv, String droppriv, String grantpriv, String referencespriv, String indexpriv, String alterpriv, String createtmptablepriv, String locktablespriv, String createviewpriv, String showviewpriv, String createroutinepriv, String alterroutinepriv, String executepriv, String triggerpriv) {
        this.hostPK = hostPK;
        this.selectpriv = selectpriv;
        this.insertpriv = insertpriv;
        this.updatepriv = updatepriv;
        this.deletepriv = deletepriv;
        this.createpriv = createpriv;
        this.droppriv = droppriv;
        this.grantpriv = grantpriv;
        this.referencespriv = referencespriv;
        this.indexpriv = indexpriv;
        this.alterpriv = alterpriv;
        this.createtmptablepriv = createtmptablepriv;
        this.locktablespriv = locktablespriv;
        this.createviewpriv = createviewpriv;
        this.showviewpriv = showviewpriv;
        this.createroutinepriv = createroutinepriv;
        this.alterroutinepriv = alterroutinepriv;
        this.executepriv = executepriv;
        this.triggerpriv = triggerpriv;
    }

    public Host(String host, String db) {
        this.hostPK = new HostPK(host, db);
    }

    public HostPK getHostPK() {
        return hostPK;
    }

    public void setHostPK(HostPK hostPK) {
        this.hostPK = hostPK;
    }

    public String getSelectpriv() {
        return selectpriv;
    }

    public void setSelectpriv(String selectpriv) {
        this.selectpriv = selectpriv;
    }

    public String getInsertpriv() {
        return insertpriv;
    }

    public void setInsertpriv(String insertpriv) {
        this.insertpriv = insertpriv;
    }

    public String getUpdatepriv() {
        return updatepriv;
    }

    public void setUpdatepriv(String updatepriv) {
        this.updatepriv = updatepriv;
    }

    public String getDeletepriv() {
        return deletepriv;
    }

    public void setDeletepriv(String deletepriv) {
        this.deletepriv = deletepriv;
    }

    public String getCreatepriv() {
        return createpriv;
    }

    public void setCreatepriv(String createpriv) {
        this.createpriv = createpriv;
    }

    public String getDroppriv() {
        return droppriv;
    }

    public void setDroppriv(String droppriv) {
        this.droppriv = droppriv;
    }

    public String getGrantpriv() {
        return grantpriv;
    }

    public void setGrantpriv(String grantpriv) {
        this.grantpriv = grantpriv;
    }

    public String getReferencespriv() {
        return referencespriv;
    }

    public void setReferencespriv(String referencespriv) {
        this.referencespriv = referencespriv;
    }

    public String getIndexpriv() {
        return indexpriv;
    }

    public void setIndexpriv(String indexpriv) {
        this.indexpriv = indexpriv;
    }

    public String getAlterpriv() {
        return alterpriv;
    }

    public void setAlterpriv(String alterpriv) {
        this.alterpriv = alterpriv;
    }

    public String getCreatetmptablepriv() {
        return createtmptablepriv;
    }

    public void setCreatetmptablepriv(String createtmptablepriv) {
        this.createtmptablepriv = createtmptablepriv;
    }

    public String getLocktablespriv() {
        return locktablespriv;
    }

    public void setLocktablespriv(String locktablespriv) {
        this.locktablespriv = locktablespriv;
    }

    public String getCreateviewpriv() {
        return createviewpriv;
    }

    public void setCreateviewpriv(String createviewpriv) {
        this.createviewpriv = createviewpriv;
    }

    public String getShowviewpriv() {
        return showviewpriv;
    }

    public void setShowviewpriv(String showviewpriv) {
        this.showviewpriv = showviewpriv;
    }

    public String getCreateroutinepriv() {
        return createroutinepriv;
    }

    public void setCreateroutinepriv(String createroutinepriv) {
        this.createroutinepriv = createroutinepriv;
    }

    public String getAlterroutinepriv() {
        return alterroutinepriv;
    }

    public void setAlterroutinepriv(String alterroutinepriv) {
        this.alterroutinepriv = alterroutinepriv;
    }

    public String getExecutepriv() {
        return executepriv;
    }

    public void setExecutepriv(String executepriv) {
        this.executepriv = executepriv;
    }

    public String getTriggerpriv() {
        return triggerpriv;
    }

    public void setTriggerpriv(String triggerpriv) {
        this.triggerpriv = triggerpriv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hostPK != null ? hostPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Host)) {
            return false;
        }
        Host other = (Host) object;
        if ((this.hostPK == null && other.hostPK != null) || (this.hostPK != null && !this.hostPK.equals(other.hostPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.controlador.Host[ hostPK=" + hostPK + " ]";
    }
    
}
