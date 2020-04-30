package com.jcondori.Servicios;

import com.google.gson.Gson;
import com.jcondori.Models.Model;

public class Object_To_Json {

    public static void main(String[] args) {
        Model model = new Model();
        model.setPersonnumber(123);
        model.setAccountnumber("asdasdasd");

        Gson gson = new Gson();

        String json_data = gson.toJson(model);
        System.out.println(json_data);
    }
}
