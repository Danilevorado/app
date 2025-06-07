package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
final class s4 extends FutureTask implements Comparable {

    /* renamed from: m, reason: collision with root package name */
    private final long f20362m;

    /* renamed from: n, reason: collision with root package name */
    final boolean f20363n;

    /* renamed from: o, reason: collision with root package name */
    private final String f20364o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ u4 f20365p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s4(u4 u4Var, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        this.f20365p = u4Var;
        e4.p.l(str);
        long andIncrement = u4.f20430l.getAndIncrement();
        this.f20362m = andIncrement;
        this.f20364o = str;
        this.f20363n = z10;
        if (andIncrement == Long.MAX_VALUE) {
            u4Var.f20269a.b().p().a("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s4(u4 u4Var, Callable callable, boolean z10, String str) {
        super(callable);
        this.f20365p = u4Var;
        e4.p.l("Task exception on worker thread");
        long andIncrement = u4.f20430l.getAndIncrement();
        this.f20362m = andIncrement;
        this.f20364o = "Task exception on worker thread";
        this.f20363n = z10;
        if (andIncrement == Long.MAX_VALUE) {
            u4Var.f20269a.b().p().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        s4 s4Var = (s4) obj;
        boolean z10 = this.f20363n;
        if (z10 != s4Var.f20363n) {
            return !z10 ? 1 : -1;
        }
        long j10 = this.f20362m;
        long j11 = s4Var.f20362m;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.f20365p.f20269a.b().r().b("Two tasks share the same index. index", Long.valueOf(this.f20362m));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.f20365p.f20269a.b().p().b(this.f20364o, th);
        super.setException(th);
    }
}
