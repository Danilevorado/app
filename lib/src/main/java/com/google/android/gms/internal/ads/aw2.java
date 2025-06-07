package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: classes.dex */
public final class aw2 extends zv2 {
    public aw2(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        i(webView);
    }
}
