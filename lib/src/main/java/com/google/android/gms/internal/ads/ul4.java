package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class ul4 {

    /* renamed from: d, reason: collision with root package name */
    public static final ol4 f16380d = new ol4(0, -9223372036854775807L, null);

    /* renamed from: e, reason: collision with root package name */
    public static final ol4 f16381e = new ol4(1, -9223372036854775807L, null);

    /* renamed from: f, reason: collision with root package name */
    public static final ol4 f16382f = new ol4(2, -9223372036854775807L, null);

    /* renamed from: g, reason: collision with root package name */
    public static final ol4 f16383g = new ol4(3, -9223372036854775807L, null);

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f16384a = sv2.H("ExoPlayer:Loader:ProgressiveMediaPeriod");

    /* renamed from: b, reason: collision with root package name */
    private pl4 f16385b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f16386c;

    public ul4(String str) {
    }

    public static ol4 b(boolean z10, long j10) {
        return new ol4(z10 ? 1 : 0, j10, null);
    }

    public final long a(ql4 ql4Var, ml4 ml4Var, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        gt1.b(looperMyLooper);
        this.f16386c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new pl4(this, looperMyLooper, ql4Var, ml4Var, i10, jElapsedRealtime).c(0L);
        return jElapsedRealtime;
    }

    public final void g() {
        pl4 pl4Var = this.f16385b;
        gt1.b(pl4Var);
        pl4Var.a(false);
    }

    public final void h() {
        this.f16386c = null;
    }

    public final void i(int i10) throws IOException {
        IOException iOException = this.f16386c;
        if (iOException != null) {
            throw iOException;
        }
        pl4 pl4Var = this.f16385b;
        if (pl4Var != null) {
            pl4Var.b(i10);
        }
    }

    public final void j(rl4 rl4Var) {
        pl4 pl4Var = this.f16385b;
        if (pl4Var != null) {
            pl4Var.a(true);
        }
        this.f16384a.execute(new sl4(rl4Var));
        this.f16384a.shutdown();
    }

    public final boolean k() {
        return this.f16386c != null;
    }

    public final boolean l() {
        return this.f16385b != null;
    }
}
