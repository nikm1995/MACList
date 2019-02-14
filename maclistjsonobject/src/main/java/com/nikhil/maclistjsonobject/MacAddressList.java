package com.nikhil.maclistjsonobject;

import android.content.Context;

import org.json.JSONObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.json.Json;
import javax.json.JsonReader;

public class MacAddressList {
    final String javaFile="Mac_List.txt";
    private Context context;
    private JSONObject list;
    public MacAddressList(Context context){
    this.context=context;
    list=null;
    }

    public JSONObject getList() {
        try {
            InputStream Is=new FileInputStream(javaFile);
            JsonReader jsonReader= Json.createReader(Is);
            list= (JSONObject) jsonReader.readObject();
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
