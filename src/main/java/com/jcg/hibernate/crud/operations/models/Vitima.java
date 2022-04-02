package com.jcg.hibernate.crud.operations.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "668443_VITIMA")
public class Vitima implements Serializable {
	
	private static final long serialVersionUID = 1L;    
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
	    @Column(name = "id_vitima")
	    private int id_vitima;
	 
	    @Column(name = "nome")
	    private String nome;
	 
	    @Column(name = "data_nasci")
	    private String datanasci;
	    
	    @Column(name = "cpf")
	    private String cpf;
    
	    public int getId_vitima() {
	        return id_vitima;
	    }
	 
	    public void setId_vitima(int id_vitima) {
	        this.id_vitima = id_vitima;
	    }
	 
	    public String getNome() {
	        return nome;
	    }
	 
	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	 
	    public String getData() {
	        return datanasci;
	    }
	 
	    public void setData(String datanasci) {
	        this.datanasci = datanasci;
	    }
	 
	    public String getCPF() {
	        return cpf;
	    }
	 
	    public void setCPF(String cpf) {
	        this.cpf = cpf;
	    }
	
	    @Override
		public String toString() {
			return "Vitima Details?= Id: " + this.id_vitima + ", Nome: " + this.nome + ", Data_Nascimento: " + this.datanasci + ", CPF: " + this.cpf;
		}
}

