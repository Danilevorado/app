package com.google.android.gms.internal.ads;

import java.util.Collections;

/* loaded from: classes.dex */
final class t1 extends y1 {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f15642e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    private boolean f15643b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f15644c;

    /* renamed from: d, reason: collision with root package name */
    private int f15645d;

    public t1(s0 s0Var) {
        super(s0Var);
    }

    @Override // com.google.android.gms.internal.ads.y1
    protected final boolean a(jm2 jm2Var) throws x1 {
        k9 k9VarY;
        if (this.f15643b) {
            jm2Var.g(1);
        } else {
            int iS = jm2Var.s();
            int i10 = iS >> 4;
            this.f15645d = i10;
            if (i10 == 2) {
                int i11 = f15642e[(iS >> 2) & 3];
                i7 i7Var = new i7();
                i7Var.s("audio/mpeg");
                i7Var.e0(1);
                i7Var.t(i11);
                k9VarY = i7Var.y();
            } else if (i10 == 7 || i10 == 8) {
                i7 i7Var2 = new i7();
                i7Var2.s(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                i7Var2.e0(1);
                i7Var2.t(8000);
                k9VarY = i7Var2.y();
            } else {
                if (i10 != 10) {
                    throw new x1("Audio format not supported: " + i10);
                }
                this.f15643b = true;
            }
            this.f17850a.b(k9VarY);
            this.f15644c = true;
            this.f15643b = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.y1
    protected final boolean b(jm2 jm2Var, long j10) {
        if (this.f15645d == 2) {
            int i10 = jm2Var.i();
            this.f17850a.a(jm2Var, i10);
            this.f17850a.e(j10, 1, i10, 0, null);
            return true;
        }
        int iS = jm2Var.s();
        if (iS != 0 || this.f15644c) {
            if (this.f15645d == 10 && iS != 1) {
                return false;
            }
            int i11 = jm2Var.i();
            this.f17850a.a(jm2Var, i11);
            this.f17850a.e(j10, 1, i11, 0, null);
            return true;
        }
        int i12 = jm2Var.i();
        byte[] bArr = new byte[i12];
        jm2Var.b(bArr, 0, i12);
        in4 in4VarA = jn4.a(bArr);
        i7 i7Var = new i7();
        i7Var.s("audio/mp4a-latm");
        i7Var.f0(in4VarA.f9816c);
        i7Var.e0(in4VarA.f9815b);
        i7Var.t(in4VarA.f9814a);
        i7Var.i(Collections.singletonList(bArr));
        this.f17850a.b(i7Var.y());
        this.f15644c = true;
        return false;
    }
}
