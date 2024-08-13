package com.movimientosweap.service;

import org.springframework.stereotype.Service;

import com.movimientosweap.common.service.CommonServiceImpl;
import com.movimientosweap.entity.TipoDocumento;
import com.movimientosweap.respository.TipoDocumentoRepository;

@Service
public class TipoDocumentoServiceImpl extends CommonServiceImpl<TipoDocumento, TipoDocumentoRepository> implements TipoDocumentoService{

}
