package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class b80 implements d80 {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f6381f = new Object();

    /* renamed from: g, reason: collision with root package name */
    static d80 f6382g;

    /* renamed from: h, reason: collision with root package name */
    static d80 f6383h;

    /* renamed from: b, reason: collision with root package name */
    private final Context f6385b;

    /* renamed from: d, reason: collision with root package name */
    private final ExecutorService f6387d;

    /* renamed from: e, reason: collision with root package name */
    private final ff0 f6388e;

    /* renamed from: a, reason: collision with root package name */
    private final Object f6384a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap f6386c = new WeakHashMap();

    protected b80(Context context, ff0 ff0Var) {
        a03.a();
        this.f6387d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.f6385b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f6388e = ff0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[Catch: all -> 0x003e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:11:0x0033, B:12:0x003a), top: B:18:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.d80 c(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.b80.f6381f
            monitor-enter(r0)
            com.google.android.gms.internal.ads.d80 r1 = com.google.android.gms.internal.ads.b80.f6382g     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L3a
            com.google.android.gms.internal.ads.os r1 = com.google.android.gms.internal.ads.mt.f12248e     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r1 = r1.e()     // Catch: java.lang.Throwable -> L3e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L33
            com.google.android.gms.internal.ads.zq r1 = com.google.android.gms.internal.ads.ir.f9997k7     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.gr r2 = k3.w.c()     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto L33
            com.google.android.gms.internal.ads.b80 r1 = new com.google.android.gms.internal.ads.b80     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.ff0 r2 = com.google.android.gms.internal.ads.ff0.f()     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.b80.f6382g = r1     // Catch: java.lang.Throwable -> L3e
            goto L3a
        L33:
            com.google.android.gms.internal.ads.c80 r3 = new com.google.android.gms.internal.ads.c80     // Catch: java.lang.Throwable -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.b80.f6382g = r3     // Catch: java.lang.Throwable -> L3e
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.internal.ads.d80 r3 = com.google.android.gms.internal.ads.b80.f6382g
            return r3
        L3e:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b80.c(android.content.Context):com.google.android.gms.internal.ads.d80");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[Catch: all -> 0x006b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:12:0x0036, B:13:0x0038, B:16:0x0041, B:20:0x0050, B:21:0x0051, B:22:0x0060, B:23:0x0067, B:14:0x0039, B:15:0x0040), top: B:29:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.d80 d(android.content.Context r4, com.google.android.gms.internal.ads.ff0 r5) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.b80.f6381f
            monitor-enter(r0)
            com.google.android.gms.internal.ads.d80 r1 = com.google.android.gms.internal.ads.b80.f6383h     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L67
            com.google.android.gms.internal.ads.os r1 = com.google.android.gms.internal.ads.mt.f12248e     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r1.e()     // Catch: java.lang.Throwable -> L6b
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L6b
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L60
            com.google.android.gms.internal.ads.zq r1 = com.google.android.gms.internal.ads.ir.f9997k7     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.gr r2 = k3.w.c()     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L6b
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L6b
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L60
            com.google.android.gms.internal.ads.b80 r1 = new com.google.android.gms.internal.ads.b80     // Catch: java.lang.Throwable -> L6b
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L6b
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L6b
            java.lang.Thread r4 = r4.getThread()     // Catch: java.lang.Throwable -> L6b
            if (r4 == 0) goto L51
            java.lang.Object r5 = r1.f6384a     // Catch: java.lang.Throwable -> L6b
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L6b
            java.util.WeakHashMap r2 = r1.f6386c     // Catch: java.lang.Throwable -> L4e
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4e
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.Thread$UncaughtExceptionHandler r5 = r4.getUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.a80 r2 = new com.google.android.gms.internal.ads.a80     // Catch: java.lang.Throwable -> L6b
            r2.<init>(r1, r5)     // Catch: java.lang.Throwable -> L6b
            r4.setUncaughtExceptionHandler(r2)     // Catch: java.lang.Throwable -> L6b
            goto L51
        L4e:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L6b
        L51:
            java.lang.Thread$UncaughtExceptionHandler r4 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.z70 r5 = new com.google.android.gms.internal.ads.z70     // Catch: java.lang.Throwable -> L6b
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L6b
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r5)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.b80.f6383h = r1     // Catch: java.lang.Throwable -> L6b
            goto L67
        L60:
            com.google.android.gms.internal.ads.c80 r4 = new com.google.android.gms.internal.ads.c80     // Catch: java.lang.Throwable -> L6b
            r4.<init>()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.b80.f6383h = r4     // Catch: java.lang.Throwable -> L6b
        L67:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.d80 r4 = com.google.android.gms.internal.ads.b80.f6383h
            return r4
        L6b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b80.d(android.content.Context, com.google.android.gms.internal.ads.ff0):com.google.android.gms.internal.ads.d80");
    }

    public static String e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String f(Throwable th) {
        return y33.c(se0.h(e(th)));
    }

    @Override // com.google.android.gms.internal.ads.d80
    public final void a(Throwable th, String str) {
        b(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.d80
    public final void b(Throwable th, String str, float f5) {
        Throwable th2;
        String packageName;
        Handler handler = se0.f15201b;
        boolean zG = false;
        if (((Boolean) mt.f12249f.e()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z10 = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (se0.q(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z10 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z10) {
                    th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 == null) {
            return;
        }
        String name = th.getClass().getName();
        String strE = e(th);
        String strF = ((Boolean) k3.w.c().b(ir.f9965h8)).booleanValue() ? f(th) : "";
        double d10 = f5;
        double dRandom = Math.random();
        int i10 = f5 > 0.0f ? (int) (1.0f / f5) : 1;
        if (dRandom < d10) {
            ArrayList<String> arrayList2 = new ArrayList();
            try {
                zG = k4.c.a(this.f6385b).g();
            } catch (Throwable th4) {
                ze0.e("Error fetching instant app info", th4);
            }
            try {
                packageName = this.f6385b.getPackageName();
            } catch (Throwable unused) {
                ze0.g("Cannot obtain package name, proceeding.");
                packageName = "unknown";
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zG)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str2 = Build.MANUFACTURER;
            String str3 = Build.MODEL;
            if (!str3.startsWith(str2)) {
                str3 = str2 + " " + str3;
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("device", str3).appendQueryParameter("js", this.f6388e.f8252m).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strE).appendQueryParameter("eids", TextUtils.join(",", k3.w.a().a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "525816637").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i10)).appendQueryParameter("pb_tm", String.valueOf(mt.f12246c.e())).appendQueryParameter("gmscv", String.valueOf(b4.f.h().b(this.f6385b))).appendQueryParameter("lite", true != this.f6388e.f8256q ? "0" : "1");
            if (!TextUtils.isEmpty(strF)) {
                builderAppendQueryParameter2.appendQueryParameter("hash", strF);
            }
            arrayList2.add(builderAppendQueryParameter2.toString());
            for (final String str4 : arrayList2) {
                final ef0 ef0Var = new ef0(null);
                this.f6387d.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.y70
                    @Override // java.lang.Runnable
                    public final void run() {
                        ef0Var.o(str4);
                    }
                });
            }
        }
    }

    protected final void g(Thread thread, Throwable th) {
        if (th != null) {
            boolean zQ = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zQ |= se0.q(stackTraceElement.getClassName());
                    zEquals |= b80.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!zQ || zEquals) {
                return;
            }
            b(th, "", 1.0f);
        }
    }
}
