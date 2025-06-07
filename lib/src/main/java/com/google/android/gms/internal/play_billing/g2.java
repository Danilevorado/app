package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class g2 extends k2 {

    /* renamed from: c, reason: collision with root package name */
    private static final Class f19509c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ g2(f2 f2Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.k2
    final void a(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) f4.k(obj, j10);
        if (list instanceof e2) {
            objUnmodifiableList = ((e2) list).c();
        } else {
            if (f19509c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof b3) && (list instanceof u1)) {
                u1 u1Var = (u1) list;
                if (u1Var.d()) {
                    u1Var.b();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        f4.x(obj, j10, objUnmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    @Override // com.google.android.gms.internal.play_billing.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = com.google.android.gms.internal.play_billing.f4.k(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = com.google.android.gms.internal.play_billing.f4.k(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L39
            boolean r2 = r1 instanceof com.google.android.gms.internal.play_billing.e2
            if (r2 == 0) goto L20
            com.google.android.gms.internal.play_billing.d2 r1 = new com.google.android.gms.internal.play_billing.d2
            r1.<init>(r0)
            goto L35
        L20:
            boolean r2 = r1 instanceof com.google.android.gms.internal.play_billing.b3
            if (r2 == 0) goto L30
            boolean r2 = r1 instanceof com.google.android.gms.internal.play_billing.u1
            if (r2 == 0) goto L30
            com.google.android.gms.internal.play_billing.u1 r1 = (com.google.android.gms.internal.play_billing.u1) r1
            com.google.android.gms.internal.play_billing.u1 r0 = r1.j(r0)
            r1 = r0
            goto L35
        L30:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L35:
            com.google.android.gms.internal.play_billing.f4.x(r5, r7, r1)
            goto L8a
        L39:
            java.lang.Class r2 = com.google.android.gms.internal.play_billing.g2.f19509c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L57
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L52:
            com.google.android.gms.internal.play_billing.f4.x(r5, r7, r2)
            r1 = r2
            goto L8a
        L57:
            boolean r2 = r1 instanceof com.google.android.gms.internal.play_billing.a4
            if (r2 == 0) goto L6f
            com.google.android.gms.internal.play_billing.d2 r2 = new com.google.android.gms.internal.play_billing.d2
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            com.google.android.gms.internal.play_billing.a4 r1 = (com.google.android.gms.internal.play_billing.a4) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            goto L52
        L6f:
            boolean r2 = r1 instanceof com.google.android.gms.internal.play_billing.b3
            if (r2 == 0) goto L8a
            boolean r2 = r1 instanceof com.google.android.gms.internal.play_billing.u1
            if (r2 == 0) goto L8a
            r2 = r1
            com.google.android.gms.internal.play_billing.u1 r2 = (com.google.android.gms.internal.play_billing.u1) r2
            boolean r3 = r2.d()
            if (r3 != 0) goto L8a
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.play_billing.u1 r1 = r2.j(r1)
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
            com.google.android.gms.internal.play_billing.f4.x(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.g2.b(java.lang.Object, java.lang.Object, long):void");
    }
}
