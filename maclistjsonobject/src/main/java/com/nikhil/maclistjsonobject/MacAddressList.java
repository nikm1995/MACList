package com.nikhil.maclistjsonobject;

import android.content.Context;

import org.json.JSONObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class MacAddressList {
    private final String javaFile="Mac_List.txt";
    private Context context;
    private JsonObject list;
    public MacAddressList(Context context){
    this.context=context;
    list=null;
    }

    public JsonObject getList() {
        try {

            InputStream Is=context.getAssets().open(javaFile);
            JsonReader jsonReader= Json.createReader(Is);
            list= jsonReader.readObject();
            jsonReader.close();
            Is.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return list;
    }
}
