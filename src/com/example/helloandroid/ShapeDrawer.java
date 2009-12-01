package com.example.helloandroid;

import android.app.Activity;
import android.os.Bundle;

public class ShapeDrawer extends Activity {

	private String shape_to_draw;
	
    private ShapeView mShapeView;
    
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);

	    
	    Bundle bun = getIntent().getExtras();
	    shape_to_draw = bun.getString("shape_to_draw");
	    	    
	    mShapeView  = new ShapeView(this, shape_to_draw);
	    setContentView(mShapeView);
	}
}