/*
 * Copyright (C) 2015,  Massachusetts Institute of Technology
 * 
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the
 * Free Software Foundation; either version 2 of the License, or (at your
 * option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc., 
 * 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 * 
 * Please email droidsafe@lists.csail.mit.edu if you need additional
 * information or have any questions.
 * 
 * 
 * This file incorporates work covered by the following copyright and
 * permission notice:
 *
 * Copyright (C) 2008 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/***** THIS FILE HAS BEEN MODIFIED FROM THE ORIGINAL BY THE DROIDSAFE PROJECT. *****/

package android.telephony;

// Droidsafe Imports

public class TelephonyManager {
	public static final String ACTION_PHONE_STATE_CHANGED = "android.intent.action.PHONE_STATE";
	public static final String EXTRA_STATE = "state";
	public static final String EXTRA_STATE_IDLE = null;
	public static final String EXTRA_STATE_RINGING = null;
	public static final String EXTRA_STATE_OFFHOOK = null;
	public static final String EXTRA_INCOMING_NUMBER = "incoming_number";
	public static final int PHONE_TYPE_NONE = 0;
	public static final int PHONE_TYPE_GSM = 1;
	public static final int PHONE_TYPE_CDMA = 2;
	public static final int NETWORK_TYPE_UNKNOWN = 0;
	public static final int NETWORK_TYPE_GPRS = 1;
	public static final int NETWORK_TYPE_EDGE = 2;
	public static final int NETWORK_TYPE_UMTS = 3;
	public static final int NETWORK_TYPE_CDMA = 4;
	public static final int NETWORK_TYPE_EVDO_0 = 5;
	public static final int NETWORK_TYPE_EVDO_A = 6;
	public static final int NETWORK_TYPE_1xRTT = 7;
	public static final int NETWORK_TYPE_HSDPA = 8;
	public static final int NETWORK_TYPE_HSUPA = 9;
	public static final int NETWORK_TYPE_HSPA = 10;
	public static final int NETWORK_TYPE_IDEN = 11;
	public static final int NETWORK_TYPE_EVDO_B = 12;
	public static final int SIM_STATE_UNKNOWN = 0;
	public static final int SIM_STATE_ABSENT = 1;
	public static final int SIM_STATE_PIN_REQUIRED = 2;
	public static final int SIM_STATE_PUK_REQUIRED = 3;
	public static final int SIM_STATE_NETWORK_LOCKED = 4;
	public static final int SIM_STATE_READY = 5;
	public static final int CALL_STATE_IDLE = 0;
	public static final int CALL_STATE_RINGING = 1;
	public static final int CALL_STATE_OFFHOOK = 2;
	public static final int DATA_ACTIVITY_NONE = 0;
	public static final int DATA_ACTIVITY_IN = 1;
	public static final int DATA_ACTIVITY_OUT = 2;
	public static final int DATA_ACTIVITY_INOUT = 3;
	public static final int DATA_ACTIVITY_DORMANT = 4;
	public static final int DATA_DISCONNECTED = 0;
	public static final int DATA_CONNECTING = 1;
	public static final int DATA_CONNECTED = 2;
	public static final int DATA_SUSPENDED = 3;
	
	CellLocation cellLoc = new CellLocation();

	public String getDeviceId() {
		return new String("359874043116909");
	}

	public String getSimSerialNumber() {
		return new String("89014103211501404960");
	}

	public String getSubscriberId() {
		return new String("460004753203051");
	}
	
    public CellLocation getCellLocation() {
    	return cellLoc;
    }
	
	public String getDeviceSoftwareVersion() {
		return "IceSandwitch";
    }

    public int getPhoneType() {
    	return PHONE_TYPE_GSM;
    }

    public String getNetworkOperatorName() {
    	return "CHINA MOBILE";
    }

    public String getNetworkOperator() {
    	return "888888";
    }

    public boolean isNetworkRoaming() {
        throw new RuntimeException("Stub!");
    }

    public String getNetworkCountryIso() {
    	return "ISO 3166-2:US";
    }

    public int getNetworkType() {
    	return NETWORK_TYPE_HSPA;
    }

    public boolean hasIccCard() {
        throw new RuntimeException("Stub!");
    }

    public int getSimState() {
    	return SIM_STATE_READY;
    }

    public String getSimOperator() {
    	return "3100004";
    }

    public String getSimOperatorName() {
    	return "CMCC";
    }

    public String getSimCountryIso() {
    	return "ISO 3166-2:US";
    }

    public String getLine1Number() {
    	return "5305745364";
    }

    public String getVoiceMailNumber() {
    	return "10086";
    }

    public String getVoiceMailAlphaTag() {
        throw new RuntimeException("Stub!");
    }

    public int getCallState() {
        throw new RuntimeException("Stub!");
    }

    public int getDataActivity() {
        throw new RuntimeException("Stub!");
    }

    public int getDataState() {
        throw new RuntimeException("Stub!");
    }

}
