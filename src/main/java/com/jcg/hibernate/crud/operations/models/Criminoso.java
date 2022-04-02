package com.jcg.hibernate.crud.operations.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "668443_CRIMINOSO")
public class Criminoso implements Serializable {
	
	private static final long serialVersionUID = 1L;    
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
	    @Column(name = "id_criminoso")
	    private int id_criminoso;
	 
	    @Column(name = "nome")
	    private String nome;
	 
	    @Column(name = "data_nasci")
	    private String datanasci;
	    
	    @Column(name = "cpf")
	    private String cpf;
	    

	    public int getId_criminoso() {
	        return id_criminoso;
	    }
	 
	    public void setId_criminoso(int id_criminoso) {
	        this.id_criminoso = id_criminoso;
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
			return "Criminoso Details?= Id: " + this.id_criminoso + ", Nome: " + this.nome + ", Data_Nascimento: " + this.datanasci + ", CPF: " + this.cpf ;
		}
}
