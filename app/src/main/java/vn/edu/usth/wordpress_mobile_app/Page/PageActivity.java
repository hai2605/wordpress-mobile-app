package vn.edu.usth.wordpress_mobile_app.Page;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import vn.edu.usth.wordpress_mobile_app.Post.PostFragmentAdapter;
import vn.edu.usth.wordpress_mobile_app.R;


public class PageActivity extends AppCompatActivity {
    private ImageButton btnback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        ViewPager pager = findViewById(R.id.view_pager);
        pager.setOffscreenPageLimit(4);
        pager.setAdapter(adapter);

        TabLayout tabLayout =findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(pager);
        // back button of page
        btnback = findViewById(R.id.back);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}