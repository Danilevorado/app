package x9;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.core.app.l;

/* loaded from: classes2.dex */
class d implements q8.a {

    /* renamed from: a, reason: collision with root package name */
    private final l.e f28371a;

    d(Context context, String str) {
        this.f28371a = new l.e(context, str);
    }

    @Override // q8.a
    public q8.a a(int i10) {
        this.f28371a.K(i10);
        return this;
    }

    @Override // q8.a
    public q8.a b(int i10) {
        this.f28371a.D(i10);
        return this;
    }

    @Override // q8.a
    public Notification build() {
        return this.f28371a.c();
    }

    @Override // q8.a
    public q8.a c(String str) {
        this.f28371a.u(str);
        return this;
    }

    @Override // q8.a
    public q8.a d(Bitmap bitmap, CharSequence charSequence) {
        this.f28371a.H(bitmap != null ? new l.b().i(bitmap).j(charSequence) : new l.c().h(charSequence));
        return this;
    }

    @Override // q8.a
    public q8.a e(CharSequence charSequence) {
        this.f28371a.o(charSequence);
        return this;
    }

    @Override // q8.a
    public q8.a f(long j10) {
        this.f28371a.L(j10);
        this.f28371a.E(true);
        return this;
    }

    @Override // q8.a
    public q8.a g(int i10) {
        if (i10 == -1) {
            ApplicationInfo applicationInfoE = c9.a.a().e();
            i10 = applicationInfoE == null ? -1 : applicationInfoE.icon;
        }
        if (i10 == -1) {
            return this;
        }
        this.f28371a.F(i10);
        return this;
    }

    @Override // q8.a
    public q8.a h(Bitmap bitmap) {
        if (bitmap != null) {
            this.f28371a.x(bitmap);
        }
        return this;
    }

    @Override // q8.a
    public q8.a i(CharSequence charSequence) {
        this.f28371a.I(charSequence);
        return this;
    }

    @Override // q8.a
    public q8.a j(Integer num) {
        if (num != null) {
            this.f28371a.k(num.intValue());
        }
        return this;
    }

    @Override // q8.a
    public q8.a k(CharSequence charSequence) {
        this.f28371a.p(charSequence);
        return this;
    }

    @Override // q8.a
    public q8.a l(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
        this.f28371a.b(new l.a(i10, charSequence, pendingIntent));
        return this;
    }

    @Override // q8.a
    public q8.a setExtras(Bundle bundle) {
        this.f28371a.s(bundle);
        return this;
    }
}
