package com.tables.repository;

import com.tables.model.TipoIvaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoIvaRepository extends JpaRepository<TipoIvaEntity, Long> {

}
