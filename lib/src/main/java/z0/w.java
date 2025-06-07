package z0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* loaded from: classes.dex */
class w implements x {

    /* renamed from: a, reason: collision with root package name */
    private final ViewOverlay f28747a;

    w(View view) {
        this.f28747a = view.getOverlay();
    }

    @Override // z0.x
    public void b(Drawable drawable) {
        this.f28747a.add(drawable);
    }

    @Override // z0.x
    public void d(Drawable drawable) {
        this.f28747a.remove(drawable);
    }
}
