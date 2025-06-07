package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class kd3 implements t53 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10985a;

    /* renamed from: b, reason: collision with root package name */
    private final List f10986b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final t53 f10987c;

    /* renamed from: d, reason: collision with root package name */
    private t53 f10988d;

    /* renamed from: e, reason: collision with root package name */
    private t53 f10989e;

    /* renamed from: f, reason: collision with root package name */
    private t53 f10990f;

    /* renamed from: g, reason: collision with root package name */
    private t53 f10991g;

    /* renamed from: h, reason: collision with root package name */
    private t53 f10992h;

    /* renamed from: i, reason: collision with root package name */
    private t53 f10993i;

    /* renamed from: j, reason: collision with root package name */
    private t53 f10994j;

    /* renamed from: k, reason: collision with root package name */
    private t53 f10995k;

    public kd3(Context context, t53 t53Var) {
        this.f10985a = context.getApplicationContext();
        this.f10987c = t53Var;
    }

    private final t53 g() {
        if (this.f10989e == null) {
            uy2 uy2Var = new uy2(this.f10985a);
            this.f10989e = uy2Var;
            h(uy2Var);
        }
        return this.f10989e;
    }

    private final void h(t53 t53Var) {
        for (int i10 = 0; i10 < this.f10986b.size(); i10++) {
            t53Var.b((wy3) this.f10986b.get(i10));
        }
    }

    private static final void i(t53 t53Var, wy3 wy3Var) {
        if (t53Var != null) {
            t53Var.b(wy3Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00fc  */
    @Override // com.google.android.gms.internal.ads.t53
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.google.android.gms.internal.ads.ib3 r5) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kd3.a(com.google.android.gms.internal.ads.ib3):long");
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final void b(wy3 wy3Var) {
        Objects.requireNonNull(wy3Var);
        this.f10987c.b(wy3Var);
        this.f10986b.add(wy3Var);
        i(this.f10988d, wy3Var);
        i(this.f10989e, wy3Var);
        i(this.f10990f, wy3Var);
        i(this.f10991g, wy3Var);
        i(this.f10992h, wy3Var);
        i(this.f10993i, wy3Var);
        i(this.f10994j, wy3Var);
    }

    @Override // com.google.android.gms.internal.ads.t53, com.google.android.gms.internal.ads.zt3
    public final Map c() {
        t53 t53Var = this.f10995k;
        return t53Var == null ? Collections.emptyMap() : t53Var.c();
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final Uri d() {
        t53 t53Var = this.f10995k;
        if (t53Var == null) {
            return null;
        }
        return t53Var.d();
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final void f() {
        t53 t53Var = this.f10995k;
        if (t53Var != null) {
            try {
                t53Var.f();
            } finally {
                this.f10995k = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.bh4
    public final int z(byte[] bArr, int i10, int i11) {
        t53 t53Var = this.f10995k;
        Objects.requireNonNull(t53Var);
        return t53Var.z(bArr, i10, i11);
    }
}
