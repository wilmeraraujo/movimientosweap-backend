package com.movimientosweap.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movimientosweap.common.controller.CommonController;
import com.movimientosweap.entity.TipoDocumento;
import com.movimientosweap.service.TipoDocumentoService;

@RestController
@RequestMapping(value="/api/v1/tipo-documento")
public class TipoDocumentoController extends CommonController<TipoDocumento, TipoDocumentoService>{
	@PutMapping("/{id}")
	public ResponseEntity<?> edit(@Validated @RequestBody TipoDocumento tipoDocumento, BindingResult result, @PathVariable(name = "id") Long id){
		
		if(result.hasErrors()) {
			return this.validar(result);
		}
		
		Optional<TipoDocumento> objeto = service.findById(id);
		
		if(objeto.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		TipoDocumento tipoDocumentoDb = objeto.get();
		tipoDocumentoDb.setCodigo(tipoDocumento.getCodigo());
		tipoDocumentoDb.setDescripcion(tipoDocumento.getDescripcion());
		
		return  ResponseEntity.status(HttpStatus.CREATED).body(service.save(tipoDocumentoDb));
	}
}
