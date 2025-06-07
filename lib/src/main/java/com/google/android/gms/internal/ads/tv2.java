package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class tv2 {

    /* renamed from: f, reason: collision with root package name */
    private static tv2 f16065f;

    /* renamed from: a, reason: collision with root package name */
    private float f16066a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final lv2 f16067b;

    /* renamed from: c, reason: collision with root package name */
    private final jv2 f16068c;

    /* renamed from: d, reason: collision with root package name */
    private kv2 f16069d;

    /* renamed from: e, reason: collision with root package name */
    private mv2 f16070e;

    public tv2(lv2 lv2Var, jv2 jv2Var) {
        this.f16067b = lv2Var;
        this.f16068c = jv2Var;
    }

    public static tv2 b() {
        if (f16065f == null) {
            f16065f = new tv2(new lv2(), new jv2());
        }
        return f16065f;
    }

    public final float a() {
        return this.f16066a;
    }

    public final void c(Context context) {
        this.f16069d = new kv2(new Handler(), context, new iv2(), this);
    }

    public final void d(float f5) {
        this.f16066a = f5;
        if (this.f16070e == null) {
            this.f16070e = mv2.a();
        }
        Iterator it = this.f16070e.b().iterator();
        while (it.hasNext()) {
            ((cv2) it.next()).g().h(f5);
        }
    }

    public final void e() {
        nv2.a().d(this);
        nv2.a().b();
        ow2.d().i();
        this.f16069d.a();
    }

    public final void f() {
        ow2.d().j();
        nv2.a().c();
        this.f16069d.b();
    }
}
