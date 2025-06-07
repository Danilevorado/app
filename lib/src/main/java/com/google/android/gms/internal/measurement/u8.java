package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class u8 extends h7 {
    private static final Map zza = new ConcurrentHashMap();
    protected qa zzc = qa.c();
    protected int zzd = -1;

    protected static y8 f() {
        return v8.h();
    }

    protected static z8 g() {
        return o9.f();
    }

    protected static z8 h(z8 z8Var) {
        int size = z8Var.size();
        return z8Var.j(size == 0 ? 10 : size + size);
    }

    protected static a9 i() {
        return ha.f();
    }

    protected static a9 j(a9 a9Var) {
        int size = a9Var.size();
        return a9Var.j(size == 0 ? 10 : size + size);
    }

    static Object k(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e5);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object m(y9 y9Var, String str, Object[] objArr) {
        return new ia(y9Var, str, objArr);
    }

    protected static void n(Class cls, u8 u8Var) {
        zza.put(cls, u8Var);
    }

    static u8 t(Class cls) throws ClassNotFoundException {
        Map map = zza;
        u8 u8Var = (u8) map.get(cls);
        if (u8Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                u8Var = (u8) map.get(cls);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException("Class initialization cannot fail.", e5);
            }
        }
        if (u8Var == null) {
            u8Var = (u8) ((u8) za.j(cls)).u(6, null, null);
            if (u8Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, u8Var);
        }
        return u8Var;
    }

    @Override // com.google.android.gms.internal.measurement.z9
    public final /* synthetic */ y9 a() {
        return (u8) u(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.h7
    final int b() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.h7
    final void d(int i10) {
        this.zzd = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return ga.a().b(getClass()).f(this, (u8) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        if (i10 != 0) {
            return i10;
        }
        int iB = ga.a().b(getClass()).b(this);
        this.zzb = iB;
        return iB;
    }

    protected final s8 r() {
        return (s8) u(5, null, null);
    }

    public final s8 s() {
        s8 s8Var = (s8) u(5, null, null);
        s8Var.i(this);
        return s8Var;
    }

    public final String toString() {
        return aa.a(this, super.toString());
    }

    protected abstract Object u(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.y9
    public final /* synthetic */ x9 w0() {
        return (s8) u(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.y9
    public final int x0() {
        int i10 = this.zzd;
        if (i10 != -1) {
            return i10;
        }
        int iA = ga.a().b(getClass()).a(this);
        this.zzd = iA;
        return iA;
    }

    @Override // com.google.android.gms.internal.measurement.y9
    public final void y0(f8 f8Var) {
        ga.a().b(getClass()).h(this, g8.n(f8Var));
    }

    @Override // com.google.android.gms.internal.measurement.y9
    public final /* synthetic */ x9 z0() {
        s8 s8Var = (s8) u(5, null, null);
        s8Var.i(this);
        return s8Var;
    }
}
