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
    }

    public JsonObject getList(){
       MacAddressList macjsonlist=new MacAddressList(this.context);
       return macjsonlist.getList();
    }

}
