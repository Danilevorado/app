package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class nw extends g3.h {

    /* renamed from: a, reason: collision with root package name */
    private final mw f12882a;

    /* renamed from: c, reason: collision with root package name */
    private final ru f12884c;

    /* renamed from: e, reason: collision with root package name */
    private final g3.c f12886e;

    /* renamed from: b, reason: collision with root package name */
    private final List f12883b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final d3.w f12885d = new d3.w();

    /* renamed from: f, reason: collision with root package name */
    private final List f12887f = new ArrayList();

    public nw(mw mwVar) {
        qu quVarK;
        qu ouVar;
        IBinder iBinder;
        this.f12882a = mwVar;
        ku kuVar = null;
        try {
            List listU = mwVar.u();
            if (listU != null) {
                for (Object obj : listU) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        ouVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        ouVar = iInterfaceQueryLocalInterface instanceof qu ? (qu) iInterfaceQueryLocalInterface : new ou(iBinder);
                    }
                    if (ouVar != null) {
                        this.f12883b.add(new ru(ouVar));
                    }
                }
            }
        } catch (RemoteException e5) {
            ze0.e("", e5);
        }
        try {
            List listV = this.f12882a.v();
            if (listV != null) {
                for (Object obj2 : listV) {
                    k3.r1 r1VarL5 = obj2 instanceof IBinder ? k3.q1.L5((IBinder) obj2) : null;
                    if (r1VarL5 != null) {
                        this.f12887f.add(new k3.s1(r1VarL5));
                    }
                }
            }
        } catch (RemoteException e10) {
            ze0.e("", e10);
        }
        try {
            quVarK = this.f12882a.k();
        } catch (RemoteException e11) {
            ze0.e("", e11);
        }
        ru ruVar = quVarK != null ? new ru(quVarK) : null;
        this.f12884c = ruVar;
        try {
            if (this.f12882a.i() != null) {
                kuVar = new ku(this.f12882a.i());
            }
        } catch (RemoteException e12) {
            ze0.e("", e12);
        }
        this.f12886e = kuVar;
    }

    @Override // g3.h
    public final String a() {
        try {
            return this.f12882a.m();
        } catch (RemoteException e5) {
            ze0.e("", e5);
            return null;
        }
    }

    @Override // g3.h
    public final String b() {
        try {
            return this.f12882a.p();
        } catch (RemoteException e5) {
            ze0.e("", e5);
            return null;
        }
    }

    @Override // g3.h
    public final String c() {
        try {
            return this.f12882a.o();
        } catch (RemoteException e5) {
            ze0.e("", e5);
            return null;
        }
    }

    @Override // g3.h
    public final String d() {
        try {
            return this.f12882a.q();
        } catch (RemoteException e5) {
            ze0.e("", e5);
            return null;
        }
    }

    @Override // g3.h
    public final g3.d e() {
        return this.f12884c;
    }

    @Override // g3.h
    public final List f() {
        return this.f12883b;
    }

    @Override // g3.h
    public final String g() {
        try {
            return this.f12882a.t();
        } catch (RemoteException e5) {
            ze0.e("", e5);
            return null;
        }
    }

    @Override // g3.h
    public final Double h() {
        try {
            double dC = this.f12882a.c();
            if (dC == -1.0d) {
                return null;
            }
            return Double.valueOf(dC);
        } catch (RemoteException e5) {
            ze0.e("", e5);
            return null;
        }
    }

    @Override // g3.h
    public final String i() {
        try {
            return this.f12882a.B();
        } catch (RemoteException e5) {
            ze0.e("", e5);
            return null;
        }
    }

    @Override // g3.h
    public final d3.w j() {
        try {
            if (this.f12882a.g() != null) {
                this.f12885d.c(this.f12882a.g());
            }
        } catch (RemoteException e5) {
            ze0.e("Exception occurred while getting video controller", e5);
        }
        return this.f12885d;
    }

    @Override // g3.h
    public final Object k() {
        try {
            l4.a aVarL = this.f12882a.l();
            if (aVarL != null) {
                return l4.b.L0(aVarL);
            }
            return null;
        } catch (RemoteException e5) {
            ze0.e("", e5);
            return null;
        }
    }
}
