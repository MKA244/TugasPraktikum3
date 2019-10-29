package com.example.tugaspraktikum3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class HewanAdapter extends RecyclerView.Adapter<HewanAdapter.HewanViewHolder> {

    private ArrayList<Hewan> dataList;
    private int[] images;

    public HewanAdapter(ArrayList<Hewan> dataList, int[] images) {
        this.images = images;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public HewanAdapter.HewanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_hewan, parent, false);
        return new HewanViewHolder(view);
    }

    public void onBindViewHolder(HewanViewHolder holder, int position) {
        int image_id = images[position];
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtJenis.setText(dataList.get(position).getJenis());
        holder.txtPemakan.setText(dataList.get(position).getPemakan());
        holder.imgHewan.setImageResource(image_id);
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class HewanViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtJenis, txtPemakan;
        private ImageView imgHewan;

        public HewanViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_hewan);
            txtJenis = (TextView) itemView.findViewById(R.id.txt_jenis);
            txtPemakan = (TextView) itemView.findViewById(R.id.txt_pemakan);
            imgHewan = (ImageView) itemView.findViewById(R.id.img_hewan);
        }
    }
}
