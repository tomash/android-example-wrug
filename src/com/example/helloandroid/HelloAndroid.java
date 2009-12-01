package com.example.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class HelloAndroid extends Activity {
    /** Called when the activity is first created. */
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Spinner shape_chooser = (Spinner) findViewById(R.id.spinner_wat);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(
        		this, R.array.shapes, android.R.layout.simple_spinner_item);
	    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	    shape_chooser.setAdapter(adapter);
	    
    }
}