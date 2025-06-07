package com.meta.analytics.dsp.uinode;

import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.RewardedVideoAd;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Kz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0725Kz {
    public static byte[] A00;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 39);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{121, 123, 110, 111, -120, 119, 126, 118, -120, 106, 109, 124, -120, 119, 120, -120, 108, 113, 106, 114, 119, -71, -73, -55, -71, -73, -70, -69, -70, -75, -73, -70, -25, -6, -10, -12, -29, -31, -26, -29, -10, -29, -82, -81, -76, -70, -71, -58, -57, -58, -69, -64, -71, -63, -58, -67, -68, -73, -71, -68, -53, -8, -6};
    }

    public static int A00(C1073Yn c1073Yn, int i10) {
        return KE.A00(c1073Yn).getInt(A01(0, 21, 2), i10);
    }

    public static String A02(C1073Yn c1073Yn, String str) {
        int iA00 = A00(c1073Yn, -1);
        if (iA00 == -1) {
            return null;
        }
        try {
            return new ExtraHints.Builder().extraData(A03(str, A01(47, 14, 49), Integer.valueOf(iA00))).build().getHints();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String A03(String str, String str2, Object obj) throws JSONException {
        String strA01 = A01(61, 2, 86);
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            String extraData = A01(42, 5, 31);
            JSONObject jSONObject2 = jSONObject.getJSONObject(extraData);
            String extraData2 = A01(32, 10, 91);
            strA01 = jSONObject2.optString(extraData2, strA01);
        }
        JSONObject jSONObject3 = new JSONObject(strA01);
        jSONObject3.put(str2, obj);
        String extraData3 = jSONObject3.toString();
        return extraData3;
    }

    public static boolean A05(String str) throws JSONException {
        return str != null && new JSONObject(new JSONObject(str).getJSONObject(A01(42, 5, 31)).optString(A01(32, 10, 91), A01(61, 2, 86))).optBoolean(A01(21, 11, 47), false);
    }

    public final InterstitialAd A06(C1073Yn c1073Yn, String str, String str2) {
        if (c1073Yn == null) {
            return null;
        }
        try {
            InterstitialAd interstitialAd = new InterstitialAd(c1073Yn, str);
            interstitialAd.setExtraHints(new ExtraHints.Builder().extraData(A03(str2, A01(21, 11, 47), true)).build());
            return interstitialAd;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final RewardedVideoAd A07(C1073Yn c1073Yn, String str, String str2) {
        if (c1073Yn == null) {
            return null;
        }
        try {
            RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(c1073Yn, str);
            rewardedVideoAd.setExtraHints(new ExtraHints.Builder().extraData(A03(str2, A01(21, 11, 47), true)).build());
            return rewardedVideoAd;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void A08(C1073Yn c1073Yn, boolean z10) {
        int i10 = 0;
        String strA01 = A01(0, 21, 2);
        if (!z10) {
            int lastNonChainedAds = KE.A00(c1073Yn).getInt(strA01, 0);
            i10 = lastNonChainedAds + 1;
        }
        KE.A00(c1073Yn).edit().putInt(strA01, i10).apply();
    }

    public final boolean A09(C1073Yn c1073Yn, String str, int i10) {
        if (i10 <= 0) {
            return false;
        }
        try {
            if (!A05(str)) {
                int lastNonChainedAds = A00(c1073Yn, i10 - 1);
                return lastNonChainedAds >= i10 + (-1);
            }
        } catch (JSONException unused) {
        }
        return false;
    }
}
