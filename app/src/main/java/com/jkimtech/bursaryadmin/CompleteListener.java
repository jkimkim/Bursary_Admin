package com.jkimtech.bursaryadmin;

import java.util.List;

public interface CompleteListener {
    default void onComplete(String downLoadUrl){

    }

    default void onUploadFetched(List<Upload> uploads){

    }

    default void onUserDataFetched(List<User> users){

    }

    default void onGenderGroup(int maleCount, int femaleCount,int others){

    }
}
