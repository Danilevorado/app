package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class d5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7184a;

    public d5(int i10) {
        this.f7184a = i10;
    }

    public static int a(int i10) {
        return (i10 >> 24) & 255;
    }

    public static String b(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) ((i10 >> 24) & 255));
        sb2.append((char) ((i10 >> 16) & 255));
        sb2.append((char) ((i10 >> 8) & 255));
        sb2.append((char) (i10 & 255));
        return sb2.toString();
    }

    public String toString() {
        return b(this.f7184a);
    }
}
