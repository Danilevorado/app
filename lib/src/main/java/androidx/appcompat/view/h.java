package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.c0;
import androidx.core.view.d0;
import androidx.core.view.e0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f715c;

    /* renamed from: d, reason: collision with root package name */
    d0 f716d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f717e;

    /* renamed from: b, reason: collision with root package name */
    private long f714b = -1;

    /* renamed from: f, reason: collision with root package name */
    private final e0 f718f = new a();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList f713a = new ArrayList();

    class a extends e0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f719a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f720b = 0;

        a() {
        }

        @Override // androidx.core.view.d0
        public void b(View view) {
            int i10 = this.f720b + 1;
            this.f720b = i10;
            if (i10 == h.this.f713a.size()) {
                d0 d0Var = h.this.f716d;
                if (d0Var != null) {
                    d0Var.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.e0, androidx.core.view.d0
        public void c(View view) {
            if (this.f719a) {
                return;
            }
            this.f719a = true;
            d0 d0Var = h.this.f716d;
            if (d0Var != null) {
                d0Var.c(null);
            }
        }

        void d() {
            this.f720b = 0;
            this.f719a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f717e) {
            Iterator it = this.f713a.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).c();
            }
            this.f717e = false;
        }
    }

    void b() {
        this.f717e = false;
    }

    public h c(c0 c0Var) {
        if (!this.f717e) {
            this.f713a.add(c0Var);
        }
        return this;
    }

    public h d(c0 c0Var, c0 c0Var2) {
        this.f713a.add(c0Var);
        c0Var2.j(c0Var.d());
        this.f713a.add(c0Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f717e) {
            this.f714b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f717e) {
            this.f715c = interpolator;
        }
        return this;
    }

    public h g(d0 d0Var) {
        if (!this.f717e) {
            this.f716d = d0Var;
        }
        return this;
    }

    public void h() {
        if (this.f717e) {
            return;
        }
        Iterator it = this.f713a.iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            long j10 = this.f714b;
            if (j10 >= 0) {
                c0Var.f(j10);
            }
            Interpolator interpolator = this.f715c;
            if (interpolator != null) {
                c0Var.g(interpolator);
            }
            if (this.f716d != null) {
                c0Var.h(this.f718f);
            }
            c0Var.l();
        }
        this.f717e = true;
    }
}
