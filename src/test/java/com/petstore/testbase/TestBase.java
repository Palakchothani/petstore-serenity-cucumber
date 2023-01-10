package com.petstore.testbase;

import com.petstore.utils.PropertyReader;

public class TestBase
{
    public static PropertyReader propertyReader;


    public static void init() {
        propertyReader = PropertyReader.getInstance();
       // RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        // RestAssured.port = Integer.parseInt(propertyReader.getProperty("port"));
        // RestAssured.basePath = Path.USERS;
    }

}
