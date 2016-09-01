/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "index_stats", catalog = "mysql", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IndexStats.findAll", query = "SELECT i FROM IndexStats i"),
    @NamedQuery(name = "IndexStats.findByDbName", query = "SELECT i FROM IndexStats i WHERE i.indexStatsPK.dbName = :dbName"),
    @NamedQuery(name = "IndexStats.findByTableName", query = "SELECT i FROM IndexStats i WHERE i.indexStatsPK.tableName = :tableName"),
    @NamedQuery(name = "IndexStats.findByIndexName", query = "SELECT i FROM IndexStats i WHERE i.indexStatsPK.indexName = :indexName"),
    @NamedQuery(name = "IndexStats.findByPrefixArity", query = "SELECT i FROM IndexStats i WHERE i.indexStatsPK.prefixArity = :prefixArity"),
    @NamedQuery(name = "IndexStats.findByAvgFrequency", query = "SELECT i FROM IndexStats i WHERE i.avgFrequency = :avgFrequency")})
public class IndexStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IndexStatsPK indexStatsPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "avg_frequency")
    private BigDecimal avgFrequency;

    public IndexStats() {
    }

    public IndexStats(IndexStatsPK indexStatsPK) {
        this.indexStatsPK = indexStatsPK;
    }

    public IndexStats(String dbName, String tableName, String indexName, int prefixArity) {
        this.indexStatsPK = new IndexStatsPK(dbName, tableName, indexName, prefixArity);
    }

    public IndexStatsPK getIndexStatsPK() {
        return indexStatsPK;
    }

    public void setIndexStatsPK(IndexStatsPK indexStatsPK) {
        this.indexStatsPK = indexStatsPK;
    }

    public BigDecimal getAvgFrequency() {
        return avgFrequency;
    }

    public void setAvgFrequency(BigDecimal avgFrequency) {
        this.avgFrequency = avgFrequency;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indexStatsPK != null ? indexStatsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IndexStats)) {
            return false;
        }
        IndexStats other = (IndexStats) object;
        if ((this.indexStatsPK == null && other.indexStatsPK != null) || (this.indexStatsPK != null && !this.indexStatsPK.equals(other.indexStatsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.controlador.IndexStats[ indexStatsPK=" + indexStatsPK + " ]";
    }
    
}
