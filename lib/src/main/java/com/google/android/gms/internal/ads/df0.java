package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public abstract class df0 {
    public static Context a(Context context) {
        return c(context).b();
    }

    public static Object b(Context context, String str, bf0 bf0Var) throws cf0 {
        try {
            return bf0Var.a(c(context).d(str));
        } catch (Exception e5) {
            throw new cf0(e5);
        }
    }

    private static DynamiteModule c(Context context) throws cf0 {
        try {
            return DynamiteModule.e(context, DynamiteModule.f5851b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e5) {
            throw new cf0(e5);
        }
    }
}
