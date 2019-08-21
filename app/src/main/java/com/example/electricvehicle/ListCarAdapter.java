package com.example.electricvehicle;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.electricvehicle.types.BYD;
import com.example.electricvehicle.types.Bolt;
import com.example.electricvehicle.types.CZero;
import com.example.electricvehicle.types.Etron;
import com.example.electricvehicle.types.F500e;
import com.example.electricvehicle.types.Fit;
import com.example.electricvehicle.types.Focus;
import com.example.electricvehicle.types.I3;
import com.example.electricvehicle.types.ModelX;
import com.example.electricvehicle.types.Zinoro;

import java.util.ArrayList;

public class ListCarAdapter extends RecyclerView.Adapter<ListCarAdapter.ListViewHolder> {
    private ArrayList<Car> listCar;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListCarAdapter(ArrayList<Car> list) {
        this.listCar = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_car, viewGroup, false);
        return new ListViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Car car = listCar.get(position);

        Glide.with(holder.itemView.getContext())
                .load(car.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);

        holder.tvName.setText(car.getName());
        holder.tvDetail.setText(car.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                onItemClickCallback.onItemClicked(listCar.get(holder.getAdapterPosition()));
                final Intent intent;
                switch (holder.getAdapterPosition()){
                    case 0:
                        intent = new Intent(holder.context, Etron.class);
                        holder.context.startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(holder.context, I3.class);
                        holder.context.startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(holder.context, Zinoro.class);
                        holder.context.startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(holder.context, BYD.class);
                        holder.context.startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(holder.context, Bolt.class);
                        holder.context.startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(holder.context, CZero.class);
                        holder.context.startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(holder.context, F500e.class);
                        holder.context.startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(holder.context, Focus.class);
                        holder.context.startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(holder.context, Fit.class);
                        holder.context.startActivity(intent);
                        break;
                    case 9:
                        intent = new Intent(holder.context, ModelX.class);
                        holder.context.startActivity(intent);
                        break;
                }
            }
        });
    }
    @Override
    public int getItemCount() {
        return listCar.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        private final Context context;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }

    public interface OnItemClickListener {
        void onItemClick(Car item);
    }

    public interface OnItemClickCallback {
        void onItemClicked(Car data);
    }
}
