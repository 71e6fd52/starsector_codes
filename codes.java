public class codes {
  private int[] arr;

  private int ffloat;

  private static int[] arr2 = new int[]{0, -1727483681};

  public codes() {
    this.arr = new int[624];
    this.arr[0] = 19650218;
    this.ffloat = 1;
    while (this.ffloat < 624) {
      this.arr[this.ffloat] = 1812433253 * (this.arr[this.ffloat - 1] ^ this.arr[this.ffloat - 1] >>> 30) + this.ffloat;
      this.ffloat++;
    }
    init_arr();
  }

  public void init_arr() {
    String key = "Nobody will ever pirate starfarer, because starfarer is not pirateable. It is not pirateable because I am so god damned good at writing top secret code like this. Are you not amazed by how truly awesome this code is. Well if you are not, balls to you then. Youve got some nerve, mister. Oh and another thing, just because I have this string in here does not mean that the crackers that will trying to cracj this software won't crack it. THey will crack it, but when they discover this special shout out they will not go on any further with their cracking efforts. They will simply say: Wow. These guys had heart. I will not";
    int[] key_arr = new int[624];
    for (int b = 0; b < key.length(); b++) {
      key_arr[b] = key.charAt(b);
    }

    int i = 1;
    int j = 0;
    char c = 624;
    for (; c != '\000'; c--) {
      this.arr[i] = (this.arr[i] ^ (this.arr[i - 1] ^ this.arr[i - 1] >>> 30) * 1664525) + key_arr[j] + j;
      this.arr[i] = this.arr[i];
      i++;
      j++;
      if (i >= 624) {
        this.arr[0] = this.arr[623];
        i = 1;
      }
      if (j >= key_arr.length)
        j = 0;
    }
    for (c = 'ɯ'; c != '\000'; c--) {
      this.arr[i] = (this.arr[i] ^ (this.arr[i - 1] ^ this.arr[i - 1] >>> 30) * 1566083941) - i;
      this.arr[i] = this.arr[i];
      if (++i >= 624) {
        this.arr[0] = this.arr[623];
        i = 1;
      }
    }
    this.arr[0] = Integer.MIN_VALUE;
  }

  public final int next_number() {
    int j;
    int i;
    do {
      if (this.ffloat >= 624) {
        int[] arrayOfInt1 = this.arr;
        int[] arrayOfInt2 = this.arr2;
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
      int k = this.arr[this.ffloat++];
      k ^= k >>> 11;
      k ^= k << 7 & 0x9D2C5680;
      k ^= k << 15 & 0xEFC60000;
      k ^= k >>> 18;
      i = k >>> 1;
      j = i % 43;
    } while (i - j + 43 - 1 < 0);
    return j;
  }

  public String next_code() {
    StringBuilder stringBuilder = new StringBuilder();
    byte b1 = 0;
    for (byte b2 = 0; b2 < 20; b2++) {
      char c = (char)(next_number() + 48);
      if (c == ':' || c == ';' || c == '<' || c == '=' || c == '>' || c == '?' || c == '@')
        c = 'A';
      stringBuilder.append(c);
      if (b1 > 3 && b2 < 19) {
        stringBuilder.append("-");
        b1 = 0;
      } else {
        b1++;
      }
    }
    return stringBuilder.toString();
  }
}
