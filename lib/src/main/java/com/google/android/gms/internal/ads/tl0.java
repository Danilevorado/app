package com.google.android.gms.internal.ads;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class tl0 extends rl0 {
    public tl0(nk0 nk0Var, pm pmVar, boolean z10) {
        super(nk0Var, pmVar, z10);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return m0(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
