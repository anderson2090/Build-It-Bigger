package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {
    @Test
    public void testTask() throws Exception {
        CloudAsyncTask cloudAsyncTask = new CloudAsyncTask();
        cloudAsyncTask.execute();
        Thread.sleep(5000);
        Assert.assertTrue(cloudAsyncTask.get().length() > 0);
    }
}
