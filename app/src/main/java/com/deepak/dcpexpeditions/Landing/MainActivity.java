package com.deepak.dcpexpeditions.Landing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.deepak.dcpexpeditions.Home.HomeFragment;
import com.deepak.dcpexpeditions.Membership.MembershipFragment;
import com.deepak.dcpexpeditions.More.MoreFragment;
import com.deepak.dcpexpeditions.Notification.NotificationFragment;
import com.deepak.dcpexpeditions.R;
import com.deepak.dcpexpeditions.Store.StoreFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.LabelVisibilityMode;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottom_view;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getSupportActionBar().hide();
        setupNavigationView();



        //context=MainActivity.this;

        //sendRefreshToken();
    }

        private void setupNavigationView() {
            bottom_view = (BottomNavigationView) findViewById(R.id.bottom_view);
            if (bottom_view != null) {

                bottom_view.setItemIconTintList(null);

                // Select first menu item by default and show Fragment accordingly.
                Menu menu = bottom_view.getMenu();
                selectFragment(menu.getItem(0));
                bottom_view.setLabelVisibilityMode(LabelVisibilityMode.LABEL_VISIBILITY_LABELED);

                // Set action to perform when any menu-item is selected.
                bottom_view.setOnNavigationItemSelectedListener(
                        new BottomNavigationView.OnNavigationItemSelectedListener() {
                            @Override
                            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                                selectFragment(item);
                                return true;
                            }
                        });
            }


        }
//
//
//    @Override
//    public void onBackPressed() {
//
//        if (bottomNavigationView.getSelectedItemId() == R.id.home) {
//            super.onBackPressed();
//            //Animatoo.animateZoom(BottomnavigationActivity.this); //fire the slide left animation
//        } else {
//            bottomNavigationView.setSelectedItemId(R.id.home);
//        }
//
//    }


        protected void selectFragment(MenuItem item) {

            item.setChecked(true);

            switch (item.getItemId()) {
                case R.id.action_home:
                    // Action to perform when Home Menu item is selected.
                    pushFragment(new HomeFragment());
                    break;
                case R.id.membership:
                    // Action to perform when Bag Menu item is selected.
                    pushFragment(new MembershipFragment());
                    break;
                case R.id.store:
                    // Action to perform when Account Menu item is selected.
                    pushFragment(new StoreFragment());
                    break;

                case R.id.notification:
                    pushFragment(new NotificationFragment());
                    break;

                case R.id.more:
                    pushFragment(new MoreFragment());
                    break;

            }


        }




        protected void pushFragment(Fragment fragment) {
            if (fragment == null)
                return;

            FragmentTransaction ft=getSupportFragmentManager().beginTransaction();

            if (ft != null) {
                ft.replace(R.id.frm_lay,fragment);
                ft.commit();
            }

        }

    }