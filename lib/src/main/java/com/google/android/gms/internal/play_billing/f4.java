package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
abstract class f4 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f19497a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f19498b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f19499c;

    /* renamed from: d, reason: collision with root package name */
    private static final e4 f19500d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f19501e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f19502f;

    /* renamed from: g, reason: collision with root package name */
    static final long f19503g;

    /* renamed from: h, reason: collision with root package name */
    static final boolean f19504h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    static {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.f4.<clinit>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean A(Class cls) {
        int i10 = c0.f19463a;
        try {
            Class cls2 = f19498b;
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
        return f19500d.g(obj, j10);
    }

    static boolean C() {
        return f19502f;
    }

    static boolean D() {
        return f19501e;
    }

    private static int E(Class cls) {
        if (f19502f) {
            return f19500d.f19487a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f19502f) {
            return f19500d.f19487a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i10 = c0.f19463a;
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
        e4 e4Var = f19500d;
        long j11 = (-4) & j10;
        int i10 = e4Var.f19487a.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        e4Var.f19487a.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j10, byte b10) {
        e4 e4Var = f19500d;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        e4Var.f19487a.putInt(obj, j11, ((255 & b10) << i10) | (e4Var.f19487a.getInt(obj, j11) & (~(255 << i10))));
    }

    static double f(Object obj, long j10) {
        return f19500d.a(obj, j10);
    }

    static float g(Object obj, long j10) {
        return f19500d.b(obj, j10);
    }

    static int h(Object obj, long j10) {
        return f19500d.f19487a.getInt(obj, j10);
    }

    static long i(Object obj, long j10) {
        return f19500d.f19487a.getLong(obj, j10);
    }

    static Object j(Class cls) {
        try {
            return f19497a.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    static Object k(Object obj, long j10) {
        return f19500d.f19487a.getObject(obj, j10);
    }

    static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new b4());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(Throwable th) {
        Logger.getLogger(f4.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void r(Object obj, long j10, boolean z10) {
        f19500d.c(obj, j10, z10);
    }

    static void s(byte[] bArr, long j10, byte b10) {
        f19500d.d(bArr, f19503g + j10, b10);
    }

    static void t(Object obj, long j10, double d10) {
        f19500d.e(obj, j10, d10);
    }

    static void u(Object obj, long j10, float f5) {
        f19500d.f(obj, j10, f5);
    }

    static void v(Object obj, long j10, int i10) {
        f19500d.f19487a.putInt(obj, j10, i10);
    }

    static void w(Object obj, long j10, long j11) {
        f19500d.f19487a.putLong(obj, j10, j11);
    }

    static void x(Object obj, long j10, Object obj2) {
        f19500d.f19487a.putObject(obj, j10, obj2);
    }

    static /* bridge */ /* synthetic */ boolean y(Object obj, long j10) {
        return ((byte) ((f19500d.f19487a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean z(Object obj, long j10) {
        return ((byte) ((f19500d.f19487a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }
}
