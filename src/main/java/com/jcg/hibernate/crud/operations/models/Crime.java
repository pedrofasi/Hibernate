package com.jcg.hibernate.crud.operations.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="668443_CRIME")
public class Crime implements Serializable {
		
	private static final long serialVersionUID = 1L;
		@Id
		@Column(name="id")
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;

		@Column(name="criminoso")
		private int id_criminoso;
		
		@Column(name="vitima")
		private int id_vitima;
		
		@Column(name="arma_utilizada")
		private int id_arma;
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
		public int getCriminoso() {
			return id_criminoso;
		}

		public void setCriminoso(int id_criminoso) {
			this.id_criminoso = id_criminoso;
		}

		public int getVitima() {
			return id_vitima;
		}

		public void setVitima(int id_vitima) {
			this.id_vitima = id_vitima;
		}
		
		public int getArma() {
			return id_arma;
		}

		public void setArma(int id_arma) {
			this.id_arma = id_arma;
		}
		
		@Override
		public String toString() {
			return "Crime Details?= Id: " + this.id + ", Criminoso: " + this.id_criminoso + ", Vitima: " + this.id_vitima + "Arma: "+ this.id_arma;
		}
	
	}
