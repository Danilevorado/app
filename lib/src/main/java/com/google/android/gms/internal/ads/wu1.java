package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import e4.c;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public abstract class wu1 implements c.a, c.b {

    /* renamed from: m, reason: collision with root package name */
    protected final tf0 f17267m = new tf0();

    /* renamed from: n, reason: collision with root package name */
    protected boolean f17268n = false;

    /* renamed from: o, reason: collision with root package name */
    protected boolean f17269o = false;

    /* renamed from: p, reason: collision with root package name */
    protected n80 f17270p;

    /* renamed from: q, reason: collision with root package name */
    protected Context f17271q;

    /* renamed from: r, reason: collision with root package name */
    protected Looper f17272r;

    /* renamed from: s, reason: collision with root package name */
    protected ScheduledExecutorService f17273s;

    @Override // e4.c.a
    public void C(int i10) {
        String str = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i10));
        ze0.b(str);
        this.f17267m.f(new dt1(1, str));
    }

    protected final synchronized void a() {
        if (this.f17270p == null) {
            this.f17270p = new n80(this.f17271q, this.f17272r, this, this);
        }
        this.f17270p.u();
    }

    protected final synchronized void b() {
        this.f17269o = true;
        n80 n80Var = this.f17270p;
        if (n80Var == null) {
            return;
        }
        if (n80Var.a() || this.f17270p.i()) {
            this.f17270p.q();
        }
        Binder.flushPendingCommands();
    }

    @Override // e4.c.b
    public final void w0(b4.b bVar) {
        String str = String.format(Locale.US, "Remote ad service connection failed, cause: %d.", Integer.valueOf(bVar.f()));
        ze0.b(str);
        this.f17267m.f(new dt1(1, str));
    }
}
