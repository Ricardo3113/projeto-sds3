package com.devsuperior.dsvendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity //Notation JPA (objeto relacional do java) =>mapeamento do paradigma do ambiente java para o paradigma ambiente relacional
@Table(name = "tb_sales") //confere com tb_sales do SQL
public class Sale {//sale será mapeado pelo banco com o nome de tb_sales
	
	@Id //indica para o banco qual a chave primária 
	@GeneratedValue(strategy = GenerationType.IDENTITY) //banco relacional com chave auto invrementavel,(a medida q for inserido novos registros o banco já atualiza)
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	@ManyToOne  //mapeamento da chave estrangeira muitos para um confirme projeto de banco relacional conceitual
	@JoinColumn(name = "seller_id")
	private Seller seller;//chave estrangeira
	
	public Sale() {
	}

	public Sale(Long id, Integer visited, Integer deals, Double amount, LocalDate date, Seller seller) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}
}
