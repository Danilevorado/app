package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
abstract class ya {

    /* renamed from: a, reason: collision with root package name */
    final Unsafe f19413a;

    ya(Unsafe unsafe) {
        this.f19413a = unsafe;
    }

    public abstract double a(Object obj, long j10);

    public abstract float b(Object obj, long j10);

    public abstract void c(Object obj, long j10, boolean z10);

    public abstract void d(Object obj, long j10, byte b10);

    public abstract void e(Object obj, long j10, double d10);

    public abstract void f(Object obj, long j10, float f5);

    public abstract boolean g(Object obj, long j10);

    public final int h(Class cls) {
        return this.f19413a.arrayBaseOffset(cls);
    }

    public final int i(Class cls) {
        return this.f19413a.arrayIndexScale(cls);
    }

    public final int j(Object obj, long j10) {
        return this.f19413a.getInt(obj, j10);
    }

    public final long k(Object obj, long j10) {
        return this.f19413a.getLong(obj, j10);
    }

    public final long l(Field field) {
        return this.f19413a.objectFieldOffset(field);
    }

    public final Object m(Object obj, long j10) {
        return this.f19413a.getObject(obj, j10);
    }

    public final void n(Object obj, long j10, int i10) {
        this.f19413a.putInt(obj, j10, i10);
    }

    public final void o(Object obj, long j10, long j11) {
        this.f19413a.putLong(obj, j10, j11);
    }

    public final void p(Object obj, long j10, Object obj2) {
        this.f19413a.putObject(obj, j10, obj2);
    }
}
