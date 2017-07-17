package com.example.android.walktracker.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by PnoD on 7/17/2017.
 */
public class WalkDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "shelter.db";
    private static final int DATABASE_VERSION = 1;

    public WalkDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_WALK_TABLE =  "CREATE TABLE " + WalkContract.WalkEntry.TABLE_NAME + " ("
                + WalkContract.WalkEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + WalkContract.WalkEntry.COLUMN_WALK_PARK + " TEXT NOT NULL, "
                + WalkContract.WalkEntry.COLUMN_WALK_BEACH + " TEXT NOT NULL, "
                + WalkContract.WalkEntry.COLUMN_WALK_MOUNTAIN + " TEXT NOT NULL, "
                + WalkContract.WalkEntry.COLUMN_WALK_KM + " INTEGER NOT NULL DEFAULT 1);";

        db.execSQL(SQL_CREATE_WALK_TABLE);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int o, int n) {
    }
}