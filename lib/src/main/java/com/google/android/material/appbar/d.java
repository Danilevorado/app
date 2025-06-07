package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.w;

/* loaded from: classes.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private final View f20695a;

    /* renamed from: b, reason: collision with root package name */
    private int f20696b;

    /* renamed from: c, reason: collision with root package name */
    private int f20697c;

    /* renamed from: d, reason: collision with root package name */
    private int f20698d;

    /* renamed from: e, reason: collision with root package name */
    private int f20699e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f20700f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f20701g = true;

    public d(View view) {
        this.f20695a = view;
    }

    void a() {
        View view = this.f20695a;
        w.Z(view, this.f20698d - (view.getTop() - this.f20696b));
        View view2 = this.f20695a;
        w.Y(view2, this.f20699e - (view2.getLeft() - this.f20697c));
    }

    public int b() {
        return this.f20698d;
    }

    void c() {
        this.f20696b = this.f20695a.getTop();
        this.f20697c = this.f20695a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f20701g || this.f20699e == i10) {
            return false;
        }
        this.f20699e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f20700f || this.f20698d == i10) {
            return false;
        }
        this.f20698d = i10;
        a();
        return true;
    }
}
