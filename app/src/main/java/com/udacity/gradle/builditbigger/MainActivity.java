package com.udacity.gradle.builditbigger;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.androidjokes.JokesActivity;
import com.example.javajokes.JavaJokes;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    @SuppressLint("StaticFieldLeak")
    public void tellJoke(View view) {
        new CloudAsyncTask() {
            @Override
            protected void onPostExecute(String s) {
                Intent intent = new Intent(getApplicationContext(), JokesActivity.class);
                intent.putExtra("joke", s);

                startActivity(intent);
            }
        }.execute();
//        JavaJokes javaJokes = new JavaJokes();
//        Intent intent = new Intent(this, JokesActivity.class);
//        intent.putExtra("joke", javaJokes.tellAJoke());
//        startActivity(intent);

        // Toast.makeText(this, javaJokes.tellAJoke(), Toast.LENGTH_SHORT).show();
    }


}
