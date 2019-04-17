package com.student.calvin.milestone5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddBusiness extends AppCompatActivity {

    public Button save;

    public Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add_business);

        save = findViewById(R.id.save);

        cancel = findViewById(R.id.cancel);

        save.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {



            }

        });

        cancel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), MainActivity.class);

                startActivity(intent);

            }

        });


    }

}
