package com.example.meserete_haymanote3;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class yeabnete_tmheret_fragment extends Fragment implements collection{
    private static String key;

    private static final String tag="Main_Activity";
    private ArrayList<Integer>titles=new ArrayList<>();
    private ArrayList<Integer>description=new ArrayList<>();
    private ArrayList<Integer>Images_url=new ArrayList<>();
View v;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        v = inflater.inflate(R.layout.yeabnete_tmheret, container, false);
        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.RecyclerView);
        yeabneteRecyclerViewAdapter adapter = new yeabneteRecyclerViewAdapter(getContext(), titles, Images_url, description);
        //yeabneteExamRecyclerViewAdapter adapter1 = new yeabneteExamRecyclerViewAdapter(getContext(), titles, Images_url, description);
        String value=collection_val.get(0);
        collection_val.clear();
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
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return v;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        collection_val.add("2");

        super.onCreate(savedInstanceState);
    //String value=collection_val.get(0);

        //initBitmaps();
    }
    private void initBitmaps2(){
        Images_url.add(R.mipmap.ic_launcher);
        titles.add(R.string.tselote_zewter_ex);
        description.add(R.string.tselote_zewter_desc_ex);
        Images_url.add(R.drawable.backgroud_6);
        titles.add(R.string.yesegno_wudase_ex);
        description.add(R.string.yesegno_wudase_desc_ex);
        Images_url.add(R.drawable.backgroud_7);
        titles.add(R.string.Yemaksegno_wudase_ex);
        description.add(R.string.Yemaksegno_wudase_desc_ex);

        Images_url.add(R.drawable.backgroud_8);
        titles.add(R.string.Yerobe_wudase_ex);

        description.add(R.string.Yerobe_wudase_desc_ex);

        Images_url.add(R.drawable.backgroud_9);
        titles.add(R.string.yehamuse_wudase_ex);
        description.add(R.string.yehamuse_wudase_desc_ex);

        Images_url.add(R.drawable.backgroud_10);
        titles.add(R.string.yearbe_wudase_ex);
        description.add(R.string.yearbe_wudase_desc_ex);
        Images_url.add(R.drawable.backgroud_11);
        titles.add(R.string.Yekedame_wudase_ex);
        description.add(R.string.Yekedame_wudase_desc_ex);
        Images_url.add(R.drawable.backgroud_12);
        titles.add(R.string.Yeehude_wudase_ex);
        description.add(R.string.Yeehude_wudase_desc_ex);
        Images_url.add(R.drawable.backgroud_13);
        titles.add(R.string.Melka_mariam_ex);
        description.add(R.string.Melka_mariam_desc_ex);
        Images_url.add(R.drawable.backgroud_7);
        titles.add(R.string.Melka_Eyesus_ex);
        description.add(R.string.Melka_Eyesus_desc_ex);
        Images_url.add(R.drawable.backgroud_7);
        titles.add(R.string.Melka_Edome_ex);
        description.add(R.string.Melka_Edome_desc_ex);


    }
    private void initBitmaps(){
        Images_url.add(R.drawable.backgroud_6);
        titles.add(R.string.tselote_zewter);
        description.add(R.string.tselote_zewter_desc);
        Images_url.add(R.drawable.backgroud_6);
        titles.add(R.string.yesegno_wudase);
        description.add(R.string.yesegno_wudase_desc);
        Images_url.add(R.drawable.backgroud_7);
        titles.add(R.string.Yemaksegno_wudase);
        description.add(R.string.Yemaksegno_wudase_desc);

        Images_url.add(R.drawable.backgroud_8);
        titles.add(R.string.Yerobe_wudase);

        description.add(R.string.Yerobe_wudase_desc);

        Images_url.add(R.drawable.backgroud_9);
        titles.add(R.string.yehamuse_wudase);
        description.add(R.string.yehamuse_wudase_desc);

        Images_url.add(R.drawable.backgroud_10);
        titles.add(R.string.yearbe_wudase);
        description.add(R.string.yearbe_wudase_desc);
        Images_url.add(R.drawable.backgroud_11);
        titles.add(R.string.Yekedame_wudase);
        description.add(R.string.Yekedame_wudase_desc);
        Images_url.add(R.drawable.backgroud_12);
        titles.add(R.string.Yeehude_wudase);
        description.add(R.string.Yeehude_wudase_desc);
        Images_url.add(R.drawable.backgroud_13);
        titles.add(R.string.Melka_mariam);
        description.add(R.string.Melka_mariam_desc);
        Images_url.add(R.drawable.backgroud_7);
        titles.add(R.string.Melka_Eyesus);
        description.add(R.string.Melka_Eyesus_desc);
        Images_url.add(R.drawable.backgroud_7);
        titles.add(R.string.Melka_Edome);
        description.add(R.string.Melka_Edome_desc);


    }

}
