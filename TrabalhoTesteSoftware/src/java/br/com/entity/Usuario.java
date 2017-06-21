/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nick
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByUsrcodigo", query = "SELECT u FROM Usuario u WHERE u.usrcodigo = :usrcodigo")
    , @NamedQuery(name = "Usuario.findByUsrnome", query = "SELECT u FROM Usuario u WHERE u.usrnome = :usrnome")
    , @NamedQuery(name = "Usuario.findByUsrlogin", query = "SELECT u FROM Usuario u WHERE u.usrlogin = :usrlogin")
    , @NamedQuery(name = "Usuario.findByUsrsenha", query = "SELECT u FROM Usuario u WHERE u.usrsenha = :usrsenha")
    , @NamedQuery(name = "Usuario.findByUsremail", query = "SELECT u FROM Usuario u WHERE u.usremail = :usremail")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "usrcodigo")
    private Integer usrcodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "usrnome")
    private String usrnome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "usrlogin")
    private String usrlogin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "usrsenha")
    private String usrsenha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "usremail")
    private String usremail;

    public Usuario() {
    }

    public Usuario(Integer usrcodigo) {
        this.usrcodigo = usrcodigo;
    }

    public Usuario(Integer usrcodigo, String usrnome, String usrlogin, String usrsenha, String usremail) {
        this.usrcodigo = usrcodigo;
        this.usrnome = usrnome;
        this.usrlogin = usrlogin;
        this.usrsenha = usrsenha;
        this.usremail = usremail;
    }

    public Integer getUsrcodigo() {
        return usrcodigo;
    }

    public void setUsrcodigo(Integer usrcodigo) {
        this.usrcodigo = usrcodigo;
    }

    public String getUsrnome() {
        return usrnome;
    }

    public void setUsrnome(String usrnome) {
        this.usrnome = usrnome;
    }

    public String getUsrlogin() {
        return usrlogin;
    }

    public void setUsrlogin(String usrlogin) {
        this.usrlogin = usrlogin;
    }

    public String getUsrsenha() {
        return usrsenha;
    }

    public void setUsrsenha(String usrsenha) {
        this.usrsenha = usrsenha;
    }

    public String getUsremail() {
        return usremail;
    }

    public void setUsremail(String usremail) {
        this.usremail = usremail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrcodigo != null ? usrcodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.usrcodigo == null && other.usrcodigo != null) || (this.usrcodigo != null && !this.usrcodigo.equals(other.usrcodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.entity.Usuario[ usrcodigo=" + usrcodigo + " ]";
    }
    
}
