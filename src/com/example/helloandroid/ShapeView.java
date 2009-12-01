package com.example.helloandroid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class ShapeView extends View {
	private Paint whitePaint;
	private String shape_name;
	
	public ShapeView(Context context, String shape_to_draw) {
		super(context);
		shape_name = shape_to_draw;
		
        whitePaint = new Paint();
        whitePaint.setColor(Color.WHITE);    
	}
	
	
	public void onDraw(Canvas canvas) {
		//get the widget size
		int width = canvas.getWidth();
		int height = canvas.getHeight();
		
		if(shape_name.equals("Circle")) {
			canvas.drawCircle(
			  (float)0.5*width, 
			  (float)0.5*height, 
			  (float)0.3*height, 
			  whitePaint);
		}
			
		if(shape_name.equals("Rectangle")) {
			canvas.drawRect(
				(float)0.25*width, 
				(float)0.25*height, 
				(float)0.75*width, 
				(float)0.75*height, 
				whitePaint);
		}
		
		if(shape_name.equals("Line")) {
			canvas.drawLine(
					(float)0.25*width, 
					(float)0.25*height, 
					(float)0.75*width, 
					(float)0.75*height, 
					whitePaint);
		}
		super.onDraw(canvas);
		//invalidate();
	}
	
	
}