package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class h1 {

    /* renamed from: d, reason: collision with root package name */
    private static final h1 f19512d = new h1(true);

    /* renamed from: a, reason: collision with root package name */
    final s3 f19513a = new i3(16);

    /* renamed from: b, reason: collision with root package name */
    private boolean f19514b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19515c;

    private h1() {
    }

    private h1(boolean z10) {
        f();
        f();
    }

    static int a(l4 l4Var, int i10, Object obj) {
        y0.w(i10 << 3);
        if (l4.f19583w == null) {
            byte[] bArr = v1.f19661d;
        }
        m4 m4Var = m4.INT;
        throw null;
    }

    public static int b(g1 g1Var, Object obj) {
        l4 l4VarF = g1Var.f();
        int iA = g1Var.a();
        if (!g1Var.h()) {
            return a(l4VarF, iA, obj);
        }
        List list = (List) obj;
        int iA2 = 0;
        if (!g1Var.e()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iA2 += a(l4VarF, iA, it.next());
            }
            return iA2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        if (!it2.hasNext()) {
            return y0.w(iA << 3) + y0.w(0);
        }
        it2.next();
        l4 l4Var = l4.f19574n;
        m4 m4Var = m4.INT;
        throw null;
    }

    private static Object j(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void k(Map.Entry entry) {
        g1 g1Var = (g1) entry.getKey();
        Object value = entry.getValue();
        if (g1Var.h()) {
            Object objD = d(g1Var);
            if (objD == null) {
                objD = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objD).add(j(it.next()));
            }
            this.f19513a.put(g1Var, objD);
            return;
        }
        if (g1Var.c() != m4.MESSAGE) {
            this.f19513a.put(g1Var, j(value));
            return;
        }
        Object objD2 = d(g1Var);
        if (objD2 == null) {
            this.f19513a.put(g1Var, j(value));
        } else {
            this.f19513a.put(g1Var, g1Var.j(((u2) objD2).z(), (u2) value).e());
        }
    }

    private static boolean l(Map.Entry entry) {
        g1 g1Var = (g1) entry.getKey();
        if (g1Var.c() != m4.MESSAGE) {
            return true;
        }
        boolean zH = g1Var.h();
        Object value = entry.getValue();
        if (!zH) {
            return m(value);
        }
        Iterator it = ((List) value).iterator();
        while (it.hasNext()) {
            if (!m(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean m(Object obj) {
        if (obj instanceof v2) {
            return ((v2) obj).k();
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int n(Map.Entry entry) {
        g1 g1Var = (g1) entry.getKey();
        Object value = entry.getValue();
        if (g1Var.c() != m4.MESSAGE || g1Var.h() || g1Var.e()) {
            return b(g1Var, value);
        }
        int iA = ((g1) entry.getKey()).a();
        int iW = y0.w(8);
        int iW2 = y0.w(16) + y0.w(iA);
        int iW3 = y0.w(24);
        int iE = ((u2) value).e();
        return iW + iW + iW2 + iW3 + y0.w(iE) + iE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void o(com.google.android.gms.internal.play_billing.g1 r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.play_billing.l4 r0 = r4.f()
            byte[] r1 = com.google.android.gms.internal.play_billing.v1.f19661d
            java.util.Objects.requireNonNull(r5)
            com.google.android.gms.internal.play_billing.l4 r1 = com.google.android.gms.internal.play_billing.l4.f19574n
            com.google.android.gms.internal.play_billing.m4 r1 = com.google.android.gms.internal.play_billing.m4.INT
            com.google.android.gms.internal.play_billing.m4 r0 = r0.b()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3f;
                case 1: goto L3c;
                case 2: goto L39;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L30;
                case 6: goto L27;
                case 7: goto L1e;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L44
        L19:
            boolean r0 = r5 instanceof com.google.android.gms.internal.play_billing.u2
            if (r0 == 0) goto L44
            goto L43
        L1e:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L43
            boolean r0 = r5 instanceof com.google.android.gms.internal.play_billing.p1
            if (r0 == 0) goto L44
            goto L43
        L27:
            boolean r0 = r5 instanceof com.google.android.gms.internal.play_billing.q0
            if (r0 != 0) goto L43
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L44
            goto L43
        L30:
            boolean r0 = r5 instanceof java.lang.String
            goto L41
        L33:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L41
        L36:
            boolean r0 = r5 instanceof java.lang.Double
            goto L41
        L39:
            boolean r0 = r5 instanceof java.lang.Float
            goto L41
        L3c:
            boolean r0 = r5 instanceof java.lang.Long
            goto L41
        L3f:
            boolean r0 = r5 instanceof java.lang.Integer
        L41:
            if (r0 == 0) goto L44
        L43:
            return
        L44:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.google.android.gms.internal.play_billing.l4 r4 = r4.f()
            com.google.android.gms.internal.play_billing.m4 r4 = r4.b()
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.h1.o(com.google.android.gms.internal.play_billing.g1, java.lang.Object):void");
    }

    public final int c() {
        int iN = 0;
        for (int i10 = 0; i10 < this.f19513a.b(); i10++) {
            iN += n(this.f19513a.g(i10));
        }
        Iterator it = this.f19513a.c().iterator();
        while (it.hasNext()) {
            iN += n((Map.Entry) it.next());
        }
        return iN;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        h1 h1Var = new h1();
        for (int i10 = 0; i10 < this.f19513a.b(); i10++) {
            Map.Entry entryG = this.f19513a.g(i10);
            h1Var.h((g1) entryG.getKey(), entryG.getValue());
        }
        for (Map.Entry entry : this.f19513a.c()) {
            h1Var.h((g1) entry.getKey(), entry.getValue());
        }
        h1Var.f19515c = this.f19515c;
        return h1Var;
    }

    public final Object d(g1 g1Var) {
        return this.f19513a.get(g1Var);
    }

    public final Iterator e() {
        return this.f19515c ? new a2(this.f19513a.entrySet().iterator()) : this.f19513a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h1) {
            return this.f19513a.equals(((h1) obj).f19513a);
        }
        return false;
    }

    public final void f() {
        if (this.f19514b) {
            return;
        }
        for (int i10 = 0; i10 < this.f19513a.b(); i10++) {
            Map.Entry entryG = this.f19513a.g(i10);
            if (entryG.getValue() instanceof n1) {
                ((n1) entryG.getValue()).r();
            }
        }
        this.f19513a.a();
        this.f19514b = true;
    }

    public final void g(h1 h1Var) {
        for (int i10 = 0; i10 < h1Var.f19513a.b(); i10++) {
            k(h1Var.f19513a.g(i10));
        }
        Iterator it = h1Var.f19513a.c().iterator();
        while (it.hasNext()) {
            k((Map.Entry) it.next());
        }
    }

    public final void h(g1 g1Var, Object obj) {
        if (!g1Var.h()) {
            o(g1Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                o(g1Var, arrayList.get(i10));
            }
            obj = arrayList;
        }
        this.f19513a.put(g1Var, obj);
    }

    public final int hashCode() {
        return this.f19513a.hashCode();
    }

    public final boolean i() {
        for (int i10 = 0; i10 < this.f19513a.b(); i10++) {
            if (!l(this.f19513a.g(i10))) {
                return false;
            }
        }
        Iterator it = this.f19513a.c().iterator();
        while (it.hasNext()) {
            if (!l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }
}
