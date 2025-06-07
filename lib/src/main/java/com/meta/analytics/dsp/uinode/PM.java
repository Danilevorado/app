package com.meta.analytics.dsp.uinode;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class PM {
    public static byte[] A08;
    public WeakReference<PB> A00;
    public WeakReference<TD> A01 = new WeakReference<>(null);
    public boolean A02 = false;
    public final C1073Yn A03;
    public final C0828Oy A04;
    public final String A05;
    public final String A06;
    public final WeakReference<J2> A07;

    static {
        A09();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A08 = new byte[]{44, 56, 54, 54, 42, 55, 45, 10, 11, 12, 7, 27, 18, 26, 63, 78, 71, 58, -29, -14, -21, -21, -30, -23, -36, -32, -20, -31, -30, 12, 27, 20, 20, 11, 18, 5, 19, 11, 25, 25, 7, 13, 11, -37, -22, -29, -29, -38, -31, -44, -23, -18, -27, -38, -23, -29, -9, 52, 53, 36, 46, 41, 90, 75, 95, 93, 79, 78, 44, 99, 63, 93, 79, 92, 57, 58, 39, 56, 58, 43, 42, 8, 63, 27, 57, 43, 56, 83, 84, 65, 84, 69, 48, 45, 39, 6, 32, 52, -10, -31, -20, -11, -27};
    }

    public PM(C1073Yn c1073Yn, PB pb2, J2 j22, C0828Oy c0828Oy, String str, String str2) {
        this.A03 = c1073Yn;
        this.A00 = new WeakReference<>(pb2);
        this.A07 = new WeakReference<>(j22);
        this.A04 = c0828Oy;
        this.A05 = str;
        this.A06 = str2;
    }

    public static Map<String, String> A03(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        HashMap map = new HashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.optString(next));
        }
        return map;
    }

    private void A04() {
        TD uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.close();
    }

    private void A05() {
        TD uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A8X();
    }

    private void A06() {
        TD uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A9K();
    }

    private void A07() {
        this.A03.A0E().A5F();
        this.A02 = true;
        TD uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AGY();
        if (C0662Ih.A1W(this.A03)) {
            this.A03.A0A().ABG();
        }
    }

    private void A08() {
        TD uxActionsJavascriptListener = this.A01.get();
        if (uxActionsJavascriptListener == null) {
            return;
        }
        uxActionsJavascriptListener.ABb();
    }

    private void A0A(PB pb2, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        SharedPreferences sharedPreferencesA00 = KE.A00(this.A03);
        String strA01 = A01(57, 5, 81);
        String strA012 = A01(0, 0, 21);
        String storageValue = jSONObject.optString(strA01, strA012);
        String key = jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50));
        String string = sharedPreferencesA00.getString(A01(14, 4, 103) + key, strA012);
        if (string != null) {
            strA012 = string;
        }
        pb2.A0g(storageValue, strA012);
    }

    private void A0B(PB pb2, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String strA01 = A01(98, 5, 12);
        String strA012 = A01(0, 0, 21);
        String strOptString = jSONObject.optString(strA01, strA012);
        String strOptString2 = jSONObject.optString(A01(57, 5, 81), strA012);
        KE.A00(this.A03).edit().putString(A01(14, 4, 103) + jSONObject.optString(A01(54, 3, 10), A01(7, 7, 50)), strOptString).apply();
        pb2.A0f(strOptString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(PK pk, String str) throws JSONException {
        switch (PJ.A00[pk.ordinal()]) {
            case 1:
                A0I(new JSONObject(str));
                break;
            case 2:
                A06();
                break;
            case 3:
                A04();
                break;
            case 4:
                A07();
                break;
            case 5:
                A0K(new JSONObject(str));
                break;
            case 6:
                A0L(new JSONObject(str));
                break;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                if (BuildConfigApi.isDebug()) {
                }
                break;
            case 8:
                A05();
            case 9:
                this.A03.A0E().A5R(str);
                break;
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
                A0D(pk, str);
                break;
            case 15:
                A0J(new JSONObject(str));
                break;
            case 16:
                A08();
                break;
            case 17:
                A0M(new JSONObject(str));
                break;
        }
        PB pb2 = this.A00.get();
        if (pb2 == null) {
        }
        switch (PJ.A00[pk.ordinal()]) {
            case 19:
                pb2.A0S();
                break;
            case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                pb2.A0R();
                break;
            case 21:
                A0B(pb2, str);
                break;
            case 22:
                A0A(pb2, str);
                break;
            case 23:
                pb2.A0i(A03(new JSONObject(str)));
                break;
        }
    }

    private void A0D(PK pk, String str) throws JSONException {
        TD td = this.A01.get();
        if (td == null) {
        }
        switch (PJ.A00[pk.ordinal()]) {
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                td.ABf();
                break;
            case 11:
                td.AD8();
                break;
            case 12:
                A0G(td, str);
                break;
            case 13:
                A0F(td, str);
                break;
            case 14:
                A0E(td, str);
                break;
        }
    }

    private void A0E(TD td, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STATE_KEY = A01(87, 5, 108);
        td.ACL(jSONObject.optBoolean(STATE_KEY, false));
    }

    private void A0F(TD td, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String PAUSED_BY_USER_KEY = A01(62, 12, 118);
        td.ADc(jSONObject.optBoolean(PAUSED_BY_USER_KEY, false));
    }

    private void A0G(TD td, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STARTED_BY_USER_KEY = A01(74, 13, 82);
        td.ADe(jSONObject.optBoolean(STARTED_BY_USER_KEY, false));
    }

    private void A0I(JSONObject jSONObject) {
        TD td = this.A01.get();
        if (td == null) {
            return;
        }
        String productUrl = jSONObject.optString(A01(0, 7, 85));
        if (TextUtils.isEmpty(productUrl)) {
            td.A8S();
        } else {
            td.A8T(productUrl);
        }
    }

    private void A0J(JSONObject jSONObject) {
        TD uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        jSONObject.optString(A01(0, 7, 85));
    }

    private void A0K(JSONObject jSONObject) {
        J2 j22 = this.A07.get();
        if (j22 == null) {
            return;
        }
        String strOptString = jSONObject.optString(A01(43, 11, 1));
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        new JA(this.A06, j22).A05(strOptString, A03(jSONObject));
    }

    private void A0L(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt(A01(18, 11, 9), -1);
        if (iOptInt == -1) {
            return;
        }
        String message = jSONObject.optString(A01(29, 14, 50));
        if (TextUtils.isEmpty(message)) {
            return;
        }
        this.A03.A0E().A9Y(iOptInt, message);
    }

    private void A0M(JSONObject jSONObject) {
        String strOptString;
        TD td = this.A01.get();
        if (td == null || (strOptString = jSONObject.optString(A01(92, 6, 71))) == null) {
            return;
        }
        td.ADr(strOptString);
    }

    public final void A0N(TD td) {
        this.A01 = new WeakReference<>(td);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        ExecutorC0734Li.A00(new PI(this, str));
    }
}
