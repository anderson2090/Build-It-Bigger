package com.udacity.gradle.builditbigger;


import android.content.Context;
import android.os.AsyncTask;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;

import java.io.IOException;

class CloudAsyncTask extends AsyncTask<Void, Void, String> {
   // Please do not run this app on Genymotion emulator's free version
    private static MyApi myApiService = null;
    private Context context;

    @Override
    protected String doInBackground(Void... voids) {

        if (myApiService == null) {
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)

                    .setRootUrl("http://10.0.2.2:8080/_ah/api/")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                            abstractGoogleClientRequest.setDisableGZipContent(true);
                        }
                    });


            myApiService = builder.build();
        }




        try {
            return myApiService.sayHi().execute().getData();
        } catch (IOException e) {
            return e.getMessage();
        }
    }


}


