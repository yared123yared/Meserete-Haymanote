package com.example.meserete_haymanote3;

import android.app.Person;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class database_class implements entry_to_app {
    private String LOG;
    DatabaseReference databaseReference;

    //ArrayList<List>yared=new ArrayList<>();
    public void get_fire_base_data() {
        databaseReference = FirebaseDatabase.getInstance().getReference("User Information");
        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                String value=dataSnapshot.getValue(person.class).toString();
//                Log.d(LOG,"value is"+ value
                Iterator<DataSnapshot> items = dataSnapshot.getChildren().iterator();
                System.out.println("heyyyy" + dataSnapshot.getChildrenCount());
                //entries.clear();
                while (items.hasNext()) {
                    initiate_user.clear();
                    //List<String>temp = new ArrayList<>();
                    DataSnapshot item = items.next();
                    String u_name = item.child("u_name").getValue().toString();
                    System.out.println("thise is the user nam" + u_name);
                    String pass = item.child("password").getValue().toString();
                    System.out.println(" thise is the password" + pass);

                    initiate_user.add(u_name);
                    System.out.println(" thise is the second user name" + u_name);
                    System.out.println(" this is the second password " + pass);
                    System.out.println(" thise is the temp " + initiate_user);
                    initiate_user.add(pass);
                    register_user.add(initiate_user);
                    //initiate_user.clear();
                    //temp.clear();
                    System.out.println("thise is the first  " + register_user);

                }



                System.out.println("done");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.w(LOG, "Failed to read value", databaseError.toException());
                System.out.println("conectionnnnnnnnnnnnnnnnnnnn havb been canceledddddddddddd");

            }
        });
    }


    public boolean user_profile(ArrayList user_profile) {
        get_fire_base_data();
       // final ArrayList<String> entries = new ArrayList<>();


        System.out.println("thise is the seconddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd  " + register_user);
        System.out.println("thise is the user profileeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" + user_profile);
        if (register_user.contains(user_profile)) {
            return true;

        } else {
            return false;

        }
    }
}
