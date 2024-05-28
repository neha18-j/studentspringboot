package com.bca.entity;

import java.util.Optional;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Studententity {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private String name;
private String dep;
private String city;
public static Optional ok(String name2) {
	// TODO Auto-generated method stub
	return null;
}


}

