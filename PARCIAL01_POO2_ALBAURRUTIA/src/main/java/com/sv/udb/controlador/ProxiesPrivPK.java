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
public class ProxiesPrivPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "Host")
    private String host;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "User")
    private String user;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "Proxied_host")
    private String proxiedhost;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "Proxied_user")
    private String proxieduser;

    public ProxiesPrivPK() {
    }

    public ProxiesPrivPK(String host, String user, String proxiedhost, String proxieduser) {
        this.host = host;
        this.user = user;
        this.proxiedhost = proxiedhost;
        this.proxieduser = proxieduser;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getProxiedhost() {
        return proxiedhost;
    }

    public void setProxiedhost(String proxiedhost) {
        this.proxiedhost = proxiedhost;
    }

    public String getProxieduser() {
        return proxieduser;
    }

    public void setProxieduser(String proxieduser) {
        this.proxieduser = proxieduser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (host != null ? host.hashCode() : 0);
        hash += (user != null ? user.hashCode() : 0);
        hash += (proxiedhost != null ? proxiedhost.hashCode() : 0);
        hash += (proxieduser != null ? proxieduser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProxiesPrivPK)) {
            return false;
        }
        ProxiesPrivPK other = (ProxiesPrivPK) object;
        if ((this.host == null && other.host != null) || (this.host != null && !this.host.equals(other.host))) {
            return false;
        }
        if ((this.user == null && other.user != null) || (this.user != null && !this.user.equals(other.user))) {
            return false;
        }
        if ((this.proxiedhost == null && other.proxiedhost != null) || (this.proxiedhost != null && !this.proxiedhost.equals(other.proxiedhost))) {
            return false;
        }
        if ((this.proxieduser == null && other.proxieduser != null) || (this.proxieduser != null && !this.proxieduser.equals(other.proxieduser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.controlador.ProxiesPrivPK[ host=" + host + ", user=" + user + ", proxiedhost=" + proxiedhost + ", proxieduser=" + proxieduser + " ]";
    }
    
}
