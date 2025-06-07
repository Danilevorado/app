package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class ql0 extends rl0 {
    public ql0(nk0 nk0Var, pm pmVar, boolean z10) {
        super(nk0Var, pmVar, z10);
    }

    @Override // com.google.android.gms.internal.ads.vk0, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return m0(webView, str, null);
    }
}
