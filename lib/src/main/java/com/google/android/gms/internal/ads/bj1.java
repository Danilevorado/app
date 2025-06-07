package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import d3.w;

/* loaded from: classes.dex */
public final class bj1 extends w.a {

    /* renamed from: a, reason: collision with root package name */
    private final pd1 f6505a;

    public bj1(pd1 pd1Var) {
        this.f6505a = pd1Var;
    }

    private static k3.p2 f(pd1 pd1Var) {
        k3.m2 m2VarU = pd1Var.U();
        if (m2VarU == null) {
            return null;
        }
        try {
            return m2VarU.i();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // d3.w.a
    public final void a() {
        k3.p2 p2VarF = f(this.f6505a);
        if (p2VarF == null) {
            return;
        }
        try {
            p2VarF.c();
        } catch (RemoteException e5) {
            ze0.h("Unable to call onVideoEnd()", e5);
        }
    }

    @Override // d3.w.a
    public final void c() {
        k3.p2 p2VarF = f(this.f6505a);
        if (p2VarF == null) {
            return;
        }
        try {
            p2VarF.h();
        } catch (RemoteException e5) {
            ze0.h("Unable to call onVideoEnd()", e5);
        }
    }

    @Override // d3.w.a
    public final void e() {
        k3.p2 p2VarF = f(this.f6505a);
        if (p2VarF == null) {
            return;
        }
        try {
            p2VarF.i();
        } catch (RemoteException e5) {
            ze0.h("Unable to call onVideoEnd()", e5);
        }
    }
}
