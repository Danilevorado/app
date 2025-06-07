package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class r34 extends u34 {

    /* renamed from: a, reason: collision with root package name */
    final Logger f14605a;

    public r34(String str) {
        this.f14605a = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.u34
    public final void a(String str) {
        this.f14605a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
