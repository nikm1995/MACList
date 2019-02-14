import android.content.Context;

import org.json.JSONObject;

import javax.json.JsonObject;

public class ListJson {

private MACJSONLIST m;
    private Context context;
    public ListJson(MACJSONLIST m) {
        this.m = m;
    }
    public ListJson(Context context){
        this.context=context;
    }

    public JSONObject getList(){
        MACJSONLIST macjsonlist=new MACJSONLIST(this.context);
       return macjsonlist.getList();
    }

}
