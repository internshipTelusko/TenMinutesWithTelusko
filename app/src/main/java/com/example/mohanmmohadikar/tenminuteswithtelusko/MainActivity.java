package com.example.mohanmmohadikar.tenminuteswithtelusko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tv2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        tv2 = (TextView)findViewById(R.id.tv2);


        tv2.setOnClickListener(view -> {


            Intent i = new Intent(MainActivity.this, Course.class);
            startActivity(i);


        });


    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);



        getMenuInflater().inflate(R.menu.main_menu, menu);

        return  true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);


        if(item.getItemId() == R.id.i3){

            sendToStart();



        }

        return true;
    }

    private void sendToStart() {

        Intent i = new Intent(MainActivity.this, Start.class);
        startActivity(i);

    }
}