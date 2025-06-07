package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import e4.c;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class xl {

    /* renamed from: a, reason: collision with root package name */
    private ScheduledFuture f17620a = null;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f17621b = new sl(this);

    /* renamed from: c, reason: collision with root package name */
    private final Object f17622c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private am f17623d;

    /* renamed from: e, reason: collision with root package name */
    private Context f17624e;

    /* renamed from: f, reason: collision with root package name */
    private dm f17625f;

    static /* bridge */ /* synthetic */ void h(xl xlVar) {
        synchronized (xlVar.f17622c) {
            am amVar = xlVar.f17623d;
            if (amVar == null) {
                return;
            }
            if (amVar.a() || xlVar.f17623d.i()) {
                xlVar.f17623d.q();
            }
            xlVar.f17623d = null;
            xlVar.f17625f = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        synchronized (this.f17622c) {
            if (this.f17624e != null && this.f17623d == null) {
                am amVarD = d(new ul(this), new vl(this));
                this.f17623d = amVarD;
                amVarD.u();
            }
        }
    }

    public final long a(bm bmVar) {
        synchronized (this.f17622c) {
            if (this.f17625f == null) {
                return -2L;
            }
            if (this.f17623d.n0()) {
                try {
                    return this.f17625f.w3(bmVar);
                } catch (RemoteException e5) {
                    ze0.e("Unable to call into cache service.", e5);
                }
            }
            return -2L;
        }
    }

    public final yl b(bm bmVar) {
        synchronized (this.f17622c) {
            if (this.f17625f == null) {
                return new yl();
            }
            try {
                if (this.f17623d.n0()) {
                    return this.f17625f.K5(bmVar);
                }
                return this.f17625f.x4(bmVar);
            } catch (RemoteException e5) {
                ze0.e("Unable to call into cache service.", e5);
                return new yl();
            }
        }
    }

    protected final synchronized am d(c.a aVar, c.b bVar) {
        return new am(this.f17624e, j3.t.v().b(), aVar, bVar);
    }

    public final void i(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f17622c) {
            if (this.f17624e != null) {
                return;
            }
            this.f17624e = context.getApplicationContext();
            if (((Boolean) k3.w.c().b(ir.Q3)).booleanValue()) {
                l();
            } else {
                if (((Boolean) k3.w.c().b(ir.P3)).booleanValue()) {
                    j3.t.d().c(new tl(this));
                }
            }
        }
    }

    public final void j() {
        if (((Boolean) k3.w.c().b(ir.R3)).booleanValue()) {
            synchronized (this.f17622c) {
                l();
                ScheduledFuture scheduledFuture = this.f17620a;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f17620a = of0.f13189d.schedule(this.f17621b, ((Long) k3.w.c().b(ir.S3)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }
}
