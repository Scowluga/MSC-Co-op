package com.scowluga.android.msccareershowcase;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.scowluga.android.msccareershowcase.details.PersonalFragment;
import com.scowluga.android.msccareershowcase.details.ResponsibilitiesFragment;
import com.scowluga.android.msccareershowcase.general.AboutFragment;
import com.scowluga.android.msccareershowcase.general.HomeFragment;
import com.scowluga.android.msccareershowcase.general.PurposeFragment;
import com.scowluga.android.msccareershowcase.other.AdditionalFragment;
import com.scowluga.android.msccareershowcase.other.CareerFragment;
import com.scowluga.android.msccareershowcase.other.CourseFragment;
import com.scowluga.android.msccareershowcase.tabattempt.TabAttemptFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static final String TAGFRAGMENT = "TAGFRAGMENT";
    public static Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        // Setting up home page

        toolbar.setTitle("Home");
        Fragment frag = new HomeFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frag_layout, frag, TAGFRAGMENT)
                .addToBackStack(TAGFRAGMENT)
                .commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_sound) {
//
//            // Pause, set as play icon, play, set as pause icon
//
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        Fragment frag;
        String title;
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            frag = HomeFragment.newInstance();
            title = "Home";
        } else if (id == R.id.nav_purpose) {
            frag = PurposeFragment.newInstance();
            title = "Purpose";
        } else if (id == R.id.nav_responsibilities) {
            frag = ResponsibilitiesFragment.newInstance();
            title = "Responsibilities";
        } else if (id == R.id.nav_personal) {
            frag = PersonalFragment.newInstance();
            title = "Personal";
        } else if (id == R.id.nav_course) {
            frag = CourseFragment.newInstance();
            title = "Course";
        } else if (id == R.id.nav_career) {
            frag = CareerFragment.newInstance();
            title = "Career";
        } else if (id == R.id.nav_additional) {
            frag = AdditionalFragment.newInstance();
            title = "Additional ";
        } else {
            frag = BlankFragment.newInstance("MSC Inc.");
            title = "MSC Career Showcase ";
        }

        toolbar.setTitle(title);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frag_layout, frag, TAGFRAGMENT)
                .addToBackStack(TAGFRAGMENT)
                .commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
