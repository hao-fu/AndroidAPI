package android.location;

import android.location.GpsSatellite;

public final class GpsStatus {
    public static final int GPS_EVENT_STARTED = 1;
    public static final int GPS_EVENT_STOPPED = 2;
    public static final int GPS_EVENT_FIRST_FIX = 3;
    public static final int GPS_EVENT_SATELLITE_STATUS = 4;

    GpsStatus() {
        throw new RuntimeException("Stub!");
    }

    public int getTimeToFirstFix() {
        throw new RuntimeException("Stub!");
    }

    public Iterable<GpsSatellite> getSatellites() {
        throw new RuntimeException("Stub!");
    }

    public int getMaxSatellites() {
        throw new RuntimeException("Stub!");
    }

    public interface NmeaListener {
        void onNmeaReceived(long var1, String var3);
    }

    public interface Listener {
        void onGpsStatusChanged(int var1);
    }
}