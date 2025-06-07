package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class r84 extends x44 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f14687o = 0;

    /* renamed from: h, reason: collision with root package name */
    private final int f14688h;

    /* renamed from: i, reason: collision with root package name */
    private final int f14689i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f14690j;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f14691k;

    /* renamed from: l, reason: collision with root package name */
    private final h11[] f14692l;

    /* renamed from: m, reason: collision with root package name */
    private final Object[] f14693m;

    /* renamed from: n, reason: collision with root package name */
    private final HashMap f14694n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r84(Collection collection, aj4 aj4Var) {
        super(false, aj4Var);
        int iC = 0;
        int size = collection.size();
        this.f14690j = new int[size];
        this.f14691k = new int[size];
        this.f14692l = new h11[size];
        this.f14693m = new Object[size];
        this.f14694n = new HashMap();
        Iterator it = collection.iterator();
        int iB = 0;
        int i10 = 0;
        while (it.hasNext()) {
            b84 b84Var = (b84) it.next();
            this.f14692l[i10] = b84Var.a();
            this.f14691k[i10] = iC;
            this.f14690j[i10] = iB;
            iC += this.f14692l[i10].c();
            iB += this.f14692l[i10].b();
            this.f14693m[i10] = b84Var.b();
            this.f14694n.put(this.f14693m[i10], Integer.valueOf(i10));
            i10++;
        }
        this.f14688h = iC;
        this.f14689i = iB;
    }

    @Override // com.google.android.gms.internal.ads.h11
    public final int b() {
        return this.f14689i;
    }

    @Override // com.google.android.gms.internal.ads.h11
    public final int c() {
        return this.f14688h;
    }

    @Override // com.google.android.gms.internal.ads.x44
    protected final int p(Object obj) {
        Integer num = (Integer) this.f14694n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.x44
    protected final int q(int i10) {
        return sv2.j(this.f14690j, i10 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.x44
    protected final int r(int i10) {
        return sv2.j(this.f14691k, i10 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.x44
    protected final int s(int i10) {
        return this.f14690j[i10];
    }

    @Override // com.google.android.gms.internal.ads.x44
    protected final int t(int i10) {
        return this.f14691k[i10];
    }

    @Override // com.google.android.gms.internal.ads.x44
    protected final h11 u(int i10) {
        return this.f14692l[i10];
    }

    @Override // com.google.android.gms.internal.ads.x44
    protected final Object v(int i10) {
        return this.f14693m[i10];
    }

    final List y() {
        return Arrays.asList(this.f14692l);
    }
}
