package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ae1 {

    /* renamed from: h, reason: collision with root package name */
    public static final ae1 f6050h = new ae1(new yd1());

    /* renamed from: a, reason: collision with root package name */
    private final qv f6051a;

    /* renamed from: b, reason: collision with root package name */
    private final nv f6052b;

    /* renamed from: c, reason: collision with root package name */
    private final dw f6053c;

    /* renamed from: d, reason: collision with root package name */
    private final aw f6054d;

    /* renamed from: e, reason: collision with root package name */
    private final n00 f6055e;

    /* renamed from: f, reason: collision with root package name */
    private final q.g f6056f;

    /* renamed from: g, reason: collision with root package name */
    private final q.g f6057g;

    private ae1(yd1 yd1Var) {
        this.f6051a = yd1Var.f17972a;
        this.f6052b = yd1Var.f17973b;
        this.f6053c = yd1Var.f17974c;
        this.f6056f = new q.g(yd1Var.f17977f);
        this.f6057g = new q.g(yd1Var.f17978g);
        this.f6054d = yd1Var.f17975d;
        this.f6055e = yd1Var.f17976e;
    }

    public final nv a() {
        return this.f6052b;
    }

    public final qv b() {
        return this.f6051a;
    }

    public final tv c(String str) {
        return (tv) this.f6057g.get(str);
    }

    public final wv d(String str) {
        return (wv) this.f6056f.get(str);
    }

    public final aw e() {
        return this.f6054d;
    }

    public final dw f() {
        return this.f6053c;
    }

    public final n00 g() {
        return this.f6055e;
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList(this.f6056f.size());
        for (int i10 = 0; i10 < this.f6056f.size(); i10++) {
            arrayList.add((String) this.f6056f.i(i10));
        }
        return arrayList;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        if (this.f6053c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f6051a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f6052b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.f6056f.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f6055e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
