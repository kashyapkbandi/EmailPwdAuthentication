package com.example.innovacx.emailpwdauth.Preferences;

import android.content.Context;

/**
 * Created by Innovacx on 12-07-2016.
 */
public class SharedPreferences {
    public static enum Property{

    }
    private static final String SP_NAME = "FDB_SHARED_PREFERENCES";



    public static String getProperty(Context context, Property property){
        return context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE).getString(property.toString(), null);
    }


    public static void setProperties(Context context, Property property, String value){
        context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE).edit().putString(property.toString(), value).apply();
    }


}
