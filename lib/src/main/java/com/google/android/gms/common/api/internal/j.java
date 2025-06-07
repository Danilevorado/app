package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final Map f5754a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Map f5755b = Collections.synchronizedMap(new WeakHashMap());

    private final void h(boolean z10, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f5754a) {
            map = new HashMap(this.f5754a);
        }
        synchronized (this.f5755b) {
            map2 = new HashMap(this.f5755b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).e(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((b5.j) entry2.getKey()).d(new c4.a(status));
            }
        }
    }

    final void c(BasePendingResult basePendingResult, boolean z10) {
        this.f5754a.put(basePendingResult, Boolean.valueOf(z10));
        basePendingResult.b(new h(this, basePendingResult));
    }

    final void d(b5.j jVar, boolean z10) {
        this.f5755b.put(jVar, Boolean.valueOf(z10));
        jVar.a().b(new i(this, jVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void e(int r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The connection to Google Play services was lost"
            r0.<init>(r1)
            r1 = 1
            if (r4 != r1) goto L10
            java.lang.String r4 = " due to service disconnection."
        Lc:
            r0.append(r4)
            goto L16
        L10:
            r2 = 3
            if (r4 != r2) goto L16
            java.lang.String r4 = " due to dead object exception."
            goto Lc
        L16:
            if (r5 == 0) goto L20
            java.lang.String r4 = " Last reason for disconnect: "
            r0.append(r4)
            r0.append(r5)
        L20:
            java.lang.String r4 = r0.toString()
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status
            r0 = 20
            r5.<init>(r0, r4)
            r3.h(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.j.e(int, java.lang.String):void");
    }

    public final void f() {
        h(false, c.B);
    }

    final boolean g() {
        return (this.f5754a.isEmpty() && this.f5755b.isEmpty()) ? false : true;
    }
}
