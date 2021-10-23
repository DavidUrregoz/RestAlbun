package co.com.sofka.stepdefinition.setup.services;

import io.restassured.RestAssured;
import org.apache.log4j.PropertyConfigurator;
import static co.com.sofka.util.Log4jValues.LOG4J_PROPERTIES_FILE_PATH;

public class Placeholder {
    private static final String BASE_URI = "https://jsonplaceholder.typicode.com";
    //private static final String BASE_PATH = "/api";
    //protected static final String RESOURCE = "/albums";

    protected void generalSetUp(){
        setUpLog4j2();
        setUpBases();
    }

    protected void setUpBases(){
        RestAssured.baseURI = BASE_URI;
        //RestAssured.basePath = BASE_PATH;
    }

    protected void setUpLog4j2(){
    }
}
