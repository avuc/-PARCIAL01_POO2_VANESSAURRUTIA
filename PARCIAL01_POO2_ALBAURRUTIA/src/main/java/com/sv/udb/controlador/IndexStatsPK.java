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
import javax.validation.constraints.Size;

/**
 *
 * @author Laboratorio
 */
@Embeddable
public class IndexStatsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "db_name")
    private String dbName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "table_name")
    private String tableName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "index_name")
    private String indexName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prefix_arity")
    private int prefixArity;

    public IndexStatsPK() {
    }

    public IndexStatsPK(String dbName, String tableName, String indexName, int prefixArity) {
        this.dbName = dbName;
        this.tableName = tableName;
        this.indexName = indexName;
        this.prefixArity = prefixArity;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public int getPrefixArity() {
        return prefixArity;
    }

    public void setPrefixArity(int prefixArity) {
        this.prefixArity = prefixArity;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dbName != null ? dbName.hashCode() : 0);
        hash += (tableName != null ? tableName.hashCode() : 0);
        hash += (indexName != null ? indexName.hashCode() : 0);
        hash += (int) prefixArity;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IndexStatsPK)) {
            return false;
        }
        IndexStatsPK other = (IndexStatsPK) object;
        if ((this.dbName == null && other.dbName != null) || (this.dbName != null && !this.dbName.equals(other.dbName))) {
            return false;
        }
        if ((this.tableName == null && other.tableName != null) || (this.tableName != null && !this.tableName.equals(other.tableName))) {
            return false;
        }
        if ((this.indexName == null && other.indexName != null) || (this.indexName != null && !this.indexName.equals(other.indexName))) {
            return false;
        }
        if (this.prefixArity != other.prefixArity) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.controlador.IndexStatsPK[ dbName=" + dbName + ", tableName=" + tableName + ", indexName=" + indexName + ", prefixArity=" + prefixArity + " ]";
    }
    
}
