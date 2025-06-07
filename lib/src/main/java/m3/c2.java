package m3;

import android.R;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.nk0;
import com.google.android.gms.internal.ads.pm;
import com.google.android.gms.internal.ads.tl0;
import com.google.android.gms.internal.ads.vk0;
import com.google.android.gms.internal.ads.ze0;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public class c2 extends b {
    public c2() {
        super(null);
    }

    @Override // m3.b
    public final int a() {
        return R.style.Theme.Material.Dialog.Alert;
    }

    @Override // m3.b
    public final CookieManager b(Context context) {
        j3.t.r();
        if (b2.a()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            ze0.e("Failed to obtain CookieManager.", th);
            j3.t.q().u(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // m3.b
    public final WebResourceResponse c(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i10, str3, map, inputStream);
    }

    @Override // m3.b
    public final vk0 d(nk0 nk0Var, pm pmVar, boolean z10) {
        return new tl0(nk0Var, pmVar, z10);
    }
}
