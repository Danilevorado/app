package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ea {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f7693a;

    public ea(Handler handler) {
        this.f7693a = new ca(this, handler);
    }

    public final void a(oa oaVar, xa xaVar) {
        oaVar.r("post-error");
        ua uaVarA = ua.a(xaVar);
        Executor executor = this.f7693a;
        ((ca) executor).f6852m.post(new da(oaVar, uaVarA, null));
    }

    public final void b(oa oaVar, ua uaVar, Runnable runnable) {
        oaVar.v();
        oaVar.r("post-response");
        Executor executor = this.f7693a;
        ((ca) executor).f6852m.post(new da(oaVar, uaVar, runnable));
    }
}
