package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: classes.dex */
final class qv2 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ WebView f14510m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f14511n;

    qv2(rv2 rv2Var, WebView webView, String str) {
        this.f14510m = webView;
        this.f14511n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14510m.loadUrl(this.f14511n);
    }
}
