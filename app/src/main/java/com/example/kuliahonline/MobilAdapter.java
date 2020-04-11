package com.example.kuliahonline;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MobilAdapter extends RecyclerView.Adapter<MobilAdapter.MobilViewHolder> {

        private ArrayList<Mobil> dataList;

        public MobilAdapter(ArrayList<Mobil> dataList) {
            this.dataList = dataList;
        }

        @Override
        public MobilViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View view = layoutInflater.inflate(R.layout.list_item, parent, false);
            return new MobilViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MobilViewHolder holder, int position) {
            holder.txtNama.setText(dataList.get(position).getNama());
            holder.txtMerek.setText(dataList.get(position).getMerek());
            holder.txtNodk.setText(dataList.get(position).getNodk());
        }

        @Override
        public int getItemCount() {
            return (dataList != null) ? dataList.size() : 0;
        }

        public class MobilViewHolder extends RecyclerView.ViewHolder{
            private TextView txtNama, txtMerek, txtNodk;

            public MobilViewHolder(View itemView) {
                super(itemView);
                txtNama = (TextView) itemView.findViewById(R.id.txt_nama_mobil);
                txtMerek = (TextView) itemView.findViewById(R.id.txt_merek_mobil);
                txtNodk = (TextView) itemView.findViewById(R.id.txt_nodk_mobil);
            }
        }
}
