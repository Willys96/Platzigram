package com.platziwillycode.platzigram.view;

import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.platziwillycode.platzigram.R;
import com.platziwillycode.platzigram.view.fragment.HomeFragment;
import com.platziwillycode.platzigram.view.fragment.ProfileFragment;
import com.platziwillycode.platzigram.view.fragment.SearchFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabReselectListener;
import com.roughike.bottombar.OnTabSelectListener;

public class ContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        BottomBar bottombar=(BottomBar) findViewById(R.id.bottombar);
        bottombar.setDefaultTab(R.id.home);

        bottombar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId){
                    case R.id.home:

                        HomeFragment homefragment= new HomeFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homefragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit()
                        ;

                        break;

                    case R.id.profile:

                        ProfileFragment profilefragment= new ProfileFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,profilefragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit()
                        ;

                        break;

                    case R.id.search:

                        SearchFragment searchfragment= new SearchFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,searchfragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit()
                        ;

                        break;
                }
            }
        });
    }
}
