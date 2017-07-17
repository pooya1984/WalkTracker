package com.example.android.walktracker;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.walktracker.data.WalkContract;
import com.example.android.walktracker.data.WalkDbHelper;



public class WalkActivity extends AppCompatActivity {


    private WalkDbHelper mDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walk);

        mDbHelper = new WalkDbHelper(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        insertWalk();
        readAllHabits();
    }

    public Cursor readAllHabits() {
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + WalkContract.WalkEntry.TABLE_NAME, null);
        cursor.close();
        return cursor;
    }

    private void insertWalk() {
        SQLiteDatabase db = mDbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(WalkContract.WalkEntry.COLUMN_WALK_PARK, "Center Park");
        values.put(WalkContract.WalkEntry.COLUMN_WALK_BEACH, "Tegel");
        values.put(WalkContract.WalkEntry.COLUMN_WALK_MOUNTAIN,"Black Wall");
        values.put(WalkContract.WalkEntry.COLUMN_WALK_KM, 2);

        long newRowId = db.insert(WalkContract.WalkEntry.TABLE_NAME, null, values);
    }

}