package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class hl4 {

    /* renamed from: a, reason: collision with root package name */
    private int f9201a;

    /* renamed from: b, reason: collision with root package name */
    private int f9202b;

    /* renamed from: c, reason: collision with root package name */
    private int f9203c = 0;

    /* renamed from: d, reason: collision with root package name */
    private zk4[] f9204d = new zk4[100];

    public hl4(boolean z10, int i10) {
    }

    public final synchronized int a() {
        return this.f9202b * 65536;
    }

    public final synchronized zk4 b() {
        zk4 zk4Var;
        this.f9202b++;
        int i10 = this.f9203c;
        if (i10 > 0) {
            zk4[] zk4VarArr = this.f9204d;
            int i11 = i10 - 1;
            this.f9203c = i11;
            zk4Var = zk4VarArr[i11];
            Objects.requireNonNull(zk4Var);
            zk4VarArr[i11] = null;
        } else {
            zk4Var = new zk4(new byte[65536], 0);
            int i12 = this.f9202b;
            zk4[] zk4VarArr2 = this.f9204d;
            int length = zk4VarArr2.length;
            if (i12 > length) {
                this.f9204d = (zk4[]) Arrays.copyOf(zk4VarArr2, length + length);
                return zk4Var;
            }
        }
        return zk4Var;
    }

    public final synchronized void c(zk4 zk4Var) {
        zk4[] zk4VarArr = this.f9204d;
        int i10 = this.f9203c;
        this.f9203c = i10 + 1;
        zk4VarArr[i10] = zk4Var;
        this.f9202b--;
        notifyAll();
    }

    public final synchronized void d(bl4 bl4Var) {
        while (bl4Var != null) {
            zk4[] zk4VarArr = this.f9204d;
            int i10 = this.f9203c;
            this.f9203c = i10 + 1;
            zk4VarArr[i10] = bl4Var.d();
            this.f9202b--;
            bl4Var = bl4Var.f();
        }
        notifyAll();
    }

    public final synchronized void e() {
        f(0);
    }

    public final synchronized void f(int i10) {
        int i11 = this.f9201a;
        this.f9201a = i10;
        if (i10 < i11) {
            g();
        }
    }

    public final synchronized void g() {
        int i10 = this.f9201a;
        int i11 = sv2.f15560a;
        int iMax = Math.max(0, ((i10 + 65535) / 65536) - this.f9202b);
        int i12 = this.f9203c;
        if (iMax >= i12) {
            return;
        }
        Arrays.fill(this.f9204d, iMax, i12, (Object) null);
        this.f9203c = iMax;
    }
}
