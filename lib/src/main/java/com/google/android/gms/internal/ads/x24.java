package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class x24 extends by3 implements kz3 {
    private static final x24 zzb;
    private t14 zzB;
    private l14 zzD;
    private int zzd;
    private int zze;
    private int zzf;
    private p14 zzj;
    private k24 zzn;
    private boolean zzo;
    private boolean zzr;
    private boolean zzs;
    private t24 zzu;
    private boolean zzv;
    private w24 zzz;
    private byte zzF = 2;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private ky3 zzk = by3.u();
    private ky3 zzl = by3.u();
    private String zzm = "";
    private ky3 zzp = by3.u();
    private String zzq = "";
    private ww3 zzt = ww3.f17284n;
    private String zzw = "";
    private ky3 zzx = by3.u();
    private ky3 zzy = by3.u();
    private ky3 zzA = by3.u();
    private String zzC = "";
    private ky3 zzE = by3.u();

    static {
        x24 x24Var = new x24();
        zzb = x24Var;
        by3.B(x24.class, x24Var);
    }

    private x24() {
    }

    public static n14 K() {
        return (n14) zzb.G();
    }

    static /* synthetic */ void P(x24 x24Var, String str) {
        str.getClass();
        x24Var.zzd |= 4;
        x24Var.zzg = str;
    }

    static /* synthetic */ void Q(x24 x24Var, String str) {
        str.getClass();
        x24Var.zzd |= 8;
        x24Var.zzh = str;
    }

    static /* synthetic */ void R(x24 x24Var, p14 p14Var) {
        p14Var.getClass();
        x24Var.zzj = p14Var;
        x24Var.zzd |= 32;
    }

    static /* synthetic */ void S(x24 x24Var, r24 r24Var) {
        r24Var.getClass();
        ky3 ky3Var = x24Var.zzk;
        if (!ky3Var.d()) {
            x24Var.zzk = by3.v(ky3Var);
        }
        x24Var.zzk.add(r24Var);
    }

    static /* synthetic */ void T(x24 x24Var, String str) {
        x24Var.zzd |= 64;
        x24Var.zzm = str;
    }

    static /* synthetic */ void U(x24 x24Var) {
        x24Var.zzd &= -65;
        x24Var.zzm = zzb.zzm;
    }

    static /* synthetic */ void V(x24 x24Var, k24 k24Var) {
        k24Var.getClass();
        x24Var.zzn = k24Var;
        x24Var.zzd |= 128;
    }

    static /* synthetic */ void W(x24 x24Var, t24 t24Var) {
        t24Var.getClass();
        x24Var.zzu = t24Var;
        x24Var.zzd |= 8192;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void X(x24 x24Var, Iterable iterable) {
        ky3 ky3Var = x24Var.zzx;
        if (!ky3Var.d()) {
            x24Var.zzx = by3.v(ky3Var);
        }
        List list = x24Var.zzx;
        byte[] bArr = ly3.f11871d;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size2);
                }
            } else {
                list.add(obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void Y(x24 x24Var, Iterable iterable) {
        ky3 ky3Var = x24Var.zzy;
        if (!ky3Var.d()) {
            x24Var.zzy = by3.v(ky3Var);
        }
        List list = x24Var.zzy;
        byte[] bArr = ly3.f11871d;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size2);
                }
            } else {
                list.add(obj);
            }
        }
    }

    static /* synthetic */ void Z(x24 x24Var, int i10) {
        x24Var.zze = i10 - 1;
        x24Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzF);
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u001b\u0000\u0001\u0001\u001b\u001b\u0000\u0007\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b", new Object[]{"zzd", "zzg", "zzh", "zzi", "zzk", r24.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zze", m24.f11916a, "zzf", m14.f11902a, "zzj", "zzm", "zzn", "zzt", "zzl", b34.class, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", h34.class, "zzB", "zzC", "zzD", "zzE", x14.class});
        }
        if (i11 == 3) {
            return new x24();
        }
        c14 c14Var = null;
        if (i11 == 4) {
            return new n14(c14Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzF = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String M() {
        return this.zzm;
    }

    public final String N() {
        return this.zzg;
    }

    public final List O() {
        return this.zzk;
    }
}
