package com.etjaal.arabicalmanac;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class AboutActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	Toast.makeText(this, "About Activity", Toast.LENGTH_SHORT).show();
	getActionBar().setDisplayHomeAsUpEnabled(true);
    }
    
    

}