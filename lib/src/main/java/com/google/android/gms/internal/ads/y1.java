package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class y1 {

    /* renamed from: a, reason: collision with root package name */
    protected final s0 f17850a;

    protected y1(s0 s0Var) {
        this.f17850a = s0Var;
    }

    protected abstract boolean a(jm2 jm2Var);

    protected abstract boolean b(jm2 jm2Var, long j10);

    public final boolean c(jm2 jm2Var, long j10) {
        return a(jm2Var) && b(jm2Var, j10);
    }
}
