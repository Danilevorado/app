package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class sx0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f15584a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f15585b;

    /* renamed from: c, reason: collision with root package name */
    private final ab3 f15586c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f15587d = true;

    public sx0(Executor executor, ScheduledExecutorService scheduledExecutorService, ab3 ab3Var) {
        this.f15584a = executor;
        this.f15585b = scheduledExecutorService;
        this.f15586c = ab3Var;
    }

    static /* bridge */ /* synthetic */ void b(final sx0 sx0Var, List list, final ma3 ma3Var) {
        if (list == null || list.isEmpty()) {
            sx0Var.f15584a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.mx0
                @Override // java.lang.Runnable
                public final void run() {
                    ma3Var.a(new yq1(3));
                }
            });
            return;
        }
        ab3 ab3VarH = qa3.h(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final ab3 ab3Var = (ab3) it.next();
            ab3VarH = qa3.m(qa3.f(ab3VarH, Throwable.class, new w93() { // from class: com.google.android.gms.internal.ads.nx0
                @Override // com.google.android.gms.internal.ads.w93
                public final ab3 a(Object obj) {
                    ma3Var.a((Throwable) obj);
                    return qa3.h(null);
                }
            }, sx0Var.f15584a), new w93() { // from class: com.google.android.gms.internal.ads.ox0
                @Override // com.google.android.gms.internal.ads.w93
                public final ab3 a(Object obj) {
                    return this.f13441a.a(ma3Var, ab3Var, (ex0) obj);
                }
            }, sx0Var.f15584a);
        }
        qa3.q(ab3VarH, new rx0(sx0Var, ma3Var), sx0Var.f15584a);
    }

    final /* synthetic */ ab3 a(ma3 ma3Var, ab3 ab3Var, ex0 ex0Var) {
        if (ex0Var != null) {
            ma3Var.b(ex0Var);
        }
        return qa3.n(ab3Var, ((Long) qt.f14470b.e()).longValue(), TimeUnit.MILLISECONDS, this.f15585b);
    }

    final /* synthetic */ void d() {
        this.f15587d = false;
    }

    public final void e(ma3 ma3Var) {
        qa3.q(this.f15586c, new qx0(this, ma3Var), this.f15584a);
    }

    public final boolean f() {
        return this.f15587d;
    }
}
