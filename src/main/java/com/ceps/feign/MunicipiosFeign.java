package com.ceps.feign;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ceps.entities.Municipios;

@Component
@FeignClient (name = "municipios", url = "https://servicodados.ibge.gov.br/api/v1/localidades/estados")
public interface MunicipiosFeign {
	
	@GetMapping(value = "/{id}/municipios")
	List<Municipios> municipioGet(@PathVariable int id);

}
