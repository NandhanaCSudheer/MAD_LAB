package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
develop an application to purchase 5  items  from a grocery shop Select item name from Spinner and input customer
name ,phone number,quantity and price for each items separately use shared preference to pass details to another
page print the total bill in next page perform input validation on code. that is one edit text for custmer name,another for phone number .after that item1(apple)
set spinner to select item 1. then item2(orange) set spinner for item2 etc... to item5(mango) set spinner for item5 each item must contain
corresponding quantity and price per one item.