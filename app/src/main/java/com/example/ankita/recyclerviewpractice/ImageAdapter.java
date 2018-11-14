package com.example.ankita.recyclerviewpractice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {

    public static final String KEY_IMAGE = "image";

    private List<ImageList>imageLists;
    private Context context;
    private Object Intent;

    public ImageAdapter(List<ImageList> imageLists, Context applicationContext) {

        this.imageLists = imageLists;
        this.context = context;
    }

    @NonNull
    @Override
    public ImageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.imagecontainer, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder( ViewHolder holder,final int position) {

        final ImageList imageList = imageLists.get(position);
        Picasso.get().load(imageList.getFormat()).into(holder.my_images);



    }

    @Override
    public int getItemCount() {
        return imageLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public LinearLayout linearLayout;
        public ImageView my_images;

        public ViewHolder( View itemView) {
            super(itemView);

            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayout);
            my_images = (ImageView)itemView.findViewById(R.id.imageView);
        }
    }
}
