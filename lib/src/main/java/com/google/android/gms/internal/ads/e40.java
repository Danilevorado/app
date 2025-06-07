package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class e40 extends k3.l2 {

    /* renamed from: m, reason: collision with root package name */
    private final Object f7621m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private volatile k3.p2 f7622n;

    @Override // k3.m2
    public final void O0(k3.p2 p2Var) {
        synchronized (this.f7621m) {
            this.f7622n = p2Var;
        }
    }

    @Override // k3.m2
    public final float c() throws RemoteException {
        throw new RemoteException();
    }

    @Override // k3.m2
    public final float e() throws RemoteException {
        throw new RemoteException();
    }

    @Override // k3.m2
    public final int g() throws RemoteException {
        throw new RemoteException();
    }

    @Override // k3.m2
    public final float h() throws RemoteException {
        throw new RemoteException();
    }

    @Override // k3.m2
    public final k3.p2 i() {
        k3.p2 p2Var;
        synchronized (this.f7621m) {
            p2Var = this.f7622n;
        }
        return p2Var;
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
