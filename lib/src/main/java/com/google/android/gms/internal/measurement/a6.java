package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a6 {
    public static Object a(b6 b6Var) {
        try {
            return b6Var.a();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return b6Var.a();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
