package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* loaded from: classes.dex */
final class lk implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final ValueCallback f11639m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ dk f11640n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ WebView f11641o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ boolean f11642p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ nk f11643q;

    lk(nk nkVar, final dk dkVar, final WebView webView, final boolean z10) {
        this.f11643q = nkVar;
        this.f11640n = dkVar;
        this.f11641o = webView;
        this.f11642p = z10;
        this.f11639m = new ValueCallback() { // from class: com.google.android.gms.internal.ads.kk
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                lk lkVar = this.f11110a;
                dk dkVar2 = dkVar;
                WebView webView2 = webView;
                boolean z11 = z10;
                lkVar.f11643q.d(dkVar2, webView2, (String) obj, z11);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f11641o.getSettings().getJavaScriptEnabled()) {
            try {
                this.f11641o.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f11639m);
            } catch (Throwable unused) {
                this.f11639m.onReceiveValue("");
            }
        }
    }
}
