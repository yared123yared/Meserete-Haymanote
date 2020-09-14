package com.example.meserete_haymanote3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

//import com.bumptech.glide.Glide;

public class medebegnaRecyclerViewAdapter extends RecyclerView.Adapter<medebegnaRecyclerViewAdapter.ViewHolder>{
    private static final String Tag="medebegnaRecyclerViewAdapter";
    private ArrayList<Integer> mImagenames=new ArrayList<>();
    private ArrayList<Integer> mImages=new ArrayList<>();
    private ArrayList<Integer> mdescription=new ArrayList<>();
    private Context context;



    public medebegnaRecyclerViewAdapter(Context context, ArrayList<Integer> mImagenames, ArrayList<Integer> mImages, ArrayList<Integer> mdescription) {
        this.mImagenames = mImagenames;
        this.mImages = mImages;
        this.mdescription = mdescription;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.medebegna_view,viewGroup,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        // Retrieve the data for that position
        Integer mCurrent = mImagenames.get(i);
        Toast.makeText(context, mCurrent, Toast.LENGTH_LONG).show();
        System.out.println(mCurrent);


//        Glide.with(context)
//                .asBitmap()
//                .load(mImages)
//                .into(viewHolder.imageView);
        viewHolder.imageView.setImageResource(mImages.get(i));
        viewHolder.title.setText(mCurrent);
        viewHolder.description.setText(mdescription.get(i));
        viewHolder.relativeLayout.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int key;
            Toast.makeText(context, mImagenames.get(i), Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(v.getContext(),medebegna_course.class);
            String value= String.valueOf(i);
            intent.putExtra(medebegna_course.key,value);
            context.startActivity(intent);

        }
    });

    }


    @Override
    public int getItemCount() {

        return mImagenames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
LinearLayout relativeLayout;
       TextView title;
        CircleImageView imageView;
        TextView description;
        @SuppressLint("WrongViewCast")
        public ViewHolder(@NonNull View itemView ) {
            super(itemView);

            imageView = (CircleImageView) itemView.findViewById(R.id.image_view);

            title =(TextView) itemView.findViewById(R.id.mtitle);
            relativeLayout =(LinearLayout) itemView.findViewById(R.id.relative_view);
            description=(TextView) itemView.findViewById(R.id.description);
        }


    }

    }


