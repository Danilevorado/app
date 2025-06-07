package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class ni3 implements nd3 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f12658a = Logger.getLogger(ni3.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final ni3 f12659b = new ni3();

    ni3() {
    }

    public static void d() {
        qd3.l(f12659b);
    }

    @Override // com.google.android.gms.internal.ads.nd3
    public final Class a() {
        return ec3.class;
    }

    @Override // com.google.android.gms.internal.ads.nd3
    public final Class b() {
        return ec3.class;
    }

    @Override // com.google.android.gms.internal.ads.nd3
    public final /* synthetic */ Object c(md3 md3Var) {
        return new mi3(md3Var);
    }
}
