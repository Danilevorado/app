package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class y6 implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final r f17899d = new r() { // from class: com.google.android.gms.internal.ads.x6
        @Override // com.google.android.gms.internal.ads.r
        public final /* synthetic */ k[] a(Uri uri, Map map) {
            int i10 = q.f14114a;
            r rVar = y6.f17899d;
            return new k[]{new y6()};
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final z6 f17900a = new z6(null);

    /* renamed from: b, reason: collision with root package name */
    private final jm2 f17901b = new jm2(2786);

    /* renamed from: c, reason: collision with root package name */
    private boolean f17902c;

    @Override // com.google.android.gms.internal.ads.k
    public final boolean a(l lVar) throws EOFException, InterruptedIOException {
        jm2 jm2Var = new jm2(10);
        int i10 = 0;
        while (true) {
            bo4 bo4Var = (bo4) lVar;
            bo4Var.E(jm2Var.h(), 0, 10, false);
            jm2Var.f(0);
            if (jm2Var.u() != 4801587) {
                break;
            }
            jm2Var.g(3);
            int iR = jm2Var.r();
            i10 += iR + 10;
            bo4Var.g(iR, false);
        }
        lVar.j();
        bo4 bo4Var2 = (bo4) lVar;
        bo4Var2.g(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            bo4Var2.E(jm2Var.h(), 0, 6, false);
            jm2Var.f(0);
            if (jm2Var.w() != 2935) {
                lVar.j();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                bo4Var2.g(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iB = mn4.b(jm2Var.h());
                if (iB == -1) {
                    return false;
                }
                bo4Var2.g(iB - 6, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void d(n nVar) {
        this.f17900a.b(nVar, new x8(Integer.MIN_VALUE, 0, 1));
        nVar.Q();
        nVar.R(new n0(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.k
    public final int e(l lVar, l0 l0Var) {
        int iZ = lVar.z(this.f17901b.h(), 0, 2786);
        if (iZ == -1) {
            return -1;
        }
        this.f17901b.f(0);
        this.f17901b.e(iZ);
        if (!this.f17902c) {
            this.f17900a.e(0L, 4);
            this.f17902c = true;
        }
        this.f17900a.a(this.f17901b);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void f(long j10, long j11) {
        this.f17902c = false;
        this.f17900a.c();
    }
}
