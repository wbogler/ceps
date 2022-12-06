package com.ceps.entities;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MicroRegioes implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<MesoRegioes> mesoRegiao;

}
