package z0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* loaded from: classes.dex */
class t implements u {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroupOverlay f28745a;

    t(ViewGroup viewGroup) {
        this.f28745a = viewGroup.getOverlay();
    }

    @Override // z0.u
    public void a(View view) {
        this.f28745a.add(view);
    }

    @Override // z0.x
    public void b(Drawable drawable) {
        this.f28745a.add(drawable);
    }

    @Override // z0.u
    public void c(View view) {
        this.f28745a.remove(view);
    }

    @Override // z0.x
    public void d(Drawable drawable) {
        this.f28745a.remove(drawable);
    }
}
