package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class ti3 implements pu3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f15863a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15864b;

    /* renamed from: c, reason: collision with root package name */
    private qp3 f15865c;

    /* renamed from: d, reason: collision with root package name */
    private ro3 f15866d;

    /* renamed from: e, reason: collision with root package name */
    private int f15867e;

    /* renamed from: f, reason: collision with root package name */
    private dq3 f15868f;

    ti3(ss3 ss3Var) throws GeneralSecurityException {
        String strP = ss3Var.P();
        this.f15863a = strP;
        if (strP.equals(td3.f15791b)) {
            try {
                tp3 tp3VarN = tp3.N(ss3Var.O(), qx3.a());
                this.f15865c = (qp3) qd3.d(ss3Var);
                this.f15864b = tp3VarN.K();
                return;
            } catch (ny3 e5) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e5);
            }
        }
        if (strP.equals(td3.f15790a)) {
            try {
                uo3 uo3VarM = uo3.M(ss3Var.O(), qx3.a());
                this.f15866d = (ro3) qd3.d(ss3Var);
                this.f15867e = uo3VarM.N().K();
                this.f15864b = this.f15867e + uo3VarM.O().K();
                return;
            } catch (ny3 e10) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e10);
            }
        }
        if (!strP.equals(di3.f7329a)) {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(strP)));
        }
        try {
            gq3 gq3VarN = gq3.N(ss3Var.O(), qx3.a());
            this.f15868f = (dq3) qd3.d(ss3Var);
            this.f15864b = gq3VarN.K();
        } catch (ny3 e11) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.pu3
    public final int a() {
        return this.f15864b;
    }

    @Override // com.google.android.gms.internal.ads.pu3
    public final pj3 b(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.f15864b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.f15863a.equals(td3.f15791b)) {
            pp3 pp3VarL = qp3.L();
            pp3VarL.j(this.f15865c);
            pp3VarL.u(ww3.I(bArr, 0, this.f15864b));
            return new pj3((wb3) qd3.g(this.f15863a, (qp3) pp3VarL.m(), wb3.class));
        }
        if (!this.f15863a.equals(td3.f15790a)) {
            if (!this.f15863a.equals(di3.f7329a)) {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            cq3 cq3VarL = dq3.L();
            cq3VarL.j(this.f15868f);
            cq3VarL.u(ww3.I(bArr, 0, this.f15864b));
            return new pj3((dc3) qd3.g(this.f15863a, (dq3) cq3VarL.m(), dc3.class));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, this.f15867e);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, this.f15867e, this.f15864b);
        xo3 xo3VarL = yo3.L();
        xo3VarL.j(this.f15866d.O());
        ww3 ww3Var = ww3.f17284n;
        xo3VarL.u(ww3.I(bArrCopyOfRange, 0, bArrCopyOfRange.length));
        yo3 yo3Var = (yo3) xo3VarL.m();
        mr3 mr3VarL = nr3.L();
        mr3VarL.j(this.f15866d.P());
        mr3VarL.u(ww3.I(bArrCopyOfRange2, 0, bArrCopyOfRange2.length));
        nr3 nr3Var = (nr3) mr3VarL.m();
        qo3 qo3VarL = ro3.L();
        qo3VarL.w(this.f15866d.K());
        qo3VarL.u(yo3Var);
        qo3VarL.v(nr3Var);
        return new pj3((wb3) qd3.g(this.f15863a, (ro3) qo3VarL.m(), wb3.class));
    }
}
