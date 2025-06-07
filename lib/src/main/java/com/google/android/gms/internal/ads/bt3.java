package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class bt3 extends by3 implements kz3 {
    private static final bt3 zzb;
    private int zzd;
    private ky3 zze = by3.u();

    static {
        bt3 bt3Var = new bt3();
        zzb = bt3Var;
        by3.B(bt3.class, bt3Var);
    }

    private bt3() {
    }

    public static xs3 M() {
        return (xs3) zzb.G();
    }

    public static bt3 P(InputStream inputStream, qx3 qx3Var) {
        return (bt3) by3.p(zzb, inputStream, qx3Var);
    }

    public static bt3 Q(byte[] bArr, qx3 qx3Var) {
        return (bt3) by3.q(zzb, bArr, qx3Var);
    }

    static /* synthetic */ void T(bt3 bt3Var, at3 at3Var) {
        at3Var.getClass();
        ky3 ky3Var = bt3Var.zze;
        if (!ky3Var.d()) {
            bt3Var.zze = by3.v(ky3Var);
        }
        bt3Var.zze.add(at3Var);
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", at3.class});
        }
        if (i11 == 3) {
            return new bt3();
        }
        ws3 ws3Var = null;
        if (i11 == 4) {
            return new xs3(ws3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zze.size();
    }

    public final int L() {
        return this.zzd;
    }

    public final at3 N(int i10) {
        return (at3) this.zze.get(i10);
    }

    public final List R() {
        return this.zze;
    }
}
