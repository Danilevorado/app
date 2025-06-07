package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes.dex */
final class c8 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ ComponentName f19827m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ g8 f19828n;

    c8(g8 g8Var, ComponentName componentName) {
        this.f19828n = g8Var;
        this.f19827m = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h8.M(this.f19828n.f19950o, this.f19827m);
    }
}
