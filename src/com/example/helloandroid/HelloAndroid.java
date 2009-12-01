package com.example.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.view.View;
import android.view.View.OnClickListener;

public class HelloAndroid extends Activity {
	
	private OnClickListener drawClickedListener = new OnClickListener() {
		public void onClick(View v) {
	       Intent i = new Intent(HelloAndroid.this, ShapeDrawer.class);
	       Bundle bun = new Bundle();
	       Spinner shape_chooser = (Spinner) findViewById(R.id.spinner_wat);
	       bun.putString("shape_to_draw", shape_chooser.getSelectedItem().toString());
	       i.putExtras(bun);
	       startActivity(i);
		}

	};

    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Spinner shape_chooser = (Spinner) findViewById(R.id.spinner_wat);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(
        		this, R.array.shapes, android.R.layout.simple_spinner_item);
	    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	    shape_chooser.setAdapter(adapter);
	    
	    Button histogram_button = (Button) findViewById(R.id.draw_button);
	    histogram_button.setOnClickListener(drawClickedListener);
    }
}