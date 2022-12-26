package com.univlittoral.philippe;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.univlittoral.philippe.enums.TypeEnum;

@SpringBootApplication
public class PhilippePApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhilippePApplication.class, args);
		Map<TypeEnum,String> mapgenre= new HashMap<>();
		mapgenre.put(TypeEnum.ROMAN, "1");
		mapgenre.put(TypeEnum.MANGA, "2");
		mapgenre.put(TypeEnum.NOUVELLE, "3");
		mapgenre.put(TypeEnum.BD, "4");
		mapgenre.put(TypeEnum.POESIE, "5");
	}

}
