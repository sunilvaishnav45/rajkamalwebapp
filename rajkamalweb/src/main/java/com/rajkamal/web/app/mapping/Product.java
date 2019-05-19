package com.rajkamal.web.app.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private int id;
	
	@Column(name = "name")
	@NotNull(message="NOT_NULL")
	private String name;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "company")
	@NotNull(message="NOT_NULL")
	private Company company;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_type")
	@NotNull(message="NOT_NULL")
	private ProductType productType;
	
	@Column(name = "mrp")
	@NotNull(message="NOT_NULL")
	private int mrp;
	
	@Column(name = "selling_price")
	@NotNull(message="NOT_NULL")
	private int sellingPrice;
	
	
	@Column(name = "discount")
	@NotNull(message="NOT_NULL")
	private int discount;
	
	@Column(name = "specification")
	@NotNull(message="NOT_NULL")
	private String specification;
	
	@Type(type= "org.hibernate.type.NumericBooleanType")
	@NotNull(message="NOT_NULL")
	@Column(name="on_offer")
	private boolean onOffer;
	
	@Column(name = "img_url")
	private String imgUrl;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public int getMrp() {
		return mrp;
	}

	public void setMrp(int mrp) {
		this.mrp = mrp;
	}

	public int getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public boolean isOnOffer() {
		return onOffer;
	}

	public void setOnOffer(boolean onOffer) {
		this.onOffer = onOffer;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public int getId() {
		return id;
	}
	
}
