package com.example.medical_note;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.ColumnInfo;

import com.example.medical_note.dataBase.Measurement;

import java.util.List;

public class MeasurementListAdapter extends RecyclerView.Adapter<MeasurementListAdapter.MyViewHolder> {

    private Context context;
    private List<Measurement> measurementsList;
    public MeasurementListAdapter(Context context ){
        this.context = context;
    }

    public void setMeasurementsList(List<Measurement> measurementsList){
        this.measurementsList = measurementsList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.id.recycler_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MeasurementListAdapter.MyViewHolder holder, int position) {
        holder.tvSistal.setText(this.measurementsList.get(position).sistal);
        holder.tvSistal.setText(this.measurementsList.get(position).diostal);
        holder.tvSistal.setText(this.measurementsList.get(position).pulse);
    }

    @Override
    public int getItemCount() {
        return this.measurementsList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvSistal;
        TextView tvDiostal;
        TextView tvPulse;

        public MyViewHolder(View view) {
            super(view);
            tvSistal = view.findViewById(R.id.tvSistal);
            tvDiostal = view.findViewById(R.id.tvDiostal);
            tvPulse = view.findViewById(R.id.tvPulse);
        }
    }
}
