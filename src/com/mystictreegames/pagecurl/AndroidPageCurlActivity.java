package com.mystictreegames.pagecurl;

import com.mystictreegames.pagecurl.R;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

/**
 * Android page curl is just a view that simulates a 2D page curl effect using the android canvas.
 * This makes is usable for quite all android versions and eliminates the need for OpenGL in this case.
 * <p>
 * For more information about the project visit the projects site: http://code.google.com/p/android-page-curl/
 * 
 * @author Moritz 'Moss' Wundke (b.thax.dcg@gmail.com)
 *
 */
public class AndroidPageCurlActivity extends Activity implements OnClickListener  {

	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	
    	/*
    	// Run as full-screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);  
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,   
                                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        /**/
    	this.setContentView(R.layout.main);
    	
    	Button standaloneExample = (Button)findViewById(R.id.standaloneExample_btn);
    	standaloneExample.setOnClickListener(this);
    	
    	Button listExample = (Button)findViewById(R.id.listExample_btn);
    	listExample.setOnClickListener(this);
    }
    
    @Override
    public void onDestroy(){
    	super.onDestroy();
    	System.gc();
    	finish();
    }

	@Override
	public void onClick(View v) {
		Intent intent = null;
		switch( v.getId() ) {
		case R.id.standaloneExample_btn:
			intent = new Intent(this, StandaloneExample.class);
			break;
		case R.id.listExample_btn:
			intent = new Intent(this, ListExample.class);
			break;
		default:
			Toast toast = Toast.makeText(this, "Do I missed the button you clicked?", Toast.LENGTH_LONG);
			toast.show();
			break;
		}
		
		// Open example
		if (intent != null) {
			intent.setAction(intent.ACTION_VIEW);
	        startActivity(intent);
		}
	}
}