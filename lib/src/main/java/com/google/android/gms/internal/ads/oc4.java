package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class oc4 extends Exception {

    /* renamed from: m, reason: collision with root package name */
    public final int f13153m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f13154n;

    /* renamed from: o, reason: collision with root package name */
    public final k9 f13155o;

    public oc4(int i10, int i11, int i12, int i13, k9 k9Var, boolean z10, Exception exc) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AudioTrack init failed ");
        sb2.append(i10);
        sb2.append(" Config(");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(i13);
        sb2.append(")");
        sb2.append(true != z10 ? "" : " (recoverable)");
        super(sb2.toString(), exc);
        this.f13153m = i10;
        this.f13154n = z10;
        this.f13155o = k9Var;
    }
}
