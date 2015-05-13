package com.example.jack.myapplication2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Button yesButton,NoButton;
    private EditText userNameEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yesButton = (Button)findViewById(R.id.yes_button);
        NoButton = (Button)findViewById(R.id.no_button);
        userNameEditText = (EditText)findViewById(R.id.user_name_edit_text);
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

    public void OnClickYesButton(View view) {

        String username =String.valueOf(userNameEditText.getText());
        String yourYesResponse = "you are great " + username;
        /**
         *Toast.LENGTH_SHORT  How long to display the message.
         */
        Toast.makeText(this,yourYesResponse,Toast.LENGTH_SHORT).show();
    }

    public void OnClickNoBuyyon(View view) {
        String username =String.valueOf(userNameEditText.getText());
        String yourNoResponse = "you are bad " + username;
        Toast.makeText(this,yourNoResponse,Toast.LENGTH_SHORT).show();
    }
}
