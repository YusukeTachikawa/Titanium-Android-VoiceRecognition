package org.mumumu.ti.android.speech;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;

@Kroll.module(name="Voicerecognition", id="org.mumumu.ti.android.speech")
public class VoicerecognitionModule extends KrollModule
{

    // Standard Debugging variables
    private static final String LCAT = "VoicerecognitionModule";

    // You can define constants with @Kroll.constant, for example:
    // @Kroll.constant public static final String EXTERNAL_NAME = value;
    
    public VoicerecognitionModule()
    {
        super();
    }

    @Kroll.onAppCreate
    public static void onAppCreate(TiApplication app)
    {
        Log.d(LCAT, "inside onAppCreate");
        // put module init code that needs to run when the application is created
    }

    // Methods
    @Kroll.method
    public String example()
    {
        Log.d(LCAT, "example called");
        return "hello world";
    }
    
    // Properties
    @Kroll.getProperty
    public String getExampleProp()
    {
        Log.d(LCAT, "get example property");
        return "hello world";
    }
    
    
    @Kroll.setProperty
    public void setExampleProp(String value) {
        Log.d(LCAT, "set example property: " + value);
    }
}