package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class c72 {

    /* renamed from: a, reason: collision with root package name */
    private final h72 f6823a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6824b;

    /* renamed from: c, reason: collision with root package name */
    private k3.j2 f6825c;

    public c72(h72 h72Var, String str) {
        this.f6823a = h72Var;
        this.f6824b = str;
    }

    public final synchronized String a() {
        k3.j2 j2Var;
        try {
            j2Var = this.f6825c;
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
            return null;
        }
        return j2Var != null ? j2Var.h() : null;
    }

    public final synchronized String b() {
        k3.j2 j2Var;
        try {
            j2Var = this.f6825c;
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
            return null;
        }
        return j2Var != null ? j2Var.h() : null;
    }

    public final synchronized void d(k3.c4 c4Var, int i10) {
        this.f6825c = null;
        this.f6823a.b(c4Var, this.f6824b, new i72(i10), new b72(this));
    }

    public final synchronized boolean e() {
        return this.f6823a.a();
    }
}
