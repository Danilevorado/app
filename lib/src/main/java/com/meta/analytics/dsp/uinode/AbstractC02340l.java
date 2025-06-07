package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.0l, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC02340l {
    public static byte[] A00;
    public static String[] A01 = {"4Fi3cRKjKwjo", "pfwDmZC0EgnSHGG3akphHDiSxRpjxWfc", "OwKyFlCBYoW0NHpoiuFf2exuC", "FTixXnraWBf7yQ9sseM6khJqknPB2", "87lno6sBf8EnLpq9v2WrftgOrdI4V", "hcLSbPhFObKmfxN2jEGb0Jf71EM4", "MV7VLhl", "AE1L1nhQpeYYJvXkfFkincgpQRIdvuit"};

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{101, 64, 4, 77, 87, 4, 77, 74, 82, 69, 72, 77, 64, 69, 80, 65, 64, 4, 83, 77, 80, 76, 75, 81, 80, 4, 80, 75, 79, 65, 74, 10, 10, 27, 2, 39, 38, 55, 38, 32, 55, 42, 44, 45, 28, 48, 55, 49, 42, 45, 36, 48, 35, 36, 60, 43, 38, 35, 46, 43, 62, 35, 37, 36, 21, 40, 47, 34, 43, 60, 35, 37, 56, 98, 115, 96, 97, 123, 124, 117};
    }

    static {
        A05();
    }

    public static EnumC02320j A00(JSONObject jSONObject) {
        return EnumC02320j.A00(jSONObject.optString(A02(52, 21, 114)));
    }

    public static C1207ba A01(C1073Yn c1073Yn, JSONObject jSONObject, String str) {
        return new C1207ba(jSONObject, c1073Yn, str);
    }

    public static Collection<String> A03(C1073Yn c1073Yn, JSONObject jSONObject) {
        JSONArray jSONArray = null;
        try {
            String detectionStringJSON = jSONObject.optString(A02(35, 17, 123));
            if (!TextUtils.isEmpty(detectionStringJSON)) {
                JSONArray detectionStringsArray = new JSONArray(detectionStringJSON);
                jSONArray = detectionStringsArray;
            }
        } catch (JSONException e5) {
            c1073Yn.A07().A9a(A02(73, 7, 42), C8A.A2C, new C8B(e5));
        }
        return A04(jSONArray);
    }

    public static Collection<String> A04(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            hashSet.add(jSONArray.optString(i10));
        }
        return hashSet;
    }

    public static boolean A06(C1073Yn c1073Yn, InterfaceC02330k interfaceC02330k, J2 j22) {
        EnumC02320j enumC02320jA7E = interfaceC02330k.A7E();
        if (enumC02320jA7E != null) {
            EnumC02320j invalidationBehavior = EnumC02320j.A03;
            if (enumC02320jA7E != invalidationBehavior) {
                boolean packageInstalled = false;
                Collection<String> collectionA6n = interfaceC02330k.A6n();
                if (collectionA6n == null || collectionA6n.isEmpty()) {
                    return false;
                }
                Iterator<String> it = collectionA6n.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (LM.A04(c1073Yn, it.next())) {
                        packageInstalled = true;
                        break;
                    }
                }
                EnumC02320j invalidationBehavior2 = EnumC02320j.A02;
                if (packageInstalled != (enumC02320jA7E == invalidationBehavior2)) {
                    return false;
                }
                String strA6T = interfaceC02330k.A6T();
                boolean zIsEmpty = TextUtils.isEmpty(strA6T);
                String[] strArr = A01;
                String clientToken = strArr[7];
                if (clientToken.charAt(25) != strArr[1].charAt(25)) {
                    throw new RuntimeException();
                }
                A01[2] = "Y0XUyINdugWnNFuKX72emGLWk";
                if (!zIsEmpty) {
                    j22.A9h(strA6T, null);
                    return true;
                }
                c1073Yn.A07().A9a(A02(32, 3, 83), C8A.A0Z, new C8B(A02(0, 32, 28)));
                return true;
            }
        }
        return false;
    }
}
