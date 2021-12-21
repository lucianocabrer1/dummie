package com.tables.repository;

import com.tables.model.AsientosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface AsientosRepository extends JpaRepository<AsientosEntity, Long> {

    @Query(value = "SELECT * FROM Asientos Where MARCAM  = '1' and NUMERO = ?1 and IDASIENTO = ?2", nativeQuery = true)
    List<AsientosEntity[]> findByNumero(Integer numero, Integer idAsiento);

    @Query(value = "Select MAX(NUMERO) ultimo_numero_asiento, MAX(IDASIENTO) id_asiento from QAEquipoDPE.dbo.Asientos WHERE MARCAM = '1'", nativeQuery = true)
    Map<Integer, Integer> findMax();
}
