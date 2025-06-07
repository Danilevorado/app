package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public final class ox2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13450a;

    /* renamed from: b, reason: collision with root package name */
    private final Looper f13451b;

    public ox2(Context context, Looper looper) {
        this.f13450a = context;
        this.f13451b = looper;
    }

    public final void a(String str) {
        dy2 dy2VarK = fy2.K();
        dy2VarK.u(this.f13450a.getPackageName());
        dy2VarK.w(2);
        ay2 ay2VarK = by2.K();
        ay2VarK.u(str);
        ay2VarK.v(2);
        dy2VarK.v(ay2VarK);
        new px2(this.f13450a, this.f13451b, (fy2) dy2VarK.m()).a();
    }
}
