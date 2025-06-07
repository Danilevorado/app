package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pf1 implements xd1 {

    /* renamed from: a, reason: collision with root package name */
    private final d40 f13854a;

    /* renamed from: b, reason: collision with root package name */
    private final d21 f13855b;

    /* renamed from: c, reason: collision with root package name */
    private final j11 f13856c;

    /* renamed from: d, reason: collision with root package name */
    private final d91 f13857d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f13858e;

    /* renamed from: f, reason: collision with root package name */
    private final hn2 f13859f;

    /* renamed from: g, reason: collision with root package name */
    private final ff0 f13860g;

    /* renamed from: h, reason: collision with root package name */
    private final do2 f13861h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13862i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13863j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13864k = true;

    /* renamed from: l, reason: collision with root package name */
    private final z30 f13865l;

    /* renamed from: m, reason: collision with root package name */
    private final a40 f13866m;

    public pf1(z30 z30Var, a40 a40Var, d40 d40Var, d21 d21Var, j11 j11Var, d91 d91Var, Context context, hn2 hn2Var, ff0 ff0Var, do2 do2Var) {
        this.f13865l = z30Var;
        this.f13866m = a40Var;
        this.f13854a = d40Var;
        this.f13855b = d21Var;
        this.f13856c = j11Var;
        this.f13857d = d91Var;
        this.f13858e = context;
        this.f13859f = hn2Var;
        this.f13860g = ff0Var;
        this.f13861h = do2Var;
    }

    private final void w(View view) {
        try {
            d40 d40Var = this.f13854a;
            if (d40Var != null && !d40Var.F()) {
                this.f13854a.H3(l4.b.p1(view));
                this.f13856c.O();
                if (((Boolean) k3.w.c().b(ir.f9988j9)).booleanValue()) {
                    this.f13857d.r();
                    return;
                }
                return;
            }
            z30 z30Var = this.f13865l;
            if (z30Var != null && !z30Var.R5()) {
                this.f13865l.O5(l4.b.p1(view));
                this.f13856c.O();
                if (((Boolean) k3.w.c().b(ir.f9988j9)).booleanValue()) {
                    this.f13857d.r();
                    return;
                }
                return;
            }
            a40 a40Var = this.f13866m;
            if (a40Var == null || a40Var.v()) {
                return;
            }
            this.f13866m.O5(l4.b.p1(view));
            this.f13856c.O();
            if (((Boolean) k3.w.c().b(ir.f9988j9)).booleanValue()) {
                this.f13857d.r();
            }
        } catch (RemoteException e5) {
            ze0.h("Failed to call handleClick", e5);
        }
    }

    private static final HashMap x(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    map2.put((String) entry.getKey(), view);
                }
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final boolean F() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final boolean O() {
        return this.f13859f.M;
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final int a() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void b(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void b0(String str) {
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void c(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final JSONObject d(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void e(k3.o1 o1Var) {
        ze0.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void f(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i10) {
        String str;
        if (!this.f13863j) {
            str = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.";
        } else {
            if (this.f13859f.M) {
                w(view2);
                return;
            }
            str = "Custom click reporting for 3p ads failed. Ad unit id not in allow list.";
        }
        ze0.g(str);
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void h() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void i() {
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void j(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.f13862i) {
                this.f13862i = j3.t.u().n(this.f13858e, this.f13860g.f8252m, this.f13859f.D.toString(), this.f13861h.f7447f);
            }
            if (this.f13864k) {
                d40 d40Var = this.f13854a;
                if (d40Var != null && !d40Var.O()) {
                    this.f13854a.A();
                    this.f13855b.a();
                    return;
                }
                z30 z30Var = this.f13865l;
                if (z30Var != null && !z30Var.S5()) {
                    this.f13865l.B();
                    this.f13855b.a();
                    return;
                }
                a40 a40Var = this.f13866m;
                if (a40Var == null || a40Var.T5()) {
                    return;
                }
                this.f13866m.P5();
                this.f13855b.a();
            }
        } catch (RemoteException e5) {
            ze0.h("Failed to call recordImpression", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void k(jw jwVar) {
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void l(View view, Map map) {
        try {
            l4.a aVarP1 = l4.b.p1(view);
            d40 d40Var = this.f13854a;
            if (d40Var != null) {
                d40Var.I4(aVarP1);
                return;
            }
            z30 z30Var = this.f13865l;
            if (z30Var != null) {
                z30Var.H3(aVarP1);
                return;
            }
            a40 a40Var = this.f13866m;
            if (a40Var != null) {
                a40Var.S5(aVarP1);
            }
        } catch (RemoteException e5) {
            ze0.h("Failed to call untrackView", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final boolean m(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void n(View view) {
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void o() {
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc A[Catch: JSONException -> 0x0045, RemoteException -> 0x0122, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x0122, blocks: (B:2:0x0000, B:4:0x001c, B:8:0x0026, B:11:0x002f, B:13:0x0036, B:14:0x0045, B:16:0x004b, B:18:0x0057, B:21:0x0062, B:24:0x0069, B:26:0x007f, B:28:0x0087, B:43:0x00a6, B:33:0x0091, B:37:0x009a, B:46:0x00ad, B:47:0x00b1, B:48:0x00c6, B:50:0x00cc, B:54:0x00de, B:56:0x00ec, B:58:0x00f8, B:60:0x00fc, B:62:0x010d, B:64:0x0111), top: B:72:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.xd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(android.view.View r9, java.util.Map r10, java.util.Map r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pf1.p(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void q(k3.r1 r1Var) {
        ze0.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void r() {
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final JSONObject s(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void t(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) {
        if (this.f13863j && this.f13859f.M) {
            return;
        }
        w(view);
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void u(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void v() {
        this.f13863j = true;
    }
}
