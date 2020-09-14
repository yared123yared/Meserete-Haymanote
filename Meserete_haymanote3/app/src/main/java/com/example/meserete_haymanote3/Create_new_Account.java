package com.example.meserete_haymanote3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Create_new_Account extends AppCompatActivity {
    DatabaseReference databaseReference;
    DatabaseReference databaseReference1;
    EditText ful_name;
    EditText u_name;
    EditText Age;
    EditText Password;
    EditText Repassword;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new__account);
        FirebaseApp.initializeApp(this);
        databaseReference= FirebaseDatabase.getInstance().getReference("User Information");
        databaseReference1=FirebaseDatabase.getInstance().getReference("User Education Level");
        ful_name=findViewById(R.id.full_name);
        u_name=findViewById(R.id.user_name);
        Age=findViewById(R.id.Age);
        Password=findViewById(R.id.password);
        Repassword=findViewById(R.id.Re_password);
        submit=findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonclicked();
            }
        });

    }

    private void buttonclicked() {
        String user_name=u_name.getText().toString();
        String name=ful_name.getText().toString();
        String pass=Password.getText().toString();
        String repass=Repassword.getText().toString();
        String age=Age.getText().toString();
        String id=databaseReference.push().getKey();
        person p=new person(name,user_name,pass,age);
        databaseReference.child(id).setValue(p);
       person d=new person(user_name,"0","0");
       databaseReference1.child(id).setValue(d);



    }
}
