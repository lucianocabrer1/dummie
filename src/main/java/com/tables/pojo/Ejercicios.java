package com.tables.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ejercicio",
        "detalle_ejercicio",
        "cerrado",
        "empresa_ejercicio",
        "id_asiento_inicio",
        "id_asiento_cierre",
        "id_asiento_cierre2",
        "desde_fecha",
        "hasta_fecha",
        "ultimo_numero_asiento",
        "id_asiento",
        "ultimo_numero_asiento_resumen",
        "id_asiento_resumen",
        "ultimo_nro_ab",
        "id_asiento_b",
        "tipo_resumen",
        "asiento_apertura",
        "asiento_cierre",
        "as_rei",
        "es_activo",
        "marca_f",
        "id_empresa",
        "numero"
})


@Data
@Builder
public class Ejercicios {

    @JsonProperty("ejercicio")
    public Integer ejercicio;
    @JsonProperty("detalle_ejercicio")
    public String detalle_ejercicio;
    @JsonProperty("cerrado")
    public String cerrado;
    @JsonProperty("empresa_ejercicio")
    public String empresa_ejercicio;
    @JsonProperty("id_asiento_inicio")
    public Integer id_asiento_inicio;
    @JsonProperty("id_asiento_cierre")
    public Integer id_asiento_cierre;
    @JsonProperty("id_asiento_cierre2")
    public Integer id_asiento_cierre2;
    @JsonProperty("desde_fecha")
    public Integer desde_fecha;
    @JsonProperty("hasta_fecha")
    public Integer hasta_fecha;
    @JsonProperty("ultimo_numero_asiento")
    public Integer ultimo_numero_asiento;
    @JsonProperty("id_asiento")
    public Integer id_asiento;
    @JsonProperty("ultimo_numero_asiento_resumen")
    public Integer ultimo_numero_asiento_resumen;
    @JsonProperty("id_asiento_resumen")
    public Integer id_asiento_resumen;
    @JsonProperty("ultimo_nro_ab")
    public Integer ultimo_nro_ab;
    @JsonProperty("id_asiento_b")
    public Integer id_asiento_b;
    @JsonProperty("tipo_resumen")
    public Integer tipo_resumen;
    @JsonProperty("asiento_apertura")
    public Integer asiento_apertura;
    @JsonProperty("asiento_cierre")
    public Integer asiento_cierre;
    @JsonProperty("as_rei")
    public Integer as_rei;
    @JsonProperty("es_activo")
    public Integer es_activo;
    @JsonProperty("marca_f")
    public Integer marca_f;
    @JsonProperty("id_empresa")
    public Integer id_empresa;
    @JsonProperty("numero")
    public Integer numero;
}
