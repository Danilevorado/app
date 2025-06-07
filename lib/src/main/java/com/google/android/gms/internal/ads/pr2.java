package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class pr2 implements r32 {

    /* renamed from: b, reason: collision with root package name */
    private static final List f14029b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    private final Handler f14030a;

    public pr2(Handler handler) {
        this.f14030a = handler;
    }

    static /* bridge */ /* synthetic */ void b(oq2 oq2Var) {
        List list = f14029b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(oq2Var);
            }
        }
    }

    private static oq2 c() {
        oq2 oq2Var;
        List list = f14029b;
        synchronized (list) {
            oq2Var = list.isEmpty() ? new oq2(null) : (oq2) list.remove(list.size() - 1);
        }
        return oq2Var;
    }

    @Override // com.google.android.gms.internal.ads.r32
    public final void C(int i10) {
        this.f14030a.removeMessages(i10);
    }

    @Override // com.google.android.gms.internal.ads.r32
    public final boolean D(q22 q22Var) {
        return ((oq2) q22Var).c(this.f14030a);
    }

    @Override // com.google.android.gms.internal.ads.r32
    public final q22 E(int i10, Object obj) {
        oq2 oq2VarC = c();
        oq2VarC.b(this.f14030a.obtainMessage(i10, obj), this);
        return oq2VarC;
    }

    @Override // com.google.android.gms.internal.ads.r32
    public final boolean F(int i10, long j10) {
        return this.f14030a.sendEmptyMessageAtTime(2, j10);
    }

    @Override // com.google.android.gms.internal.ads.r32
    public final void G(Object obj) {
        this.f14030a.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.r32
    public final boolean H(Runnable runnable) {
        return this.f14030a.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.r32
    public final q22 I(int i10, int i11, int i12) {
        oq2 oq2VarC = c();
        oq2VarC.b(this.f14030a.obtainMessage(1, i11, i12), this);
        return oq2VarC;
    }

    @Override // com.google.android.gms.internal.ads.r32
    public final q22 K(int i10) {
        oq2 oq2VarC = c();
        oq2VarC.b(this.f14030a.obtainMessage(i10), this);
        return oq2VarC;
    }

    @Override // com.google.android.gms.internal.ads.r32
    public final Looper a() {
        return this.f14030a.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.r32
    public final boolean a0(int i10) {
        return this.f14030a.sendEmptyMessage(i10);
    }

    @Override // com.google.android.gms.internal.ads.r32
    public final boolean w(int i10) {
        return this.f14030a.hasMessages(0);
    }
}
