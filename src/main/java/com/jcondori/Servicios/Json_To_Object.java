package com.jcondori.Servicios;

import com.google.gson.Gson;
import com.jcondori.Models.Model;

public class Json_To_Object {

    public static void main(String[] args) {

        Gson gson = new Gson();
        String json_data = "{\"personnumber\":31,\"effectivestartdate\":\"2018/03/05\",\"lastname\":\"Miranda\",\"previouslastname\":\"DeLeon\",\"firstname\":\"Ana\",\"middlenames\":\"Sofía\",\"nationalidentifiertype\":\"CUI\",\"nationalidentifiernumber\":\"2658417550101\",\"dateofbirth\":\"1994/12/08\",\"maritalstatus\":\"1\",\"sex\":\"F\",\"ethnicity\":\"4\",\"religion\":\"CH_ROMANCATHOLIC\",\"bloodtype\":\"A+\",\"townofbirth\":\"Guatemala\",\"countryofbirth\":\"GT\",\"regionofbirth\":\"Guatemala\",\"legislationcode\":\"GT\",\"highesteducationlevel\":\"5\",\"addressline1\":\"10Avenida24-47laReformita\",\"addladdressattribute3\":\"Zona12\",\"postalcode\":\"01012\",\"townorcity\":\"Guatemala\",\"country\":\"GT\",\"addresstype\":\"HM\",\"emailaddress\":\"amiranda@unis.edu.gt.test\",\"emailtype\":\"W1\",\"phonenumber\":\"54582924\",\"phonetype\":\"HM\",\"workertype\":\"E\",\"actioncode\":\"HIRE\",\"assignmentcategory\":\"N_A\",\"workercategory\":\"8\",\"hourlysalariedcode\":\"O\",\"gradecode\":\"SECRE001\",\"positioncode\":\"POA148\",\"jobcode\":\"PUA101\",\"locationcode\":\"U001\",\"departmentname\":\"DirecciónAdministrativa\",\"frequency\":\"D\",\"normalhours\":\"8\",\"fullparttime\":\"FULL_TIME\",\"persontypecode\":\"Empleado\",\"bankname\":\"BancoIndustrial\",\"accountnumber\":\"8070004638\",\"salaryamount\":2100,\"externalidentifiernumber\":\"MIR003\",\"externalidentifiertype\":\"SIRVO\"}";

        Model model = gson.fromJson(json_data,Model.class);
        System.out.println(model);
        System.out.println(model.getPostalcode());
        System.out.println(model.getPersonnumber());

    }

}
