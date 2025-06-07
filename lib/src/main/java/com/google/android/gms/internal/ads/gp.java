package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class gp extends by3 implements kz3 {
    private static final gp zzb;
    private int zzd;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private int zzl;
    private ky3 zze = by3.u();
    private String zzi = "";
    private String zzj = "";

    static {
        gp gpVar = new gp();
        zzb = gpVar;
        by3.B(gp.class, gpVar);
    }

    private gp() {
    }

    public static cp K() {
        return (cp) zzb.G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void M(gp gpVar, Iterable iterable) {
        ky3 ky3Var = gpVar.zze;
        if (!ky3Var.d()) {
            gpVar.zze = by3.v(ky3Var);
        }
        List list = gpVar.zze;
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

    static /* synthetic */ void N(gp gpVar, int i10) {
        gpVar.zzd |= 1;
        gpVar.zzf = i10;
    }

    static /* synthetic */ void O(gp gpVar, int i10) {
        gpVar.zzd |= 2;
        gpVar.zzg = i10;
    }

    static /* synthetic */ void P(gp gpVar, long j10) {
        gpVar.zzd |= 4;
        gpVar.zzh = j10;
    }

    static /* synthetic */ void Q(gp gpVar, String str) {
        str.getClass();
        gpVar.zzd |= 8;
        gpVar.zzi = str;
    }

    static /* synthetic */ void R(gp gpVar, String str) {
        str.getClass();
        gpVar.zzd |= 16;
        gpVar.zzj = str;
    }

    static /* synthetic */ void S(gp gpVar, long j10) {
        gpVar.zzd |= 32;
        gpVar.zzk = j10;
    }

    static /* synthetic */ void T(gp gpVar, int i10) {
        gpVar.zzd |= 64;
        gpVar.zzl = i10;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzd", "zze", bp.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new gp();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new cp(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
