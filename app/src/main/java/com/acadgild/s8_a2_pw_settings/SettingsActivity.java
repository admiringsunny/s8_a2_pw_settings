package com.acadgild.s8_a2_pw_settings;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by sunny on 10/2/16.
 */
public class SettingsActivity extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.settings);
    }
}
