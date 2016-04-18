package com.lance.demoapp;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class DemoActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo);
    }

   public void launchOtherActivity(View view){
   	Intent intent = new Intent(this, OtherActivity.class);
	startActivity(intent);
   }
}
