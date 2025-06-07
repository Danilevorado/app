package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import r3.c;

/* loaded from: classes.dex */
public final class r60 extends r3.c {

    /* renamed from: a, reason: collision with root package name */
    private final mw f14645a;

    /* renamed from: c, reason: collision with root package name */
    private final q60 f14647c;

    /* renamed from: d, reason: collision with root package name */
    private final c.a f14648d;

    /* renamed from: b, reason: collision with root package name */
    private final List f14646b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final List f14649e = new ArrayList();

    public r60(mw mwVar) {
        qu quVarK;
        this.f14645a = mwVar;
        p60 p60Var = null;
        try {
            List listU = mwVar.u();
            if (listU != null) {
                for (Object obj : listU) {
                    qu quVarL5 = obj instanceof IBinder ? pu.L5((IBinder) obj) : null;
                    if (quVarL5 != null) {
                        this.f14646b.add(new q60(quVarL5));
                    }
                }
            }
        } catch (RemoteException e5) {
            ze0.e("", e5);
        }
        try {
            List listV = this.f14645a.v();
            if (listV != null) {
                for (Object obj2 : listV) {
                    k3.r1 r1VarL5 = obj2 instanceof IBinder ? k3.q1.L5((IBinder) obj2) : null;
                    if (r1VarL5 != null) {
                        this.f14649e.add(new k3.s1(r1VarL5));
                    }
                }
            }
        } catch (RemoteException e10) {
            ze0.e("", e10);
        }
        try {
            quVarK = this.f14645a.k();
        } catch (RemoteException e11) {
            ze0.e("", e11);
        }
        q60 q60Var = quVarK != null ? new q60(quVarK) : null;
        this.f14647c = q60Var;
        try {
            if (this.f14645a.i() != null) {
                p60Var = new p60(this.f14645a.i());
            }
        } catch (RemoteException e12) {
            ze0.e("", e12);
        }
        this.f14648d = p60Var;
    }

    @Override // r3.c
    public final String a() {
        try {
            return this.f14645a.p();
        } catch (RemoteException e5) {
            ze0.e("", e5);
            return null;
        }
    }

    @Override // r3.c
    public final String b() {
        try {
            return this.f14645a.q();
        } catch (RemoteException e5) {
            ze0.e("", e5);
            return null;
        }
    }

    @Override // r3.c
    public final d3.u c() {
        k3.j2 j2VarH;
        try {
            j2VarH = this.f14645a.h();
        } catch (RemoteException e5) {
            ze0.e("", e5);
            j2VarH = null;
        }
        return d3.u.d(j2VarH);
    }

    @Override // r3.c
    protected final /* bridge */ /* synthetic */ Object d() {
        try {
            return this.f14645a.n();
        } catch (RemoteException e5) {
            ze0.e("", e5);
            return null;
        }
    }
}
