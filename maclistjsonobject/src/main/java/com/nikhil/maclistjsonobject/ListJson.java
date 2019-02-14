package com.nikhil.maclistjsonobject;

import android.content.Context;

import org.json.JSONObject;

import javax.json.JsonObject;

public class ListJson {

    private MacAddressList list;
    private Context context;
    public ListJson(MacAddressList m) {
        this.list= m;
    }
    public ListJson(Context context){
        this.context=context;
        list=new MacAddressList(this.context);
    }

    public JsonObject getList(){
       return list.getList();
    }

    public boolean getDataCreated(String[] db){
        return list.DataCreated(db);
    }

}
