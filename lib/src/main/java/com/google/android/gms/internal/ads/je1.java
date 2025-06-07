package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class je1 extends yu implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, mf1 {

    /* renamed from: m, reason: collision with root package name */
    private final WeakReference f10460m;

    /* renamed from: n, reason: collision with root package name */
    private final Map f10461n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    private final Map f10462o = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    private final Map f10463p = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    private kd1 f10464q;

    /* renamed from: r, reason: collision with root package name */
    private oj f10465r;

    public je1(View view, HashMap map, HashMap map2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        j3.t.z();
        bg0.a(view, this);
        j3.t.z();
        bg0.b(view, this);
        this.f10460m = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.f10461n.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f10463p.putAll(this.f10461n);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.f10462o.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.f10463p.putAll(this.f10462o);
        this.f10465r = new oj(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.zu
    public final synchronized void G0(l4.a aVar) {
        if (this.f10464q != null) {
            Object objL0 = l4.b.L0(aVar);
            if (!(objL0 instanceof View)) {
                ze0.g("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.f10464q.s((View) objL0);
        }
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final View e() {
        return (View) this.f10460m.get();
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final synchronized View e0(String str) {
        WeakReference weakReference = (WeakReference) this.f10463p.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zu
    public final synchronized void f() {
        kd1 kd1Var = this.f10464q;
        if (kd1Var != null) {
            kd1Var.y(this);
            this.f10464q = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final FrameLayout g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final oj i() {
        return this.f10465r;
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final synchronized l4.a j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final synchronized String k() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final synchronized Map l() {
        return this.f10463p;
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final synchronized Map m() {
        return this.f10462o;
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final synchronized Map n() {
        return this.f10461n;
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final synchronized JSONObject o() {
        kd1 kd1Var = this.f10464q;
        if (kd1Var == null) {
            return null;
        }
        return kd1Var.U(e(), l(), n());
    }

    @Override // com.google.android.gms.internal.ads.zu
    public final synchronized void o3(l4.a aVar) {
        Object objL0 = l4.b.L0(aVar);
        if (!(objL0 instanceof kd1)) {
            ze0.g("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        kd1 kd1Var = this.f10464q;
        if (kd1Var != null) {
            kd1Var.y(this);
        }
        kd1 kd1Var2 = (kd1) objL0;
        if (!kd1Var2.z()) {
            ze0.d("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.f10464q = kd1Var2;
        kd1Var2.x(this);
        this.f10464q.p(e());
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        kd1 kd1Var = this.f10464q;
        if (kd1Var != null) {
            kd1Var.j(view, e(), l(), n(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        kd1 kd1Var = this.f10464q;
        if (kd1Var != null) {
            kd1Var.h(e(), l(), n(), kd1.D(e()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        kd1 kd1Var = this.f10464q;
        if (kd1Var != null) {
            kd1Var.h(e(), l(), n(), kd1.D(e()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        kd1 kd1Var = this.f10464q;
        if (kd1Var != null) {
            kd1Var.q(view, motionEvent, e());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final synchronized JSONObject p() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.mf1
    public final synchronized void w3(String str, View view, boolean z10) {
        this.f10463p.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f10461n.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }
}
