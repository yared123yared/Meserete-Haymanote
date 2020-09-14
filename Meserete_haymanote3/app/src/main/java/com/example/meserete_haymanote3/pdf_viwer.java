package com.example.meserete_haymanote3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class pdf_viwer extends AppCompatActivity {
    private TextView Title;
    private TextView mread;
    public static String key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viwer);
        Title=findViewById(R.id.title_new);
        mread=findViewById(R.id.read);
        Intent intent=getIntent();
        String val=intent.getStringExtra(key);
        int value=Integer.parseInt(val);
        Title.setText(medebegna_course_home.courses_Title[value]);
        mread.setText(medebegna_course_home.courses_pdf[value]);
//        switch (value){
//            case 0:
//                // do tmherete haymanote
//                Title.setText(medebegna_course_home.courses_Title[value]);
//
//
//                break;
//            case 1:
//                // do serate betekerstian
//                break;
//            case 2:
//                //do yemesehafe kedeuse tenate
//                break;
//            case 3:
//                //do yebetekerstian tarike
//                break;
//            case 4:
//                // do senefetret
//        }

    }
}
