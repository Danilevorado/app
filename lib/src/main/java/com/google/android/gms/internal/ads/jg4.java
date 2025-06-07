package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jg4 implements yh4 {

    /* renamed from: a, reason: collision with root package name */
    private final r f10477a;

    /* renamed from: b, reason: collision with root package name */
    private k f10478b;

    /* renamed from: c, reason: collision with root package name */
    private l f10479c;

    public jg4(r rVar) {
        this.f10477a = rVar;
    }

    @Override // com.google.android.gms.internal.ads.yh4
    public final void a(long j10, long j11) {
        k kVar = this.f10478b;
        Objects.requireNonNull(kVar);
        kVar.f(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.yh4
    public final long b() {
        l lVar = this.f10479c;
        if (lVar != null) {
            return lVar.e();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.yh4
    public final void c() {
        if (this.f10478b != null) {
            this.f10478b = null;
        }
        this.f10479c = null;
    }

    @Override // com.google.android.gms.internal.ads.yh4
    public final void d() {
        k kVar = this.f10478b;
        if (kVar instanceof w4) {
            ((w4) kVar).b();
        }
    }

    @Override // com.google.android.gms.internal.ads.yh4
    public final void e(bh4 bh4Var, Uri uri, Map map, long j10, long j11, n nVar) throws gj4 {
        bo4 bo4Var = new bo4(bh4Var, j10, j11);
        this.f10479c = bo4Var;
        if (this.f10478b != null) {
            return;
        }
        k[] kVarArrA = this.f10477a.a(uri, map);
        int length = kVarArrA.length;
        int i10 = 0;
        if (length == 1) {
            this.f10478b = kVarArrA[0];
        } else {
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                k kVar = kVarArrA[i11];
                try {
                } catch (EOFException unused) {
                    if (this.f10478b != null || bo4Var.e() == j10) {
                    }
                } catch (Throwable th) {
                    gt1.f(this.f10478b != null || bo4Var.e() == j10);
                    bo4Var.j();
                    throw th;
                }
                if (kVar.a(bo4Var)) {
                    this.f10478b = kVar;
                    gt1.f(true);
                    bo4Var.j();
                    break;
                } else {
                    boolean z10 = this.f10478b != null || bo4Var.e() == j10;
                    gt1.f(z10);
                    bo4Var.j();
                    i11++;
                }
            }
            if (this.f10478b == null) {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    int length2 = kVarArrA.length;
                    if (i10 >= length2) {
                        throw new gj4("None of the available extractors (" + sb2.toString() + ") could read the stream.", uri);
                    }
                    sb2.append(kVarArrA[i10].getClass().getSimpleName());
                    if (i10 < length2 - 1) {
                        sb2.append(", ");
                    }
                    i10++;
                }
            }
        }
        this.f10478b.d(nVar);
    }

    @Override // com.google.android.gms.internal.ads.yh4
    public final int f(l0 l0Var) {
        k kVar = this.f10478b;
        Objects.requireNonNull(kVar);
        l lVar = this.f10479c;
        Objects.requireNonNull(lVar);
        return kVar.e(lVar, l0Var);
    }
}
