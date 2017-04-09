package com.example.test.google_search;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.app.SearchManager;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private EditText editTextInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextInput = (EditText) findViewById(R.id.editTextInput);
    }
        public void onSearchClick(View v)
        {
            try {
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                String term = editTextInput.getText().toString();
                intent.putExtra(SearchManager.QUERY, term);
                startActivity(intent);
            } catch (Exception e) {
                // TODO: handle exception


        }
    }
}
