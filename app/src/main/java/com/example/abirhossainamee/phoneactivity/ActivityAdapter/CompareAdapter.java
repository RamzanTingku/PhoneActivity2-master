package com.example.abirhossainamee.phoneactivity.ActivityAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.abirhossainamee.phoneactivity.ModelClass.InfoClass;
import com.example.abirhossainamee.phoneactivity.R;

import java.util.ArrayList;

/**
 * Created by RamzanUllah on 09-May-17.
 */


public class CompareAdapter extends RecyclerView.Adapter<ViewHolder>{

    public Context context;
    public ArrayList<InfoClass>infolist;

    public CompareAdapter(Context context, ArrayList<InfoClass> infolist) {
        this.context =context;
        this.infolist = infolist;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.singlelist_compare,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        InfoClass infoclass = infolist.get(position);
        holder.mtv_periodName.setText(infoclass.getPeriodName());
        holder.mtv_unlockTime.setText(infoclass.getUnlockedTime());
        holder.mtv_fbUseTime.setText(infoclass.getSocialTime());
        holder.mtv_dataUsage.setText(infoclass.getDataPack());

    }

    @Override
    public int getItemCount() {
        return infolist.size();
    }
}


class ViewHolder extends RecyclerView.ViewHolder {

    public TextView mtv_periodName, mtv_unlockTime, mtv_fbUseTime, mtv_dataUsage;

    public ViewHolder(View itemView) {
        super(itemView);

        mtv_periodName = (TextView)itemView.findViewById(R.id.txtView_periodName);
        mtv_unlockTime = (TextView)itemView.findViewById(R.id.txtView_unlocked);
        mtv_fbUseTime = (TextView)itemView.findViewById(R.id.txtView_fbUse);
        mtv_dataUsage = (TextView)itemView.findViewById(R.id.txtView_data_usage);

    }
}