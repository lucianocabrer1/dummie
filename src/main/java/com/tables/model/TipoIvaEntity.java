package com.tables.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TiposIVA")
public class TipoIvaEntity {

    @Id
    private Long tipoDeIva;

    private String descripcionAdicional;
    private int porIva;
    private int marcaf;
    private int inafecto;
    private int porRecargoEquivalencia;

    protected TipoIvaEntity() {
    }

    public TipoIvaEntity(Long tipoDeIva, String descripcionAdicional, int porIva, int marcaf, int inafecto,
            int porRecargoEquivalencia) {
        this.tipoDeIva = tipoDeIva;
        this.descripcionAdicional = descripcionAdicional;
        this.porIva = porIva;
        this.marcaf = marcaf;
        this.inafecto = inafecto;
        this.porRecargoEquivalencia = porRecargoEquivalencia;
    }

    @Override
    public String toString() {
        return "TipoIvaEntity{" + "tipoDeIva=" + tipoDeIva + ", descripcionAdicional='" + descripcionAdicional + '\''
                + ", porIva=" + porIva + ", marcaf=" + marcaf + ", inafecto=" + inafecto + ", porRecargoEquivalencia="
                + porRecargoEquivalencia + '}';
    }

    public Long getTipoDeIva() {
        return tipoDeIva;
    }

    public String getDescripcionAdicional() {
        return descripcionAdicional;
    }

    public int getPorIva() {
        return porIva;
    }

    public int getMarcaf() {
        return marcaf;
    }

    public int getInafecto() {
        return inafecto;
    }

    public int getPorRecargoEquivalencia() {
        return porRecargoEquivalencia;
    }

}
