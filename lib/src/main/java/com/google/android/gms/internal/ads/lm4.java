package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* loaded from: classes.dex */
public final class lm4 extends Surface {

    /* renamed from: p, reason: collision with root package name */
    private static int f11666p;

    /* renamed from: q, reason: collision with root package name */
    private static boolean f11667q;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f11668m;

    /* renamed from: n, reason: collision with root package name */
    private final jm4 f11669n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f11670o;

    /* synthetic */ lm4(jm4 jm4Var, SurfaceTexture surfaceTexture, boolean z10, km4 km4Var) {
        super(surfaceTexture);
        this.f11669n = jm4Var;
        this.f11668m = z10;
    }

    public static lm4 a(Context context, boolean z10) {
        boolean z11 = true;
        if (z10 && !b(context)) {
            z11 = false;
        }
        gt1.f(z11);
        return new jm4().a(z10 ? f11666p : 0);
    }

    public static synchronized boolean b(Context context) {
        String strEglQueryString;
        if (!f11667q) {
            int i10 = sv2.f15560a;
            int i11 = 2;
            if (i10 >= 24 && ((i10 >= 26 || !("samsung".equals(sv2.f15562c) || "XT1650".equals(sv2.f15563d))) && ((i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                if (strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                    i11 = 1;
                }
            } else {
                i11 = 0;
            }
            f11666p = i11;
            f11667q = true;
        }
        return f11666p != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f11669n) {
            if (!this.f11670o) {
                this.f11669n.b();
                this.f11670o = true;
            }
        }
    }
}
