package com.example.irinnahar_comp304_001_finalterm;

import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface AppDao {
    @Insert
    public  void  addJobInfo(JobInfo jobInfo);

    @Query("select * from jobInfo")
    public List<JobInfo> getJobInfo();


}
