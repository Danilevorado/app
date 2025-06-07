package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import h3.a;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ze2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18536a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f18537b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f18538c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18539d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f18540e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f18541f;

    /* renamed from: g, reason: collision with root package name */
    private final ae0 f18542g;

    ze2(ae0 ae0Var, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10, boolean z10, boolean z11) {
        this.f18542g = ae0Var;
        this.f18536a = context;
        this.f18537b = scheduledExecutorService;
        this.f18538c = executor;
        this.f18539d = i10;
        this.f18540e = z10;
        this.f18541f = z11;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        if (!((Boolean) k3.w.c().b(ir.Q0)).booleanValue()) {
            return qa3.g(new Exception("Did not ad Ad ID into query param."));
        }
        return qa3.e((ga3) qa3.n(qa3.l(ga3.D(this.f18542g.a(this.f18536a, this.f18539d)), new w23() { // from class: com.google.android.gms.internal.ads.xe2
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                return this.f17526a.c((a.C0142a) obj);
            }
        }, this.f18538c), ((Long) k3.w.c().b(ir.R0)).longValue(), TimeUnit.MILLISECONDS, this.f18537b), Throwable.class, new w23() { // from class: com.google.android.gms.internal.ads.ye2
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                return this.f18002a.d((Throwable) obj);
            }
        }, this.f18538c);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ com.google.android.gms.internal.ads.af2 c(h3.a.C0142a r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.c03 r0 = new com.google.android.gms.internal.ads.c03
            r0.<init>()
            boolean r1 = r7.f18540e
            if (r1 != 0) goto L1b
            com.google.android.gms.internal.ads.zq r1 = com.google.android.gms.internal.ads.ir.I2
            com.google.android.gms.internal.ads.gr r2 = k3.w.c()
            java.lang.Object r1 = r2.b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L31
        L1b:
            boolean r1 = r7.f18540e
            if (r1 == 0) goto L6f
            com.google.android.gms.internal.ads.zq r1 = com.google.android.gms.internal.ads.ir.J2
            com.google.android.gms.internal.ads.gr r2 = k3.w.c()
            java.lang.Object r1 = r2.b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L6f
        L31:
            android.content.Context r0 = r7.f18536a     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.f03 r1 = com.google.android.gms.internal.ads.f03.k(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            r8.getClass()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r2 = r8.a()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            android.content.Context r0 = r7.f18536a     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.zq r0 = com.google.android.gms.internal.ads.ir.M2     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.gr r4 = k3.w.c()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Object r0 = r4.b(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            long r4 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            boolean r6 = r7.f18541f     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.c03 r0 = r1.j(r2, r3, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            goto L6f
        L5e:
            r0 = move-exception
            goto L61
        L60:
            r0 = move-exception
        L61:
            com.google.android.gms.internal.ads.je0 r1 = j3.t.q()
            java.lang.String r2 = "AdIdInfoSignalSource.getPaidV1"
            r1.u(r0, r2)
            com.google.android.gms.internal.ads.c03 r0 = new com.google.android.gms.internal.ads.c03
            r0.<init>()
        L6f:
            com.google.android.gms.internal.ads.af2 r1 = new com.google.android.gms.internal.ads.af2
            r2 = 0
            r1.<init>(r8, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ze2.c(h3.a$a):com.google.android.gms.internal.ads.af2");
    }

    final /* synthetic */ af2 d(Throwable th) {
        k3.t.b();
        ContentResolver contentResolver = this.f18536a.getContentResolver();
        return new af2(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new c03());
    }
}
