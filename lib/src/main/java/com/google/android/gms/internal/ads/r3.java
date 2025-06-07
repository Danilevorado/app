package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class r3 extends j3 {
    public static final Parcelable.Creator<r3> CREATOR = new q3();

    /* renamed from: n, reason: collision with root package name */
    public final String f14601n;

    /* renamed from: o, reason: collision with root package name */
    public final String f14602o;

    /* renamed from: p, reason: collision with root package name */
    public final c63 f14603p;

    public r3(String str, String str2, List list) {
        super(str);
        gt1.d(!list.isEmpty());
        this.f14601n = str2;
        c63 c63VarS = c63.s(list);
        this.f14603p = c63VarS;
        this.f14602o = (String) c63VarS.get(0);
    }

    private static List a(String str) throws NumberFormatException {
        int i10;
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                i10 = Integer.parseInt(str.substring(8, 10));
            } else {
                if (str.length() < 7) {
                    if (str.length() >= 4) {
                        i10 = Integer.parseInt(str.substring(0, 4));
                    }
                    return arrayList;
                }
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                i10 = Integer.parseInt(str.substring(5, 7));
            }
            arrayList.add(Integer.valueOf(i10));
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r3.class == obj.getClass()) {
            r3 r3Var = (r3) obj;
            if (sv2.b(this.f10269m, r3Var.f10269m) && sv2.b(this.f14601n, r3Var.f14601n) && this.f14603p.equals(r3Var.f14603p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f10269m.hashCode() + 527;
        String str = this.f14601n;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.f14603p.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0108  */
    @Override // com.google.android.gms.internal.ads.j3, com.google.android.gms.internal.ads.kc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(com.google.android.gms.internal.ads.n70 r9) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r3.p(com.google.android.gms.internal.ads.n70):void");
    }

    @Override // com.google.android.gms.internal.ads.j3
    public final String toString() {
        return this.f10269m + ": description=" + this.f14601n + ": values=" + String.valueOf(this.f14603p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10269m);
        parcel.writeString(this.f14601n);
        parcel.writeStringArray((String[]) this.f14603p.toArray(new String[0]));
    }
}
