package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class av2 {

    /* renamed from: a, reason: collision with root package name */
    private final hv2 f6261a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f6262b;

    /* renamed from: c, reason: collision with root package name */
    private final List f6263c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final Map f6264d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final String f6265e = "";

    /* renamed from: f, reason: collision with root package name */
    private final String f6266f;

    /* renamed from: g, reason: collision with root package name */
    private final bv2 f6267g;

    private av2(hv2 hv2Var, WebView webView, String str, List list, String str2, String str3, bv2 bv2Var) {
        this.f6261a = hv2Var;
        this.f6262b = webView;
        this.f6267g = bv2Var;
        this.f6266f = str2;
    }

    public static av2 b(hv2 hv2Var, WebView webView, String str, String str2) {
        return new av2(hv2Var, webView, null, null, str, "", bv2.HTML);
    }

    public static av2 c(hv2 hv2Var, WebView webView, String str, String str2) {
        return new av2(hv2Var, webView, null, null, str, "", bv2.JAVASCRIPT);
    }

    public final WebView a() {
        return this.f6262b;
    }

    public final bv2 d() {
        return this.f6267g;
    }

    public final hv2 e() {
        return this.f6261a;
    }

    public final String f() {
        return this.f6266f;
    }

    public final String g() {
        return this.f6265e;
    }

    public final List h() {
        return Collections.unmodifiableList(this.f6263c);
    }

    public final Map i() {
        return Collections.unmodifiableMap(this.f6264d);
    }
}
