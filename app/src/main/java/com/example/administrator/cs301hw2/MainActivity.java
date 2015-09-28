package com.example.administrator.cs301hw2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;


/* https://www.youtube.com/watch?v=SaXYFHYGLj4 */

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Button addPlayer;
    Button addTeam;
    Button playButton;

    EditText playerName;
    EditText playerNum;
    EditText playerGoals;
    EditText playerAssists;
    EditText playerPen;
    EditText playerPos;
    EditText teamName;
    EditText teamWins;
    EditText teamLoss;
    EditText teamDraw;

    TextView teamSet;
    TextView numSet;
    TextView goalSet;
    TextView assistsSet;
    TextView penSet;
    TextView posSet;
    TextView winSet;
    TextView lossSet;
    TextView drawSet;
    TextView winStatSet;
    TextView teamWinStat;
    TextView lossStatSet;
    TextView TeamLossStat;
    TextView drawStatSet;
    TextView TeamDrawStat;

    ImageView playerPic;

    Spinner teamSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupPlayButton();

    }

    private void setupPlayButton() {

        playButton = (Button) findViewById(R.id.playButton);
        playButton.setOnClickListener(this);

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

    @Override
    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, SecondaryActivity.class));
    }

}
