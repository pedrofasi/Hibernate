package com.jcg.hibernate.crud.operations.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="668443_ARMAS")
public class Arma implements Serializable {
		
	private static final long serialVersionUID = 1L;
		@Id
		@Column(name="id_arma")
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id_arma;

		@Column(name="nome")
		private String nome;
		
		public int getId() {
			return id_arma;
		}

		public void setId(int id_arma) {
			this.id_arma = id_arma;
		}
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		@Override
		public String toString() {
			return "Arma Details?= Id Arma: " + this.id_arma + ", Arma: " + this.nome;
		}
	
	}
