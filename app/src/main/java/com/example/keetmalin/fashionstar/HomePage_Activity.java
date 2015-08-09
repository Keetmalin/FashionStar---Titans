package com.example.keetmalin.fashionstar;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

//this application will provide a news feed similar to Facebook
//may be we can integrate Facebook with our needed criterias

public class HomePage_Activity extends ActionBarActivity {

    //button for my model and go shopping
    Button btnMyModel,btnGoShopping;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_);

        //initialize button MyModel
        btnMyModel = (Button) findViewById(R.id.btnMyModel);
        //initialize for go Shopping menu
        btnGoShopping = (Button) findViewById(R.id.btnGoShopping);

        //listener for btnMymodel
        btnMyModel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (HomePage_Activity.this,EnterDimensions_Activity.class);
                startActivity(intent);
            }
        });
        //set listener for btnGoShopping
        btnGoShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (HomePage_Activity.this,ShoppingMenu_Activity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_page_, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
