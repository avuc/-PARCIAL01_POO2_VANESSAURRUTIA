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
@Table(name = "help_topic", catalog = "mysql", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HelpTopic.findAll", query = "SELECT h FROM HelpTopic h"),
    @NamedQuery(name = "HelpTopic.findByHelpTopicId", query = "SELECT h FROM HelpTopic h WHERE h.helpTopicId = :helpTopicId"),
    @NamedQuery(name = "HelpTopic.findByName", query = "SELECT h FROM HelpTopic h WHERE h.name = :name"),
    @NamedQuery(name = "HelpTopic.findByHelpCategoryId", query = "SELECT h FROM HelpTopic h WHERE h.helpCategoryId = :helpCategoryId")})
public class HelpTopic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "help_topic_id")
    private Integer helpTopicId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "help_category_id")
    private short helpCategoryId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "example")
    private String example;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "url")
    private String url;

    public HelpTopic() {
    }

    public HelpTopic(Integer helpTopicId) {
        this.helpTopicId = helpTopicId;
    }

    public HelpTopic(Integer helpTopicId, String name, short helpCategoryId, String description, String example, String url) {
        this.helpTopicId = helpTopicId;
        this.name = name;
        this.helpCategoryId = helpCategoryId;
        this.description = description;
        this.example = example;
        this.url = url;
    }

    public Integer getHelpTopicId() {
        return helpTopicId;
    }

    public void setHelpTopicId(Integer helpTopicId) {
        this.helpTopicId = helpTopicId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getHelpCategoryId() {
        return helpCategoryId;
    }

    public void setHelpCategoryId(short helpCategoryId) {
        this.helpCategoryId = helpCategoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (helpTopicId != null ? helpTopicId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HelpTopic)) {
            return false;
        }
        HelpTopic other = (HelpTopic) object;
        if ((this.helpTopicId == null && other.helpTopicId != null) || (this.helpTopicId != null && !this.helpTopicId.equals(other.helpTopicId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.controlador.HelpTopic[ helpTopicId=" + helpTopicId + " ]";
    }
    
}
