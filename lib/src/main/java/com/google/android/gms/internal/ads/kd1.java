package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class kd1 extends ex0 {
    public static final c63 H = c63.A("3010", "3008", "1005", "1009", "2011", "2007");
    private final Context A;
    private final md1 B;
    private final t62 C;
    private final Map D;
    private final List E;
    private final pj F;
    private kb3 G;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f10965i;

    /* renamed from: j, reason: collision with root package name */
    private final pd1 f10966j;

    /* renamed from: k, reason: collision with root package name */
    private final xd1 f10967k;

    /* renamed from: l, reason: collision with root package name */
    private final pe1 f10968l;

    /* renamed from: m, reason: collision with root package name */
    private final ud1 f10969m;

    /* renamed from: n, reason: collision with root package name */
    private final ae1 f10970n;

    /* renamed from: o, reason: collision with root package name */
    private final w34 f10971o;

    /* renamed from: p, reason: collision with root package name */
    private final w34 f10972p;

    /* renamed from: q, reason: collision with root package name */
    private final w34 f10973q;

    /* renamed from: r, reason: collision with root package name */
    private final w34 f10974r;

    /* renamed from: s, reason: collision with root package name */
    private final w34 f10975s;

    /* renamed from: t, reason: collision with root package name */
    private mf1 f10976t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f10977u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f10978v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f10979w;

    /* renamed from: x, reason: collision with root package name */
    private final mc0 f10980x;

    /* renamed from: y, reason: collision with root package name */
    private final bg f10981y;

    /* renamed from: z, reason: collision with root package name */
    private final ff0 f10982z;

    public kd1(cx0 cx0Var, Executor executor, pd1 pd1Var, xd1 xd1Var, pe1 pe1Var, ud1 ud1Var, ae1 ae1Var, w34 w34Var, w34 w34Var2, w34 w34Var3, w34 w34Var4, w34 w34Var5, mc0 mc0Var, bg bgVar, ff0 ff0Var, Context context, md1 md1Var, t62 t62Var, pj pjVar) {
        super(cx0Var);
        this.f10965i = executor;
        this.f10966j = pd1Var;
        this.f10967k = xd1Var;
        this.f10968l = pe1Var;
        this.f10969m = ud1Var;
        this.f10970n = ae1Var;
        this.f10971o = w34Var;
        this.f10972p = w34Var2;
        this.f10973q = w34Var3;
        this.f10974r = w34Var4;
        this.f10975s = w34Var5;
        this.f10980x = mc0Var;
        this.f10981y = bgVar;
        this.f10982z = ff0Var;
        this.A = context;
        this.B = md1Var;
        this.C = t62Var;
        this.D = new HashMap();
        this.E = new ArrayList();
        this.F = pjVar;
    }

    public static boolean D(View view) {
        if (!((Boolean) k3.w.c().b(ir.f9902b9)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        j3.t.r();
        long jO = m3.b2.O(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (jO >= ((Integer) k3.w.c().b(ir.f9913c9)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final synchronized View F(Map map) {
        if (map == null) {
            return null;
        }
        c63 c63Var = H;
        int size = c63Var.size();
        int i10 = 0;
        while (i10 < size) {
            WeakReference weakReference = (WeakReference) map.get((String) c63Var.get(i10));
            i10++;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType G() {
        if (!((Boolean) k3.w.c().b(ir.f10106u7)).booleanValue()) {
            return null;
        }
        mf1 mf1Var = this.f10976t;
        if (mf1Var == null) {
            ze0.b("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        l4.a aVarJ = mf1Var.j();
        if (aVarJ != null) {
            return (ImageView.ScaleType) l4.b.L0(aVarJ);
        }
        return pe1.f13718k;
    }

    private final void I(String str, boolean z10) {
        if (!((Boolean) k3.w.c().b(ir.M4)).booleanValue()) {
            Y("Google", true);
            return;
        }
        ab3 ab3VarG0 = this.f10966j.g0();
        if (ab3VarG0 == null) {
            return;
        }
        this.G = kb3.D();
        qa3.q(ab3VarG0, new jd1(this, "Google", true), this.f10965i);
    }

    private final synchronized void J(View view, Map map, Map map2) {
        this.f10968l.d(this.f10976t);
        this.f10967k.j(view, map, map2, G());
        this.f10978v = true;
    }

    private final void K(View view, l4.a aVar) {
        nk0 nk0VarB0 = this.f10966j.b0();
        if (!this.f10969m.d() || aVar == null || nk0VarB0 == null || view == null) {
            return;
        }
        j3.t.a().b(aVar, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final synchronized void d0(mf1 mf1Var) {
        Iterator<String> itKeys;
        View view;
        xf xfVarC;
        if (this.f10977u) {
            return;
        }
        this.f10976t = mf1Var;
        this.f10968l.e(mf1Var);
        this.f10967k.p(mf1Var.e(), mf1Var.n(), mf1Var.m(), mf1Var, mf1Var);
        if (((Boolean) k3.w.c().b(ir.f10014m2)).booleanValue() && (xfVarC = this.f10981y.c()) != null) {
            xfVarC.b(mf1Var.e());
        }
        if (((Boolean) k3.w.c().b(ir.D1)).booleanValue()) {
            hn2 hn2Var = this.f8016b;
            if (hn2Var.f9259l0 && (itKeys = hn2Var.f9257k0.keys()) != null) {
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    WeakReference weakReference = (WeakReference) this.f10976t.l().get(next);
                    this.D.put(next, Boolean.FALSE);
                    if (weakReference != null && (view = (View) weakReference.get()) != null) {
                        oj ojVar = new oj(this.A, view);
                        this.E.add(ojVar);
                        ojVar.c(new id1(this, next));
                    }
                }
            }
        }
        if (mf1Var.i() != null) {
            mf1Var.i().c(this.f10980x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void e0(mf1 mf1Var) {
        this.f10967k.l(mf1Var.e(), mf1Var.l());
        if (mf1Var.g() != null) {
            mf1Var.g().setClickable(false);
            mf1Var.g().removeAllViews();
        }
        if (mf1Var.i() != null) {
            mf1Var.i().e(this.f10980x);
        }
        this.f10976t = null;
    }

    public static /* synthetic */ void V(kd1 kd1Var) {
        try {
            pd1 pd1Var = kd1Var.f10966j;
            int iN = pd1Var.N();
            if (iN == 1) {
                if (kd1Var.f10970n.b() != null) {
                    kd1Var.I("Google", true);
                    kd1Var.f10970n.b().x5((gv) kd1Var.f10971o.b());
                    return;
                }
                return;
            }
            if (iN == 2) {
                if (kd1Var.f10970n.a() != null) {
                    kd1Var.I("Google", true);
                    kd1Var.f10970n.a().e1((ev) kd1Var.f10972p.b());
                    return;
                }
                return;
            }
            if (iN == 3) {
                if (kd1Var.f10970n.d(pd1Var.k0()) != null) {
                    if (kd1Var.f10966j.c0() != null) {
                        kd1Var.Y("Google", true);
                    }
                    kd1Var.f10970n.d(kd1Var.f10966j.k0()).b2((jv) kd1Var.f10975s.b());
                    return;
                }
                return;
            }
            if (iN == 6) {
                if (kd1Var.f10970n.f() != null) {
                    kd1Var.I("Google", true);
                    kd1Var.f10970n.f().M1((mw) kd1Var.f10973q.b());
                    return;
                }
                return;
            }
            if (iN != 7) {
                ze0.d("Wrong native template id!");
                return;
            }
            ae1 ae1Var = kd1Var.f10970n;
            if (ae1Var.g() != null) {
                ae1Var.g().U1((h00) kd1Var.f10974r.b());
            }
        } catch (RemoteException e5) {
            ze0.e("RemoteException when notifyAdLoad is called", e5);
        }
    }

    public final synchronized boolean A() {
        return this.f10967k.F();
    }

    public final synchronized boolean B() {
        return this.f10967k.O();
    }

    public final boolean C() {
        return this.f10969m.d();
    }

    public final synchronized boolean E(Bundle bundle) {
        if (this.f10978v) {
            return true;
        }
        boolean zM = this.f10967k.m(bundle);
        this.f10978v = zM;
        return zM;
    }

    public final synchronized int H() {
        return this.f10967k.a();
    }

    public final md1 N() {
        return this.B;
    }

    public final String R() {
        return this.f10969m.b();
    }

    public final synchronized JSONObject T(View view, Map map, Map map2) {
        return this.f10967k.d(view, map, map2, G());
    }

    public final synchronized JSONObject U(View view, Map map, Map map2) {
        return this.f10967k.s(view, map, map2, G());
    }

    public final void W(View view) {
        l4.a aVarF0 = this.f10966j.f0();
        if (!this.f10969m.d() || aVarF0 == null || view == null) {
            return;
        }
        j3.t.a();
        if (((Boolean) k3.w.c().b(ir.G4)).booleanValue() && wu2.b()) {
            Object objL0 = l4.b.L0(aVarF0);
            if (objL0 instanceof yu2) {
                ((yu2) objL0).b(view, ev2.NOT_VISIBLE, "Ad overlay");
            }
        }
    }

    public final synchronized void X() {
        this.f10967k.g();
    }

    public final void Y(String str, boolean z10) {
        String str2;
        yy1 yy1Var;
        zy1 zy1Var;
        if (!this.f10969m.d() || TextUtils.isEmpty(str)) {
            return;
        }
        pd1 pd1Var = this.f10966j;
        nk0 nk0VarB0 = pd1Var.b0();
        nk0 nk0VarC0 = pd1Var.c0();
        if (nk0VarB0 == null && nk0VarC0 == null) {
            ze0.g("Omid display and video webview are null. Skipping initialization.");
            return;
        }
        boolean z11 = false;
        boolean z12 = nk0VarB0 != null;
        boolean z13 = nk0VarC0 != null;
        if (((Boolean) k3.w.c().b(ir.K4)).booleanValue()) {
            this.f10969m.a();
            int iB = this.f10969m.a().b();
            int i10 = iB - 1;
            if (i10 != 0) {
                if (i10 != 1) {
                    ze0.g("Unknown omid media type: " + (iB != 1 ? iB != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                    return;
                }
                if (nk0VarB0 == null) {
                    ze0.g("Omid media type was display but there was no display webview.");
                    return;
                } else {
                    z13 = false;
                    z11 = true;
                }
            } else {
                if (nk0VarC0 == null) {
                    ze0.g("Omid media type was video but there was no video webview.");
                    return;
                }
                z13 = true;
            }
        } else {
            z11 = z12;
        }
        if (z11) {
            str2 = null;
        } else {
            str2 = "javascript";
            nk0VarB0 = nk0VarC0;
        }
        String str3 = str2;
        nk0VarB0.P();
        if (!j3.t.a().d(this.A)) {
            ze0.g("Failed to initialize omid in InternalNativeAd");
            return;
        }
        ff0 ff0Var = this.f10982z;
        String str4 = ff0Var.f8253n + "." + ff0Var.f8254o;
        if (z13) {
            yy1Var = yy1.VIDEO;
            zy1Var = zy1.DEFINED_BY_JAVASCRIPT;
        } else {
            yy1Var = yy1.NATIVE_DISPLAY;
            zy1Var = this.f10966j.N() == 3 ? zy1.UNSPECIFIED : zy1.ONE_PIXEL;
        }
        l4.a aVarC = j3.t.a().c(str4, nk0VarB0.P(), "", "javascript", str3, str, zy1Var, yy1Var, this.f8016b.f9261m0);
        if (aVarC == null) {
            ze0.g("Failed to create omid session in InternalNativeAd");
            return;
        }
        this.f10966j.D(aVarC);
        nk0VarB0.i1(aVarC);
        if (z13) {
            j3.t.a().b(aVarC, nk0VarC0.z());
            this.f10979w = true;
        }
        if (z10) {
            j3.t.a().d0(aVarC);
            nk0VarB0.c("onSdkLoaded", new q.a());
        }
    }

    final /* synthetic */ void Z() {
        this.f10967k.i();
        this.f10966j.h();
    }

    @Override // com.google.android.gms.internal.ads.ex0
    public final synchronized void a() {
        this.f10977u = true;
        this.f10965i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.hd1
            @Override // java.lang.Runnable
            public final void run() {
                this.f9103m.Z();
            }
        });
        super.a();
    }

    final /* synthetic */ void a0(View view, boolean z10, int i10) {
        this.f10967k.f(view, this.f10976t.e(), this.f10976t.l(), this.f10976t.n(), z10, G(), i10);
    }

    @Override // com.google.android.gms.internal.ads.ex0
    public final void b() {
        this.f10965i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.dd1
            @Override // java.lang.Runnable
            public final void run() {
                kd1.V(this.f7264m);
            }
        });
        if (this.f10966j.N() != 7) {
            Executor executor = this.f10965i;
            final xd1 xd1Var = this.f10967k;
            xd1Var.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ed1
                @Override // java.lang.Runnable
                public final void run() {
                    xd1Var.o();
                }
            });
        }
        super.b();
    }

    final /* synthetic */ void b0(boolean z10) {
        this.f10967k.f(null, this.f10976t.e(), this.f10976t.l(), this.f10976t.n(), z10, G(), 0);
    }

    final /* synthetic */ void c0(View view) {
        K(view, this.f10966j.f0());
    }

    public final synchronized void h(View view, Map map, Map map2, boolean z10) {
        if (this.f10978v) {
            return;
        }
        if (((Boolean) k3.w.c().b(ir.D1)).booleanValue() && this.f8016b.f9259l0) {
            Iterator it = this.D.keySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) this.D.get((String) it.next())).booleanValue()) {
                    return;
                }
            }
        }
        if (!z10) {
            if (((Boolean) k3.w.c().b(ir.f10146y3)).booleanValue() && map != null) {
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    View view2 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                    if (view2 != null && D(view2)) {
                        J(view, map, map2);
                        return;
                    }
                }
            }
            return;
        }
        View viewF = F(map);
        if (viewF == null) {
            J(view, map, map2);
            return;
        }
        if (((Boolean) k3.w.c().b(ir.f10157z3)).booleanValue()) {
            if (D(viewF)) {
                J(view, map, map2);
                return;
            }
            return;
        }
        if (!((Boolean) k3.w.c().b(ir.A3)).booleanValue()) {
            J(view, map, map2);
            return;
        }
        Rect rect = new Rect();
        if (viewF.getGlobalVisibleRect(rect, null) && viewF.getHeight() == rect.height() && viewF.getWidth() == rect.width()) {
            J(view, map, map2);
        }
    }

    public final synchronized void i(k3.r1 r1Var) {
        this.f10967k.q(r1Var);
    }

    public final synchronized void j(View view, View view2, Map map, Map map2, boolean z10) {
        this.f10968l.c(this.f10976t);
        this.f10967k.t(view, view2, map, map2, z10, G());
        if (this.f10979w) {
            pd1 pd1Var = this.f10966j;
            if (pd1Var.c0() != null) {
                pd1Var.c0().c("onSdkAdUserInteractionClick", new q.a());
            }
        }
    }

    public final synchronized void k(final View view, final int i10) {
        if (((Boolean) k3.w.c().b(ir.J9)).booleanValue()) {
            mf1 mf1Var = this.f10976t;
            if (mf1Var == null) {
                ze0.b("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z10 = mf1Var instanceof je1;
                this.f10965i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ad1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6043m.a0(view, z10, i10);
                    }
                });
            }
        }
    }

    public final synchronized void l(String str) {
        this.f10967k.b0(str);
    }

    public final synchronized void m(Bundle bundle) {
        this.f10967k.u(bundle);
    }

    public final synchronized void n() {
        mf1 mf1Var = this.f10976t;
        if (mf1Var == null) {
            ze0.b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z10 = mf1Var instanceof je1;
            this.f10965i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.fd1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8227m.b0(z10);
                }
            });
        }
    }

    public final synchronized void o() {
        if (this.f10978v) {
            return;
        }
        this.f10967k.r();
    }

    public final void p(final View view) {
        if (!((Boolean) k3.w.c().b(ir.M4)).booleanValue()) {
            K(view, this.f10966j.f0());
            return;
        }
        kb3 kb3Var = this.G;
        if (kb3Var == null) {
            return;
        }
        kb3Var.b(new Runnable() { // from class: com.google.android.gms.internal.ads.bd1
            @Override // java.lang.Runnable
            public final void run() {
                this.f6430m.c0(view);
            }
        }, this.f10965i);
    }

    public final synchronized void q(View view, MotionEvent motionEvent, View view2) {
        this.f10967k.c(view, motionEvent, view2);
    }

    public final synchronized void r(Bundle bundle) {
        this.f10967k.b(bundle);
    }

    public final synchronized void s(View view) {
        this.f10967k.n(view);
    }

    public final synchronized void t() {
        this.f10967k.v();
    }

    public final synchronized void u(k3.o1 o1Var) {
        this.f10967k.e(o1Var);
    }

    public final synchronized void v(k3.c2 c2Var) {
        this.C.a(c2Var);
    }

    public final synchronized void w(jw jwVar) {
        this.f10967k.k(jwVar);
    }

    public final synchronized void x(final mf1 mf1Var) {
        if (((Boolean) k3.w.c().b(ir.B1)).booleanValue()) {
            m3.b2.f25197i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.gd1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8678m.d0(mf1Var);
                }
            });
        } else {
            d0(mf1Var);
        }
    }

    public final synchronized void y(final mf1 mf1Var) {
        if (((Boolean) k3.w.c().b(ir.B1)).booleanValue()) {
            m3.b2.f25197i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.cd1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6878m.e0(mf1Var);
                }
            });
        } else {
            e0(mf1Var);
        }
    }

    public final boolean z() {
        return this.f10969m.e();
    }
}
