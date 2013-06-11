/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ultrabate.entidade;

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

/**
 *
 * @author Denisio
 */
@Entity
@Table(name = "Tb_Pess_Jur")
@NamedQueries({
    @NamedQuery(name = "TbPessJur.findAll", query = "SELECT t FROM TbPessJur t")})
public class TbPessJur implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Emp_Documento")
    private Double empDocumento;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Pjur_Codigo_Pessoa")
    private Integer pjurCodigoPessoa;
    @Column(name = "Pjur_Documento")
    private Double pjurDocumento;
    @Size(max = 70)
    @Column(name = "Pjur_RSocial")
    private String pjurRSocial;
    @Column(name = "Pjur_IE")
    private Double pjurIE;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Pjur_observacao")
    private String pjurobservacao;
    @Size(max = 50)
    @Column(name = "Pjur_Email")
    private String pjurEmail;
    @Size(max = 50)
    @Column(name = "PJur_Web")
    private String pJurWeb;
    @Size(max = 30)
    @Column(name = "Pjur_Telefone")
    private String pjurTelefone;
    @Size(max = 15)
    @Column(name = "Pjur_CCM")
    private String pjurCCM;
    @Size(max = 15)
    @Column(name = "Pjur_RTCR")
    private String pjurRTCR;
    @Size(max = 1)
    @Column(name = "Pjur_Ind_Matriz")
    private String pjurIndMatriz;
    @Size(max = 30)
    @Column(name = "Pjur_Fax")
    private String pjurFax;
    @Size(max = 30)
    @Column(name = "Pjur_Celular")
    private String pjurCelular;
    @Size(max = 30)
    @Column(name = "Pjur_NmContato")
    private String pjurNmContato;
    @Size(max = 10)
    @Column(name = "Pjur_Banco")
    private String pjurBanco;
    @Size(max = 20)
    @Column(name = "Pjur_Ag")
    private String pjurAg;
    @Size(max = 20)
    @Column(name = "Pjur_Conta")
    private String pjurConta;
    @Size(max = 10)
    @Column(name = "Pjur_IndRel")
    private String pjurIndRel;
    @Size(max = 1)
    @Column(name = "status")
    private String status;
    @Size(max = 3)
    @Column(name = "faturamento")
    private String faturamento;
    @Column(name = "prazo")
    private Integer prazo;
    @Size(max = 60)
    @Column(name = "Nomefantasia")
    private String nomefantasia;
    @Size(max = 3)
    @Column(name = "CodigoNotaFiscal")
    private String codigoNotaFiscal;
    @Column(name = "formacobranca")
    private Integer formacobranca;

    public TbPessJur() {
    }

    public TbPessJur(Integer pjurCodigoPessoa) {
        this.pjurCodigoPessoa = pjurCodigoPessoa;
    }

    public Double getEmpDocumento() {
        return empDocumento;
    }

    public void setEmpDocumento(Double empDocumento) {
        this.empDocumento = empDocumento;
    }

    public Integer getPjurCodigoPessoa() {
        return pjurCodigoPessoa;
    }

    public void setPjurCodigoPessoa(Integer pjurCodigoPessoa) {
        this.pjurCodigoPessoa = pjurCodigoPessoa;
    }

    public Double getPjurDocumento() {
        return pjurDocumento;
    }

    public void setPjurDocumento(Double pjurDocumento) {
        this.pjurDocumento = pjurDocumento;
    }

    public String getPjurRSocial() {
        return pjurRSocial;
    }

    public void setPjurRSocial(String pjurRSocial) {
        this.pjurRSocial = pjurRSocial;
    }

    public Double getPjurIE() {
        return pjurIE;
    }

    public void setPjurIE(Double pjurIE) {
        this.pjurIE = pjurIE;
    }

    public String getPjurobservacao() {
        return pjurobservacao;
    }

    public void setPjurobservacao(String pjurobservacao) {
        this.pjurobservacao = pjurobservacao;
    }

    public String getPjurEmail() {
        return pjurEmail;
    }

    public void setPjurEmail(String pjurEmail) {
        this.pjurEmail = pjurEmail;
    }

    public String getPJurWeb() {
        return pJurWeb;
    }

    public void setPJurWeb(String pJurWeb) {
        this.pJurWeb = pJurWeb;
    }

    public String getPjurTelefone() {
        return pjurTelefone;
    }

    public void setPjurTelefone(String pjurTelefone) {
        this.pjurTelefone = pjurTelefone;
    }

    public String getPjurCCM() {
        return pjurCCM;
    }

    public void setPjurCCM(String pjurCCM) {
        this.pjurCCM = pjurCCM;
    }

    public String getPjurRTCR() {
        return pjurRTCR;
    }

    public void setPjurRTCR(String pjurRTCR) {
        this.pjurRTCR = pjurRTCR;
    }

    public String getPjurIndMatriz() {
        return pjurIndMatriz;
    }

    public void setPjurIndMatriz(String pjurIndMatriz) {
        this.pjurIndMatriz = pjurIndMatriz;
    }

    public String getPjurFax() {
        return pjurFax;
    }

    public void setPjurFax(String pjurFax) {
        this.pjurFax = pjurFax;
    }

    public String getPjurCelular() {
        return pjurCelular;
    }

    public void setPjurCelular(String pjurCelular) {
        this.pjurCelular = pjurCelular;
    }

    public String getPjurNmContato() {
        return pjurNmContato;
    }

    public void setPjurNmContato(String pjurNmContato) {
        this.pjurNmContato = pjurNmContato;
    }

    public String getPjurBanco() {
        return pjurBanco;
    }

    public void setPjurBanco(String pjurBanco) {
        this.pjurBanco = pjurBanco;
    }

    public String getPjurAg() {
        return pjurAg;
    }

    public void setPjurAg(String pjurAg) {
        this.pjurAg = pjurAg;
    }

    public String getPjurConta() {
        return pjurConta;
    }

    public void setPjurConta(String pjurConta) {
        this.pjurConta = pjurConta;
    }

    public String getPjurIndRel() {
        return pjurIndRel;
    }

    public void setPjurIndRel(String pjurIndRel) {
        this.pjurIndRel = pjurIndRel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(String faturamento) {
        this.faturamento = faturamento;
    }

    public Integer getPrazo() {
        return prazo;
    }

    public void setPrazo(Integer prazo) {
        this.prazo = prazo;
    }

    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    public String getCodigoNotaFiscal() {
        return codigoNotaFiscal;
    }

    public void setCodigoNotaFiscal(String codigoNotaFiscal) {
        this.codigoNotaFiscal = codigoNotaFiscal;
    }

    public Integer getFormacobranca() {
        return formacobranca;
    }

    public void setFormacobranca(Integer formacobranca) {
        this.formacobranca = formacobranca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pjurCodigoPessoa != null ? pjurCodigoPessoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbPessJur)) {
            return false;
        }
        TbPessJur other = (TbPessJur) object;
        if ((this.pjurCodigoPessoa == null && other.pjurCodigoPessoa != null) || (this.pjurCodigoPessoa != null && !this.pjurCodigoPessoa.equals(other.pjurCodigoPessoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ultrabate.entidade.TbPessJur[ pjurCodigoPessoa=" + pjurCodigoPessoa + " ]";
    }
    
}
