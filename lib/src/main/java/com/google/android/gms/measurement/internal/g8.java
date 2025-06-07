package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import e4.c;

/* loaded from: classes.dex */
public final class g8 implements ServiceConnection, c.a, c.b {

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f19948m;

    /* renamed from: n, reason: collision with root package name */
    private volatile o3 f19949n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ h8 f19950o;

    protected g8(h8 h8Var) {
        this.f19950o = h8Var;
    }

    @Override // e4.c.a
    public final void C(int i10) {
        e4.p.e("MeasurementServiceConnection.onConnectionSuspended");
        this.f19950o.f20269a.b().o().a("Service connection suspended");
        this.f19950o.f20269a.B().y(new e8(this));
    }

    @Override // e4.c.a
    public final void L0(Bundle bundle) {
        e4.p.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                e4.p.l(this.f19949n);
                this.f19950o.f20269a.B().y(new d8(this, (x4.f) this.f19949n.H()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f19949n = null;
                this.f19948m = false;
            }
        }
    }

    public final void b(Intent intent) {
        this.f19950o.f();
        Context contextA = this.f19950o.f20269a.a();
        h4.a aVarB = h4.a.b();
        synchronized (this) {
            if (this.f19948m) {
                this.f19950o.f20269a.b().t().a("Connection attempt already in progress");
                return;
            }
            this.f19950o.f20269a.b().t().a("Using local app measurement service");
            this.f19948m = true;
            aVarB.a(contextA, intent, this.f19950o.f19988c, 129);
        }
    }

    public final void c() {
        this.f19950o.f();
        Context contextA = this.f19950o.f20269a.a();
        synchronized (this) {
            if (this.f19948m) {
                this.f19950o.f20269a.b().t().a("Connection attempt already in progress");
                return;
            }
            if (this.f19949n != null && (this.f19949n.i() || this.f19949n.a())) {
                this.f19950o.f20269a.b().t().a("Already awaiting connection attempt");
                return;
            }
            this.f19949n = new o3(contextA, Looper.getMainLooper(), this, this);
            this.f19950o.f20269a.b().t().a("Connecting to remote service");
            this.f19948m = true;
            e4.p.l(this.f19949n);
            this.f19949n.u();
        }
    }

    public final void d() {
        if (this.f19949n != null && (this.f19949n.a() || this.f19949n.i())) {
            this.f19949n.q();
        }
        this.f19949n = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e4.p.e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f19948m = false;
                this.f19950o.f20269a.b().p().a("Service connected with null binder");
                return;
            }
            x4.f j3Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    j3Var = iInterfaceQueryLocalInterface instanceof x4.f ? (x4.f) iInterfaceQueryLocalInterface : new j3(iBinder);
                    this.f19950o.f20269a.b().t().a("Bound to IMeasurementService interface");
                } else {
                    this.f19950o.f20269a.b().p().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f19950o.f20269a.b().p().a("Service connect failed to get IMeasurementService");
            }
            if (j3Var == null) {
                this.f19948m = false;
                try {
                    h4.a.b().c(this.f19950o.f20269a.a(), this.f19950o.f19988c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f19950o.f20269a.B().y(new b8(this, j3Var));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        e4.p.e("MeasurementServiceConnection.onServiceDisconnected");
        this.f19950o.f20269a.b().o().a("Service disconnected");
        this.f19950o.f20269a.B().y(new c8(this, componentName));
    }

    @Override // e4.c.b
    public final void w0(b4.b bVar) {
        e4.p.e("MeasurementServiceConnection.onConnectionFailed");
        s3 s3VarE = this.f19950o.f20269a.E();
        if (s3VarE != null) {
            s3VarE.u().b("Service connection failed", bVar);
        }
        synchronized (this) {
            this.f19948m = false;
            this.f19949n = null;
        }
        this.f19950o.f20269a.B().y(new f8(this));
    }
}
