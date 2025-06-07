package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class fj4 {

    /* renamed from: d, reason: collision with root package name */
    public static final fj4 f8300d = new fj4(new j31[0]);

    /* renamed from: e, reason: collision with root package name */
    private static final String f8301e = Integer.toString(0, 36);

    /* renamed from: f, reason: collision with root package name */
    public static final xa4 f8302f = new xa4() { // from class: com.google.android.gms.internal.ads.ej4
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f8303a;

    /* renamed from: b, reason: collision with root package name */
    private final c63 f8304b;

    /* renamed from: c, reason: collision with root package name */
    private int f8305c;

    public fj4(j31... j31VarArr) {
        this.f8304b = c63.t(j31VarArr);
        this.f8303a = j31VarArr.length;
        int i10 = 0;
        while (i10 < this.f8304b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f8304b.size(); i12++) {
                if (((j31) this.f8304b.get(i10)).equals(this.f8304b.get(i12))) {
                    ad2.c("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final int a(j31 j31Var) {
        int iIndexOf = this.f8304b.indexOf(j31Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final j31 b(int i10) {
        return (j31) this.f8304b.get(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fj4.class == obj.getClass()) {
            fj4 fj4Var = (fj4) obj;
            if (this.f8303a == fj4Var.f8303a && this.f8304b.equals(fj4Var.f8304b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f8305c;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f8304b.hashCode();
        this.f8305c = iHashCode;
        return iHashCode;
    }
}
