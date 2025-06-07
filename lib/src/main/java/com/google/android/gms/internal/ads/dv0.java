package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class dv0 extends zu0 {

    /* renamed from: i, reason: collision with root package name */
    private final Context f7507i;

    /* renamed from: j, reason: collision with root package name */
    private final View f7508j;

    /* renamed from: k, reason: collision with root package name */
    private final nk0 f7509k;

    /* renamed from: l, reason: collision with root package name */
    private final in2 f7510l;

    /* renamed from: m, reason: collision with root package name */
    private final bx0 f7511m;

    /* renamed from: n, reason: collision with root package name */
    private final ae1 f7512n;

    /* renamed from: o, reason: collision with root package name */
    private final h91 f7513o;

    /* renamed from: p, reason: collision with root package name */
    private final w34 f7514p;

    /* renamed from: q, reason: collision with root package name */
    private final Executor f7515q;

    /* renamed from: r, reason: collision with root package name */
    private k3.h4 f7516r;

    dv0(cx0 cx0Var, Context context, in2 in2Var, View view, nk0 nk0Var, bx0 bx0Var, ae1 ae1Var, h91 h91Var, w34 w34Var, Executor executor) {
        super(cx0Var);
        this.f7507i = context;
        this.f7508j = view;
        this.f7509k = nk0Var;
        this.f7510l = in2Var;
        this.f7511m = bx0Var;
        this.f7512n = ae1Var;
        this.f7513o = h91Var;
        this.f7514p = w34Var;
        this.f7515q = executor;
    }

    public static /* synthetic */ void o(dv0 dv0Var) {
        ae1 ae1Var = dv0Var.f7512n;
        if (ae1Var.e() == null) {
            return;
        }
        try {
            ae1Var.e().N0((k3.q0) dv0Var.f7514p.b(), l4.b.p1(dv0Var.f7507i));
        } catch (RemoteException e5) {
            ze0.e("RemoteException when notifyAdLoad is called", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.ex0
    public final void b() {
        this.f7515q.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.cv0
            @Override // java.lang.Runnable
            public final void run() {
                dv0.o(this.f7086m);
            }
        });
        super.b();
    }

    @Override // com.google.android.gms.internal.ads.zu0
    public final int h() {
        if (((Boolean) k3.w.c().b(ir.f10019m7)).booleanValue() && this.f8016b.f9251h0) {
            if (!((Boolean) k3.w.c().b(ir.f10029n7)).booleanValue()) {
                return 0;
            }
        }
        return this.f8015a.f16413b.f15924b.f11675c;
    }

    @Override // com.google.android.gms.internal.ads.zu0
    public final View i() {
        return this.f7508j;
    }

    @Override // com.google.android.gms.internal.ads.zu0
    public final k3.m2 j() {
        try {
            return this.f7511m.a();
        } catch (io2 unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zu0
    public final in2 k() {
        k3.h4 h4Var = this.f7516r;
        if (h4Var != null) {
            return ho2.b(h4Var);
        }
        hn2 hn2Var = this.f8016b;
        if (hn2Var.f9243d0) {
            for (String str : hn2Var.f9236a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new in2(this.f7508j.getWidth(), this.f7508j.getHeight(), false);
        }
        return (in2) this.f8016b.f9271s.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zu0
    public final in2 l() {
        return this.f7510l;
    }

    @Override // com.google.android.gms.internal.ads.zu0
    public final void m() {
        this.f7513o.a();
    }

    @Override // com.google.android.gms.internal.ads.zu0
    public final void n(ViewGroup viewGroup, k3.h4 h4Var) {
        nk0 nk0Var;
        if (viewGroup == null || (nk0Var = this.f7509k) == null) {
            return;
        }
        nk0Var.c1(em0.c(h4Var));
        viewGroup.setMinimumHeight(h4Var.f24653o);
        viewGroup.setMinimumWidth(h4Var.f24656r);
        this.f7516r = h4Var;
    }
}
