package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Stabler> {
    List<Personn> listOfPeople;
    public MyAdapter(){
        listOfPeople = new ArrayList<>();
    }

    @Override
    public Stabler onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.indivlist, parent, false);
        return new Stabler(v);
    }

    @Override
    public void onBindViewHolder(Stabler holder, int position) {
        holder.t1.setText(listOfPeople.get(position).getAddress());
        holder.t2.setText(listOfPeople.get(position).getEmail());
        holder.t3.setText(listOfPeople.get(position).getGender());
        holder.t4.setText(listOfPeople.get(position).getId());
        holder.t5.setText(listOfPeople.get(position).getPhone().getMobile());
        holder.t6.setText(listOfPeople.get(position).getPhone().getHome());
        holder.t7.setText(listOfPeople.get(position).getPhone().getOffice());
        holder.t8.setText(listOfPeople.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return listOfPeople.size();
    }


    public class Stabler extends RecyclerView.ViewHolder {
        public TextView t1, t2, t3, t4, t5, t6, t7, t8;

        public Stabler(View itemView) {
            super(itemView);
            t1 = itemView.findViewById(R.id.address);
            t2 = itemView.findViewById(R.id.email);
            t3 = itemView.findViewById(R.id.gender);
            t4 = itemView.findViewById(R.id.id);
            t5 = itemView.findViewById(R.id.mobile);
            t6 = itemView.findViewById(R.id.home);
            t7 = itemView.findViewById(R.id.office);
            t8 = itemView.findViewById(R.id.name);

        }
    }

    public void setData(List<Personn> values){
        listOfPeople.clear();
        listOfPeople.addAll(values);
        notifyDataSetChanged();
    }
}
