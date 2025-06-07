package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public abstract class y90 extends ContextWrapper {
    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
