/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Laboratorio
 */
@Entity
@Table(name = "table_stats", catalog = "mysql", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TableStats.findAll", query = "SELECT t FROM TableStats t"),
    @NamedQuery(name = "TableStats.findByDbName", query = "SELECT t FROM TableStats t WHERE t.tableStatsPK.dbName = :dbName"),
    @NamedQuery(name = "TableStats.findByTableName", query = "SELECT t FROM TableStats t WHERE t.tableStatsPK.tableName = :tableName"),
    @NamedQuery(name = "TableStats.findByCardinality", query = "SELECT t FROM TableStats t WHERE t.cardinality = :cardinality")})
public class TableStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TableStatsPK tableStatsPK;
    @Column(name = "cardinality")
    private BigInteger cardinality;

    public TableStats() {
    }

    public TableStats(TableStatsPK tableStatsPK) {
        this.tableStatsPK = tableStatsPK;
    }

    public TableStats(String dbName, String tableName) {
        this.tableStatsPK = new TableStatsPK(dbName, tableName);
    }

    public TableStatsPK getTableStatsPK() {
        return tableStatsPK;
    }

    public void setTableStatsPK(TableStatsPK tableStatsPK) {
        this.tableStatsPK = tableStatsPK;
    }

    public BigInteger getCardinality() {
        return cardinality;
    }

    public void setCardinality(BigInteger cardinality) {
        this.cardinality = cardinality;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tableStatsPK != null ? tableStatsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TableStats)) {
            return false;
        }
        TableStats other = (TableStats) object;
        if ((this.tableStatsPK == null && other.tableStatsPK != null) || (this.tableStatsPK != null && !this.tableStatsPK.equals(other.tableStatsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.controlador.TableStats[ tableStatsPK=" + tableStatsPK + " ]";
    }
    
}
