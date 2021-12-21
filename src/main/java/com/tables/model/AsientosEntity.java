package com.tables.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Asientos")
public class AsientosEntity {

    @Embedded
    @Id
    private AsientosId asientosId;

    private Integer VALMONSEC;
    private String TIPO;
    private Integer recpam;
    private Integer NUMEROANT;
    private Integer NUMERO;
    private Integer NRORECIBO;
    private Integer NROORDPAGO;
    private Integer NROFACTURAV;
    private Integer NROFACTURAC;
    private String NOMBRE;
    private Integer MARCAT;
    private Integer MARCAS;
    private Integer MARCAM;
    private Integer MARCAF;
    private Integer MARAC;
    private String LEYENDA;
    private Integer IDMOV;
    private Integer IDASIENTO;
    private Date HORA;
    private Integer HABER;
    private Integer FECHA;
    private Integer EJERCICIO;
    private Integer DIARIO;
    private String DETALLEEJERCICIO;
    private String DETALLE;
    private Integer DEBE;
    private String CONCEPTO;
    private Integer CODIGO;
    private Integer CENCOSTO;
    private Integer BLOQUEADO;
    private Integer ASITIPO;

    private AsientosEntity() {

    }

    public AsientosEntity(AsientosId asientosId, Integer VALMONSEC, String TIPO, Integer recpam, Integer NUMEROANT, Integer NUMERO, Integer NRORECIBO, Integer NROORDPAGO, Integer NROFACTURAV, Integer NROFACTURAC, String NOMBRE, Integer MARCAT, Integer MARCAS, Integer MARCAM, Integer MARCAF, Integer MARAC, String LEYENDA, Integer IDMOV, Integer IDASIENTO, Date HORA, Integer HABER, Integer FECHA, Integer EJERCICIO, Integer DIARIO, String DETALLEEJERCICIO, String DETALLE, Integer DEBE, String CONCEPTO, Integer CODIGO, Integer CENCOSTO, Integer BLOQUEADO, Integer ASITIPO) {
        this.asientosId = asientosId;
        this.VALMONSEC = VALMONSEC;
        this.TIPO = TIPO;
        this.recpam = recpam;
        this.NUMEROANT = NUMEROANT;
        this.NUMERO = NUMERO;
        this.NRORECIBO = NRORECIBO;
        this.NROORDPAGO = NROORDPAGO;
        this.NROFACTURAV = NROFACTURAV;
        this.NROFACTURAC = NROFACTURAC;
        this.NOMBRE = NOMBRE;
        this.MARCAT = MARCAT;
        this.MARCAS = MARCAS;
        this.MARCAM = MARCAM;
        this.MARCAF = MARCAF;
        this.MARAC = MARAC;
        this.LEYENDA = LEYENDA;
        this.IDMOV = IDMOV;
        this.IDASIENTO = IDASIENTO;
        this.HORA = HORA;
        this.HABER = HABER;
        this.FECHA = FECHA;
        this.EJERCICIO = EJERCICIO;
        this.DIARIO = DIARIO;
        this.DETALLEEJERCICIO = DETALLEEJERCICIO;
        this.DETALLE = DETALLE;
        this.DEBE = DEBE;
        this.CONCEPTO = CONCEPTO;
        this.CODIGO = CODIGO;
        this.CENCOSTO = CENCOSTO;
        this.BLOQUEADO = BLOQUEADO;
        this.ASITIPO = ASITIPO;
    }

    public AsientosId getAsientosId() {
        return asientosId;
    }

    public void setAsientosId(AsientosId asientosId) {
        this.asientosId = asientosId;
    }

    public Integer getVALMONSEC() {
        return VALMONSEC;
    }

    public void setVALMONSEC(Integer VALMONSEC) {
        this.VALMONSEC = VALMONSEC;
    }

    public String getTIPO() {
        return TIPO;
    }

    public void setTIPO(String TIPO) {
        this.TIPO = TIPO;
    }

    public Integer getRecpam() {
        return recpam;
    }

    public void setRecpam(Integer recpam) {
        this.recpam = recpam;
    }

    public Integer getNUMEROANT() {
        return NUMEROANT;
    }

    public void setNUMEROANT(Integer NUMEROANT) {
        this.NUMEROANT = NUMEROANT;
    }

    public Integer getNUMERO() {
        return NUMERO;
    }

    public void setNUMERO(Integer NUMERO) {
        this.NUMERO = NUMERO;
    }

    public Integer getNRORECIBO() {
        return NRORECIBO;
    }

    public void setNRORECIBO(Integer NRORECIBO) {
        this.NRORECIBO = NRORECIBO;
    }

    public Integer getNROORDPAGO() {
        return NROORDPAGO;
    }

    public void setNROORDPAGO(Integer NROORDPAGO) {
        this.NROORDPAGO = NROORDPAGO;
    }

    public Integer getNROFACTURAV() {
        return NROFACTURAV;
    }

    public void setNROFACTURAV(Integer NROFACTURAV) {
        this.NROFACTURAV = NROFACTURAV;
    }

    public Integer getNROFACTURAC() {
        return NROFACTURAC;
    }

    public void setNROFACTURAC(Integer NROFACTURAC) {
        this.NROFACTURAC = NROFACTURAC;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public Integer getMARCAT() {
        return MARCAT;
    }

    public void setMARCAT(Integer MARCAT) {
        this.MARCAT = MARCAT;
    }

    public Integer getMARCAS() {
        return MARCAS;
    }

    public void setMARCAS(Integer MARCAS) {
        this.MARCAS = MARCAS;
    }

    public Integer getMARCAM() {
        return MARCAM;
    }

    public void setMARCAM(Integer MARCAM) {
        this.MARCAM = MARCAM;
    }

    public Integer getMARCAF() {
        return MARCAF;
    }

    public void setMARCAF(Integer MARCAF) {
        this.MARCAF = MARCAF;
    }

    public Integer getMARAC() {
        return MARAC;
    }

    public void setMARAC(Integer MARAC) {
        this.MARAC = MARAC;
    }

    public String getLEYENDA() {
        return LEYENDA;
    }

    public void setLEYENDA(String LEYENDA) {
        this.LEYENDA = LEYENDA;
    }

    public Integer getIDMOV() {
        return IDMOV;
    }

    public void setIDMOV(Integer IDMOV) {
        this.IDMOV = IDMOV;
    }

    public Integer getIDASIENTO() {
        return IDASIENTO;
    }

    public void setIDASIENTO(Integer IDASIENTO) {
        this.IDASIENTO = IDASIENTO;
    }

    public Date getHORA() {
        return HORA;
    }

    public void setHORA(Date HORA) {
        this.HORA = HORA;
    }

    public Integer getHABER() {
        return HABER;
    }

    public void setHABER(Integer HABER) {
        this.HABER = HABER;
    }

    public Integer getFECHA() {
        return FECHA;
    }

    public void setFECHA(Integer FECHA) {
        this.FECHA = FECHA;
    }

    public Integer getEJERCICIO() {
        return EJERCICIO;
    }

    public void setEJERCICIO(Integer EJERCICIO) {
        this.EJERCICIO = EJERCICIO;
    }

    public Integer getDIARIO() {
        return DIARIO;
    }

    public void setDIARIO(Integer DIARIO) {
        this.DIARIO = DIARIO;
    }

    public String getDETALLEEJERCICIO() {
        return DETALLEEJERCICIO;
    }

    public void setDETALLEEJERCICIO(String DETALLEEJERCICIO) {
        this.DETALLEEJERCICIO = DETALLEEJERCICIO;
    }

    public String getDETALLE() {
        return DETALLE;
    }

    public void setDETALLE(String DETALLE) {
        this.DETALLE = DETALLE;
    }

    public Integer getDEBE() {
        return DEBE;
    }

    public void setDEBE(Integer DEBE) {
        this.DEBE = DEBE;
    }

    public String getCONCEPTO() {
        return CONCEPTO;
    }

    public void setCONCEPTO(String CONCEPTO) {
        this.CONCEPTO = CONCEPTO;
    }

    public Integer getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(Integer CODIGO) {
        this.CODIGO = CODIGO;
    }

    public Integer getCENCOSTO() {
        return CENCOSTO;
    }

    public void setCENCOSTO(Integer CENCOSTO) {
        this.CENCOSTO = CENCOSTO;
    }

    public Integer getBLOQUEADO() {
        return BLOQUEADO;
    }

    public void setBLOQUEADO(Integer BLOQUEADO) {
        this.BLOQUEADO = BLOQUEADO;
    }

    public Integer getASITIPO() {
        return ASITIPO;
    }

    public void setASITIPO(Integer ASITIPO) {
        this.ASITIPO = ASITIPO;
    }
}
