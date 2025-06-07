package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: classes.dex */
final class d23 extends x13 {

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ IBinder f7170n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ g23 f7171o;

    d23(g23 g23Var, IBinder iBinder) {
        this.f7171o = g23Var;
        this.f7170n = iBinder;
    }

    @Override // com.google.android.gms.internal.ads.x13
    public final void a() throws RemoteException {
        this.f7171o.f8589m.f8980m = s13.L5(this.f7170n);
        h23.q(this.f7171o.f8589m);
        this.f7171o.f8589m.f8974g = false;
        Iterator it = this.f7171o.f8589m.f8971d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f7171o.f8589m.f8971d.clear();
    }
}
