package com.myprojects.myapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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

    @OnClick(R.id.button_spotify_streamer)
    void clickSpotifyStreamer(){
        Util.showToast(getBaseContext(), R.string.toast_message_on_clicked, Util.getString(getBaseContext(),R.string.button_name_spotify_streamer));
    }

    @OnClick(R.id.button_scores_app)
    void clickScoresApp(){
        Util.showToast(getBaseContext(), R.string.toast_message_on_clicked, Util.getString(getBaseContext(),R.string.button_name_scores_app));
    }

    @OnClick(R.id.button_library_app)
    void clickLibraryApp(){
        Util.showToast(getBaseContext(),R.string.toast_message_on_clicked,Util.getString(getBaseContext(),R.string.button_name_library_app));
    }

    @OnClick(R.id.button_build_it_bigger)
    void clickBuildItBigger(){
        Util.showToast(getBaseContext(),R.string.toast_message_on_clicked,Util.getString(getBaseContext(),R.string.button_name_build_it_bigger));
    }

    @OnClick(R.id.button_xyz_reader)
    void clickXyzReader(){
        Util.showToast(getBaseContext(),R.string.toast_message_on_clicked,Util.getString(getBaseContext(),R.string.button_name_xyz_reader));
    }

    @OnClick(R.id.button_capstone)
    void clickCapstone(){
        Util.showToast(getBaseContext(),R.string.toast_message_on_clicked,Util.getString(getBaseContext(),R.string.button_name_capstone));
    }

}
