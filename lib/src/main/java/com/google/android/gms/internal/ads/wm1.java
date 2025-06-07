package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class wm1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f17201a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ xm1 f17202b;

    wm1(xm1 xm1Var) {
        this.f17202b = xm1Var;
    }

    static /* bridge */ /* synthetic */ wm1 a(wm1 wm1Var) {
        wm1Var.f17201a.putAll(wm1Var.f17202b.f17635c);
        return wm1Var;
    }

    public final wm1 b(String str, String str2) {
        this.f17201a.put(str, str2);
        return this;
    }

    public final wm1 c(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f17201a.put(str, str2);
        }
        return this;
    }

    public final wm1 d(hn2 hn2Var) {
        this.f17201a.put("aai", hn2Var.f9276x);
        if (((Boolean) k3.w.c().b(ir.H6)).booleanValue()) {
            c("rid", hn2Var.f9265o0);
        }
        return this;
    }

    public final wm1 e(ln2 ln2Var) {
        this.f17201a.put("gqi", ln2Var.f11674b);
        return this;
    }

    public final String f() {
        return this.f17202b.f17633a.b(this.f17201a);
    }

    public final void g() {
        this.f17202b.f17634b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.vm1
            @Override // java.lang.Runnable
            public final void run() {
                this.f16777m.i();
            }
        });
    }

    public final void h() {
        this.f17202b.f17634b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.um1
            @Override // java.lang.Runnable
            public final void run() {
                this.f16391m.j();
            }
        });
    }

    final /* synthetic */ void i() {
        this.f17202b.f17633a.e(this.f17201a);
    }

    final /* synthetic */ void j() {
        this.f17202b.f17633a.d(this.f17201a);
    }
}
