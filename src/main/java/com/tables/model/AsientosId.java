package com.tables.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AsientosId implements Serializable {

    private static final long serialVersionUID = -5906143662471528273L;
    private Integer sucursal;
    private Integer linea;
    private Integer transac;

    private AsientosId() {
    }

    public AsientosId(Integer sucursal, Integer linea, Integer transac) {
        this.sucursal = sucursal;
        this.linea = linea;
        this.transac = transac;
    }

    public Integer getSucursal() {
        return sucursal;
    }

    public Integer getLinea() {
        return linea;
    }

    public Integer getTransac() {
        return transac;
    }

}
