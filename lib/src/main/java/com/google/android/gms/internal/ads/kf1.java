package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class kf1 {

    /* renamed from: a, reason: collision with root package name */
    private final dk1 f11010a;

    /* renamed from: b, reason: collision with root package name */
    private final qi1 f11011b;

    /* renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f11012c = null;

    public kf1(dk1 dk1Var, qi1 qi1Var) {
        this.f11010a = dk1Var;
        this.f11011b = qi1Var;
    }

    private static final int f(Context context, String str, int i10) throws NumberFormatException {
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        k3.t.b();
        return se0.z(context, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(final View view, final WindowManager windowManager) {
        nk0 nk0VarA = this.f11010a.a(k3.h4.v(), null, null);
        View view2 = (View) nk0VarA;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        nk0VarA.O0("/sendMessageToSdk", new gy() { // from class: com.google.android.gms.internal.ads.gf1
            @Override // com.google.android.gms.internal.ads.gy
            public final void a(Object obj, Map map) {
                this.f8698a.b((nk0) obj, map);
            }
        });
        nk0VarA.O0("/hideValidatorOverlay", new gy() { // from class: com.google.android.gms.internal.ads.hf1
            @Override // com.google.android.gms.internal.ads.gy
            public final void a(Object obj, Map map) {
                this.f9121a.c(windowManager, view, (nk0) obj, map);
            }
        });
        nk0VarA.O0("/open", new qy(null, null, null, null, null));
        this.f11011b.j(new WeakReference(nk0VarA), "/loadNativeAdPolicyViolations", new gy() { // from class: com.google.android.gms.internal.ads.if1
            @Override // com.google.android.gms.internal.ads.gy
            public final void a(Object obj, Map map) throws NumberFormatException {
                this.f9711a.e(view, windowManager, (nk0) obj, map);
            }
        });
        this.f11011b.j(new WeakReference(nk0VarA), "/showValidatorOverlay", new gy() { // from class: com.google.android.gms.internal.ads.jf1
            @Override // com.google.android.gms.internal.ads.gy
            public final void a(Object obj, Map map) {
                ze0.b("Show native ad policy validator overlay.");
                ((nk0) obj).z().setVisibility(0);
            }
        });
        return (View) nk0VarA;
    }

    final /* synthetic */ void b(nk0 nk0Var, Map map) {
        this.f11011b.g("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void c(WindowManager windowManager, View view, nk0 nk0Var, Map map) {
        ze0.b("Hide native ad policy validator overlay.");
        nk0Var.z().setVisibility(8);
        if (nk0Var.z().getWindowToken() != null) {
            windowManager.removeView(nk0Var.z());
        }
        nk0Var.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f11012c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.f11012c);
    }

    final /* synthetic */ void d(Map map, boolean z10) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.f11011b.g("sendMessageToNativeJs", map2);
    }

    final /* synthetic */ void e(final View view, final WindowManager windowManager, final nk0 nk0Var, final Map map) throws NumberFormatException {
        nk0Var.G().c0(new am0() { // from class: com.google.android.gms.internal.ads.ef1
            @Override // com.google.android.gms.internal.ads.am0
            public final void a(boolean z10) {
                this.f7737m.d(map, z10);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int iF = f(context, (String) map.get("validator_width"), ((Integer) k3.w.c().b(ir.f10161z7)).intValue());
        int iF2 = f(context, (String) map.get("validator_height"), ((Integer) k3.w.c().b(ir.A7)).intValue());
        int iF3 = f(context, (String) map.get("validator_x"), 0);
        int iF4 = f(context, (String) map.get("validator_y"), 0);
        nk0Var.c1(em0.b(iF, iF2));
        try {
            nk0Var.P().getSettings().setUseWideViewPort(((Boolean) k3.w.c().b(ir.B7)).booleanValue());
            nk0Var.P().getSettings().setLoadWithOverviewMode(((Boolean) k3.w.c().b(ir.C7)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsB = m3.z0.b();
        layoutParamsB.x = iF3;
        layoutParamsB.y = iF4;
        windowManager.updateViewLayout(nk0Var.z(), layoutParamsB);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i10 = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - iF4;
            this.f11012c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.ff1
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    View view2 = view;
                    nk0 nk0Var2 = nk0Var;
                    String str2 = str;
                    WindowManager.LayoutParams layoutParams = layoutParamsB;
                    int i11 = i10;
                    WindowManager windowManager2 = windowManager;
                    Rect rect2 = new Rect();
                    if (!view2.getGlobalVisibleRect(rect2) || nk0Var2.z().getWindowToken() == null) {
                        return;
                    }
                    layoutParams.y = (("1".equals(str2) || "2".equals(str2)) ? rect2.bottom : rect2.top) - i11;
                    windowManager2.updateViewLayout(nk0Var2.z(), layoutParams);
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.f11012c);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        nk0Var.loadUrl(str2);
    }
}
