package com.example.jeansmits.navdrawer;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;

/**
 * Created by jeansmits on 17/09/15.
 */
public class VDABApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "wHX0iZnTWEaZruUj8NYlzig68F0ORopwxoHX2blC", "IfFXupvy4eoIjWhkiKRkIzITQaiyyOWkgVasZwpX");
        ParseInstallation.getCurrentInstallation().saveInBackground();



    }
}
