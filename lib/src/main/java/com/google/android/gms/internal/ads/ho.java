package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ho extends by3 implements kz3 {
    private static final ho zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private sp zzi;
    private zn zzk;
    private co zzl;
    private vo zzm;
    private cn zzn;
    private gp zzo;
    private pq zzp;
    private ln zzq;
    private String zzf = "";
    private int zzh = AdError.NETWORK_ERROR_CODE;
    private jy3 zzj = by3.t();

    static {
        ho hoVar = new ho();
        zzb = hoVar;
        by3.B(ho.class, hoVar);
    }

    private ho() {
    }

    public static go M() {
        return (go) zzb.G();
    }

    static /* synthetic */ void P(ho hoVar, String str) {
        str.getClass();
        hoVar.zzd |= 2;
        hoVar.zzf = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void Q(ho hoVar, Iterable iterable) {
        jy3 jy3Var = hoVar.zzj;
        if (!jy3Var.d()) {
            int size = jy3Var.size();
            hoVar.zzj = jy3Var.j(size == 0 ? 10 : size + size);
        }
        List list = hoVar.zzj;
        byte[] bArr = ly3.f11871d;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size2 = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size2) + " is null.";
                int size3 = list.size();
                while (true) {
                    size3--;
                    if (size3 < size2) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size3);
                }
            } else {
                list.add(obj);
            }
        }
    }

    static /* synthetic */ void S(ho hoVar, zn znVar) {
        znVar.getClass();
        hoVar.zzk = znVar;
        hoVar.zzd |= 32;
    }

    static /* synthetic */ void T(ho hoVar, cn cnVar) {
        cnVar.getClass();
        hoVar.zzn = cnVar;
        hoVar.zzd |= 256;
    }

    static /* synthetic */ void U(ho hoVar, gp gpVar) {
        gpVar.getClass();
        hoVar.zzo = gpVar;
        hoVar.zzd |= 512;
    }

    static /* synthetic */ void V(ho hoVar, pq pqVar) {
        pqVar.getClass();
        hoVar.zzp = pqVar;
        hoVar.zzd |= 1024;
    }

    static /* synthetic */ void W(ho hoVar, ln lnVar) {
        lnVar.getClass();
        hoVar.zzq = lnVar;
        hoVar.zzd |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", eo.f7921a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i11 == 3) {
            return new ho();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new go(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final cn K() {
        cn cnVar = this.zzn;
        return cnVar == null ? cn.L() : cnVar;
    }

    public final zn L() {
        zn znVar = this.zzk;
        return znVar == null ? zn.L() : znVar;
    }

    public final String O() {
        return this.zzf;
    }
}
