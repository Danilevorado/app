package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
abstract class c extends CoordinatorLayout.c {

    /* renamed from: a, reason: collision with root package name */
    private d f20692a;

    /* renamed from: b, reason: collision with root package name */
    private int f20693b;

    /* renamed from: c, reason: collision with root package name */
    private int f20694c;

    public c() {
        this.f20693b = 0;
        this.f20694c = 0;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20693b = 0;
        this.f20694c = 0;
    }

    public int E() {
        d dVar = this.f20692a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    protected void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.I(view, i10);
    }

    public boolean G(int i10) {
        d dVar = this.f20692a;
        if (dVar != null) {
            return dVar.e(i10);
        }
        this.f20693b = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        F(coordinatorLayout, view, i10);
        if (this.f20692a == null) {
            this.f20692a = new d(view);
        }
        this.f20692a.c();
        this.f20692a.a();
        int i11 = this.f20693b;
        if (i11 != 0) {
            this.f20692a.e(i11);
            this.f20693b = 0;
        }
        int i12 = this.f20694c;
        if (i12 == 0) {
            return true;
        }
        this.f20692a.d(i12);
        this.f20694c = 0;
        return true;
    }
}
