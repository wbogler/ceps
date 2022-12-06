package com.ceps.entities;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MesoRegioes implements Serializable{

	private static final long serialVersionUID = 1L;
	
	List<UF> unidades;

}
