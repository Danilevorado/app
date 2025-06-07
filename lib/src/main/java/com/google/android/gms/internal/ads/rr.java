package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class rr {
    public static final void a(qr qrVar, or orVar) {
        if (orVar.a() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(orVar.b())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        qrVar.d(orVar.a(), orVar.b(), orVar.c(), orVar.d());
    }
}
