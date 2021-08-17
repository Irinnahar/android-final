package com.example.irinnahar_comp304_001_finalterm;

import java.util.List;

public class DataProvider {
    private AppDatabase appDatabase;

    public DataProvider(AppDatabase appDatabase) {
        this.appDatabase = appDatabase;
    }

    public List<JobInfo> getJobInformation() {
        List<JobInfo> jobInfos = appDatabase.appDao().getJobInfo();
        if (jobInfos == null || jobInfos.size() == 0) {

            JobInfo jobInfo = new JobInfo("1001", "Developer","Amazon",43.64344110398808, -79.38318174664629, "125K");
            appDatabase.appDao().addJobInfo(jobInfo);

            jobInfo = new JobInfo("1002","Business Analyst", "Google", 43.4544934567389,-80.49914808660397,  "140K"  );
            appDatabase.appDao().addJobInfo(jobInfo);

            jobInfo = new JobInfo("1003", "Solution Designer", "IBM",43.8514336376069,-79.3386178639796, "160K");
            appDatabase.appDao().addJobInfo(jobInfo);

            jobInfos = appDatabase.appDao().getJobInfo();
        }

        return jobInfos;
    }

}
