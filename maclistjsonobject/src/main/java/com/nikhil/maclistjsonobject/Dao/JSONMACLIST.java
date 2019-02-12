package com.nikhil.maclistjsonobject.Dao;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


import org.json.JSONObject;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class JSONMACLIST {
    public static final String JSON_FILE2="Mac_List.txt";

    public final JSONObject MacAdd() {
        JsonObject jsonObject=null;

        try {
            InputStream fis = new FileInputStream(JSON_FILE2);

            //create JsonReader object
            //JsonReader
            JsonReader jsonReader = Json.createReader(fis);

            /**
             * We can create JsonReader from Factory also
             JsonReaderFactory factory = Json.createReaderFactory(null);
             jsonReader = factory.createReader(fis);
             */

            //get JsonObject from JsonReader
            jsonObject = jsonReader.readObject();

            jsonReader.close();
            fis.close();
            System.out.println(jsonObject.toString());//jsonObject

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return (JSONObject) jsonObject;




    }

}
