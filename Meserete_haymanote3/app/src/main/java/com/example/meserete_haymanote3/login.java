package com.example.meserete_haymanote3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class login extends AppCompatActivity  {

    private EditText muser_name;
    private EditText mpassword;
    private Button mlogin;
    private Button mCreate_new_Account;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        muser_name=findViewById(R.id.user_name);
        mpassword=findViewById(R.id.password);
        mlogin=findViewById(R.id.login);
        mCreate_new_Account=findViewById(R.id.create_account);
        mlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(v);
            }
        });
        mCreate_new_Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(v);
            }
        });
    }

    private void buttonClicked(View view) {
        ArrayList<String>users_info=new ArrayList<>();
        switch (view.getId()){




            case R.id.login:
                String name=muser_name.getText().toString();
                String pass=mpassword.getText().toString();
                users_info.add(name);
                users_info.add(pass);
                database_class database=new database_class();
                Boolean value=database.user_profile(users_info);
                Toast.makeText(this, value.toString(), Toast.LENGTH_SHORT).show();
                if (value == true){
                    //Toast.makeText(this, collection.value_collection.toString(), Toast.LENGTH_SHORT).show();
                    Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(this,main.class);
                    startActivity(intent);




                }else{
                    Toast.makeText(this, "incorredt user_name and password", Toast.LENGTH_SHORT).show();
                }


                //do loginhere
                break;
            case R.id.create_account:
                // do th ecreate account here
                Intent intent= new Intent(this,Create_new_Account.class);
                startActivity(intent);
                break;

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
