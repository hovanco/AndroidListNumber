package com.example.androidlistnumber;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewNumbers;
    int[] arrayNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewNumbers = findViewById(R.id.Recycler_Number);
        recyclerViewNumbers.setLayoutManager(new LinearLayoutManager(this));

        arrayNumber = new int[100];
        for (int i = 0; i < arrayNumber.length; i++){
            arrayNumber[i] = i;
        }
        NumberAdapter numberAdapter = new NumberAdapter();
        numberAdapter.arrayNumber = arrayNumber;
        recyclerViewNumbers.setAdapter(numberAdapter);

    }
}
