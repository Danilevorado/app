package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public abstract class b extends BasePendingResult implements d4.c {

    /* renamed from: q, reason: collision with root package name */
    private final a.c f5647q;

    /* renamed from: r, reason: collision with root package name */
    private final com.google.android.gms.common.api.a f5648r;

    protected b(com.google.android.gms.common.api.a aVar, GoogleApiClient googleApiClient) {
        super((GoogleApiClient) e4.p.m(googleApiClient, "GoogleApiClient must not be null"));
        e4.p.m(aVar, "Api must not be null");
        this.f5647q = aVar.b();
        this.f5648r = aVar;
    }

    private void u(RemoteException remoteException) {
        v(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    protected abstract void p(a.b bVar);

    public final com.google.android.gms.common.api.a q() {
        return this.f5648r;
    }

    public final a.c r() {
        return this.f5647q;
    }

    protected void s(c4.f fVar) {
    }

    public final void t(a.b bVar) throws DeadObjectException {
        try {
            p(bVar);
        } catch (DeadObjectException e5) {
            u(e5);
            throw e5;
        } catch (RemoteException e10) {
            u(e10);
        }
    }

    public final void v(Status status) {
        e4.p.b(!status.y(), "Failed result must not be success");
        c4.f fVarD = d(status);
        h(fVarD);
        s(fVarD);
    }
}
