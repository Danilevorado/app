package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
abstract class za {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f19429a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f19430b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f19431c;

    /* renamed from: d, reason: collision with root package name */
    private static final ya f19432d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f19433e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f19434f;

    /* renamed from: g, reason: collision with root package name */
    static final long f19435g;

    /* renamed from: h, reason: collision with root package name */
    static final boolean f19436h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    static {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.za.<clinit>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean A(Class cls) {
        int i10 = j7.f19027a;
        try {
            Class cls2 = f19430b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean B(Object obj, long j10) {
        return f19432d.g(obj, j10);
    }

    static boolean C() {
        return f19434f;
    }

    static boolean D() {
        return f19433e;
    }

    private static int E(Class cls) {
        if (f19434f) {
            return f19432d.h(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f19434f) {
            return f19432d.i(cls);
        }
        return -1;
    }

    private static Field b() {
        int i10 = j7.f19027a;
        Field fieldC = c(Buffer.class, "effectiveDirectAddress");
        if (fieldC != null) {
            return fieldC;
        }
        Field fieldC2 = c(Buffer.class, "address");
        if (fieldC2 == null || fieldC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldC2;
    }

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        ya yaVar = f19432d;
        int iJ = yaVar.j(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        yaVar.n(obj, j11, ((255 & b10) << i10) | (iJ & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        ya yaVar = f19432d;
        int i10 = (((int) j10) & 3) << 3;
        yaVar.n(obj, j11, ((255 & b10) << i10) | (yaVar.j(obj, j11) & (~(255 << i10))));
    }

    static double f(Object obj, long j10) {
        return f19432d.a(obj, j10);
    }

    static float g(Object obj, long j10) {
        return f19432d.b(obj, j10);
    }

    static int h(Object obj, long j10) {
        return f19432d.j(obj, j10);
    }

    static long i(Object obj, long j10) {
        return f19432d.k(obj, j10);
    }

    static Object j(Class cls) {
        try {
            return f19429a.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    static Object k(Object obj, long j10) {
        return f19432d.m(obj, j10);
    }

    static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new va());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(Throwable th) {
        Logger.getLogger(za.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void r(Object obj, long j10, boolean z10) {
        f19432d.c(obj, j10, z10);
    }

    static void s(byte[] bArr, long j10, byte b10) {
        f19432d.d(bArr, f19435g + j10, b10);
    }

    static void t(Object obj, long j10, double d10) {
        f19432d.e(obj, j10, d10);
    }

    static void u(Object obj, long j10, float f5) {
        f19432d.f(obj, j10, f5);
    }

    static void v(Object obj, long j10, int i10) {
        f19432d.n(obj, j10, i10);
    }

    static void w(Object obj, long j10, long j11) {
        f19432d.o(obj, j10, j11);
    }

    static void x(Object obj, long j10, Object obj2) {
        f19432d.p(obj, j10, obj2);
    }

    static /* bridge */ /* synthetic */ boolean y(Object obj, long j10) {
        return ((byte) ((f19432d.j(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean z(Object obj, long j10) {
        return ((byte) ((f19432d.j(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }
}
