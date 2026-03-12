//package com.example.travel;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder> {
//
//    String[] titles;
//    int[] images;
//
//    public PlaceAdapter(String[] titles, int[] images) {
//        this.titles = titles;
//        this.images = images;
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_place, parent, false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.title.setText(titles[position]);
//        holder.image.setImageResource(images[position]);
//    }
//
//    @Override
//    public int getItemCount() {
//        return titles.length;
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//        ImageView image;
//        TextView title;
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            image = itemView.findViewById(R.id.placeimage);
//            title = itemView.findViewById(R.id.placetext);
//        }
//    }
//}
package com.example.travel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder> {

    String[] titles;
    int[] mainImages;
    int[] extraImages;

    public PlaceAdapter(String[] titles, int[] mainImages, int[] extraImages) {
        this.titles = titles;
        this.mainImages = mainImages;
        this.extraImages = extraImages;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_place, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(titles[position]);
        holder.mainImage.setImageResource(mainImages[position]);
        holder.extraImage.setImageResource(extraImages[position]); // one extra image per page
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView mainImage, extraImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.placeTitle);
            mainImage = itemView.findViewById(R.id.placeImage);
            extraImage = itemView.findViewById(R.id.extraImage);
        }
    }
}