import java.util.Arrays;
import java.util.List;

class StarsectorCodes {
  public static List<String> blacklist = Arrays.asList(
    "AG5F5-R6QV1-AGJDG-3EAAA",
    "8J4TI-ADWUS-2AQ4R-V37SS",
    "AD4C6-9DMAQ-AAMOB-7YMT8",
    "87AMY-186QS-W5A3Y-5MFA8",
    "YJ7PX-3LDZG-28JEC-Q4CA3",
    "CP1R9-3AAEB-LDY9Q-DAQA2",
    "R2STF-YAAAA-LJA0J-AZR3R",
    "2ACAL-JSPA7-HAAN8-AIS2F",
    "54AAK-6A0WV-ADFF0-U027A",
    "B8AA8-YADKB-PKZ2Z-7DBRB",
    "CTQ0S-7PLO1-IL8AA-132FN",
    "9ZPHR-GBIH2-RDKUQ-LAOSN",
    "AZAQO-QPDZE-87D4A-5AYUD",
    "Y4OG2-S9LLL-SS3JN-AMGCR",
    "Z5R3A-AAWA3-KTUAZ-GAA1V",
    "UASWE-4JH83-1ZFRA-CAT19",
    "WGO1T-DBKC6-6ASLN-6MMBE",
    "8IRRT-BADMZ-CD3IE-NZUAA",
    "AAUKK-6W38G-SM2U5-ABSN7",
    "J5AQC-A6B1A-AAAQA-AAA8A",
    "12LN4-JVA91-KZZ53-5SHWT",
    "FNANQ-AQ2AV-QKL2A-ZLRAA",
    "OL9CJ-BA4NO-MAAAA-AAMKO",
    "XANBG-ECRZX-PFWAP-YOG7Z",
    "WYX2A-PNK4Q-7AWA4-NJUZO",
    "GSR49-LUA1D-R0HAJ-CAMAA",
    "AKMA6-4X9A5-A04AA-UWSHB",
    "W59UA-PA3XT-LQUSA-UNJEA",
    "PBELO-QWVRT-6UAV5-6JQO7",
    "PT27L-V7IAW-A1K49-2AZXL",
    "AVM29-2JO2E-TER02-AVMNE",
    "IAAGA-G9QHG-A91ZH-NKKDA",
    "EIBTA-X46OI-RA22M-FDSHR",
    "MAARN-AJCLE-G3QJA-XN2AA",
    "T6Q42-3D0EM-KJADY-AEXHA",
    "67AYA-THTW5-ANAAS-9ACSC"
  );

  public static void main(String[] args) {
    codes codes = new codes();
    for (int b = 0; b < 500000; b++) {
      String str = codes.next_code();
      if (!blacklist.contains(str))
        System.out.println(str);
    }
  }
}
