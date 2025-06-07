package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class ip2 {

    /* renamed from: a, reason: collision with root package name */
    static b5.i f9877a;

    /* renamed from: b, reason: collision with root package name */
    public static x3.b f9878b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f9879c = new Object();

    public static b5.i a(Context context) {
        b5.i iVar;
        b(context, false);
        synchronized (f9879c) {
            iVar = f9877a;
        }
        return iVar;
    }

    public static void b(Context context, boolean z10) {
        synchronized (f9879c) {
            if (f9878b == null) {
                f9878b = x3.a.a(context);
            }
            b5.i iVar = f9877a;
            if (iVar == null || ((iVar.m() && !f9877a.n()) || (z10 && f9877a.m()))) {
                f9877a = ((x3.b) e4.p.m(f9878b, "the appSetIdClient shouldn't be null")).a();
            }
        }
    }
}
