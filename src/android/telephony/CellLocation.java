package android.telephony;

public class CellLocation {
	public CellLocation() {
    }

    public static void requestLocationUpdate() {
        throw new RuntimeException("Stub!");
    }

    public static CellLocation getEmpty() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStateInvalid() {
        throw new RuntimeException("Stub!");
    }

    public void setLacAndCid(int lac, int cid) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLac() {
    	return 95616;
    }

    public int getCid() {
    	// IA valid CID ranges from 0 to 65535 (216-1) on GSM
    	return 10010;
    }

    public int getPsc() {
    	return 10086;
    }

}
