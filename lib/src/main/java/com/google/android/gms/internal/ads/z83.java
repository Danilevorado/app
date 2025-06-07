package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class z83 extends q83 {

    /* renamed from: a, reason: collision with root package name */
    static final Unsafe f18476a;

    /* renamed from: b, reason: collision with root package name */
    static final long f18477b;

    /* renamed from: c, reason: collision with root package name */
    static final long f18478c;

    /* renamed from: d, reason: collision with root package name */
    static final long f18479d;

    /* renamed from: e, reason: collision with root package name */
    static final long f18480e;

    /* renamed from: f, reason: collision with root package name */
    static final long f18481f;

    class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Object run() throws IllegalAccessException, IllegalArgumentException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f18478c = unsafe.objectFieldOffset(b93.class.getDeclaredField("o"));
                f18477b = unsafe.objectFieldOffset(b93.class.getDeclaredField("n"));
                f18479d = unsafe.objectFieldOffset(b93.class.getDeclaredField("m"));
                f18480e = unsafe.objectFieldOffset(a93.class.getDeclaredField("a"));
                f18481f = unsafe.objectFieldOffset(a93.class.getDeclaredField("b"));
                f18476a = unsafe;
            } catch (NoSuchFieldException e5) {
                throw new RuntimeException(e5);
            } catch (RuntimeException e10) {
                throw e10;
            }
        } catch (PrivilegedActionException e11) {
            throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
        }
    }

    /* synthetic */ z83(h93 h93Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.q83
    final t83 a(b93 b93Var, t83 t83Var) {
        t83 t83Var2;
        do {
            t83Var2 = b93Var.f6401n;
            if (t83Var == t83Var2) {
                return t83Var2;
            }
        } while (!e(b93Var, t83Var2, t83Var));
        return t83Var2;
    }

    @Override // com.google.android.gms.internal.ads.q83
    final a93 b(b93 b93Var, a93 a93Var) {
        a93 a93Var2;
        do {
            a93Var2 = b93Var.f6402o;
            if (a93Var == a93Var2) {
                return a93Var2;
            }
        } while (!g(b93Var, a93Var2, a93Var));
        return a93Var2;
    }

    @Override // com.google.android.gms.internal.ads.q83
    final void c(a93 a93Var, a93 a93Var2) {
        f18476a.putObject(a93Var, f18481f, a93Var2);
    }

    @Override // com.google.android.gms.internal.ads.q83
    final void d(a93 a93Var, Thread thread) {
        f18476a.putObject(a93Var, f18480e, thread);
    }

    @Override // com.google.android.gms.internal.ads.q83
    final boolean e(b93 b93Var, t83 t83Var, t83 t83Var2) {
        return f93.a(f18476a, b93Var, f18477b, t83Var, t83Var2);
    }

    @Override // com.google.android.gms.internal.ads.q83
    final boolean f(b93 b93Var, Object obj, Object obj2) {
        return f93.a(f18476a, b93Var, f18479d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.q83
    final boolean g(b93 b93Var, a93 a93Var, a93 a93Var2) {
        return f93.a(f18476a, b93Var, f18478c, a93Var, a93Var2);
    }
}
