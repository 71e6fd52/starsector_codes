import java.io.Serializable;

public class fsuper implements Serializable {
  private static final int Ø00000 = 624;
  
  private static final int õ00000 = 397;
  
  private static final int Ô00000 = -1727483681;
  
  private static final int Ö00000 = -2147483648;
  
  private static final int OO0000 = 2147483647;
  
  private static final int Ó00000 = -1658038656;
  
  private static final int fnew = -272236544;
  
  private int[] o00000;
  
  private int ffloat;
  
  private int[] ö00000;
  
  private double fclass;
  
  private boolean fnull;
  
  public boolean o00000(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject == null || !(paramObject instanceof fsuper))
      return false; 
    fsuper super1 = (fsuper)paramObject;
    if (this.ffloat != super1.ffloat)
      return false; 
    byte b;
    for (b = 0; b < this.ö00000.length; b++) {
      if (this.ö00000[b] != super1.ö00000[b])
        return false; 
    } 
    for (b = 0; b < this.o00000.length; b++) {
      if (this.o00000[b] != super1.o00000[b])
        return false; 
    } 
    return true;
  }
  
  public fsuper() { this(System.currentTimeMillis()); }
  
  public fsuper(long paramLong) { o00000(paramLong); }
  
  public fsuper(int[] paramArrayOfInt) { o00000(paramArrayOfInt); }
  
  public void o00000(long paramLong) {
    this.fnull = false;
    this.o00000 = new int[624];
    this.ö00000 = new int[2];
    this.ö00000[0] = 0;
    this.ö00000[1] = -1727483681;
    this.o00000[0] = (int)(paramLong & 0xFFFFFFFFFFFFFFFFL);
    this.ffloat = 1;
    while (this.ffloat < 624) {
      this.o00000[this.ffloat] = 1812433253 * (this.o00000[this.ffloat - 1] ^ this.o00000[this.ffloat - 1] >>> 30) + this.ffloat;
      this.o00000[this.ffloat] = this.o00000[this.ffloat] & 0xFFFFFFFF;
      this.ffloat++;
    } 
  }
  
  public void o00000(int[] paramArrayOfInt) {
    if (paramArrayOfInt.length == 0)
      throw new IllegalArgumentException("Array length must be greater than zero"); 
    o00000(19650218L);
    int i = 1;
    int j = 0;
    char c;
    for (c = (624 > paramArrayOfInt.length) ? (char)624 : (char)paramArrayOfInt.length; c != '\000'; c--) {
      this.o00000[i] = (this.o00000[i] ^ (this.o00000[i - 1] ^ this.o00000[i - 1] >>> 30) * 1664525) + paramArrayOfInt[j] + j;
      this.o00000[i] = this.o00000[i] & 0xFFFFFFFF;
      i++;
      j++;
      if (i >= 624) {
        this.o00000[0] = this.o00000[623];
        i = 1;
      } 
      if (j >= paramArrayOfInt.length)
        j = 0; 
    } 
    for (c = 'ɯ'; c != '\000'; c--) {
      this.o00000[i] = (this.o00000[i] ^ (this.o00000[i - 1] ^ this.o00000[i - 1] >>> 30) * 1566083941) - i;
      this.o00000[i] = this.o00000[i] & 0xFFFFFFFF;
      if (++i >= 624) {
        this.o00000[0] = this.o00000[623];
        i = 1;
      } 
    } 
    this.o00000[0] = Integer.MIN_VALUE;
  }
  
  public final int o00000() {
    if (this.ffloat >= 624) {
      int[] arrayOfInt1 = this.o00000;
      int[] arrayOfInt2 = this.ö00000;
      byte b;
      for (b = 0; b < 'ã'; b++) {
        int j = arrayOfInt1[b] & 0x80000000 | arrayOfInt1[b + 1] & 0x7FFFFFFF;
        arrayOfInt1[b] = arrayOfInt1[b + 'ƍ'] ^ j >>> 1 ^ arrayOfInt2[j & 1];
      } 
      while (b < 'ɯ') {
        int j = arrayOfInt1[b] & 0x80000000 | arrayOfInt1[b + 1] & 0x7FFFFFFF;
        arrayOfInt1[b] = arrayOfInt1[b + -227] ^ j >>> 1 ^ arrayOfInt2[j & 1];
        b++;
      } 
      int i = arrayOfInt1[623] & 0x80000000 | arrayOfInt1[0] & 0x7FFFFFFF;
      arrayOfInt1[623] = arrayOfInt1[396] ^ i >>> 1 ^ arrayOfInt2[i & 1];
      this.ffloat = 0;
    } 
    int fnull = this.o00000[this.ffloat++];
    fnull ^= fnull >>> 11;
    fnull ^= fnull << 7 & 0x9D2C5680;
    fnull ^= fnull << 15 & 0xEFC60000;
    return fnull >>> 18;
  }
  
  public final int o00000(int paramInt) {
    int j;
    int i;
    if (paramInt <= 0)
      throw new IllegalArgumentException("n must be > 0"); 
    if ((paramInt & -paramInt) == paramInt) {
      if (this.ffloat >= 624) {
        int[] arrayOfInt1 = this.o00000;
        int[] arrayOfInt2 = this.ö00000;
        for (j = 0; j < 227; j++) {
          int m = arrayOfInt1[j] & 0x80000000 | arrayOfInt1[j + 1] & 0x7FFFFFFF;
          arrayOfInt1[j] = arrayOfInt1[j + 'ƍ'] ^ m >>> 1 ^ arrayOfInt2[m & 1];
        } 
        while (j < 623) {
          int m = arrayOfInt1[j] & 0x80000000 | arrayOfInt1[j + 1] & 0x7FFFFFFF;
          arrayOfInt1[j] = arrayOfInt1[j + -227] ^ m >>> 1 ^ arrayOfInt2[m & 1];
          j++;
        } 
        int k = arrayOfInt1[623] & 0x80000000 | arrayOfInt1[0] & 0x7FFFFFFF;
        arrayOfInt1[623] = arrayOfInt1[396] ^ k >>> 1 ^ arrayOfInt2[k & 1];
        this.ffloat = 0;
      } 
      i = this.o00000[this.ffloat++];
      i ^= i >>> 11;
      i ^= i << 7 & 0x9D2C5680;
      i ^= i << 15 & 0xEFC60000;
      i ^= i >>> 18;
      return (int)(paramInt * (i >>> 1) >> 31);
    } 
    do {
      if (this.ffloat >= 624) {
        int[] arrayOfInt1 = this.o00000;
        int[] arrayOfInt2 = this.ö00000;
        int b;
        for (b = 0; b < 'ã'; b++) {
          int n = arrayOfInt1[b] & 0x80000000 | arrayOfInt1[b + 1] & 0x7FFFFFFF;
          arrayOfInt1[b] = arrayOfInt1[b + 'ƍ'] ^ n >>> 1 ^ arrayOfInt2[n & 1];
        } 
        while (b < 'ɯ') {
          int n = arrayOfInt1[b] & 0x80000000 | arrayOfInt1[b + 1] & 0x7FFFFFFF;
          arrayOfInt1[b] = arrayOfInt1[b + -227] ^ n >>> 1 ^ arrayOfInt2[n & 1];
          b++;
        } 
        int m = arrayOfInt1[623] & 0x80000000 | arrayOfInt1[0] & 0x7FFFFFFF;
        arrayOfInt1[623] = arrayOfInt1[396] ^ m >>> 1 ^ arrayOfInt2[m & 1];
        this.ffloat = 0;
      } 
      int k = this.o00000[this.ffloat++];
      k ^= k >>> 11;
      k ^= k << 7 & 0x9D2C5680;
      k ^= k << 15 & 0xEFC60000;
      k ^= k >>> 18;
      i = k >>> 1;
      j = i % paramInt;
    } while (i - j + paramInt - 1 < 0);
    return j;
  }
}
