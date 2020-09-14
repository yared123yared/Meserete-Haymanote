package com.example.meserete_haymanote3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class main extends AppCompatActivity implements collection {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main1, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.tab);
//        setSupportActionBar(toolbar);
        //Toast.makeText(this, collection.value_collection.toString(), Toast.LENGTH_LONG).show();
        //value_collection.add("1");


        tabLayout=findViewById(R.id.tab);
        viewPager=findViewById(R.id.view_pager);
        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.AddFragment(new home_fragment(),"Home");
        viewPagerAdapter.AddFragment(new yeabnete_tmheret_fragment(),"Yeabnete Tmheret");

        viewPagerAdapter.AddFragment(new medebegna_tmheret_fragment(),"medebegna tmheret");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        //tabLayout.getTabAt(0).setIcon(R.drawable.ic_launcher_background);
    }
    @SuppressLint("ResourceAsColor")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (item.getItemId()){
            case R.id.action_course:
                Toast.makeText(this, "course", Toast.LENGTH_SHORT).show();
                // do course
                collection_val.add("1");
                collection_val_yeabnete.add("1");

                tabLayout=findViewById(R.id.tab);
                tabLayout.setBackgroundColor(R.color.design_default_color_primary_dark);
                viewPager=findViewById(R.id.view_pager);
                viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
                viewPagerAdapter.AddFragment(new home_fragment(),"Home");
                viewPagerAdapter.AddFragment(new yeabnete_tmheret_fragment(),"Yeabnete Tmheret");

                viewPagerAdapter.AddFragment(new medebegna_tmheret_fragment(),"medebegna tmheret");
                viewPager.setAdapter(viewPagerAdapter);
                tabLayout.setupWithViewPager(viewPager);

                break;
            case R.id.action_developer:
                Toast.makeText(this, "developer", Toast.LENGTH_SHORT).show();
                // do developer
                break;
            case R.id.action_exam:
                Toast.makeText(this, "exam", Toast.LENGTH_SHORT).show();
                //do exam
                collection_val.add("2");
                collection_val_yeabnete.add("2");


                tabLayout=findViewById(R.id.tab);
                tabLayout.setBackgroundColor(R.color.colorAccent);
                viewPager=findViewById(R.id.view_pager);
                viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
                viewPagerAdapter.AddFragment(new home_fragment(),"Home");
                viewPagerAdapter.AddFragment(new yeabnete_tmheret_fragment(),"Yeabnete Exam");

                viewPagerAdapter.AddFragment(new medebegna_tmheret_fragment(),"medebegna Exam");
                viewPager.setAdapter(viewPagerAdapter);
                tabLayout.setupWithViewPager(viewPager);
                break;
            case R.id.action_log_out:
                Toast.makeText(this, "log out", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(this,login.class);
                startActivity(intent);
                //do log_out
                    break;
            case R.id.action_about_up:
                Toast.makeText(this, "about app", Toast.LENGTH_SHORT).show();
                // do about_app
                break;
                default:
                    //do default

                    break;







        }
        if (id == R.id.action_course) {
            Toast.makeText(this, "course is touched", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
