package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class u6 {

    /* renamed from: h, reason: collision with root package name */
    private static volatile r6 f19344h;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f19348l = 0;

    /* renamed from: a, reason: collision with root package name */
    final q6 f19349a;

    /* renamed from: b, reason: collision with root package name */
    final String f19350b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f19351c;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f19352d = -1;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f19353e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f19354f;

    /* renamed from: g, reason: collision with root package name */
    private static final Object f19343g = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicReference f19345i = new AtomicReference();

    /* renamed from: j, reason: collision with root package name */
    private static final w6 f19346j = new w6(l6.f19060a, null);

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicInteger f19347k = new AtomicInteger();

    /* synthetic */ u6(q6 q6Var, String str, Object obj, boolean z10, s6 s6Var) {
        if (q6Var.f19213b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f19349a = q6Var;
        this.f19350b = str;
        this.f19351c = obj;
        this.f19354f = true;
    }

    public static void d() {
        f19347k.incrementAndGet();
    }

    public static void e(final Context context) {
        if (f19344h == null) {
            Object obj = f19343g;
            synchronized (obj) {
                if (f19344h == null) {
                    synchronized (obj) {
                        r6 r6Var = f19344h;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (r6Var == null || r6Var.a() != context) {
                            x5.d();
                            v6.b();
                            f6.d();
                            f19344h = new u5(context, f7.a(new b7() { // from class: com.google.android.gms.internal.measurement.k6
                                @Override // com.google.android.gms.internal.measurement.b7
                                public final Object a() {
                                    Context context2 = context;
                                    int i10 = u6.f19348l;
                                    return g6.a(context2);
                                }
                            }));
                            f19347k.incrementAndGet();
                        }
                    }
                }
            }
        }
    }

    abstract Object a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0029, B:16:0x0037, B:20:0x005e, B:22:0x0068, B:38:0x0099, B:40:0x00a9, B:42:0x00bd, B:43:0x00c0, B:44:0x00c4, B:26:0x0071, B:28:0x0077, B:32:0x0089, B:34:0x008f, B:37:0x0097, B:31:0x0087, B:17:0x004e, B:47:0x00cb, B:48:0x00d0, B:49:0x00d1), top: B:55:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:8:0x0016, B:10:0x001a, B:12:0x0020, B:14:0x0029, B:16:0x0037, B:20:0x005e, B:22:0x0068, B:38:0x0099, B:40:0x00a9, B:42:0x00bd, B:43:0x00c0, B:44:0x00c4, B:26:0x0071, B:28:0x0077, B:32:0x0089, B:34:0x008f, B:37:0x0097, B:31:0x0087, B:17:0x004e, B:47:0x00cb, B:48:0x00d0, B:49:0x00d1), top: B:55:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            r6 = this;
            boolean r0 = r6.f19354f
            if (r0 != 0) goto Lb
            java.lang.String r0 = r6.f19350b
            java.lang.String r1 = "flagName must not be null"
            java.util.Objects.requireNonNull(r0, r1)
        Lb:
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.u6.f19347k
            int r0 = r0.get()
            int r1 = r6.f19352d
            if (r1 >= r0) goto Ld5
            monitor-enter(r6)
            int r1 = r6.f19352d     // Catch: java.lang.Throwable -> Lc9
            if (r1 >= r0) goto Ld1
            com.google.android.gms.internal.measurement.r6 r1 = com.google.android.gms.internal.measurement.u6.f19344h     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto Lcb
            com.google.android.gms.internal.measurement.q6 r2 = r6.f19349a     // Catch: java.lang.Throwable -> Lc9
            boolean r3 = r2.f19217f     // Catch: java.lang.Throwable -> Lc9
            android.net.Uri r2 = r2.f19213b     // Catch: java.lang.Throwable -> Lc9
            r3 = 0
            if (r2 == 0) goto L4e
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.q6 r4 = r6.f19349a     // Catch: java.lang.Throwable -> Lc9
            android.net.Uri r4 = r4.f19213b     // Catch: java.lang.Throwable -> Lc9
            boolean r2 = com.google.android.gms.internal.measurement.h6.a(r2, r4)     // Catch: java.lang.Throwable -> Lc9
            if (r2 == 0) goto L5b
            com.google.android.gms.internal.measurement.q6 r2 = r6.f19349a     // Catch: java.lang.Throwable -> Lc9
            boolean r2 = r2.f19219h     // Catch: java.lang.Throwable -> Lc9
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> Lc9
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.q6 r4 = r6.f19349a     // Catch: java.lang.Throwable -> Lc9
            android.net.Uri r4 = r4.f19213b     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.j6 r5 = new java.lang.Runnable() { // from class: com.google.android.gms.internal.measurement.j6
                static {
                    /*
                        com.google.android.gms.internal.measurement.j6 r0 = new com.google.android.gms.internal.measurement.j6
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.internal.measurement.j6) com.google.android.gms.internal.measurement.j6.m com.google.android.gms.internal.measurement.j6
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.j6.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.j6.<init>():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        r0 = this;
                        com.google.android.gms.internal.measurement.u6.d()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.j6.run():void");
                }
            }     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.x5 r2 = com.google.android.gms.internal.measurement.x5.a(r2, r4, r5)     // Catch: java.lang.Throwable -> Lc9
            goto L5c
        L4e:
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.q6 r4 = r6.f19349a     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r4 = r4.f19212a     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.j6 r4 = com.google.android.gms.internal.measurement.j6.f19026m     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.v6.a(r2, r3, r4)     // Catch: java.lang.Throwable -> Lc9
        L5b:
            r2 = r3
        L5c:
            if (r2 == 0) goto L6d
            java.lang.String r4 = r6.c()     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r2 = r2.x(r4)     // Catch: java.lang.Throwable -> Lc9
            if (r2 == 0) goto L6d
            java.lang.Object r2 = r6.a(r2)     // Catch: java.lang.Throwable -> Lc9
            goto L6e
        L6d:
            r2 = r3
        L6e:
            if (r2 == 0) goto L71
            goto L99
        L71:
            com.google.android.gms.internal.measurement.q6 r2 = r6.f19349a     // Catch: java.lang.Throwable -> Lc9
            boolean r2 = r2.f19216e     // Catch: java.lang.Throwable -> Lc9
            if (r2 != 0) goto L94
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.f6 r2 = com.google.android.gms.internal.measurement.f6.a(r2)     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.q6 r4 = r6.f19349a     // Catch: java.lang.Throwable -> Lc9
            boolean r4 = r4.f19216e     // Catch: java.lang.Throwable -> Lc9
            if (r4 == 0) goto L87
            r4 = r3
            goto L89
        L87:
            java.lang.String r4 = r6.f19350b     // Catch: java.lang.Throwable -> Lc9
        L89:
            java.lang.String r2 = r2.x(r4)     // Catch: java.lang.Throwable -> Lc9
            if (r2 == 0) goto L94
            java.lang.Object r2 = r6.a(r2)     // Catch: java.lang.Throwable -> Lc9
            goto L95
        L94:
            r2 = r3
        L95:
            if (r2 != 0) goto L99
            java.lang.Object r2 = r6.f19351c     // Catch: java.lang.Throwable -> Lc9
        L99:
            com.google.android.gms.internal.measurement.b7 r1 = r1.b()     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r1 = r1.a()     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.z6 r1 = (com.google.android.gms.internal.measurement.z6) r1     // Catch: java.lang.Throwable -> Lc9
            boolean r4 = r1.b()     // Catch: java.lang.Throwable -> Lc9
            if (r4 == 0) goto Lc4
            java.lang.Object r1 = r1.a()     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.z5 r1 = (com.google.android.gms.internal.measurement.z5) r1     // Catch: java.lang.Throwable -> Lc9
            com.google.android.gms.internal.measurement.q6 r2 = r6.f19349a     // Catch: java.lang.Throwable -> Lc9
            android.net.Uri r4 = r2.f19213b     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r2 = r2.f19215d     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r5 = r6.f19350b     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r1 = r1.a(r4, r3, r2, r5)     // Catch: java.lang.Throwable -> Lc9
            if (r1 != 0) goto Lc0
            java.lang.Object r2 = r6.f19351c     // Catch: java.lang.Throwable -> Lc9
            goto Lc4
        Lc0:
            java.lang.Object r2 = r6.a(r1)     // Catch: java.lang.Throwable -> Lc9
        Lc4:
            r6.f19353e = r2     // Catch: java.lang.Throwable -> Lc9
            r6.f19352d = r0     // Catch: java.lang.Throwable -> Lc9
            goto Ld1
        Lc9:
            r0 = move-exception
            goto Ld3
        Lcb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc9
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lc9
            throw r0     // Catch: java.lang.Throwable -> Lc9
        Ld1:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc9
            goto Ld5
        Ld3:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc9
            throw r0
        Ld5:
            java.lang.Object r0 = r6.f19353e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.u6.b():java.lang.Object");
    }

    public final String c() {
        String str = this.f19349a.f19215d;
        return this.f19350b;
    }
}
