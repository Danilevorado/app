package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A03' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.Rh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class EnumC0889Rh {
    public static byte[] A00;
    public static String[] A01 = {"nA8fLeyOwVmNwvq6aIqKxCaagHA5eYr", "8Z3ODqLNUnEAqB2P3Amw9Ur1PSsugik5", "YRmdf", "zIg3Ob9eurpeZ06C2uEHUxbrUPW1iO5", "DwODnBhAs5I9lGAPLwBjllp42Gjp41Mv", "6IL6kP5nz", "IHg6IZuYXxuMxytmBHiV", "YXmTZGEBqQ8NuPQvZDB03"};
    public static final /* synthetic */ EnumC0889Rh[] A02;
    public static final EnumC0889Rh A03;
    public static final EnumC0889Rh A04;
    public static final EnumC0889Rh A05;
    public static final EnumC0889Rh A06;
    public static final EnumC0889Rh A07;
    public static final EnumC0889Rh A08;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-82, -33, -33, -50, -26, 110, -101, -101, -104, -111, -115, -102, -103, -60, -54, -73, -63, -70, Byte.MAX_VALUE, -92, -86, 101, 120, Byte.MIN_VALUE, 123, 121, -118, 123, -100, -102, -111, -106, -113, -99, -74, -77, -74, -73, -65, -74, 104, -68, -63, -72, -83, 104, -73, -82, 104, -78, -69, -73, -74, 104, -73, -86, -78, -83, -85, -68, 104, -77, -83, -63};
    }

    public abstract boolean A04(JSONArray jSONArray, int i10);

    public abstract boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i10);

    public abstract boolean A06(JSONObject jSONObject, String str);

    public abstract boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str);

    static {
        A03();
        final String strA02 = A02(0, 5, 105);
        final int i10 = 0;
        EnumC0889Rh enumC0889Rh = new EnumC0889Rh(strA02, i10) { // from class: com.facebook.ads.redexgen.X.J6
            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A04(JSONArray jSONArray, int i11) {
                return jSONArray.optJSONArray(i11) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i11) {
                return AbstractC0890Ri.A00(jSONArray.optJSONArray(i11), jSONArray2.optJSONArray(i11));
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONArray(str) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return AbstractC0890Ri.A00(jSONObject.optJSONArray(str), jSONObject2.optJSONArray(str));
            }
        };
        A03 = enumC0889Rh;
        final String strA022 = A02(5, 7, 40);
        final int i11 = 1;
        EnumC0889Rh enumC0889Rh2 = new EnumC0889Rh(strA022, i11) { // from class: com.facebook.ads.redexgen.X.In
            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A04(JSONArray jSONArray, int i12) {
                return jSONArray.optBoolean(i12, true) == jSONArray.optBoolean(i12, false);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i12) {
                return jSONArray.optBoolean(i12) == jSONArray2.optBoolean(i12);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optBoolean(str, true) == jSONObject.optBoolean(str, false);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optBoolean(str) == jSONObject2.optBoolean(str);
            }
        };
        A04 = enumC0889Rh2;
        final String strA023 = A02(12, 6, 81);
        final int i12 = 2;
        EnumC0889Rh enumC0889Rh3 = new EnumC0889Rh(strA023, i12) { // from class: com.facebook.ads.redexgen.X.ID
            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A04(JSONArray jSONArray, int i13) {
                return jSONArray.optInt(i13, 0) == jSONArray.optInt(i13, 1) && jSONArray.optDouble(i13, 0.0d) == jSONArray.optDouble(i13, 1.0d) && ((double) jSONArray.optInt(i13, 0)) != jSONArray.optDouble(i13, 0.0d);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i13) {
                return jSONArray.optDouble(i13) == jSONArray2.optDouble(i13);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, 0.0d) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) != jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optDouble(str) == jSONObject2.optDouble(str);
            }
        };
        A05 = enumC0889Rh3;
        final String strA024 = A02(18, 3, 50);
        final int i13 = 3;
        EnumC0889Rh enumC0889Rh4 = new EnumC0889Rh(strA024, i13) { // from class: com.facebook.ads.redexgen.X.I5
            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A04(JSONArray jSONArray, int i14) {
                return jSONArray.optInt(i14, 0) == jSONArray.optInt(i14, 1) && jSONArray.optDouble(i14, 0.0d) == jSONArray.optDouble(i14, 1.0d) && ((double) jSONArray.optInt(i14, 0)) == jSONArray.optDouble(i14, 0.0d);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i14) {
                return jSONArray.optInt(i14) == jSONArray2.optInt(i14);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, 0.0d) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) == jSONObject.optDouble(str, 0.0d);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optInt(str) == jSONObject2.optInt(str);
            }
        };
        A06 = enumC0889Rh4;
        final String strA025 = A02(21, 6, 18);
        final int i14 = 4;
        EnumC0889Rh enumC0889Rh5 = new EnumC0889Rh(strA025, i14) { // from class: com.facebook.ads.redexgen.X.I4
            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A04(JSONArray jSONArray, int i15) {
                return jSONArray.optJSONObject(i15) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i15) {
                return AbstractC0890Ri.A02(jSONArray.optJSONObject(i15), jSONArray2.optJSONObject(i15));
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONObject(str) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return AbstractC0890Ri.A02(jSONObject.optJSONObject(str), jSONObject2.optJSONObject(str));
            }
        };
        A07 = enumC0889Rh5;
        final String strA026 = A02(27, 6, 36);
        final int i15 = 5;
        EnumC0889Rh enumC0889Rh6 = new EnumC0889Rh(strA026, i15) { // from class: com.facebook.ads.redexgen.X.Hx
            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A04(JSONArray jSONArray, int i16) {
                return jSONArray.optString(i16) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i16) {
                return jSONArray.optString(i16).equals(jSONArray2.optString(i16));
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optString(str) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0889Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optString(str).equals(jSONObject2.optString(str));
            }
        };
        A08 = enumC0889Rh6;
        A02 = new EnumC0889Rh[]{enumC0889Rh, enumC0889Rh2, enumC0889Rh3, enumC0889Rh4, enumC0889Rh5, enumC0889Rh6};
    }

    public EnumC0889Rh(String str, int i10) {
    }

    public static EnumC0889Rh A00(JSONArray jSONArray, int i10) {
        for (EnumC0889Rh type : values()) {
            if (A01[1].charAt(14) != '2') {
                throw new RuntimeException();
            }
            A01[4] = "PUsgFaltT51mxPXWqnHKjq6lqfkoVDea";
            if (type.A04(jSONArray, i10)) {
                return type;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static EnumC0889Rh A01(JSONObject jSONObject, String str) {
        for (EnumC0889Rh enumC0889Rh : values()) {
            boolean zA06 = enumC0889Rh.A06(jSONObject, str);
            if (A01[5].length() != 9) {
                throw new RuntimeException();
            }
            A01[6] = "GmRRmI3tzaTgoS0GQtjO0";
            if (zA06) {
                return enumC0889Rh;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static EnumC0889Rh valueOf(String str) {
        return (EnumC0889Rh) Enum.valueOf(EnumC0889Rh.class, str);
    }

    public static EnumC0889Rh[] values() {
        return (EnumC0889Rh[]) A02.clone();
    }
}
