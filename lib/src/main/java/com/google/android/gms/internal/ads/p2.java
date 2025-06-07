package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class p2 implements kc0 {
    public static final Parcelable.Creator<p2> CREATOR = new o2();

    /* renamed from: m, reason: collision with root package name */
    public final String f13518m;

    /* renamed from: n, reason: collision with root package name */
    public final String f13519n;

    protected p2(Parcel parcel) {
        String string = parcel.readString();
        int i10 = sv2.f15560a;
        this.f13518m = string;
        this.f13519n = parcel.readString();
    }

    public p2(String str, String str2) {
        this.f13518m = str;
        this.f13519n = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            p2 p2Var = (p2) obj;
            if (this.f13518m.equals(p2Var.f13518m) && this.f13519n.equals(p2Var.f13519n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13518m.hashCode() + 527) * 31) + this.f13519n.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    @Override // com.google.android.gms.internal.ads.kc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(com.google.android.gms.internal.ads.n70 r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.f13518m
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case 62359119: goto L36;
                case 79833656: goto L2c;
                case 428414940: goto L22;
                case 1746739798: goto L18;
                case 1939198791: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L40
        Le:
            java.lang.String r1 = "ARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = r5
            goto L41
        L18:
            java.lang.String r1 = "ALBUMARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = r3
            goto L41
        L22:
            java.lang.String r1 = "DESCRIPTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = r2
            goto L41
        L2c:
            java.lang.String r1 = "TITLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 0
            goto L41
        L36:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = r4
            goto L41
        L40:
            r0 = -1
        L41:
            if (r0 == 0) goto L64
            if (r0 == r5) goto L5e
            if (r0 == r4) goto L58
            if (r0 == r3) goto L52
            if (r0 == r2) goto L4c
            return
        L4c:
            java.lang.String r0 = r6.f13519n
            r7.z(r0)
            return
        L52:
            java.lang.String r0 = r6.f13519n
            r7.u(r0)
            return
        L58:
            java.lang.String r0 = r6.f13519n
            r7.v(r0)
            return
        L5e:
            java.lang.String r0 = r6.f13519n
            r7.w(r0)
            return
        L64:
            java.lang.String r0 = r6.f13519n
            r7.I(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p2.p(com.google.android.gms.internal.ads.n70):void");
    }

    public final String toString() {
        return "VC: " + this.f13518m + "=" + this.f13519n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13518m);
        parcel.writeString(this.f13519n);
    }
}
