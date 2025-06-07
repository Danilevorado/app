package com.onesignal;

import com.onesignal.e3;
import com.onesignal.z2;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimerTask;

/* loaded from: classes.dex */
class u0 {

    /* renamed from: c, reason: collision with root package name */
    private static Date f22460c = new Date();

    /* renamed from: a, reason: collision with root package name */
    private final c f22461a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f22462b = new ArrayList();

    class a extends TimerTask {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f22463m;

        a(String str) {
            this.f22463m = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            u0.this.f22462b.remove(this.f22463m);
            u0.this.f22461a.a();
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22465a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f22466b;

        static {
            int[] iArr = new int[z2.b.values().length];
            f22466b = iArr;
            try {
                iArr[z2.b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22466b[z2.b.LESS_THAN_OR_EQUAL_TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22466b[z2.b.GREATER_THAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22466b[z2.b.GREATER_THAN_OR_EQUAL_TO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22466b[z2.b.EQUAL_TO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22466b[z2.b.NOT_EQUAL_TO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[z2.a.values().length];
            f22465a = iArr2;
            try {
                iArr2[z2.a.SESSION_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22465a[z2.a.TIME_SINCE_LAST_IN_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    interface c {
        void a();

        void b(String str);
    }

    u0(c cVar) {
        this.f22461a = cVar;
    }

    private static boolean d(double d10, double d11, z2.b bVar) {
        switch (b.f22466b[bVar.ordinal()]) {
            case 1:
                return d11 < d10;
            case 2:
                return d11 <= d10 || f(d10, d11);
            case 3:
                return d11 >= d10;
            case 4:
                return d11 >= d10 || f(d10, d11);
            case 5:
                return f(d10, d11);
            case 6:
                return !f(d10, d11);
            default:
                e3.i1(e3.z.ERROR, "Attempted to apply an invalid operator on a time-based in-app-message trigger: " + bVar.toString());
                return false;
        }
    }

    static void e() {
        f22460c = new Date();
    }

    private static boolean f(double d10, double d11) {
        return Math.abs(d10 - d11) < 0.3d;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072 A[Catch: all -> 0x0099, TryCatch #0 {, blocks: (B:7:0x0009, B:9:0x000f, B:11:0x0011, B:26:0x0057, B:28:0x0072, B:29:0x0077, B:31:0x0079, B:33:0x007e, B:35:0x0080, B:37:0x0088, B:39:0x008a, B:40:0x0097, B:16:0x0025, B:18:0x002f, B:20:0x0031, B:23:0x003d, B:25:0x0052, B:24:0x0047), top: B:45:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079 A[Catch: all -> 0x0099, TryCatch #0 {, blocks: (B:7:0x0009, B:9:0x000f, B:11:0x0011, B:26:0x0057, B:28:0x0072, B:29:0x0077, B:31:0x0079, B:33:0x007e, B:35:0x0080, B:37:0x0088, B:39:0x008a, B:40:0x0097, B:16:0x0025, B:18:0x002f, B:20:0x0031, B:23:0x003d, B:25:0x0052, B:24:0x0047), top: B:45:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean c(com.onesignal.z2 r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r15.f22545e
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.ArrayList r0 = r14.f22462b
            monitor-enter(r0)
            java.lang.Object r2 = r15.f22545e     // Catch: java.lang.Throwable -> L99
            boolean r2 = r2 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L99
            if (r2 != 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L99
            return r1
        L11:
            int[] r2 = com.onesignal.u0.b.f22465a     // Catch: java.lang.Throwable -> L99
            com.onesignal.z2$a r3 = r15.f22542b     // Catch: java.lang.Throwable -> L99
            int r3 = r3.ordinal()     // Catch: java.lang.Throwable -> L99
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L99
            r3 = 1
            r4 = 0
            if (r2 == r3) goto L47
            r6 = 2
            if (r2 == r6) goto L25
            r6 = r4
            goto L57
        L25:
            com.onesignal.d1 r2 = com.onesignal.e3.g0()     // Catch: java.lang.Throwable -> L99
            boolean r2 = r2.X()     // Catch: java.lang.Throwable -> L99
            if (r2 == 0) goto L31
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L99
            return r1
        L31:
            com.onesignal.d1 r2 = com.onesignal.e3.g0()     // Catch: java.lang.Throwable -> L99
            java.util.Date r2 = r2.f21825t     // Catch: java.lang.Throwable -> L99
            if (r2 != 0) goto L3d
            r6 = 999999(0xf423f, double:4.94065E-318)
            goto L57
        L3d:
            java.util.Date r6 = new java.util.Date     // Catch: java.lang.Throwable -> L99
            r6.<init>()     // Catch: java.lang.Throwable -> L99
            long r6 = r6.getTime()     // Catch: java.lang.Throwable -> L99
            goto L52
        L47:
            java.util.Date r2 = new java.util.Date     // Catch: java.lang.Throwable -> L99
            r2.<init>()     // Catch: java.lang.Throwable -> L99
            long r6 = r2.getTime()     // Catch: java.lang.Throwable -> L99
            java.util.Date r2 = com.onesignal.u0.f22460c     // Catch: java.lang.Throwable -> L99
        L52:
            long r8 = r2.getTime()     // Catch: java.lang.Throwable -> L99
            long r6 = r6 - r8
        L57:
            java.lang.String r2 = r15.f22541a     // Catch: java.lang.Throwable -> L99
            java.lang.Object r8 = r15.f22545e     // Catch: java.lang.Throwable -> L99
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L99
            double r8 = r8.doubleValue()     // Catch: java.lang.Throwable -> L99
            r10 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r8 = r8 * r10
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L99
            double r10 = (double) r8     // Catch: java.lang.Throwable -> L99
            double r12 = (double) r6     // Catch: java.lang.Throwable -> L99
            com.onesignal.z2$b r15 = r15.f22544d     // Catch: java.lang.Throwable -> L99
            boolean r15 = d(r10, r12, r15)     // Catch: java.lang.Throwable -> L99
            if (r15 == 0) goto L79
            com.onesignal.u0$c r15 = r14.f22461a     // Catch: java.lang.Throwable -> L99
            r15.b(r2)     // Catch: java.lang.Throwable -> L99
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L99
            return r3
        L79:
            long r8 = r8 - r6
            int r15 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r15 > 0) goto L80
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L99
            return r1
        L80:
            java.util.ArrayList r15 = r14.f22462b     // Catch: java.lang.Throwable -> L99
            boolean r15 = r15.contains(r2)     // Catch: java.lang.Throwable -> L99
            if (r15 == 0) goto L8a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L99
            return r1
        L8a:
            com.onesignal.u0$a r15 = new com.onesignal.u0$a     // Catch: java.lang.Throwable -> L99
            r15.<init>(r2)     // Catch: java.lang.Throwable -> L99
            com.onesignal.v0.a(r15, r2, r8)     // Catch: java.lang.Throwable -> L99
            java.util.ArrayList r15 = r14.f22462b     // Catch: java.lang.Throwable -> L99
            r15.add(r2)     // Catch: java.lang.Throwable -> L99
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L99
            return r1
        L99:
            r15 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L99
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.u0.c(com.onesignal.z2):boolean");
    }
}
