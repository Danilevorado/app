package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.1d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class EnumC02511d {
    public static byte[] A01;
    public static final /* synthetic */ EnumC02511d[] A02;
    public static final EnumC02511d A03;
    public static final EnumC02511d A04;
    public static final EnumC02511d A05;
    public final String A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{24, 23, 18, 27, 1, 14, 12, 27, 29, 31, 29, 22, 27, 3, 1, 28, 11, 10, 12, 3, 1, 22, 16, 18, 16, 27, 22, 119, 101, 98, 118, 105, 101, 119, Byte.MAX_VALUE, 112, 114, 101, 99, 97, 99, 104, 101};
    }

    static {
        A02();
        String strA01 = A01(27, 16, 0);
        EnumC02511d enumC02511d = new EnumC02511d(strA01, 0, strA01);
        A05 = enumC02511d;
        String strA012 = A01(13, 14, 115);
        EnumC02511d enumC02511d2 = new EnumC02511d(strA012, 1, strA012);
        A04 = enumC02511d2;
        String strA013 = A01(0, 13, 126);
        EnumC02511d enumC02511d3 = new EnumC02511d(strA013, 2, strA013);
        A03 = enumC02511d3;
        A02 = new EnumC02511d[]{enumC02511d, enumC02511d2, enumC02511d3};
    }

    public EnumC02511d(String str, int i10, String str2) {
        this.A00 = str2;
    }

    public static EnumC02511d A00(String str) {
        for (EnumC02511d enumC02511d : values()) {
            if (enumC02511d.A00.equalsIgnoreCase(str)) {
                return enumC02511d;
            }
        }
        return A03;
    }

    public static EnumC02511d valueOf(String str) {
        return (EnumC02511d) Enum.valueOf(EnumC02511d.class, str);
    }

    public static EnumC02511d[] values() {
        return (EnumC02511d[]) A02.clone();
    }
}
