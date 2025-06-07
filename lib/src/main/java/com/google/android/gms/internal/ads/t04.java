package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
abstract class t04 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f15633a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f15634b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f15635c;

    /* renamed from: d, reason: collision with root package name */
    private static final s04 f15636d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f15637e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f15638f;

    /* renamed from: g, reason: collision with root package name */
    static final long f15639g;

    /* renamed from: h, reason: collision with root package name */
    private static final long f15640h;

    /* renamed from: i, reason: collision with root package name */
    static final boolean f15641i;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    static {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t04.<clinit>():void");
    }

    static void A(Object obj, long j10, float f5) {
        f15636d.h(obj, j10, f5);
    }

    static void B(Object obj, long j10, int i10) {
        f15636d.f15038a.putInt(obj, j10, i10);
    }

    static void C(Object obj, long j10, long j11) {
        f15636d.f15038a.putLong(obj, j10, j11);
    }

    static void D(Object obj, long j10, Object obj2) {
        f15636d.f15038a.putObject(obj, j10, obj2);
    }

    static /* bridge */ /* synthetic */ boolean E(Object obj, long j10) {
        return ((byte) ((f15636d.f15038a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean F(Object obj, long j10) {
        return ((byte) ((f15636d.f15038a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean G(Class cls) {
        int i10 = iw3.f10205a;
        try {
            Class cls2 = f15634b;
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

    static boolean H(Object obj, long j10) {
        return f15636d.i(obj, j10);
    }

    static boolean a() {
        return f15638f;
    }

    static boolean b() {
        return f15637e;
    }

    private static int c(Class cls) {
        if (f15638f) {
            return f15636d.f15038a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int d(Class cls) {
        if (f15638f) {
            return f15636d.f15038a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field e() {
        int i10 = iw3.f10205a;
        Field fieldF = f(Buffer.class, "effectiveDirectAddress");
        if (fieldF != null) {
            return fieldF;
        }
        Field fieldF2 = f(Buffer.class, "address");
        if (fieldF2 == null || fieldF2.getType() != Long.TYPE) {
            return null;
        }
        return fieldF2;
    }

    private static Field f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Object obj, long j10, byte b10) {
        s04 s04Var = f15636d;
        long j11 = (-4) & j10;
        int i10 = s04Var.f15038a.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        s04Var.f15038a.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(Object obj, long j10, byte b10) {
        s04 s04Var = f15636d;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        s04Var.f15038a.putInt(obj, j11, ((255 & b10) << i10) | (s04Var.f15038a.getInt(obj, j11) & (~(255 << i10))));
    }

    static byte i(long j10) {
        return f15636d.a(j10);
    }

    static double j(Object obj, long j10) {
        return f15636d.b(obj, j10);
    }

    static float k(Object obj, long j10) {
        return f15636d.c(obj, j10);
    }

    static int l(Object obj, long j10) {
        return f15636d.f15038a.getInt(obj, j10);
    }

    static long m(ByteBuffer byteBuffer) {
        s04 s04Var = f15636d;
        return s04Var.f15038a.getLong(byteBuffer, f15640h);
    }

    static long n(Object obj, long j10) {
        return f15636d.f15038a.getLong(obj, j10);
    }

    static Object o(Class cls) {
        try {
            return f15633a.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    static Object p(Object obj, long j10) {
        return f15636d.f15038a.getObject(obj, j10);
    }

    static Unsafe q() {
        try {
            return (Unsafe) AccessController.doPrivileged(new p04());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void r(Throwable th) {
        Logger.getLogger(t04.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void w(long j10, byte[] bArr, long j11, long j12) {
        f15636d.d(j10, bArr, j11, j12);
    }

    static void x(Object obj, long j10, boolean z10) {
        f15636d.e(obj, j10, z10);
    }

    static void y(byte[] bArr, long j10, byte b10) {
        f15636d.f(bArr, f15639g + j10, b10);
    }

    static void z(Object obj, long j10, double d10) {
        f15636d.g(obj, j10, d10);
    }
}
