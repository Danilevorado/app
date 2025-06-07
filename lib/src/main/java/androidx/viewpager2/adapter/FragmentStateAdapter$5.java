package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import androidx.lifecycle.n;

/* loaded from: classes.dex */
class FragmentStateAdapter$5 implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Handler f3997a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f3998b;

    @Override // androidx.lifecycle.l
    public void d(n nVar, j.b bVar) {
        if (bVar == j.b.ON_DESTROY) {
            this.f3997a.removeCallbacks(this.f3998b);
            nVar.s().c(this);
        }
    }
}
