package com.chengkai.myfirstapp;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	
	public void sendMessage(View view){
		System.out.println("sendMessage"+view);
		Intent intent = new Intent(this,DisplayMessageActivity.class);
		EditText editText = (EditText)findViewById(R.id.edit_message);
		String inputText = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, inputText);
		startActivity(intent);
		
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        System.out.println("android version "+Build.VERSION.SDK_INT+", mini version :"+Build.VERSION_CODES.HONEYCOMB);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
    	switch (item.getItemId()) {
	        case R.id.action_search:
	            openSearch();
	            return true;
	        case R.id.action_settings:
	            openSettings();
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
    }
    
    public void openSearch(){
    	System.out.println("openSearch");
    	
    }
    
    public void openSettings(){
    	System.out.println("openSetting");
    	
    }
    
    @Override
    protected void onStart() {
    	// TODO Auto-generated method stub
    	super.onStart();
    	System.out.println("onStart");
    }
    
    @Override
    protected void onResume() {
    	// TODO Auto-generated method stub
    	super.onResume();
    	System.out.println("onResume");
    }
    
    @Override
    protected void onPause() {
    	// TODO Auto-generated method stub
    	super.onPause();
    	System.out.println("onPause");
    }
    
    @Override
    protected void onStop() {
    	// TODO Auto-generated method stub
    	super.onStop();
    	System.out.println("onStop");
    }
    
    @Override
    protected void onRestart() {
    	// TODO Auto-generated method stub
    	super.onRestart();
    	System.out.println("onRestart");
    }
    
    @Override
    protected void onDestroy() {
    	// TODO Auto-generated method stub
    	super.onDestroy();
    	System.out.println("onDestroy");
    }
    
}
