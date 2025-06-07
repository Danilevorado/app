package com.google.android.gms.internal.ads;

import e4.c;

/* loaded from: classes.dex */
final class km implements c.b {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ tf0 f11152m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ lm f11153n;

    km(lm lmVar, tf0 tf0Var) {
        this.f11153n = lmVar;
        this.f11152m = tf0Var;
    }

    @Override // e4.c.b
    public final void w0(b4.b bVar) {
        synchronized (this.f11153n.f11657d) {
            this.f11152m.f(new RuntimeException("Connection failed."));
        }
    }
}
