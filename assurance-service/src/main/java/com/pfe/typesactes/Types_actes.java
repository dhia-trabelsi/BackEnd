package com.pfe.typesactes;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TYPES_ACTES")
public class Types_actes {
	

	
	@Id @Column(name = "TYPE_ACT")
	private String Type_Act;
	@Column(length = 40, name = "LIB_TYPE_ACTE")
	private String Lib_Type_Acte;
	

	// type_act      NUMBER(2) not null,
  	// lib_type_acte VARCHAR2(40)
	

}
