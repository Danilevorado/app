package com.meta.analytics.dsp.uinode;

import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class NY extends WebView {
    public static byte[] A01;
    public static String[] A02 = {"wCfyxoFTZ1jJ20JoleL2PfrggSS6BF65", "Rc2rUHoB5tN3gwl7phNiRTFEm74RUGaD", "k3E8g92vqjz0P264LqfNkGJlcmiFj3XN", "5IFC", "4VKGug1amLvDa4cy8fz1MnlZuIkeI9i2", "ilhy", "oZlIL0UAu4uBBRacqgrbUbhUTaUcQiCc", "IlF4AsfZVSat8w0D1JV7TLHsmvDiF9Hf"};
    public static final String A03;
    public boolean A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 105);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{87, 112, 120, 125, 116, 117, 49, 101, 126, 49, 120, Byte.MAX_VALUE, 120, 101, 120, 112, 125, 120, 107, 116, 49, 82, 126, 126, 122, 120, 116, 92, 112, Byte.MAX_VALUE, 112, 118, 116, 99, 63, 92, 93, 43, 104, 121, 106, 120, 99, 110, 111, 27, 16, 7, 16, 2, 18, 3, 24, 1, 5, 75, 82, 64, 71, 122, 83, 76, 64, 82};
    }

    public abstract WebChromeClient A0D();

    public abstract WebViewClient A0E();

    static {
        A01();
        A03 = NY.class.getSimpleName();
    }

    public NY(Activity activity, C1073Yn c1073Yn) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super(activity);
        A03(c1073Yn);
    }

    public NY(C1073Yn c1073Yn) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super(c1073Yn);
        A03(c1073Yn);
    }

    public static void A02(int i10) {
        C1072Ym context = AbstractC04007e.A00();
        if (context != null) {
            context.A07().A9a(A00(56, 8, 76), i10, new C8B(A00(35, 10, 98)));
        }
    }

    private void A03(C04017f c04017f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        setWebChromeClient(A0D());
        setWebViewClient(A0E());
        AbstractC0782Ne.A04(this);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        if (Build.VERSION.SDK_INT >= 17) {
            WebSettings settings = getSettings();
            String[] strArr = A02;
            if (strArr[5].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "3VK0";
            strArr2[3] = "3PNm";
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        if (c04017f.A04().A8z() && Build.VERSION.SDK_INT >= 19) {
            setWebContentsDebuggingEnabled(true);
        }
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
            } catch (Exception unused) {
                Log.w(A03, A00(0, 35, 120));
            }
        }
    }

    private void A04(String str) {
        loadUrl(A00(45, 11, 24) + str);
    }

    public final void A05(String str) {
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                evaluateJavascript(str, null);
            } else {
                A04(str);
            }
        } catch (IllegalStateException unused) {
            A04(str);
        }
    }

    public final boolean A06() {
        return this.A00;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.A00 = true;
        super.destroy();
    }
}
