package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class u34 {
    public static u34 b(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new p34(cls.getSimpleName()) : new r34(cls.getSimpleName());
    }

    public abstract void a(String str);
}
