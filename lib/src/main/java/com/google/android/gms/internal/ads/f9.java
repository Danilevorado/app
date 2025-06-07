package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class f9 implements k {

    /* renamed from: h, reason: collision with root package name */
    public static final r f8181h = new r() { // from class: com.google.android.gms.internal.ads.b9
        @Override // com.google.android.gms.internal.ads.r
        public final /* synthetic */ k[] a(Uri uri, Map map) {
            int i10 = q.f14114a;
            r rVar = f9.f8181h;
            return new k[]{new f9()};
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private n f8182a;

    /* renamed from: b, reason: collision with root package name */
    private s0 f8183b;

    /* renamed from: e, reason: collision with root package name */
    private d9 f8186e;

    /* renamed from: c, reason: collision with root package name */
    private int f8184c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f8185d = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f8187f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f8188g = -1;

    @Override // com.google.android.gms.internal.ads.k
    public final boolean a(l lVar) {
        return i9.c(lVar);
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void d(n nVar) {
        this.f8182a = nVar;
        this.f8183b = nVar.S(0, 1);
        nVar.Q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
    
        if (r1 != 65534) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    @Override // com.google.android.gms.internal.ads.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.google.android.gms.internal.ads.l r19, com.google.android.gms.internal.ads.l0 r20) throws com.google.android.gms.internal.ads.oh0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f9.e(com.google.android.gms.internal.ads.l, com.google.android.gms.internal.ads.l0):int");
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void f(long j10, long j11) {
        this.f8184c = j10 == 0 ? 0 : 4;
        d9 d9Var = this.f8186e;
        if (d9Var != null) {
            d9Var.a(j11);
        }
    }
}
