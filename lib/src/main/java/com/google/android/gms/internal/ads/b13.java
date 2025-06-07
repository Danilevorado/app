package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class b13 {
    public static a13 a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new c13(new i13(context));
    }
}
