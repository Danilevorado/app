package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;

/* loaded from: classes.dex */
public final class ol0 {

    /* renamed from: a, reason: collision with root package name */
    private final pl0 f13312a;

    /* renamed from: b, reason: collision with root package name */
    private final nl0 f13313b;

    public ol0(pl0 pl0Var, nl0 nl0Var) {
        this.f13313b = nl0Var;
        this.f13312a = pl0Var;
    }

    final /* synthetic */ void a(String str) {
        nl0 nl0Var = this.f13313b;
        Uri uri = Uri.parse(str);
        vk0 vk0VarV0 = ((hl0) nl0Var.f12692a).v0();
        if (vk0VarV0 == null) {
            ze0.d("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            vk0VarV0.k0(uri);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.pl0, com.google.android.gms.internal.ads.xl0] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Click string is empty, not proceeding.";
        } else {
            ?? r02 = this.f13312a;
            bg bgVarL = r02.L();
            if (bgVarL == null) {
                str2 = "Signal utils is empty, ignoring.";
            } else {
                xf xfVarC = bgVarL.c();
                if (xfVarC == null) {
                    str2 = "Signals object is empty, ignoring.";
                } else {
                    if (r02.getContext() != null) {
                        Context context = this.f13312a.getContext();
                        pl0 pl0Var = this.f13312a;
                        return xfVarC.h(context, str, (View) pl0Var, pl0Var.i());
                    }
                    str2 = "Context is null, ignoring.";
                }
            }
        }
        m3.n1.k(str2);
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.pl0, com.google.android.gms.internal.ads.xl0] */
    @JavascriptInterface
    public String getViewSignals() {
        String str;
        ?? r02 = this.f13312a;
        bg bgVarL = r02.L();
        if (bgVarL == null) {
            str = "Signal utils is empty, ignoring.";
        } else {
            xf xfVarC = bgVarL.c();
            if (xfVarC == null) {
                str = "Signals object is empty, ignoring.";
            } else {
                if (r02.getContext() != null) {
                    Context context = this.f13312a.getContext();
                    pl0 pl0Var = this.f13312a;
                    return xfVarC.d(context, (View) pl0Var, pl0Var.i());
                }
                str = "Context is null, ignoring.";
            }
        }
        m3.n1.k(str);
        return "";
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            ze0.g("URL is empty, ignoring message");
        } else {
            m3.b2.f25197i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ml0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12191m.a(str);
                }
            });
        }
    }
}
