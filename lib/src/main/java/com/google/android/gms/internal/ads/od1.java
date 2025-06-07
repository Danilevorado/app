package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class od1 extends k3.l2 {

    /* renamed from: m, reason: collision with root package name */
    private final Object f13157m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private final k3.m2 f13158n;

    /* renamed from: o, reason: collision with root package name */
    private final d40 f13159o;

    public od1(k3.m2 m2Var, d40 d40Var) {
        this.f13158n = m2Var;
        this.f13159o = d40Var;
    }

    @Override // k3.m2
    public final void O0(k3.p2 p2Var) {
        synchronized (this.f13157m) {
            k3.m2 m2Var = this.f13158n;
            if (m2Var != null) {
                m2Var.O0(p2Var);
            }
        }
    }

    @Override // k3.m2
    public final float c() throws RemoteException {
        throw new RemoteException();
    }

    @Override // k3.m2
    public final float e() {
        d40 d40Var = this.f13159o;
        if (d40Var != null) {
            return d40Var.h();
        }
        return 0.0f;
    }

    @Override // k3.m2
    public final int g() throws RemoteException {
        throw new RemoteException();
    }

    @Override // k3.m2
    public final float h() {
        d40 d40Var = this.f13159o;
        if (d40Var != null) {
            return d40Var.g();
        }
        return 0.0f;
    }

    @Override // k3.m2
    public final k3.p2 i() {
        synchronized (this.f13157m) {
            k3.m2 m2Var = this.f13158n;
            if (m2Var == null) {
                return null;
            }
            return m2Var.i();
        }
    }

    @Override // k3.m2
    public final void k() throws RemoteException {
        throw new RemoteException();
    }

    @Override // k3.m2
    public final void l() throws RemoteException {
        throw new RemoteException();
    }

    @Override // k3.m2
    public final void m() throws RemoteException {
        throw new RemoteException();
    }

    @Override // k3.m2
    public final boolean o() throws RemoteException {
        throw new RemoteException();
    }

    @Override // k3.m2
    public final boolean p() throws RemoteException {
        throw new RemoteException();
    }

    @Override // k3.m2
    public final boolean q() throws RemoteException {
        throw new RemoteException();
    }

    @Override // k3.m2
    public final void x0(boolean z10) throws RemoteException {
        throw new RemoteException();
    }
}
