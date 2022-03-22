package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class Item_util extends BaseAdapter {
    Context context;
    ArrayList<Item_entity> item_entities;
    int layout;
    ImageButton btn_add;

    public Item_util(Context context, ArrayList<Item_entity> item_entities, int layout) {
        this.context = context;
        this.item_entities = item_entities;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return item_entities.size();
    }

    @Override
    public Object getItem(int i) {
        return item_entities.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(context).inflate(layout,viewGroup,false);
        btn_add=view.findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,MainActivity2.class);
                intent.putExtra("band", (Serializable) item_entities.get(i));
                context.startActivity(intent);
            }
        });

        TextView txtName=view.findViewById(R.id.txtName);
        TextView txtComment=view.findViewById(R.id.txtGia);
        TextView txtGia=view.findViewById(R.id.txtGia);
        ImageView btn_img=view.findViewById(R.id.btn_img);
        txtName.setText(item_entities.get(i).getName());
        txtComment.setText(item_entities.get(i).getComment());
        txtGia.setText(Double.toString(item_entities.get(i).getGia()));
        btn_img.setImageResource(item_entities.get(i).getImg());


        return view;
    }
}
