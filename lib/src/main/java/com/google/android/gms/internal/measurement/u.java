package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class u implements Iterable, q {

    /* renamed from: m, reason: collision with root package name */
    private final String f19324m;

    public u(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f19324m = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016f  */
    @Override // com.google.android.gms.internal.measurement.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.q e(java.lang.String r22, com.google.android.gms.internal.measurement.r4 r23, java.util.List r24) {
        /*
            Method dump skipped, instructions count: 1770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.u.e(java.lang.String, com.google.android.gms.internal.measurement.r4, java.util.List):com.google.android.gms.internal.measurement.q");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f19324m.equals(((u) obj).f19324m);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q f() {
        return new u(this.f19324m);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double g() {
        double d10;
        if (this.f19324m.isEmpty()) {
            d10 = 0.0d;
        } else {
            try {
                return Double.valueOf(this.f19324m);
            } catch (NumberFormatException unused) {
                d10 = Double.NaN;
            }
        }
        return Double.valueOf(d10);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean h() {
        return Boolean.valueOf(!this.f19324m.isEmpty());
    }

    public final int hashCode() {
        return this.f19324m.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String i() {
        return this.f19324m;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new t(this);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator l() {
        return new s(this);
    }

    public final String toString() {
        return "\"" + this.f19324m + "\"";
    }
}
