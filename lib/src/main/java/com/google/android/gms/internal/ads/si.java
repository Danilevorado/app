package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class si {

    /* renamed from: a, reason: collision with root package name */
    private final dh f15260a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15261b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15262c;

    /* renamed from: e, reason: collision with root package name */
    private final Class[] f15264e;

    /* renamed from: d, reason: collision with root package name */
    private volatile Method f15263d = null;

    /* renamed from: f, reason: collision with root package name */
    private final CountDownLatch f15265f = new CountDownLatch(1);

    public si(dh dhVar, String str, String str2, Class... clsArr) {
        this.f15260a = dhVar;
        this.f15261b = str;
        this.f15262c = str2;
        this.f15264e = clsArr;
        dhVar.k().submit(new ri(this));
    }

    static /* bridge */ /* synthetic */ void b(si siVar) {
        try {
            try {
                dh dhVar = siVar.f15260a;
                Class clsLoadClass = dhVar.i().loadClass(siVar.c(dhVar.u(), siVar.f15261b));
                if (clsLoadClass != null) {
                    siVar.f15263d = clsLoadClass.getMethod(siVar.c(siVar.f15260a.u(), siVar.f15262c), siVar.f15264e);
                    Method method = siVar.f15263d;
                }
            } catch (gg | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
            }
        } finally {
            siVar.f15265f.countDown();
        }
    }

    private final String c(byte[] bArr, String str) {
        return new String(this.f15260a.e().b(bArr, str), "UTF-8");
    }

    public final Method a() {
        if (this.f15263d != null) {
            return this.f15263d;
        }
        try {
            if (this.f15265f.await(2L, TimeUnit.SECONDS)) {
                return this.f15263d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
