package com.demo.dto;


	import java.io.Serial;
	import java.io.Serializable;

	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	import jakarta.persistence.UniqueConstraint;

	@Entity
	@Table(name = "sample", uniqueConstraints = 
		    @UniqueConstraint(columnNames = "id"))
		    
		    public class Sample implements Serializable {

			@Serial
			private static final long serialVersionUID = -1798070786993154676L;


			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			@Column(name = "id")
			private Integer id;

			@Column(name = "name")
			private String name;

			@Column(name = "location")
			private String location;

			public Integer getId() {
				return id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getLocation() {
				return location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public static long getSerialversionuid() {
				return serialVersionUID;
			}
			
	}