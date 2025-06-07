package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class ch0 {

    /* renamed from: m, reason: collision with root package name */
    private static final AtomicInteger f6917m = new AtomicInteger(0);

    /* renamed from: n, reason: collision with root package name */
    private static final AtomicInteger f6918n = new AtomicInteger(0);

    public static int O() {
        return f6917m.get();
    }

    public static int Q() {
        return f6918n.get();
    }

    protected static AtomicInteger u() {
        return f6917m;
    }

    protected static AtomicInteger v() {
        return f6918n;
    }

    public abstract void A(int i10);

    public abstract void B(int i10);

    public abstract void C(bh0 bh0Var);

    public abstract void D(int i10);

    public abstract void E(int i10);

    public abstract void F(boolean z10);

    public abstract void G(Integer num);

    public abstract void H(boolean z10);

    public abstract void I(int i10);

    public abstract void J(Surface surface, boolean z10);

    public abstract void K(float f5, boolean z10);

    public abstract void L();

    public abstract boolean M();

    public abstract int N();

    public abstract int P();

    public abstract long R();

    public abstract long S();

    public abstract long T();

    public abstract long U();

    public abstract long V();

    public abstract long r();

    public abstract long s();

    public abstract Integer t();

    public abstract void w(Uri[] uriArr, String str);

    public abstract void x(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10);

    public abstract void y();

    public abstract void z(long j10);
}
