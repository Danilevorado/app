package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: classes.dex */
final class bw2 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    private final WebView f6696m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ cw2 f6697n;

    bw2(cw2 cw2Var) {
        this.f6697n = cw2Var;
        this.f6696m = cw2Var.f7101d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6696m.destroy();
    }
}
