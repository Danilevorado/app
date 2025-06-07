package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class nk1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f12687a = new HashMap();

    nk1() {
    }

    public final synchronized mk1 a(String str) {
        return (mk1) this.f12687a.get(str);
    }

    public final mk1 b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mk1 mk1VarA = a((String) it.next());
            if (mk1VarA != null) {
                return mk1VarA;
            }
        }
        return null;
    }

    public final String c(String str) {
        z50 z50Var;
        mk1 mk1VarA = a(str);
        return (mk1VarA == null || (z50Var = mk1VarA.f12182b) == null) ? "" : z50Var.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final synchronized void d(java.lang.String r7, com.google.android.gms.internal.ads.ap2 r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Map r0 = r6.f12687a     // Catch: java.lang.Throwable -> L44
            boolean r0 = r0.containsKey(r7)     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto Lb
            monitor-exit(r6)
            return
        Lb:
            com.google.android.gms.internal.ads.mk1 r0 = new com.google.android.gms.internal.ads.mk1     // Catch: java.lang.Throwable -> L44
            r1 = 0
            if (r8 != 0) goto L12
        L10:
            r2 = r1
            goto L16
        L12:
            com.google.android.gms.internal.ads.z50 r2 = r8.j()     // Catch: com.google.android.gms.internal.ads.io2 -> L10 java.lang.Throwable -> L44
        L16:
            if (r8 != 0) goto L19
            goto L1d
        L19:
            com.google.android.gms.internal.ads.z50 r1 = r8.k()     // Catch: com.google.android.gms.internal.ads.io2 -> L1d java.lang.Throwable -> L44
        L1d:
            com.google.android.gms.internal.ads.zq r3 = com.google.android.gms.internal.ads.ir.G8     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.gr r4 = k3.w.c()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r3 = r4.b(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L44
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L44
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L33
        L31:
            r4 = r5
            goto L3a
        L33:
            if (r8 != 0) goto L36
            goto L3a
        L36:
            r8.c()     // Catch: com.google.android.gms.internal.ads.io2 -> L3a java.lang.Throwable -> L44
            goto L31
        L3a:
            r0.<init>(r7, r2, r1, r4)     // Catch: java.lang.Throwable -> L44
            java.util.Map r8 = r6.f12687a     // Catch: java.lang.Throwable -> L44
            r8.put(r7, r0)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r6)
            return
        L44:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nk1.d(java.lang.String, com.google.android.gms.internal.ads.ap2):void");
    }

    final synchronized void e(String str, l50 l50Var) {
        if (this.f12687a.containsKey(str)) {
            return;
        }
        try {
            this.f12687a.put(str, new mk1(str, l50Var.e(), l50Var.h(), true));
        } catch (Throwable unused) {
        }
    }
}
