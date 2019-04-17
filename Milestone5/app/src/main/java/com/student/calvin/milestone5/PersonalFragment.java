package com.student.calvin.milestone5;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class PersonalFragment extends Fragment {

    public Button[] contact;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.personal_fragment, container, false);

        contact = new Button[1];

        contact[0] = view.findViewById(R.id.nOne);

        contact[0].setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), PersonalContactPage.class);

                startActivity(intent);

            }

        });

        return view;

    }

}
