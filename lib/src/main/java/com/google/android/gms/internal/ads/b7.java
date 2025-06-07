package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class b7 implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final r f6364d = new r() { // from class: com.google.android.gms.internal.ads.a7
        @Override // com.google.android.gms.internal.ads.r
        public final /* synthetic */ k[] a(Uri uri, Map map) {
            int i10 = q.f14114a;
            r rVar = b7.f6364d;
            return new k[]{new b7()};
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final c7 f6365a = new c7(null);

    /* renamed from: b, reason: collision with root package name */
    private final jm2 f6366b = new jm2(16384);

    /* renamed from: c, reason: collision with root package name */
    private boolean f6367c;

    @Override // com.google.android.gms.internal.ads.k
    public final boolean a(l lVar) throws EOFException, InterruptedIOException {
        int i10;
        jm2 jm2Var = new jm2(10);
        int i11 = 0;
        while (true) {
            bo4 bo4Var = (bo4) lVar;
            bo4Var.E(jm2Var.h(), 0, 10, false);
            jm2Var.f(0);
            if (jm2Var.u() != 4801587) {
                break;
            }
            jm2Var.g(3);
            int iR = jm2Var.r();
            i11 += iR + 10;
            bo4Var.g(iR, false);
        }
        lVar.j();
        bo4 bo4Var2 = (bo4) lVar;
        bo4Var2.g(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            bo4Var2.E(jm2Var.h(), 0, 7, false);
            jm2Var.f(0);
            int iW = jm2Var.w();
            if (iW == 44096 || iW == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArrH = jm2Var.h();
                int i15 = pn4.f13955b;
                if (bArrH.length < 7) {
                    i10 = -1;
                } else {
                    int i16 = ((bArrH[2] & 255) << 8) | (bArrH[3] & 255);
                    if (i16 == 65535) {
                        i16 = ((bArrH[4] & 255) << 16) | ((bArrH[5] & 255) << 8) | (bArrH[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (iW == 44097) {
                        i14 += 2;
                    }
                    i10 = i16 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                bo4Var2.g(i10 - 7, false);
            } else {
                lVar.j();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                bo4Var2.g(i13, false);
                i12 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void d(n nVar) {
        this.f6365a.b(nVar, new x8(Integer.MIN_VALUE, 0, 1));
        nVar.Q();
        nVar.R(new n0(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.k
    public final int e(l lVar, l0 l0Var) {
        int iZ = lVar.z(this.f6366b.h(), 0, 16384);
        if (iZ == -1) {
            return -1;
        }
        this.f6366b.f(0);
        this.f6366b.e(iZ);
        if (!this.f6367c) {
            this.f6365a.e(0L, 4);
            this.f6367c = true;
        }
        this.f6365a.a(this.f6366b);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void f(long j10, long j11) {
        this.f6367c = false;
        this.f6365a.c();
    }
}
