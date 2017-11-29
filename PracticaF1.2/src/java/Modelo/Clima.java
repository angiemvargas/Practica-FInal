/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author angiem.vargas
 */
@Entity
@Table(name = "Clima")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clima.findAll", query = "SELECT c FROM Clima c")
    , @NamedQuery(name = "Clima.findByMes", query = "SELECT c FROM Clima c WHERE c.mes = :mes")
    , @NamedQuery(name = "Clima.findByHumedad", query = "SELECT c FROM Clima c WHERE c.humedad = :humedad")
    , @NamedQuery(name = "Clima.findByTemperatura", query = "SELECT c FROM Clima c WHERE c.temperatura = :temperatura")
    , @NamedQuery(name = "Clima.findByViento", query = "SELECT c FROM Clima c WHERE c.viento = :viento")
    , @NamedQuery(name = "Clima.findByNubosidad", query = "SELECT c FROM Clima c WHERE c.nubosidad = :nubosidad")
    , @NamedQuery(name = "Clima.findByPresi\u00f3nAtmosferica", query = "SELECT c FROM Clima c WHERE c.presi\u00f3nAtmosferica = :presi\u00f3nAtmosferica")})
public class Clima implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Mes")
    private String mes;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Humedad")
    private Float humedad;
    @Column(name = "Temperatura")
    private Float temperatura;
    @Column(name = "Viento")
    private Float viento;
    @Column(name = "Nubosidad")
    private Float nubosidad;
    @Column(name = "Presi\u00f3nAtmosferica")
    private Float presiónAtmosferica;

    public Clima() {
    }

    public Clima(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Float getHumedad() {
        return humedad;
    }

    public void setHumedad(Float humedad) {
        this.humedad = humedad;
    }

    public Float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Float temperatura) {
        this.temperatura = temperatura;
    }

    public Float getViento() {
        return viento;
    }

    public void setViento(Float viento) {
        this.viento = viento;
    }

    public Float getNubosidad() {
        return nubosidad;
    }

    public void setNubosidad(Float nubosidad) {
        this.nubosidad = nubosidad;
    }

    public Float getPresiónAtmosferica() {
        return presiónAtmosferica;
    }

    public void setPresiónAtmosferica(Float presiónAtmosferica) {
        this.presiónAtmosferica = presiónAtmosferica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mes != null ? mes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clima)) {
            return false;
        }
        Clima other = (Clima) object;
        if ((this.mes == null && other.mes != null) || (this.mes != null && !this.mes.equals(other.mes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Clima[ mes=" + mes + " ]";
    }
    
}
