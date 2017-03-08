//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package android.os;

public class StatFs {
	
	String path = "";
	
    public StatFs(String path) {
    	this.path = path;
    }

    public void restat(String path) {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public int getBlockSize() {
    	return 99;
    }

    public long getBlockSizeLong() {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public int getBlockCount() {
        throw new RuntimeException("Stub!");
    }

    public long getBlockCountLong() {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public int getFreeBlocks() {
        throw new RuntimeException("Stub!");
    }

    public long getFreeBlocksLong() {
        throw new RuntimeException("Stub!");
    }

    public long getFreeBytes() {
        throw new RuntimeException("Stub!");
    }

    /** @deprecated */
    @Deprecated
    public int getAvailableBlocks() {
    	return 99;
    }

    public long getAvailableBlocksLong() {
        throw new RuntimeException("Stub!");
    }

    public long getAvailableBytes() {
        throw new RuntimeException("Stub!");
    }

    public long getTotalBytes() {
        throw new RuntimeException("Stub!");
    }
}
