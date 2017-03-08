//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package android.net;

public class NetworkInfo  {
    public NetworkInfo() {
    }

    public int getType() {
    	return 1;
    }

    public int getSubtype() {
        throw new RuntimeException("Stub!");
    }

    public String getTypeName() {
    	// Return a human-readable name describe the type of the network, for example "WIFI" or "MOBILE". 
    	return "WIFI";
    }

    public String getSubtypeName() {
        throw new RuntimeException("Stub!");
    }

    public boolean isConnectedOrConnecting() {
    	return true;
    }

    public boolean isConnected() {
    	return true;
    }

    public boolean isAvailable() {
    	return true;
    }

    public boolean isFailover() {
        throw new RuntimeException("Stub!");
    }

    public boolean isRoaming() {
        throw new RuntimeException("Stub!");
    }

    public NetworkInfo.State getState() {
        throw new RuntimeException("Stub!");
    }

    public NetworkInfo.DetailedState getDetailedState() {
        throw new RuntimeException("Stub!");
    }

    public String getReason() {
        throw new RuntimeException("Stub!");
    }

    public String getExtraInfo() {
    	// Report the extra information about the network state, if any was provided by the lower networking layers. 
    	return "";
    }

    public int describeContents() {
        throw new RuntimeException("Stub!");
    }


    public static enum DetailedState {
        AUTHENTICATING,
        BLOCKED,
        CAPTIVE_PORTAL_CHECK,
        CONNECTED,
        CONNECTING,
        DISCONNECTED,
        DISCONNECTING,
        FAILED,
        IDLE,
        OBTAINING_IPADDR,
        SCANNING,
        SUSPENDED,
        VERIFYING_POOR_LINK;

        private DetailedState() {
        }
    }

    public static enum State {
        CONNECTED,
        CONNECTING,
        DISCONNECTED,
        DISCONNECTING,
        SUSPENDED,
        UNKNOWN;

        private State() {
        }
    }
}
