package com.student.calvin.milestone5;

import android.content.Intent;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;

    public TabLayout tabLayout;

    public ImageButton addContactButton;

    public Button sortButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        mViewPager = findViewById(R.id.container);

        setupViewPager(mViewPager);

        tabLayout = findViewById(R.id.tabLayout);

        tabLayout.setupWithViewPager(mViewPager);

        addContactButton = findViewById(R.id.addContact);

        addContactButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                final View view = v;

                PopupMenu popupMenu = new PopupMenu(MainActivity.this, addContactButton);

                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        Intent intent;

                        switch(item.getItemId()) {

                            case R.id.personalMenuItem:

                                intent = new Intent(view.getContext(), AddPersonal.class);

                                startActivity(intent);

                                return true;

                            case R.id.businessMenuItem:

                                intent = new Intent(view.getContext(), AddBusiness.class);

                                startActivity(intent);

                                return true;

                            default:

                                return false;

                        }

                    }

                });

                popupMenu.show();

            }

        });

        sortButton = findViewById(R.id.sortButton);

        sortButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                final View view = v;

                PopupMenu popupMenu = new PopupMenu(MainActivity.this, sortButton);

                popupMenu.getMenuInflater().inflate(R.menu.sort_menu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        Intent intent;

                        switch(item.getItemId()) {

                            case R.id.aToZSort:

                                sortButton.setText("A - Z");

                                return true;

                            case R.id.zToASort:

                                sortButton.setText("Z - A");

                                return true;

                            default:

                                return false;

                        }

                    }

                });

                popupMenu.show();

            }

        });

    }

    private void setupViewPager(ViewPager viewPager) {

        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());

        adapter.addFragment(new PersonalFragment(), "Personal");

        adapter.addFragment(new BusinessFragment(), "Business");

        viewPager.setAdapter(adapter);

    }

}
