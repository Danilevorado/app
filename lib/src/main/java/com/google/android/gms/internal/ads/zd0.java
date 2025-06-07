package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes.dex */
final class zd0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Context f18524m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ tf0 f18525n;

    zd0(ae0 ae0Var, Context context, tf0 tf0Var) {
        this.f18524m = context;
        this.f18525n = tf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f18525n.e(h3.a.a(this.f18524m));
        } catch (b4.g | IOException | IllegalStateException e5) {
            this.f18525n.f(e5);
            ze0.e("Exception while getting advertising Id info", e5);
        }
    }
}
