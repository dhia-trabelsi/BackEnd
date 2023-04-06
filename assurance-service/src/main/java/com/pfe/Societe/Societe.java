package com.pfe.Societe;

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
@Table(name = "SOCIETE")
public class Societe {

    @Id @Column(length = 4, name = "COD_SOC")
    private String Cod_Soc;
    @Column(length = 100, name = "LIB_SOC")
    private String Lib_Soc;
    @Column(length = 100, name = "LIB_SOC_A")
    private String Lib_Soc_A;
    @Column(length = 100, name = "ADR_SOC")
    private String Adr_Soc;
    @Column(length = 100, name = "ADR_SOC_A")
    private String Adr_Soc_A;
    @Column(length = 20, name = "TEL_SOC")
    private String Tel_Soc;
    @Column(length = 20, name = "FAX_SOC")
    private String Fax_Soc;
    @Column(length = 20, name = "COD_TVA")
    private String Cod_Tva;
    @Column(length = 10, name = "COD_RETR")
    private String Cod_Retr;
    @Column(length = 10, name = "NUM_RETR")
    private String Num_Retr;
    @Column(length = 1, name = "REP_WEB")
    private String Rep_Web;
    @Column(length = 1, name = "REGIME")
    private String Regime;
    @Column(length = 25, name = "NUM_POLICE")
    private String Num_Police;
    @Column(length = 100, name = "ADR_ELECTRONIQUE")
    private String Adr_Electronique;
    @Column(length = 4, name = "COD_PAY")
    private String Cod_Pay;
    @Column(name = "AGE_MIN")
    private int Age_Min;
    @Column(name = "AGE_MAX")
    private int Age_Max;


    /*
    COD_SOC VARCHAR2(4) NOT NULL,
    LIB_SOC VARCHAR2(100),
    LIB_SOC_A VARCHAR2(100),
    ADR_SOC VARCHAR2(100),
    ADR_SOC_A VARCHAR2(100),
    TEL_SOC VARCHAR2(20),
    FAX_SOC VARCHAR2(20),
    COD_TVA VARCHAR2(20),
    COD_RETR VARCHAR2(10),
    NUM_RETR VARCHAR2(10),
    REP_WEB VARCHAR2(1),
    REGIME VARCHAR2(1),
    NUM_POLICE VARCHAR2(25),
    ADR_ELECTRONIQUE VARCHAR2(100),
    COD_PAY VARCHAR2(4),
    AGE_MIN NUMBER(3),
    AGE_MAX NUMBER(3),
    */
    
}
