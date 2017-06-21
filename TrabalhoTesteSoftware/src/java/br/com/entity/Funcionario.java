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
@Table(name = "funcionario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f")
    , @NamedQuery(name = "Funcionario.findByFunccodigo", query = "SELECT f FROM Funcionario f WHERE f.funccodigo = :funccodigo")
    , @NamedQuery(name = "Funcionario.findByFuncnome", query = "SELECT f FROM Funcionario f WHERE f.funcnome = :funcnome")
    , @NamedQuery(name = "Funcionario.findByFuncnascimento", query = "SELECT f FROM Funcionario f WHERE f.funcnascimento = :funcnascimento")
    , @NamedQuery(name = "Funcionario.findByFunccpf", query = "SELECT f FROM Funcionario f WHERE f.funccpf = :funccpf")
    , @NamedQuery(name = "Funcionario.findByFunccel", query = "SELECT f FROM Funcionario f WHERE f.funccel = :funccel")
    , @NamedQuery(name = "Funcionario.findByFuncendereco", query = "SELECT f FROM Funcionario f WHERE f.funcendereco = :funcendereco")
    , @NamedQuery(name = "Funcionario.findByFuncbairro", query = "SELECT f FROM Funcionario f WHERE f.funcbairro = :funcbairro")
    , @NamedQuery(name = "Funcionario.findByFunccidade", query = "SELECT f FROM Funcionario f WHERE f.funccidade = :funccidade")
    , @NamedQuery(name = "Funcionario.findByFuncemail", query = "SELECT f FROM Funcionario f WHERE f.funcemail = :funcemail")})
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "funccodigo")
    private Integer funccodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "funcnome")
    private String funcnome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "funcnascimento")
    private String funcnascimento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "funccpf")
    private String funccpf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "funccel")
    private String funccel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "funcendereco")
    private String funcendereco;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "funcbairro")
    private String funcbairro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "funccidade")
    private String funccidade;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "funcemail")
    private String funcemail;

    public Funcionario() {
    }

    public Funcionario(Integer funccodigo) {
        this.funccodigo = funccodigo;
    }

    public Funcionario(Integer funccodigo, String funcnome, String funcnascimento, String funccpf, String funccel, String funcendereco, String funcbairro, String funccidade, String funcemail) {
        this.funccodigo = funccodigo;
        this.funcnome = funcnome;
        this.funcnascimento = funcnascimento;
        this.funccpf = funccpf;
        this.funccel = funccel;
        this.funcendereco = funcendereco;
        this.funcbairro = funcbairro;
        this.funccidade = funccidade;
        this.funcemail = funcemail;
    }

    public Integer getFunccodigo() {
        return funccodigo;
    }

    public void setFunccodigo(Integer funccodigo) {
        this.funccodigo = funccodigo;
    }

    public String getFuncnome() {
        return funcnome;
    }

    public void setFuncnome(String funcnome) {
        this.funcnome = funcnome;
    }

    public String getFuncnascimento() {
        return funcnascimento;
    }

    public void setFuncnascimento(String funcnascimento) {
        this.funcnascimento = funcnascimento;
    }

    public String getFunccpf() {
        return funccpf;
    }

    public void setFunccpf(String funccpf) {
        this.funccpf = funccpf;
    }

    public String getFunccel() {
        return funccel;
    }

    public void setFunccel(String funccel) {
        this.funccel = funccel;
    }

    public String getFuncendereco() {
        return funcendereco;
    }

    public void setFuncendereco(String funcendereco) {
        this.funcendereco = funcendereco;
    }

    public String getFuncbairro() {
        return funcbairro;
    }

    public void setFuncbairro(String funcbairro) {
        this.funcbairro = funcbairro;
    }

    public String getFunccidade() {
        return funccidade;
    }

    public void setFunccidade(String funccidade) {
        this.funccidade = funccidade;
    }

    public String getFuncemail() {
        return funcemail;
    }

    public void setFuncemail(String funcemail) {
        this.funcemail = funcemail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (funccodigo != null ? funccodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.funccodigo == null && other.funccodigo != null) || (this.funccodigo != null && !this.funccodigo.equals(other.funccodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.entity.Funcionario[ funccodigo=" + funccodigo + " ]";
    }
    
}
