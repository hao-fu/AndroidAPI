package android.database;

import java.io.Closeable;

public class Cursor
  implements Closeable
{
  public static final int FIELD_TYPE_NULL = 0;
  public static final int FIELD_TYPE_INTEGER = 1;
  public static final int FIELD_TYPE_FLOAT = 2;
  public static final int FIELD_TYPE_STRING = 3;
  public static final int FIELD_TYPE_BLOB = 4;
  
  public int getCount() {
	return 0;
}
  
  public int getPosition() {
	return 0;
}
  
  public boolean move(int paramInt) {
	return false;
}
  
  public  boolean moveToPosition(int paramInt) {
	return false;
}
  
  public  boolean moveToFirst() {
	return false;
}
  
  public  boolean moveToLast() {
	return false;
}
  
  public  boolean moveToNext() {
	return false;
}
  
  public  boolean moveToPrevious() {
	return false;
}
  
  public  boolean isFirst() {
	return false;
}
  
  public  boolean isLast() {
	return false;
}
  
  public  boolean isBeforeFirst() {
	return false;
}
  
  public  boolean isAfterLast() {
	return false;
}
  
  public  int getColumnIndex(String paramString) {
	return 0;
}
  
  public  int getColumnIndexOrThrow(String paramString)
    throws IllegalArgumentException {
	return 0;
}
  
  public  String getColumnName(int paramInt) {
	return null;
}
  
  public  String[] getColumnNames() {
	return null;
}
  
  public  int getColumnCount() {
	return 0;
}
  
  public  byte[] getBlob(int paramInt) {
	return null;
}
  
  public  String getString(int paramInt) {
	return null;
}
  
  public  short getShort(int paramInt) {
	return 0;
}
  
  public  int getInt(int paramInt) {
	return 0;
}
  
  public  long getLong(int paramInt) {
	return 0;
}
  
  public  float getFloat(int paramInt) {
	return 0;
}
  
  public  double getDouble(int paramInt) {
	return 0;
}
  
  public  int getType(int paramInt) {
	return 0;
}
  
  public  boolean isNull(int paramInt) {
	return false;
}
  
  
  public  void close() {
}
  
  public  boolean isClosed() {
	return false;
}
  

  
  public  boolean getWantsAllOnMoveCalls() {
	return false;
}
  
  //public  Bundle getExtras();
  
  //public  Bundle respond(Bundle paramBundle);
}

/* Location:           C:\Users\hao\Downloads\android-sdk-windows\platforms\android-19\android.jar
 * Qualified Name:     android.database.Cursor
 * Java Class Version: 5 (49.0)
 * JD-Core Version:    0.7.1
 */