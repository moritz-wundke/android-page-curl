package com.mystictreegames.pagecurl;

import com.mystictreegames.pagecurl.R;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

/**
 * This example demostrates the use of the view as a standalone view that has been created within
 * a layout.
 * 
 * @author Moritz 'Moss' Wundke (b.thax.dcg@gmail.com)
 *
 */
public class StandaloneExample extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	this.setContentView(R.layout.standalone_example);
    }
    
    @Override
    public void onDestroy(){
    	super.onDestroy();
    	System.gc();
    	finish();
    }
    
    /**
	 * Set the current orientation to landscape. This will prevent the OS from changing
	 * the app's orientation.
	 */
	public void lockOrientationLandscape() {
		lockOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
	}
	
	/**
	 * Set the current orientation to portrait. This will prevent the OS from changing
	 * the app's orientation.
	 */
	public void lockOrientationPortrait() {
		lockOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	}
	
	/**
	 * Locks the orientation to a specific type.  Possible values are:
	 * <ul>
	 * <li>{@link ActivityInfo#SCREEN_ORIENTATION_BEHIND}</li>
	 * <li>{@link ActivityInfo#SCREEN_ORIENTATION_LANDSCAPE}</li>
	 * <li>{@link ActivityInfo#SCREEN_ORIENTATION_NOSENSOR}</li>
	 * <li>{@link ActivityInfo#SCREEN_ORIENTATION_PORTRAIT}</li>
	 * <li>{@link ActivityInfo#SCREEN_ORIENTATION_SENSOR}</li>
	 * <li>{@link ActivityInfo#SCREEN_ORIENTATION_UNSPECIFIED}</li>
	 * <li>{@link ActivityInfo#SCREEN_ORIENTATION_USER}</li>
	 * </ul>
	 * @param orientation
	 */
	public void lockOrientation( int orientation ) {
		setRequestedOrientation(orientation);
	}
}
