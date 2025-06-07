package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class i9 extends m9 {

    /* renamed from: c, reason: collision with root package name */
    private static final Class f19008c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ i9(h9 h9Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.m9
    final void a(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) za.k(obj, j10);
        if (list instanceof g9) {
            objUnmodifiableList = ((g9) list).c();
        } else {
            if (f19008c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof fa) && (list instanceof a9)) {
                a9 a9Var = (a9) list;
                if (a9Var.d()) {
                    a9Var.b();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        za.x(obj, j10, objUnmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    @Override // com.google.android.gms.internal.measurement.m9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = com.google.android.gms.internal.measurement.za.k(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = com.google.android.gms.internal.measurement.za.k(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L39
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.g9
            if (r2 == 0) goto L20
            com.google.android.gms.internal.measurement.f9 r1 = new com.google.android.gms.internal.measurement.f9
            r1.<init>(r0)
            goto L35
        L20:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.fa
            if (r2 == 0) goto L30
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.a9
            if (r2 == 0) goto L30
            com.google.android.gms.internal.measurement.a9 r1 = (com.google.android.gms.internal.measurement.a9) r1
            com.google.android.gms.internal.measurement.a9 r0 = r1.j(r0)
            r1 = r0
            goto L35
        L30:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L35:
            com.google.android.gms.internal.measurement.za.x(r5, r7, r1)
            goto L8a
        L39:
            java.lang.Class r2 = com.google.android.gms.internal.measurement.i9.f19008c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L57
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L52:
            com.google.android.gms.internal.measurement.za.x(r5, r7, r2)
            r1 = r2
            goto L8a
        L57:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.ua
            if (r2 == 0) goto L6f
            com.google.android.gms.internal.measurement.f9 r2 = new com.google.android.gms.internal.measurement.f9
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            com.google.android.gms.internal.measurement.ua r1 = (com.google.android.gms.internal.measurement.ua) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            goto L52
        L6f:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.fa
            if (r2 == 0) goto L8a
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.a9
            if (r2 == 0) goto L8a
            r2 = r1
            com.google.android.gms.internal.measurement.a9 r2 = (com.google.android.gms.internal.measurement.a9) r2
            boolean r3 = r2.d()
            if (r3 != 0) goto L8a
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.measurement.a9 r1 = r2.j(r1)
            goto L35
        L8a:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L99
            if (r2 <= 0) goto L99
            r1.addAll(r6)
        L99:
            if (r0 > 0) goto L9c
            goto L9d
        L9c:
            r6 = r1
        L9d:
            com.google.android.gms.internal.measurement.za.x(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.i9.b(java.lang.Object, java.lang.Object, long):void");
    }
}
