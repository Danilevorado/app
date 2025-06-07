package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class mc0 implements nj {

    /* renamed from: m, reason: collision with root package name */
    private final Context f12039m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f12040n;

    /* renamed from: o, reason: collision with root package name */
    private final String f12041o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f12042p;

    public mc0(Context context, String str) {
        this.f12039m = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f12041o = str;
        this.f12042p = false;
        this.f12040n = new Object();
    }

    @Override // com.google.android.gms.internal.ads.nj
    public final void U(mj mjVar) {
        b(mjVar.f12152j);
    }

    public final String a() {
        return this.f12041o;
    }

    public final void b(boolean z10) {
        if (j3.t.p().z(this.f12039m)) {
            synchronized (this.f12040n) {
                if (this.f12042p == z10) {
                    return;
                }
                this.f12042p = z10;
                if (TextUtils.isEmpty(this.f12041o)) {
                    return;
                }
                if (this.f12042p) {
                    j3.t.p().m(this.f12039m, this.f12041o);
                } else {
                    j3.t.p().n(this.f12039m, this.f12041o);
                }
            }
        }
    }
}
