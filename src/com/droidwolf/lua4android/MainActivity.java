package com.droidwolf.lua4android;

import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LuaState L = LuaStateFactory.newLuaState();
        L.openLibs();
        L.LdoString("text = 'Hello Android, I am Lua.'");
        L.getGlobal("text");
        String text = L.toString(-1);
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText(text);
        setContentView(tv);
    }
    
}
