package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txtName=findViewById(R.id.txtName);
        TextView txtComment=findViewById(R.id.txtGia);
        TextView txtGia=findViewById(R.id.txtGia);
        ImageView btn_img=findViewById(R.id.btn_img);
        Item_entity item_entity=(Item_entity) getIntent().getSerializableExtra("band");
        txtName.setText(item_entity.getName());
        txtComment.setText(item_entity.getComment());
        txtGia.setText(Double.toString(item_entity.getGia()));
        btn_img.setImageResource(item_entity.getImg());

    }
}