package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class v1 implements k {

    /* renamed from: q, reason: collision with root package name */
    public static final r f16517q = new r() { // from class: com.google.android.gms.internal.ads.u1
        @Override // com.google.android.gms.internal.ads.r
        public final /* synthetic */ k[] a(Uri uri, Map map) {
            int i10 = q.f14114a;
            r rVar = v1.f16517q;
            return new k[]{new v1()};
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private n f16523f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16525h;

    /* renamed from: i, reason: collision with root package name */
    private long f16526i;

    /* renamed from: j, reason: collision with root package name */
    private int f16527j;

    /* renamed from: k, reason: collision with root package name */
    private int f16528k;

    /* renamed from: l, reason: collision with root package name */
    private int f16529l;

    /* renamed from: m, reason: collision with root package name */
    private long f16530m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f16531n;

    /* renamed from: o, reason: collision with root package name */
    private t1 f16532o;

    /* renamed from: p, reason: collision with root package name */
    private z1 f16533p;

    /* renamed from: a, reason: collision with root package name */
    private final jm2 f16518a = new jm2(4);

    /* renamed from: b, reason: collision with root package name */
    private final jm2 f16519b = new jm2(9);

    /* renamed from: c, reason: collision with root package name */
    private final jm2 f16520c = new jm2(11);

    /* renamed from: d, reason: collision with root package name */
    private final jm2 f16521d = new jm2();

    /* renamed from: e, reason: collision with root package name */
    private final w1 f16522e = new w1();

    /* renamed from: g, reason: collision with root package name */
    private int f16524g = 1;

    private final jm2 b(l lVar) throws EOFException, InterruptedIOException {
        if (this.f16529l > this.f16521d.j()) {
            jm2 jm2Var = this.f16521d;
            int iJ = jm2Var.j();
            jm2Var.d(new byte[Math.max(iJ + iJ, this.f16529l)], 0);
        } else {
            this.f16521d.f(0);
        }
        this.f16521d.e(this.f16529l);
        ((bo4) lVar).C(this.f16521d.h(), 0, this.f16529l, false);
        return this.f16521d;
    }

    private final void c() {
        if (this.f16531n) {
            return;
        }
        this.f16523f.R(new n0(-9223372036854775807L, 0L));
        this.f16531n = true;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final boolean a(l lVar) throws EOFException, InterruptedIOException {
        bo4 bo4Var = (bo4) lVar;
        bo4Var.E(this.f16518a.h(), 0, 3, false);
        this.f16518a.f(0);
        if (this.f16518a.u() != 4607062) {
            return false;
        }
        bo4Var.E(this.f16518a.h(), 0, 2, false);
        this.f16518a.f(0);
        if ((this.f16518a.w() & 250) != 0) {
            return false;
        }
        bo4Var.E(this.f16518a.h(), 0, 4, false);
        this.f16518a.f(0);
        int iM = this.f16518a.m();
        lVar.j();
        bo4 bo4Var2 = (bo4) lVar;
        bo4Var2.g(iM, false);
        bo4Var2.E(this.f16518a.h(), 0, 4, false);
        this.f16518a.f(0);
        return this.f16518a.m() == 0;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void d(n nVar) {
        this.f16523f = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.google.android.gms.internal.ads.l r17, com.google.android.gms.internal.ads.l0 r18) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v1.e(com.google.android.gms.internal.ads.l, com.google.android.gms.internal.ads.l0):int");
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void f(long j10, long j11) {
        if (j10 == 0) {
            this.f16524g = 1;
            this.f16525h = false;
        } else {
            this.f16524g = 3;
        }
        this.f16527j = 0;
    }
}
