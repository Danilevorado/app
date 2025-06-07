package com.google.android.gms.internal.ads;

import android.os.Binder;
import e4.c;

/* loaded from: classes.dex */
public abstract class os1 implements c.a, c.b {

    /* renamed from: m, reason: collision with root package name */
    protected final tf0 f13375m = new tf0();

    /* renamed from: n, reason: collision with root package name */
    protected final Object f13376n = new Object();

    /* renamed from: o, reason: collision with root package name */
    protected boolean f13377o = false;

    /* renamed from: p, reason: collision with root package name */
    protected boolean f13378p = false;

    /* renamed from: q, reason: collision with root package name */
    protected k90 f13379q;

    /* renamed from: r, reason: collision with root package name */
    protected k80 f13380r;

    @Override // e4.c.a
    public final void C(int i10) {
        ze0.b("Cannot connect to remote service, fallback to local instance.");
    }

    protected final void a() {
        synchronized (this.f13376n) {
            this.f13378p = true;
            if (this.f13380r.a() || this.f13380r.i()) {
                this.f13380r.q();
            }
            Binder.flushPendingCommands();
        }
    }

    public void w0(b4.b bVar) {
        ze0.b("Disconnected from remote ad request service.");
        this.f13375m.f(new dt1(1));
    }
}
