package com.google.android.gms.measurement.internal;

import android.util.Log;

/* loaded from: classes.dex */
final class p3 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ int f20261m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f20262n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Object f20263o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ Object f20264p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Object f20265q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ s3 f20266r;

    p3(s3 s3Var, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f20266r = s3Var;
        this.f20261m = i10;
        this.f20262n = str;
        this.f20263o = obj;
        this.f20264p = obj2;
        this.f20265q = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s3 s3Var;
        char c10;
        g4 g4VarF = this.f20266r.f20269a.F();
        if (!g4VarF.l()) {
            Log.println(6, this.f20266r.C(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        s3 s3Var2 = this.f20266r;
        if (s3Var2.f20350c == 0) {
            if (s3Var2.f20269a.y().H()) {
                s3Var = this.f20266r;
                s3Var.f20269a.x();
                c10 = 'C';
            } else {
                s3Var = this.f20266r;
                s3Var.f20269a.x();
                c10 = 'c';
            }
            s3Var.f20350c = c10;
        }
        s3 s3Var3 = this.f20266r;
        if (s3Var3.f20351d < 0) {
            s3Var3.f20269a.y().o();
            s3Var3.f20351d = 68000L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.f20261m);
        s3 s3Var4 = this.f20266r;
        String strSubstring = "2" + cCharAt + s3Var4.f20350c + s3Var4.f20351d + ":" + s3.z(true, this.f20262n, this.f20263o, this.f20264p, this.f20265q);
        if (strSubstring.length() > 1024) {
            strSubstring = this.f20262n.substring(0, 1024);
        }
        e4 e4Var = g4VarF.f19921d;
        if (e4Var != null) {
            e4Var.b(strSubstring, 1L);
        }
    }
}
