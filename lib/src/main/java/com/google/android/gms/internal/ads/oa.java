package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class oa implements Comparable {

    /* renamed from: m, reason: collision with root package name */
    private final za f13104m;

    /* renamed from: n, reason: collision with root package name */
    private final int f13105n;

    /* renamed from: o, reason: collision with root package name */
    private final String f13106o;

    /* renamed from: p, reason: collision with root package name */
    private final int f13107p;

    /* renamed from: q, reason: collision with root package name */
    private final Object f13108q;

    /* renamed from: r, reason: collision with root package name */
    private final sa f13109r;

    /* renamed from: s, reason: collision with root package name */
    private Integer f13110s;

    /* renamed from: t, reason: collision with root package name */
    private ra f13111t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f13112u;

    /* renamed from: v, reason: collision with root package name */
    private w9 f13113v;

    /* renamed from: w, reason: collision with root package name */
    private na f13114w;

    /* renamed from: x, reason: collision with root package name */
    private final ba f13115x;

    public oa(int i10, String str, sa saVar) {
        Uri uri;
        String host;
        this.f13104m = za.f18501c ? new za() : null;
        this.f13108q = new Object();
        int iHashCode = 0;
        this.f13112u = false;
        this.f13113v = null;
        this.f13105n = i10;
        this.f13106o = str;
        this.f13109r = saVar;
        this.f13115x = new ba();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.f13107p = iHashCode;
    }

    public final boolean A() {
        boolean z10;
        synchronized (this.f13108q) {
            z10 = this.f13112u;
        }
        return z10;
    }

    public final boolean B() {
        synchronized (this.f13108q) {
        }
        return false;
    }

    public byte[] C() {
        return null;
    }

    public final ba D() {
        return this.f13115x;
    }

    public final int a() {
        return this.f13105n;
    }

    public final int b() {
        return this.f13115x.b();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f13110s.intValue() - ((oa) obj).f13110s.intValue();
    }

    public final int d() {
        return this.f13107p;
    }

    public final w9 g() {
        return this.f13113v;
    }

    public final oa i(w9 w9Var) {
        this.f13113v = w9Var;
        return this;
    }

    public final oa k(ra raVar) {
        this.f13111t = raVar;
        return this;
    }

    public final oa l(int i10) {
        this.f13110s = Integer.valueOf(i10);
        return this;
    }

    protected abstract ua m(ja jaVar);

    public final String o() {
        String str = this.f13106o;
        if (this.f13105n == 0) {
            return str;
        }
        return Integer.toString(1) + "-" + str;
    }

    public final String p() {
        return this.f13106o;
    }

    public Map q() {
        return Collections.emptyMap();
    }

    public final void r(String str) {
        if (za.f18501c) {
            this.f13104m.a(str, Thread.currentThread().getId());
        }
    }

    public final void s(xa xaVar) {
        sa saVar;
        synchronized (this.f13108q) {
            saVar = this.f13109r;
        }
        if (saVar != null) {
            saVar.a(xaVar);
        }
    }

    protected abstract void t(Object obj);

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.f13107p));
        B();
        return "[ ] " + this.f13106o + " " + "0x".concat(strValueOf) + " NORMAL " + this.f13110s;
    }

    final void u(String str) {
        ra raVar = this.f13111t;
        if (raVar != null) {
            raVar.b(this);
        }
        if (za.f18501c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new ma(this, str, id));
            } else {
                this.f13104m.a(str, id);
                this.f13104m.b(toString());
            }
        }
    }

    public final void v() {
        synchronized (this.f13108q) {
            this.f13112u = true;
        }
    }

    final void w() {
        na naVar;
        synchronized (this.f13108q) {
            naVar = this.f13114w;
        }
        if (naVar != null) {
            naVar.a(this);
        }
    }

    final void x(ua uaVar) {
        na naVar;
        synchronized (this.f13108q) {
            naVar = this.f13114w;
        }
        if (naVar != null) {
            naVar.b(this, uaVar);
        }
    }

    final void y(int i10) {
        ra raVar = this.f13111t;
        if (raVar != null) {
            raVar.c(this, i10);
        }
    }

    final void z(na naVar) {
        synchronized (this.f13108q) {
            this.f13114w = naVar;
        }
    }
}
