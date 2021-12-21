package com.tables;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.tables.model.AsientosEntity;
//import com.tables.pojo.Asiento;
import com.tables.pojo.Asiento;
import com.tables.pojo.Ejercicios;
import com.tables.repository.AsientosRepository;
import com.tables.repository.TipoIvaRepository;
import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DumieTest {

    @Autowired
    TipoIvaRepository tipoIvaRepository;

    @Autowired
    AsientosRepository asientosRepository;

    JSONObject ejercicio = new JSONObject()
                            .put("ejercicio",1)
                            .put("detalle_ejercicio","EJERCICIO UNO")
                            .put("cerrado","N")
                            .put("empresa_ejercicio","EMPRESA")
                            .put("id_asiento_inicio",1)
                            .put("id_asiento_cierre",1)
                            .put("id_asiento_cierre2",1)
                            .put("desde_fecha",79262)
                            .put("hasta_fecha",79991)
                            .put("ultimo_numero_asiento",1290)
                            .put("id_asiento",1004)
                            .put("ultimo_numero_asiento_resumen",5)
                            .put("id_asiento_resumen",4)
                            .put("ultimo_nro_ab",0)
                            .put("id_asiento_b",0)
                            .put("tipo_resumen",1)
                            .put("asiento_apertura",0)
                            .put("asiento_cierre",0)
                            .put("as_rei",0)
                            .put("es_activo",0)
                            .put("marca_f",0)
                            .put("id_empresa",1)
                            .put("numero",1);

    Ejercicios ejercicios = Ejercicios.builder()
            .ejercicio(1)
            .detalle_ejercicio("EJERCICIO UNO")
            .cerrado("N")
            .empresa_ejercicio("EMPRESA")
            .id_asiento_inicio(1)
            .id_asiento_cierre(1)
            .id_asiento_cierre2(1)
            .desde_fecha(79262)
            .hasta_fecha(79991)
            .ultimo_numero_asiento(1290)
            .id_asiento(1004)
            .ultimo_numero_asiento_resumen(5)
            .id_asiento_resumen(4)
            .ultimo_nro_ab(0)
            .id_asiento_b(0)
            .tipo_resumen(1)
            .asiento_apertura(0)
            .asiento_cierre(0)
            .as_rei(0)
            .es_activo(0)
            .marca_f(0)
            .id_empresa(1)
            .numero(1)
            .build();

    Asiento asientoBody = Asiento.builder()
            .codigo_empresa(1)
            .descripcion_empresa("Empresa 1")
            .ejercicios(ejercicios)
            .build();

    JSONArray array = new JSONArray().put(ejercicio)
            .put(ejercicio);

    JSONObject asiento = new JSONObject()
            .put("codigo_empresa",1)
            .put("descripcion_empresam","Empresa 1")
            .put("ejercicios", array);


    public DumieTest() throws JSONException {
    }

    @Test
    @Transactional
    public void a (){
;
        //tipoIvaRepository.findAll();
       // List<AsientosEntity> list = asientosRepository.findAll();
        Map<Integer, Integer> arr = asientosRepository.findMax();

        List<AsientosEntity[]> list = asientosRepository.findByNumero(arr.get("ultimo_numero_asiento"), arr.get("id_asiento"));

        System.out.println(asiento);

       /**
        * SE USA PARA DEJARLO FORMATO JSON BONITO
        *
        * JSONObject orderedJson = new JSONObject(mapa);
        System.out.println("JSON ORDENADO " + orderedJson);

        JSONArray jsonArray = new JSONArray(Arrays.asList(orderedJson));
        System.out.println("JSON ARRAY " + jsonArray);

        System.out.println("HOLA" + mapa);

        try {
            System.out.println("Ordered JSON Fianl CSV :: "+ CDL.toString(jsonArray));
        } catch (JSONException e) {
            e.printStackTrace();
        }**/


    }

}
