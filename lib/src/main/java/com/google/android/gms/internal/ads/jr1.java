package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class jr1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f10680a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f10681b;

    public jr1(q44 q44Var, q44 q44Var2) {
        this.f10680a = q44Var;
        this.f10681b = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        ls2 ls2Var = (ls2) this.f10680a.b();
        final CookieManager cookieManagerB = j3.t.s().b((Context) this.f10681b.b());
        cs2 cs2VarI = vr2.a(new Callable() { // from class: com.google.android.gms.internal.ads.gr1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = cookieManagerB;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) k3.w.c().b(ir.J0));
            }
        }, fs2.WEBVIEW_COOKIE, ls2Var).i(1L, TimeUnit.SECONDS);
        final hr1 hr1Var = new nr2() { // from class: com.google.android.gms.internal.ads.hr1
            @Override // com.google.android.gms.internal.ads.nr2
            public final Object a(Object obj) {
                return "";
            }
        };
        return cs2VarI.c(Exception.class, new w93() { // from class: com.google.android.gms.internal.ads.yr2
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return qa3.h("");
            }
        }).a();
    }
}
