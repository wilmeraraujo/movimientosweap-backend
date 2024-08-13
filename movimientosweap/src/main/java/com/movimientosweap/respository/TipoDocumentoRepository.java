package com.movimientosweap.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movimientosweap.entity.TipoDocumento;

public interface TipoDocumentoRepository extends JpaRepository<TipoDocumento, Long> {

}
