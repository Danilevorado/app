package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
abstract class gm4 {

    /* renamed from: a, reason: collision with root package name */
    private static Constructor f8814a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f8815b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f8816c;

    /* renamed from: d, reason: collision with root package name */
    private static Constructor f8817d;

    public static d1 a(float f5) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        c();
        Object objNewInstance = f8814a.newInstance(new Object[0]);
        f8815b.invoke(objNewInstance, Float.valueOf(f5));
        Object objInvoke = f8816c.invoke(objNewInstance, new Object[0]);
        Objects.requireNonNull(objInvoke);
        return (d1) objInvoke;
    }

    public static se1 b() throws ClassNotFoundException {
        c();
        return (se1) f8817d.newInstance(new Object[0]);
    }

    private static void c() throws ClassNotFoundException {
        if (f8814a == null || f8815b == null || f8816c == null) {
            Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
            f8814a = cls.getConstructor(new Class[0]);
            f8815b = cls.getMethod("setRotationDegrees", Float.TYPE);
            f8816c = cls.getMethod("build", new Class[0]);
        }
        if (f8817d == null) {
            f8817d = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory").getConstructor(new Class[0]);
        }
    }
}
