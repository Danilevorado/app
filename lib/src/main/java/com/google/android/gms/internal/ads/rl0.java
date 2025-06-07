package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class rl0 extends vk0 {
    public rl0(nk0 nk0Var, pm pmVar, boolean z10) {
        super(nk0Var, pmVar, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse m0(WebView webView, String str, Map map) {
        if (!(webView instanceof nk0)) {
            ze0.g("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        nk0 nk0Var = (nk0) webView;
        zb0 zb0Var = this.G;
        if (zb0Var != null) {
            zb0Var.b(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.D(str, map);
        }
        if (nk0Var.G() != null) {
            nk0Var.G().E();
        }
        String str2 = (String) k3.w.c().b(nk0Var.I().i() ? ir.O : nk0Var.I0() ? ir.N : ir.M);
        j3.t.r();
        return m3.b2.P(nk0Var.getContext(), nk0Var.m().f8252m, str2);
    }
}
