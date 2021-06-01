package com.example.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "role")
public class Role1 {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Set<USER> getUsers() {
//		return users;
//	}
//
//	public void setUsers(Set<USER> users) {
//		this.users = users;
//	}
//
//
    
}
