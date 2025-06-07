package m3;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.nk0;
import com.google.android.gms.internal.ads.pm;
import com.google.android.gms.internal.ads.ql0;
import com.google.android.gms.internal.ads.vk0;
import com.google.android.gms.internal.ads.ze0;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public class b {
    private b() {
    }

    /* synthetic */ b(i2 i2Var) {
    }

    public static b l(int i10) {
        return i10 >= 30 ? new h2() : i10 >= 28 ? new g2() : i10 >= 26 ? new e2() : i10 >= 24 ? new d2() : i10 >= 21 ? new c2() : new b();
    }

    public int a() {
        return 1;
    }

    public CookieManager b(Context context) {
        j3.t.r();
        if (b2.a()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            ze0.e("Failed to obtain CookieManager.", th);
            j3.t.q().u(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public WebResourceResponse c(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public vk0 d(nk0 nk0Var, pm pmVar, boolean z10) {
        return new ql0(nk0Var, pmVar, z10);
    }

    public boolean e(Activity activity, Configuration configuration) {
        return false;
    }

    public void f(Context context, String str, String str2) {
    }

    public boolean g(Context context, String str) {
        return false;
    }

    public int h(Context context, TelephonyManager telephonyManager) {
        return AdError.NO_FILL_ERROR_CODE;
    }

    public int i(AudioManager audioManager) {
        return 0;
    }

    public void j(Activity activity) {
    }

    public int k(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
