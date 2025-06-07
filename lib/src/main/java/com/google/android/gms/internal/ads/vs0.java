package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class vs0 implements fs0 {

    /* renamed from: a, reason: collision with root package name */
    private final CookieManager f16845a;

    public vs0(Context context) {
        this.f16845a = j3.t.s().b(context);
    }

    @Override // com.google.android.gms.internal.ads.fs0
    public final void a(Map map) {
        if (this.f16845a == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f16845a.setCookie((String) k3.w.c().b(ir.J0), str);
            return;
        }
        String str2 = (String) k3.w.c().b(ir.J0);
        String cookie = this.f16845a.getCookie(str2);
        if (cookie == null) {
            return;
        }
        List listF = w33.c(t23.c(';')).f(cookie);
        for (int i10 = 0; i10 < listF.size(); i10++) {
            CookieManager cookieManager = this.f16845a;
            Iterator it = w33.c(t23.c('=')).d((String) listF.get(i10)).iterator();
            Objects.requireNonNull(it);
            if (!it.hasNext()) {
                throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
            }
            cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) k3.w.c().b(ir.f10121w0))));
        }
    }
}
