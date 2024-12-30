package com.parseFhir.parsingFhirJson.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.parseFhir.parsingFhirJson.model.PersonModel;

public class ParsingService {
	
	
	/*
	 * {
		  "id": 101,
		  "name": "John Doe",
		  "age": 30,
		  "isEmployee": true,
		  "contact": {
		    "email": "johndoe@example.com",
		    "phone": "123-456-7890"
		  },
		  "skills": ["Java", "Python", "SQL"]
		}
	 */
	/*
	 * in this code we are using Model(POJO) classes to parsing the JSON.
	 * this code written for beginner who can wants to know how to do PARSING by making model.
	 * this is the very simple way to learn and implement their knowledge . 
	 */
	public static void main(String[] args) {

		String json = "{\n" + "  \"id\": 101,\n" + "  \"name\": \"John Doe\",\n" + "  \"age\": 30,\n"
				+ "  \"isEmployee\": true,\n" + "  \"contact\": {\n" + "    \"email\": \"johndoe@example.com\",\n"
				+ "    \"phone\": \"123-456-7890\"\n" + "  },\n" + "  \"skills\": [\"Java\", \"Python\", \"SQL\"]\n"
				+ "}\n" + "";

		ObjectMapper objectMapper = new ObjectMapper();
		try {
			PersonModel personModel = objectMapper.readValue(json, PersonModel.class);
			System.out.println("id : " + personModel.getId());
			System.out.println("name : " + personModel.getName());
			System.out.println("age : " + personModel.getAge());
			System.out
					.println("contact : " + personModel.getContact().getEmail() + personModel.getContact().getPhone());
			System.out.println("skills : " + personModel.getSkills());
			System.out.println("====================");
			for (String skill : personModel.getSkills()) {
				System.out.println("skills : " + skill);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
