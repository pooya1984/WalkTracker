package com.example.android.walktracker.data;

import android.provider.BaseColumns;

/**
 * Created by PnoD on 7/17/2017.
 */

public final class WalkContract {

    private WalkContract() {}

    public static final class WalkEntry implements BaseColumns {

        public final static String TABLE_NAME = "walk";


        public final static String _ID = BaseColumns._ID;

        public final static String COLUMN_WALK_PARK ="park";

        public final static String COLUMN_WALK_BEACH = "beach";

        public final static String COLUMN_WALK_MOUNTAIN = "mountain";


        public final static String COLUMN_WALK_KM = "km";

    }

}