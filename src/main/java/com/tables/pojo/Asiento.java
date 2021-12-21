package com.tables.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Data;
import com.tables.pojo.Ejercicios;
import java.io.Serializable;
import java.util.ArrayList;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "codigo_empresa",
        "descripcion_empresa",
        "ejercicios"

})

@Data
@Builder
public class Asiento implements Serializable {

    @JsonProperty("codigo_empresa")
    public Integer codigo_empresa;
    @JsonProperty("descripcion_empresa")
    public String descripcion_empresa;
    @JsonProperty("ejercicios")
    public Ejercicios ejercicios;

}