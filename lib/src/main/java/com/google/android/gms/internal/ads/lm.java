package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class lm {

    /* renamed from: a, reason: collision with root package name */
    private am f11654a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f11655b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f11656c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f11657d = new Object();

    lm(Context context) {
        this.f11656c = context;
    }

    static /* bridge */ /* synthetic */ void e(lm lmVar) {
        synchronized (lmVar.f11657d) {
            am amVar = lmVar.f11654a;
            if (amVar == null) {
                return;
            }
            amVar.q();
            lmVar.f11654a = null;
            Binder.flushPendingCommands();
        }
    }

    final Future c(bm bmVar) {
        fm fmVar = new fm(this);
        jm jmVar = new jm(this, bmVar, fmVar);
        km kmVar = new km(this, fmVar);
        synchronized (this.f11657d) {
            am amVar = new am(this.f11656c, j3.t.v().b(), jmVar, kmVar);
            this.f11654a = amVar;
            amVar.u();
        }
        return fmVar;
    }
}
