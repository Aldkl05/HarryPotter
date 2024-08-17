package edu.learn.harrypotter.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import edu.learn.harrypotter.models.House;
import edu.learn.harrypotterapp.R;

public class HouseAdapter extends ArrayAdapter<House> {

Activity context;
ArrayList<House> houseList;
    public HouseAdapter(@NonNull Activity context, ArrayList<House> houseList) {
        super(context, R.layout.house_item);
        this.context = context;
        this.houseList = houseList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater inflater = context.getLayoutInflater();

        View view = inflater.inflate( R.layout.house_item, null,true);

        House house = houseList.get(position);

        ImageView imageView = view.findViewById(R.id.house_image);
        TextView houseName = view.findViewById(R.id.house_name);


        imageView.setImageResource(house.getImage());
        houseName.setText(house.getName());


        return view;
    }
}


