package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class ce0 {

    /* renamed from: a, reason: collision with root package name */
    private final i4.e f6884a;

    /* renamed from: b, reason: collision with root package name */
    private final me0 f6885b;

    /* renamed from: e, reason: collision with root package name */
    private final String f6888e;

    /* renamed from: f, reason: collision with root package name */
    private final String f6889f;

    /* renamed from: d, reason: collision with root package name */
    private final Object f6887d = new Object();

    /* renamed from: g, reason: collision with root package name */
    private long f6890g = -1;

    /* renamed from: h, reason: collision with root package name */
    private long f6891h = -1;

    /* renamed from: i, reason: collision with root package name */
    private long f6892i = 0;

    /* renamed from: j, reason: collision with root package name */
    private long f6893j = -1;

    /* renamed from: k, reason: collision with root package name */
    private long f6894k = -1;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedList f6886c = new LinkedList();

    ce0(i4.e eVar, me0 me0Var, String str, String str2) {
        this.f6884a = eVar;
        this.f6885b = me0Var;
        this.f6888e = str;
        this.f6889f = str2;
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.f6887d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f6888e);
            bundle.putString("slotid", this.f6889f);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.f6893j);
            bundle.putLong("tresponse", this.f6894k);
            bundle.putLong("timp", this.f6890g);
            bundle.putLong("tload", this.f6891h);
            bundle.putLong("pcc", this.f6892i);
            bundle.putLong("tfetch", -1L);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator it = this.f6886c.iterator();
            while (it.hasNext()) {
                arrayList.add(((be0) it.next()).b());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final String c() {
        return this.f6888e;
    }

    public final void d() {
        synchronized (this.f6887d) {
            if (this.f6894k != -1) {
                be0 be0Var = new be0(this);
                be0Var.d();
                this.f6886c.add(be0Var);
                this.f6892i++;
                this.f6885b.e();
                this.f6885b.d(this);
            }
        }
    }

    public final void e() {
        synchronized (this.f6887d) {
            if (this.f6894k != -1 && !this.f6886c.isEmpty()) {
                be0 be0Var = (be0) this.f6886c.getLast();
                if (be0Var.a() == -1) {
                    be0Var.c();
                    this.f6885b.d(this);
                }
            }
        }
    }

    public final void f() {
        synchronized (this.f6887d) {
            if (this.f6894k != -1 && this.f6890g == -1) {
                this.f6890g = this.f6884a.b();
                this.f6885b.d(this);
            }
            this.f6885b.f();
        }
    }

    public final void g() {
        synchronized (this.f6887d) {
            this.f6885b.g();
        }
    }

    public final void h(boolean z10) {
        synchronized (this.f6887d) {
            if (this.f6894k != -1) {
                this.f6891h = this.f6884a.b();
            }
        }
    }

    public final void i() {
        synchronized (this.f6887d) {
            this.f6885b.h();
        }
    }

    public final void j(k3.c4 c4Var) {
        synchronized (this.f6887d) {
            long jB = this.f6884a.b();
            this.f6893j = jB;
            this.f6885b.i(c4Var, jB);
        }
    }

    public final void k(long j10) {
        synchronized (this.f6887d) {
            this.f6894k = j10;
            if (j10 != -1) {
                this.f6885b.d(this);
            }
        }
    }
}
