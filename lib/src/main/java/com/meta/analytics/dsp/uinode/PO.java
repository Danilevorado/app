package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public abstract class PO {
    public static byte[] A00;
    public static String[] A01 = {"xPMOoUfbkmQ5kvnU3jbgLL47OcFEjU7z", "1dodMLotzUEJucQn2MWgY64F", "Ei0kY7ZOP", "czo3jP2JN", "", "hHdeWCinA2EaAz86iaUgwk6OrkZVXmHI", "CkfkaUvdCRi5J5AIUl6JSr62iIVQ3RiE", "AT3hLPm3hPYjZ73rxoY4ER"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static PN A00(C1073Yn c1073Yn, JSONObject jSONObject, C03786c c03786c, JA ja2, C0828Oy c0828Oy, boolean z10) throws JSONException {
        boolean z11;
        String strA0R;
        boolean z12 = z10;
        String strA01 = A01(101, 3, 106);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        String strOptString = jSONObject.optString(A01(51, 26, 80));
        arrayList3.add(strOptString);
        if (z12) {
            strA0R = c03786c.A0R(strOptString);
            if (strOptString.equals(strA0R)) {
                z12 = false;
                z11 = false;
            } else {
                z11 = z12;
            }
        } else {
            z11 = z12;
            strA0R = strOptString;
        }
        ja2.A04(J9.A0P, null);
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A01(92, 4, 1));
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optString(strA01) != null) {
                arrayList.add(jSONObjectOptJSONObject.optString(strA01));
                if (z11) {
                    jSONObjectOptJSONObject.put(strA01, c03786c.A0Q(jSONObjectOptJSONObject.optString(strA01)));
                }
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A01(77, 15, 126));
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    String strOptString2 = jSONArrayOptJSONArray.optString(i10);
                    arrayList.add(strOptString2);
                    if (z11) {
                        jSONArrayOptJSONArray.put(i10, c03786c.A0Q(strOptString2));
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(A01(43, 8, 26));
            if (jSONArrayOptJSONArray2 != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                    A03(arrayList, arrayList2, jSONArrayOptJSONArray2.optJSONObject(i11), c03786c, z11);
                }
            } else {
                A03(arrayList, arrayList2, jSONObject, c03786c, z11);
            }
        } catch (JSONException unused) {
            c0828Oy.A04(C8A.A15, A01(0, 43, 79));
        }
        return new PN(jSONObject, strA0R, arrayList, arrayList2, arrayList3, z12);
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{69, 114, 114, 111, 114, 32, 116, 114, 97, 110, 115, 102, 111, 114, 109, 105, 110, 103, 32, 74, 83, 79, 78, 32, 105, 110, 32, 117, 112, 100, 97, 116, 101, 67, 97, 99, 104, 101, 100, 85, 114, 108, 115, 54, 52, 39, 58, 32, 38, 48, 57, 123, 102, 113, 126, 114, 118, 124, 64, 108, 123, 116, 64, 115, 126, 102, 122, 109, 64, 119, 107, 114, 115, 64, 106, 109, 115, 84, 95, 85, 110, 82, 80, 67, 85, 110, 88, 92, 80, 86, 84, 66, 39, 45, 33, 32, 2, 6, 10, 12, 14, 80, 87, 73, 107, 116, 121, 120, 114, 66, 104, 111, 113};
    }

    static {
        A02();
    }

    public static void A03(ArrayList<String> videoUrls, ArrayList<String> arrayList, JSONObject jSONObject, C03786c c03786c, boolean z10) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A01(96, 5, 36));
        if (jSONObjectOptJSONObject != null) {
            String strA01 = A01(101, 3, 106);
            if (A01[1].length() == 1) {
                throw new RuntimeException();
            }
            A01[7] = "G1neCcMuoIIVUH8A2yIEObncf";
            if (jSONObjectOptJSONObject.optString(strA01) != null) {
                String strOptString = jSONObjectOptJSONObject.optString(strA01);
                videoUrls.add(strOptString);
                if (z10) {
                    jSONObjectOptJSONObject.put(strA01, c03786c.A0Q(strOptString));
                }
            }
        }
        String strA012 = A01(104, 9, 82);
        if (!TextUtils.isEmpty(jSONObject.optString(strA012))) {
            String strOptString2 = jSONObject.optString(strA012);
            arrayList.add(strOptString2);
            if (z10) {
                jSONObject.put(strA012, c03786c.A0R(strOptString2));
            }
        }
    }
}
