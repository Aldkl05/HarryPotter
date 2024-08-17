package edu.learn.harrypotter.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import edu.learn.harrypotter.models.Spell;
import edu.learn.harrypotterapp.R;

public class SpellAdapter extends RecyclerView.Adapter<SpellAdapter.ViewHolder> {

    Activity context;
    ArrayList<Spell> spellList;

    public SpellAdapter(Activity context,
                        ArrayList<Spell> spellList){
        this.context =context;
        this.spellList =spellList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View items = layoutInflater.inflate(R.layout.item_spell,parent,false);

        ViewHolder viewHolder = new ViewHolder(items);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Spell spell = spellList.get(position);
        holder.spellName.setText(spell.getName());
        holder.spellDescription.setText(spell.getDescription());
    }

    @Override
    public int getItemCount() {
        return spellList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView spellName;
        TextView spellDescription;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            spellName = itemView.findViewById(R.id.spell_name);
            spellDescription = itemView.findViewById(R.id.spell_description);

        }
    }



}
