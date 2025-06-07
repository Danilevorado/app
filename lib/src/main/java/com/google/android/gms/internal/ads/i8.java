package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class i8 implements k {

    /* renamed from: l, reason: collision with root package name */
    public static final r f9602l = new r() { // from class: com.google.android.gms.internal.ads.g8
        @Override // com.google.android.gms.internal.ads.r
        public final /* synthetic */ k[] a(Uri uri, Map map) {
            int i10 = q.f14114a;
            r rVar = i8.f9602l;
            return new k[]{new i8()};
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private boolean f9607e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9608f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9609g;

    /* renamed from: h, reason: collision with root package name */
    private long f9610h;

    /* renamed from: i, reason: collision with root package name */
    private e8 f9611i;

    /* renamed from: j, reason: collision with root package name */
    private n f9612j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f9613k;

    /* renamed from: a, reason: collision with root package name */
    private final rt2 f9603a = new rt2(0);

    /* renamed from: c, reason: collision with root package name */
    private final jm2 f9605c = new jm2(4096);

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f9604b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    private final f8 f9606d = new f8();

    @Override // com.google.android.gms.internal.ads.k
    public final boolean a(l lVar) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        bo4 bo4Var = (bo4) lVar;
        bo4Var.E(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        bo4Var.g(bArr[13] & 7, false);
        bo4Var.E(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void d(n nVar) {
        this.f9612j = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    @Override // com.google.android.gms.internal.ads.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.google.android.gms.internal.ads.l r17, com.google.android.gms.internal.ads.l0 r18) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i8.e(com.google.android.gms.internal.ads.l, com.google.android.gms.internal.ads.l0):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.rt2 r5 = r4.f9603a
            long r0 = r5.e()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.c()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.f(r7)
        L24:
            com.google.android.gms.internal.ads.e8 r5 = r4.f9611i
            r6 = 0
            if (r5 == 0) goto L2c
            r5.d(r7)
        L2c:
            android.util.SparseArray r5 = r4.f9604b
            int r5 = r5.size()
            if (r6 >= r5) goto L42
            android.util.SparseArray r5 = r4.f9604b
            java.lang.Object r5 = r5.valueAt(r6)
            com.google.android.gms.internal.ads.h8 r5 = (com.google.android.gms.internal.ads.h8) r5
            r5.b()
            int r6 = r6 + 1
            goto L2c
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i8.f(long, long):void");
    }
}
