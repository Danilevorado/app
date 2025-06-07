package x9;

import android.app.Notification;
import android.content.Context;
import androidx.core.app.l;

/* loaded from: classes2.dex */
public class f implements q8.b {

    /* renamed from: a, reason: collision with root package name */
    private final l.e f28373a;

    f(Context context, String str) {
        this.f28373a = new l.e(context, str);
    }

    @Override // q8.b
    public q8.b a(int i10) {
        this.f28373a.A(i10);
        return this;
    }

    @Override // q8.b
    public q8.b b(int i10) {
        this.f28373a.k(i10);
        return this;
    }

    @Override // q8.b
    public Notification build() {
        return this.f28373a.c();
    }

    @Override // q8.b
    public q8.b c(String str) {
        this.f28373a.u(str);
        return this;
    }

    @Override // q8.b
    public q8.b d(boolean z10) {
        this.f28373a.h(z10);
        return this;
    }

    @Override // q8.b
    public q8.b e(boolean z10) {
        this.f28373a.w(z10);
        return this;
    }

    @Override // q8.b
    public q8.b f(l.g gVar) {
        this.f28373a.H(gVar);
        return this;
    }

    @Override // q8.b
    public q8.b g(int i10) {
        this.f28373a.F(i10);
        if (i10 == -1 && c9.a.b() != null) {
            this.f28373a.F(c.a(c9.a.b()));
        }
        return this;
    }
}
