package com.parseFhir.parsingFhirJson.service;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParsingJson {
	public static void main(String[] args) {

		/*
		 * THIS IS THE PARSING JSON DATA WITHOUT MAKING ANY MODEL(POJO) CLASS. THIS IS
		 * VERY SMALL CODE FOR BEGGINER WHO WANTS TO LEARN THE PARSING IN VERY SIMPLE
		 * WAY. IN THIS CODE I AM USING FOR LOOP FOR ITERATING SKILLS , YOU CAN LEARN
		 * ITERATION AS WELL FROM THIS CODE.
		 */
		
		
		String json = "{\n" + "  \"id\": 101,\n" + "  \"name\": \"John Doe\",\n" + "  \"age\": 30,\n"
				+ "  \"isEmployee\": true,\n" + "  \"contact\": {\n" + "    \"email\": \"johndoe@example.com\",\n"
				+ "    \"phone\": \"123-456-7890\"\n" + "  },\n" + "  \"skills\": [\"Java\", \"Python\", \"SQL\"]\n"
				+ "}";

		JSONObject jsonObject = new JSONObject(json);
		int id = jsonObject.getInt("id");
		String name = jsonObject.getString("name");
		int age = jsonObject.getInt("age");
		boolean isEmployee = jsonObject.getBoolean("isEmployee");

		JSONObject contact = jsonObject.getJSONObject("contact");
		String email = contact.getString("email");
		String phone = contact.getString("phone");

		JSONArray skills = jsonObject.getJSONArray("skills");

		System.out.println("id : " + id);
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("isEmployee : " + isEmployee);
		System.out.println("email : " + email);
		System.out.println("phone : " + phone);
		System.out.println("skills : " + skills);

		for (int i = 0; i < skills.length(); i++) {
			System.out.println(skills.get(i));
		}

	}
}
