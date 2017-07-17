package com.example.android.walktracker.data;

import android.provider.BaseColumns;

/**
 * Created by PnoD on 7/17/2017.
 */

public final class WalkContract {

    private WalkContract() {}


    //An empty private constructor makes sure that the class is not going to be initialised.
    public static final class WalkEntry implements BaseColumns {

        public final static String TABLE_NAME = "walk";

        public final static String COLUMN_WALK_PARK ="park";

        public final static String COLUMN_WALK_BEACH = "beach";

        public final static String COLUMN_WALK_MOUNTAIN = "mountain";

        public final static String COLUMN_WALK_KM = "km";}
}