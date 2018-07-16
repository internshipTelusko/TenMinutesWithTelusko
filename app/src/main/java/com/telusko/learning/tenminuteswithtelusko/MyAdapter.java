package com.telusko.learning.tenminuteswithtelusko;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mohanmmohadikar on 7/6/18.
 */



public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


    private List<Data> qlist;
    private Context ctx;

    public MyAdapter(List<Data> qlist, Context ctx) {
        this.qlist = qlist;
        this.ctx = ctx;
    }


    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list, parent, false);

        return  new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        Data currentItem = qlist.get(position);

        holder.tv1.setText(currentItem.getQue());
        holder.rb1.setText(currentItem.getOp1());
        holder.rb2.setText(currentItem.getOp2());
        holder.rb3.setText(currentItem.getOp3());
        holder.rb4.setText(currentItem.getOp4());


    }

    @Override
    public int getItemCount() {
        return qlist.size();
    }



    public class ViewHolder extends  RecyclerView.ViewHolder{


        public  TextView tv1;
        public RadioButton rb1,rb2,rb3,rb4;

        public ViewHolder(View itemView) {
            super(itemView);

            tv1 = (TextView)itemView.findViewById(R.id.tv1);
            rb1 = (RadioButton)itemView.findViewById(R.id.rb1);
            rb2 = (RadioButton)itemView.findViewById(R.id.rb2);
            rb3 = (RadioButton)itemView.findViewById(R.id.rb3);
            rb4 = (RadioButton)itemView.findViewById(R.id.rb4);

        }
    }


}
