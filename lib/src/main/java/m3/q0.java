package m3;

import com.google.android.gms.internal.ads.ab3;
import com.google.android.gms.internal.ads.ra;
import com.google.android.gms.internal.ads.tf0;
import com.google.android.gms.internal.ads.v9;
import com.google.android.gms.internal.ads.ye0;
import com.google.android.gms.internal.ads.ze0;
import java.util.Map;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    private static ra f25276a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f25277b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final l0 f25278c = new i0();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[Catch: all -> 0x003d, TryCatch #0 {, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:15:0x0039, B:14:0x0034, B:16:0x003b), top: B:21:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q0(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            android.content.Context r0 = r4.getApplicationContext()
            if (r0 == 0) goto Ld
            android.content.Context r4 = r4.getApplicationContext()
        Ld:
            java.lang.Object r0 = m3.q0.f25277b
            monitor-enter(r0)
            com.google.android.gms.internal.ads.ra r1 = m3.q0.f25276a     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L3b
            com.google.android.gms.internal.ads.ir.a(r4)     // Catch: java.lang.Throwable -> L3d
            boolean r1 = i4.d.a()     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L34
            com.google.android.gms.internal.ads.zq r1 = com.google.android.gms.internal.ads.ir.f9908c4     // Catch: java.lang.Throwable -> L3d
            com.google.android.gms.internal.ads.gr r2 = k3.w.c()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3d
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L34
            com.google.android.gms.internal.ads.ra r4 = m3.y.b(r4)     // Catch: java.lang.Throwable -> L3d
            goto L39
        L34:
            r1 = 0
            com.google.android.gms.internal.ads.ra r4 = com.google.android.gms.internal.ads.wb.a(r4, r1)     // Catch: java.lang.Throwable -> L3d
        L39:
            m3.q0.f25276a = r4     // Catch: java.lang.Throwable -> L3d
        L3b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            return
        L3d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.q0.<init>(android.content.Context):void");
    }

    public final ab3 a(String str) {
        tf0 tf0Var = new tf0();
        f25276a.a(new p0(str, null, tf0Var));
        return tf0Var;
    }

    public final ab3 b(int i10, String str, Map map, byte[] bArr) {
        n0 n0Var = new n0(null);
        j0 j0Var = new j0(this, str, n0Var);
        ye0 ye0Var = new ye0(null);
        k0 k0Var = new k0(this, i10, str, n0Var, j0Var, bArr, map, ye0Var);
        if (ye0.k()) {
            try {
                ye0Var.d(str, "GET", k0Var.q(), k0Var.C());
            } catch (v9 e5) {
                ze0.g(e5.getMessage());
            }
        }
        f25276a.a(k0Var);
        return n0Var;
    }
}
