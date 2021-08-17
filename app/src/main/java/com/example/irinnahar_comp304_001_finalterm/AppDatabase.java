package com.example.irinnahar_comp304_001_finalterm;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {JobInfo.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract AppDao appDao();
}
