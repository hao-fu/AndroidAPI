package android.app;

import android.telephony.TelephonyManager;

public class Activity {
	public void setContentView(int view) {
		
	}
	
	public Object getSystemService(String name) {
        if (name.equals("phone")) {
        	return new TelephonyManager();
        }
        
        return null;
    }

}
