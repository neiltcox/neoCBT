package com.tinassist.neocbt.neocbt;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.tinassist.neocbt.neocbt.surveys.PostSurvey1;
import com.tinassist.neocbt.neocbt.surveys.PostSurvey2;
import com.tinassist.neocbt.neocbt.surveys.PreSurvey1;
import com.tinassist.neocbt.neocbt.surveys.PreSurvey2;
import com.tinassist.neocbt.neocbt.week1.W1P1;
import com.tinassist.neocbt.neocbt.week2.W2P1;
import com.tinassist.neocbt.neocbt.week3.W3P1;
import com.tinassist.neocbt.neocbt.week4.W4P0;
import com.tinassist.neocbt.neocbt.week5.W5P0;
import com.tinassist.neocbt.neocbt.week6.W6P0;
import com.tinassist.neocbt.neocbt.week7.W7P0;
import com.tinassist.neocbt.neocbt.week8.W8P1;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        onNavigationItemSelected(navigationView.getMenu().getItem(0));

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
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Fragment fragment = null;
        if (id == R.id.nav_week1) {
            fragment = new W1P1();
        } else if (id == R.id.nav_week2) {
            fragment = new W2P1();
        } else if (id == R.id.nav_week3) {
            fragment = new W3P1();
        } else if (id == R.id.nav_week4) {
            fragment = new W4P0();
        } else if (id == R.id.nav_week5) {
            fragment = new W5P0();
        } else if (id == R.id.nav_week6) {
            fragment = new W6P0();
        } else if (id == R.id.nav_week7) {
            fragment = new W7P0();
        } else if (id == R.id.nav_week8) {
            fragment = new W8P1();
        } else if (id == R.id.home) {
            fragment = new Home();
        } else if (id == R.id.pre_survey1) {
            fragment = new PreSurvey1();
        } else if (id == R.id.pre_survey2) {
            fragment = new PreSurvey2();
        } else if (id == R.id.post_survey1) {
            fragment = new PostSurvey1();
        } else if (id == R.id.post_survey2) {
            fragment = new PostSurvey2();
        }

        /*if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit();
        }*/

        if (fragment != null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frame_container, fragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void scheduleNotification(Notification notification, int delay) {
        Intent notificationIntent = new Intent(this, NotificationPublisher.class);
        notificationIntent.putExtra(NotificationPublisher.NOTIFICATION_ID, 1);
        notificationIntent.putExtra(NotificationPublisher.NOTIFICATION, notification);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        long futureInMillis = SystemClock.elapsedRealtime() + delay;
        AlarmManager alarmManager = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, SystemClock.elapsedRealtime(),
                60000, pendingIntent);
        //alarmManager.set(AlarmManager.RTC_WAKEUP, futureInMillis, pendingIntent);
    }

    public Notification getNotification() {

        Notification.Builder builder = new Notification.Builder(this);
        builder.setContentTitle("Meditation Time!");
        builder.setContentText("It's time for a new mindful breathing exercise!");
        builder.setSmallIcon(R.drawable.ear1);
        builder.setColor(0x4b966e);
        return builder.build();
    }

    //public void original_notification () {
      //  NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
        //mBuilder.setSmallIcon(R.drawable.logo1);
        //mBuilder.setContentTitle("Notification Alert, Click me!");
        //mBuilder.setContentText("Hi, This is Android Notification Detail!");

        //NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        //mNotificationManager.notify(1, mBuilder.build());
    //}
}
