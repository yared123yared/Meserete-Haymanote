package com.example.meserete_haymanote3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.meserete_haymanote3.medebegna_course_home.courses_Title;

public class medebegna_course extends AppCompatActivity {
    public static String key;
    private Button read;
    private Button Listen;
    private TextView title;
    private ImageView display;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medebegna_course);
        read = findViewById(R.id.read);
        Listen = findViewById(R.id.listen);
        title = findViewById(R.id.title);
        display = findViewById(R.id.Image_backgound);
        Listen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonclicked(v);
            }
        });
        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonclicked(v);
            }
        });
        Intent intent = getIntent();
        String value = intent.getStringExtra(key);
        int iteration_key = Integer.parseInt(value);
        title.setText(medebegna_course_home.courses_Title[iteration_key]);
        display.setImageResource(medebegna_course_home.images[iteration_key]);
//
//      switch (iteration_key){
//          case 0:
//              // do yehaymanote tmherete
//              title.setText(medebegna_course_home.courses_Title[iteration_key]);
//              display.setImageResource(medebegna_course_home.images[iteration_key]);
//
//              break;
//          case 1:
//              // do serate betekerstian
//              title.setText(medebegna_course_home.courses_Title[iteration_key]);
//              display.setImageResource(medebegna_course_home.images[iteration_key]);
//
//              break;
//          case 2:
//              // do ymesehafe keduse tenate
//              title.setText(medebegna_course_home.courses_Title[iteration_key]);
//              display.setImageResource(medebegna_course_home.images[iteration_key]);
//
//              break;
//          case 3:
//              //do yebetekrestian tarike
//              title.setText(medebegna_course_home.courses_Title[iteration_key]);
//              display.setImageResource(medebegna_course_home.images[iteration_key]);
//
//
//              break;
//          case 4:
//              // do senefetret
//              title.setText(medebegna_course_home.courses_Title[iteration_key]);
//              display.setImageResource(medebegna_course_home.images[iteration_key]);
//
//              break;
//
//
//      }
//        //int value=Integer.parseInt(intent.getStringExtra(key));
//        //Toast.makeText(this, key, Toast.LENGTH_SHORT).show();
//    }
    }
    private void buttonclicked(View view) {
        Intent intent3=getIntent();
        String value3=intent3.getStringExtra(key);


        switch (view.getId()){
            case R.id.read:
                Intent intent=new Intent(this,pdf_viwer.class);
                intent.putExtra(pdf_viwer.key,value3);
                Toast.makeText(this, value3, Toast.LENGTH_SHORT).show();
                startActivity(intent);

                break;
            case R.id.listen:
                // do listen here
                Intent intent1=new Intent(this,pdf_viwer.class);
                intent1.putExtra(pdf_viwer.key,key);
                Toast.makeText(this, key, Toast.LENGTH_SHORT).show();
                startActivity(intent1);
                break;
        }
    }

}
