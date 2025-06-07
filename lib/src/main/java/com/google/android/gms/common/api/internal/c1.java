package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class c1 extends g1 {

    /* renamed from: r, reason: collision with root package name */
    private final SparseArray f5669r;

    private c1(d4.f fVar) {
        super(fVar, b4.e.p());
        this.f5669r = new SparseArray();
        this.f5639m.a("AutoManageHelper", this);
    }

    public static c1 t(d4.e eVar) {
        d4.f fVarD = LifecycleCallback.d(eVar);
        c1 c1Var = (c1) fVarD.d("AutoManageHelper", c1.class);
        return c1Var != null ? c1Var : new c1(fVarD);
    }

    private final b1 w(int i10) {
        if (this.f5669r.size() <= i10) {
            return null;
        }
        SparseArray sparseArray = this.f5669r;
        return (b1) sparseArray.get(sparseArray.keyAt(i10));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i10 = 0; i10 < this.f5669r.size(); i10++) {
            b1 b1VarW = w(i10);
            if (b1VarW != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(b1VarW.f5650m);
                printWriter.println(":");
                b1VarW.f5651n.d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.g1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        SparseArray sparseArray = this.f5669r;
        Log.d("AutoManageHelper", "onStart " + this.f5743n + " " + String.valueOf(sparseArray));
        if (this.f5744o.get() == null) {
            for (int i10 = 0; i10 < this.f5669r.size(); i10++) {
                b1 b1VarW = w(i10);
                if (b1VarW != null) {
                    b1VarW.f5651n.connect();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.g1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        for (int i10 = 0; i10 < this.f5669r.size(); i10++) {
            b1 b1VarW = w(i10);
            if (b1VarW != null) {
                b1VarW.f5651n.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.g1
    protected final void m(b4.b bVar, int i10) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i10 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        b1 b1Var = (b1) this.f5669r.get(i10);
        if (b1Var != null) {
            v(i10);
            GoogleApiClient.c cVar = b1Var.f5652o;
            if (cVar != null) {
                cVar.w0(bVar);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.g1
    protected final void n() {
        for (int i10 = 0; i10 < this.f5669r.size(); i10++) {
            b1 b1VarW = w(i10);
            if (b1VarW != null) {
                b1VarW.f5651n.connect();
            }
        }
    }

    public final void u(int i10, GoogleApiClient googleApiClient, GoogleApiClient.c cVar) {
        e4.p.m(googleApiClient, "GoogleApiClient instance cannot be null");
        e4.p.p(this.f5669r.indexOfKey(i10) < 0, "Already managing a GoogleApiClient with id " + i10);
        d1 d1Var = (d1) this.f5744o.get();
        Log.d("AutoManageHelper", "starting AutoManage for client " + i10 + " " + this.f5743n + " " + String.valueOf(d1Var));
        b1 b1Var = new b1(this, i10, googleApiClient, cVar);
        googleApiClient.j(b1Var);
        this.f5669r.put(i10, b1Var);
        if (this.f5743n && d1Var == null) {
            Log.d("AutoManageHelper", "connecting ".concat(googleApiClient.toString()));
            googleApiClient.connect();
        }
    }

    public final void v(int i10) {
        b1 b1Var = (b1) this.f5669r.get(i10);
        this.f5669r.remove(i10);
        if (b1Var != null) {
            b1Var.f5651n.k(b1Var);
            b1Var.f5651n.disconnect();
        }
    }
}
