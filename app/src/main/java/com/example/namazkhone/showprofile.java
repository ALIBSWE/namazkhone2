package com.example.namazkhone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class showprofile extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showprofile);

        TextView name=findViewById(R.id.txt11);
        TextView famili=findViewById(R.id.txt22);
        TextView age=findViewById(R.id.txt33);
        Button btn11=findViewById(R.id.btn11);


        Intent getdata=getIntent();
        name.setText(getdata.getExtras().getString("name"));
        famili.setText(getdata.getExtras().getString("famili"));
        age.setText(getdata.getExtras().getString("age"));


        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next1=new Intent(showprofile.this, mainList.class);
                startActivity(next1);


            }
        });

    }
}
