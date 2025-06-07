package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import e4.c;
import java.io.IOException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
final class jm implements c.a {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ bm f10577m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ tf0 f10578n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ lm f10579o;

    jm(lm lmVar, bm bmVar, tf0 tf0Var) {
        this.f10579o = lmVar;
        this.f10577m = bmVar;
        this.f10578n = tf0Var;
    }

    @Override // e4.c.a
    public final void C(int i10) {
    }

    @Override // e4.c.a
    public final void L0(Bundle bundle) {
        synchronized (this.f10579o.f11657d) {
            lm lmVar = this.f10579o;
            if (lmVar.f11655b) {
                return;
            }
            lmVar.f11655b = true;
            final am amVar = this.f10579o.f11654a;
            if (amVar == null) {
                return;
            }
            bb3 bb3Var = of0.f13186a;
            final bm bmVar = this.f10577m;
            final tf0 tf0Var = this.f10578n;
            final ab3 ab3VarS = bb3Var.s(new Runnable() { // from class: com.google.android.gms.internal.ads.gm
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    jm jmVar = this.f8794m;
                    am amVar2 = amVar;
                    bm bmVar2 = bmVar;
                    tf0 tf0Var2 = tf0Var;
                    try {
                        dm dmVarO0 = amVar2.o0();
                        yl ylVarK5 = amVar2.n0() ? dmVarO0.K5(bmVar2) : dmVarO0.x4(bmVar2);
                        if (!ylVarK5.y()) {
                            tf0Var2.f(new RuntimeException("No entry contents."));
                            lm.e(jmVar.f10579o);
                            return;
                        }
                        im imVar = new im(jmVar, ylVarK5.v(), 1);
                        int i10 = imVar.read();
                        if (i10 == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        imVar.unread(i10);
                        tf0Var2.e(nm.b(imVar, ylVarK5.x(), ylVarK5.A(), ylVarK5.f(), ylVarK5.z()));
                    } catch (RemoteException | IOException e5) {
                        ze0.e("Unable to obtain a cache service instance.", e5);
                        tf0Var2.f(e5);
                        lm.e(jmVar.f10579o);
                    }
                }
            });
            final tf0 tf0Var2 = this.f10578n;
            tf0Var2.b(new Runnable() { // from class: com.google.android.gms.internal.ads.hm
                @Override // java.lang.Runnable
                public final void run() {
                    tf0 tf0Var3 = tf0Var2;
                    Future future = ab3VarS;
                    if (tf0Var3.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, of0.f13191f);
        }
    }
}
