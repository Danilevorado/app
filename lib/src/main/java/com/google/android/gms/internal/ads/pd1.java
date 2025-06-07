package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class pd1 {

    /* renamed from: a, reason: collision with root package name */
    private int f13690a;

    /* renamed from: b, reason: collision with root package name */
    private k3.m2 f13691b;

    /* renamed from: c, reason: collision with root package name */
    private ju f13692c;

    /* renamed from: d, reason: collision with root package name */
    private View f13693d;

    /* renamed from: e, reason: collision with root package name */
    private List f13694e;

    /* renamed from: g, reason: collision with root package name */
    private k3.a3 f13696g;

    /* renamed from: h, reason: collision with root package name */
    private Bundle f13697h;

    /* renamed from: i, reason: collision with root package name */
    private nk0 f13698i;

    /* renamed from: j, reason: collision with root package name */
    private nk0 f13699j;

    /* renamed from: k, reason: collision with root package name */
    private nk0 f13700k;

    /* renamed from: l, reason: collision with root package name */
    private l4.a f13701l;

    /* renamed from: m, reason: collision with root package name */
    private View f13702m;

    /* renamed from: n, reason: collision with root package name */
    private ab3 f13703n;

    /* renamed from: o, reason: collision with root package name */
    private View f13704o;

    /* renamed from: p, reason: collision with root package name */
    private l4.a f13705p;

    /* renamed from: q, reason: collision with root package name */
    private double f13706q;

    /* renamed from: r, reason: collision with root package name */
    private qu f13707r;

    /* renamed from: s, reason: collision with root package name */
    private qu f13708s;

    /* renamed from: t, reason: collision with root package name */
    private String f13709t;

    /* renamed from: w, reason: collision with root package name */
    private float f13712w;

    /* renamed from: x, reason: collision with root package name */
    private String f13713x;

    /* renamed from: u, reason: collision with root package name */
    private final q.g f13710u = new q.g();

    /* renamed from: v, reason: collision with root package name */
    private final q.g f13711v = new q.g();

    /* renamed from: f, reason: collision with root package name */
    private List f13695f = Collections.emptyList();

    public static pd1 F(z30 z30Var) {
        try {
            od1 od1VarJ = J(z30Var.w3(), null);
            ju juVarX4 = z30Var.x4();
            View view = (View) L(z30Var.L5());
            String strP = z30Var.p();
            List listN5 = z30Var.N5();
            String strN = z30Var.n();
            Bundle bundleE = z30Var.e();
            String strM = z30Var.m();
            View view2 = (View) L(z30Var.M5());
            l4.a aVarL = z30Var.l();
            String strQ = z30Var.q();
            String strO = z30Var.o();
            double dC = z30Var.c();
            qu quVarK5 = z30Var.K5();
            pd1 pd1Var = new pd1();
            pd1Var.f13690a = 2;
            pd1Var.f13691b = od1VarJ;
            pd1Var.f13692c = juVarX4;
            pd1Var.f13693d = view;
            pd1Var.w("headline", strP);
            pd1Var.f13694e = listN5;
            pd1Var.w("body", strN);
            pd1Var.f13697h = bundleE;
            pd1Var.w("call_to_action", strM);
            pd1Var.f13702m = view2;
            pd1Var.f13705p = aVarL;
            pd1Var.w("store", strQ);
            pd1Var.w("price", strO);
            pd1Var.f13706q = dC;
            pd1Var.f13707r = quVarK5;
            return pd1Var;
        } catch (RemoteException e5) {
            ze0.h("Failed to get native ad from app install ad mapper", e5);
            return null;
        }
    }

    public static pd1 G(a40 a40Var) {
        try {
            od1 od1VarJ = J(a40Var.w3(), null);
            ju juVarX4 = a40Var.x4();
            View view = (View) L(a40Var.i());
            String strP = a40Var.p();
            List listN5 = a40Var.N5();
            String strN = a40Var.n();
            Bundle bundleC = a40Var.c();
            String strM = a40Var.m();
            View view2 = (View) L(a40Var.L5());
            l4.a aVarM5 = a40Var.M5();
            String strL = a40Var.l();
            qu quVarK5 = a40Var.K5();
            pd1 pd1Var = new pd1();
            pd1Var.f13690a = 1;
            pd1Var.f13691b = od1VarJ;
            pd1Var.f13692c = juVarX4;
            pd1Var.f13693d = view;
            pd1Var.w("headline", strP);
            pd1Var.f13694e = listN5;
            pd1Var.w("body", strN);
            pd1Var.f13697h = bundleC;
            pd1Var.w("call_to_action", strM);
            pd1Var.f13702m = view2;
            pd1Var.f13705p = aVarM5;
            pd1Var.w("advertiser", strL);
            pd1Var.f13708s = quVarK5;
            return pd1Var;
        } catch (RemoteException e5) {
            ze0.h("Failed to get native ad from content ad mapper", e5);
            return null;
        }
    }

    public static pd1 H(z30 z30Var) {
        try {
            return K(J(z30Var.w3(), null), z30Var.x4(), (View) L(z30Var.L5()), z30Var.p(), z30Var.N5(), z30Var.n(), z30Var.e(), z30Var.m(), (View) L(z30Var.M5()), z30Var.l(), z30Var.q(), z30Var.o(), z30Var.c(), z30Var.K5(), null, 0.0f);
        } catch (RemoteException e5) {
            ze0.h("Failed to get native ad assets from app install ad mapper", e5);
            return null;
        }
    }

    public static pd1 I(a40 a40Var) {
        try {
            return K(J(a40Var.w3(), null), a40Var.x4(), (View) L(a40Var.i()), a40Var.p(), a40Var.N5(), a40Var.n(), a40Var.c(), a40Var.m(), (View) L(a40Var.L5()), a40Var.M5(), null, null, -1.0d, a40Var.K5(), a40Var.l(), 0.0f);
        } catch (RemoteException e5) {
            ze0.h("Failed to get native ad assets from content ad mapper", e5);
            return null;
        }
    }

    private static od1 J(k3.m2 m2Var, d40 d40Var) {
        if (m2Var == null) {
            return null;
        }
        return new od1(m2Var, d40Var);
    }

    private static pd1 K(k3.m2 m2Var, ju juVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, l4.a aVar, String str4, String str5, double d10, qu quVar, String str6, float f5) {
        pd1 pd1Var = new pd1();
        pd1Var.f13690a = 6;
        pd1Var.f13691b = m2Var;
        pd1Var.f13692c = juVar;
        pd1Var.f13693d = view;
        pd1Var.w("headline", str);
        pd1Var.f13694e = list;
        pd1Var.w("body", str2);
        pd1Var.f13697h = bundle;
        pd1Var.w("call_to_action", str3);
        pd1Var.f13702m = view2;
        pd1Var.f13705p = aVar;
        pd1Var.w("store", str4);
        pd1Var.w("price", str5);
        pd1Var.f13706q = d10;
        pd1Var.f13707r = quVar;
        pd1Var.w("advertiser", str6);
        pd1Var.q(f5);
        return pd1Var;
    }

    private static Object L(l4.a aVar) {
        if (aVar == null) {
            return null;
        }
        return l4.b.L0(aVar);
    }

    public static pd1 d0(d40 d40Var) {
        try {
            return K(J(d40Var.j(), d40Var), d40Var.k(), (View) L(d40Var.n()), d40Var.t(), d40Var.v(), d40Var.q(), d40Var.i(), d40Var.r(), (View) L(d40Var.m()), d40Var.p(), d40Var.u(), d40Var.B(), d40Var.c(), d40Var.l(), d40Var.o(), d40Var.e());
        } catch (RemoteException e5) {
            ze0.h("Failed to get native ad assets from unified ad mapper", e5);
            return null;
        }
    }

    public final synchronized double A() {
        return this.f13706q;
    }

    public final synchronized void B(nk0 nk0Var) {
        this.f13698i = nk0Var;
    }

    public final synchronized void C(View view) {
        this.f13704o = view;
    }

    public final synchronized void D(l4.a aVar) {
        this.f13701l = aVar;
    }

    public final synchronized boolean E() {
        return this.f13699j != null;
    }

    public final synchronized float M() {
        return this.f13712w;
    }

    public final synchronized int N() {
        return this.f13690a;
    }

    public final synchronized Bundle O() {
        if (this.f13697h == null) {
            this.f13697h = new Bundle();
        }
        return this.f13697h;
    }

    public final synchronized View P() {
        return this.f13693d;
    }

    public final synchronized View Q() {
        return this.f13702m;
    }

    public final synchronized View R() {
        return this.f13704o;
    }

    public final synchronized q.g S() {
        return this.f13710u;
    }

    public final synchronized q.g T() {
        return this.f13711v;
    }

    public final synchronized k3.m2 U() {
        return this.f13691b;
    }

    public final synchronized k3.a3 V() {
        return this.f13696g;
    }

    public final synchronized ju W() {
        return this.f13692c;
    }

    public final qu X() {
        List list = this.f13694e;
        if (list != null && !list.isEmpty()) {
            Object obj = this.f13694e.get(0);
            if (obj instanceof IBinder) {
                return pu.L5((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized qu Y() {
        return this.f13707r;
    }

    public final synchronized qu Z() {
        return this.f13708s;
    }

    public final synchronized String a() {
        return e("headline");
    }

    public final synchronized nk0 a0() {
        return this.f13699j;
    }

    public final synchronized String b() {
        return this.f13713x;
    }

    public final synchronized nk0 b0() {
        return this.f13700k;
    }

    public final synchronized String c() {
        return e("price");
    }

    public final synchronized nk0 c0() {
        return this.f13698i;
    }

    public final synchronized String d() {
        return e("store");
    }

    public final synchronized String e(String str) {
        return (String) this.f13711v.get(str);
    }

    public final synchronized l4.a e0() {
        return this.f13705p;
    }

    public final synchronized List f() {
        return this.f13694e;
    }

    public final synchronized l4.a f0() {
        return this.f13701l;
    }

    public final synchronized List g() {
        return this.f13695f;
    }

    public final synchronized ab3 g0() {
        return this.f13703n;
    }

    public final synchronized void h() {
        nk0 nk0Var = this.f13698i;
        if (nk0Var != null) {
            nk0Var.destroy();
            this.f13698i = null;
        }
        nk0 nk0Var2 = this.f13699j;
        if (nk0Var2 != null) {
            nk0Var2.destroy();
            this.f13699j = null;
        }
        nk0 nk0Var3 = this.f13700k;
        if (nk0Var3 != null) {
            nk0Var3.destroy();
            this.f13700k = null;
        }
        this.f13701l = null;
        this.f13710u.clear();
        this.f13711v.clear();
        this.f13691b = null;
        this.f13692c = null;
        this.f13693d = null;
        this.f13694e = null;
        this.f13697h = null;
        this.f13702m = null;
        this.f13704o = null;
        this.f13705p = null;
        this.f13707r = null;
        this.f13708s = null;
        this.f13709t = null;
    }

    public final synchronized String h0() {
        return e("advertiser");
    }

    public final synchronized void i(ju juVar) {
        this.f13692c = juVar;
    }

    public final synchronized String i0() {
        return e("body");
    }

    public final synchronized void j(String str) {
        this.f13709t = str;
    }

    public final synchronized String j0() {
        return e("call_to_action");
    }

    public final synchronized void k(k3.a3 a3Var) {
        this.f13696g = a3Var;
    }

    public final synchronized String k0() {
        return this.f13709t;
    }

    public final synchronized void l(qu quVar) {
        this.f13707r = quVar;
    }

    public final synchronized void m(String str, cu cuVar) {
        if (cuVar == null) {
            this.f13710u.remove(str);
        } else {
            this.f13710u.put(str, cuVar);
        }
    }

    public final synchronized void n(nk0 nk0Var) {
        this.f13699j = nk0Var;
    }

    public final synchronized void o(List list) {
        this.f13694e = list;
    }

    public final synchronized void p(qu quVar) {
        this.f13708s = quVar;
    }

    public final synchronized void q(float f5) {
        this.f13712w = f5;
    }

    public final synchronized void r(List list) {
        this.f13695f = list;
    }

    public final synchronized void s(nk0 nk0Var) {
        this.f13700k = nk0Var;
    }

    public final synchronized void t(ab3 ab3Var) {
        this.f13703n = ab3Var;
    }

    public final synchronized void u(String str) {
        this.f13713x = str;
    }

    public final synchronized void v(double d10) {
        this.f13706q = d10;
    }

    public final synchronized void w(String str, String str2) {
        if (str2 == null) {
            this.f13711v.remove(str);
        } else {
            this.f13711v.put(str, str2);
        }
    }

    public final synchronized void x(int i10) {
        this.f13690a = i10;
    }

    public final synchronized void y(k3.m2 m2Var) {
        this.f13691b = m2Var;
    }

    public final synchronized void z(View view) {
        this.f13702m = view;
    }
}
