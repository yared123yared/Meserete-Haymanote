package com.example.meserete_haymanote3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class medebegna_tmheret_fragment extends Fragment implements collection  {
    private static final String tag="Main_Activity";
    private ArrayList<Integer>titles=new ArrayList<>();
    private ArrayList<Integer>description=new ArrayList<>();
    private ArrayList<Integer>Images_url=new ArrayList<>();
View v;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.medebegna_tmheret, container, false);
        RecyclerView recyclerView=(RecyclerView)  v.findViewById(R.id.RecyclerView);
        medebegnaRecyclerViewAdapter adapter=new medebegnaRecyclerViewAdapter(getContext(),titles,Images_url,description);
        String value=collection_val_yeabnete.get(0);
        collection_val_yeabnete.clear();
        //Toast.makeText(getContext(), "akjdshfkajsgfiuefwbamzvcbuiawkshvdbcoweibc,<zbckyuefbcm<snxc"+value, Toast.LENGTH_SHORT).show();

        switch (value){

            case "1":
                //do yeabnete tmheret
                titles.clear();
                Images_url.clear();
                description.clear();
                initBitmaps();

                //Toast.makeText(getContext(), "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", Toast.LENGTH_SHORT).show();
                break;
            case "2":
                // do yeabnete exam
                titles.clear();
                Images_url.clear();
                description.clear();
                initBitmaps2();
                //Toast.makeText(getContext(), "cccccccccccccccccccccccccccccccccccccccccccccccccccccc", Toast.LENGTH_SHORT).show();
                break;


        }
        //Toast.makeText(getContext(), "yaredddddddddddddddddddddddddddddddd", Toast.LENGTH_LONG).show();

        //initBitmaps2();
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        collection_val_yeabnete.add("1");

        super.onCreate(savedInstanceState);

    }

    private void initBitmaps(){

//        for(int i=0;i<medebegna_course_home.course_detail.length;i++){
//
//            description.add(medebegna_course_home.course_detail[i]);
//        }
//        for(int j=0;j<medebegna_course_home.courses_Title.length;j++){
//            titles.add(medebegna_course_home.courses_Title[j]);
//        }
//        for(int k=0;k<medebegna_course_home.images.length;k++){
//            Images_url.add(medebegna_course_home.images[k]);
//        }
        Images_url.add(R.drawable.backgroud_11);
        titles.add(R.string.Tmherete_Haymanote);
        description.add(R.string.Tmherete_Haymanote_desc);

        Images_url.add(R.drawable.backgroud_12);
        titles.add(R.string.Serate_betekerestian);
        description.add(R.string.Serate_betekerestian_desc);


        Images_url.add(R.drawable.backgroud_9);
        titles.add(R.string.YmeshafeKeduse_tenate);
        description.add(R.string.YmeshafeKeduse_tenate_desc);


        Images_url.add(R.drawable.backgroud_10);
        titles.add(R.string.Ybetekerstian_tarike);
        description.add(R.string.Ybetekerstian_tarike_desc);


        Images_url.add(R.drawable.backgroud_8);
        titles.add(R.string.Sene_Fetret);
        description.add(R.string.Sene_Fetret_desc);





    }
    private void initBitmaps2(){

//        for(int i=0;i<medebegna_course_home.course_detail_ex.length+1;i++){
//
//            description.add(medebegna_course_home.course_detail_ex[i]);
//        }
//        for(int j=0;j<medebegna_course_home.courses_Title_ex.length+1;j++){
//            titles.add(medebegna_course_home.courses_Title_ex[j]);
//        }
//        for(int k=0;k<medebegna_course_home.images_ex.length+1;k++){
//            Images_url.add(medebegna_course_home.images_ex[k]);
//        }


                Images_url.add(R.mipmap.ic_launcher_round);
        titles.add(R.string.Tmherete_Haymanote_ex);
        description.add(R.string.Tmherete_Haymanote_desc_ex);

        Images_url.add(R.drawable.backgroud_12);
        titles.add(R.string.Serate_betekerestian_ex);
        description.add(R.string.Serate_betekerestian_desc_ex);


        Images_url.add(R.drawable.backgroud_9);
        titles.add(R.string.YmeshafeKeduse_tenate_ex);
        description.add(R.string.YmeshafeKeduse_tenate_desc_ex);


        Images_url.add(R.drawable.backgroud_10);
        titles.add(R.string.Ybetekerstian_tarike_ex);
        description.add(R.string.Ybetekerstian_tarike_desc_ex);


        Images_url.add(R.drawable.backgroud_8);
        titles.add(R.string.Sene_Fetret_ex);
        description.add(R.string.Sene_Fetret_desc_ex);



    }

}
