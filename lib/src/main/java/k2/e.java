package k2;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import l2.b;

/* loaded from: classes.dex */
public abstract class e extends i implements b.a {

    /* renamed from: t, reason: collision with root package name */
    private Animatable f24587t;

    public e(ImageView imageView) {
        super(imageView);
    }

    private void m(Object obj) {
        if (!(obj instanceof Animatable)) {
            this.f24587t = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f24587t = animatable;
        animatable.start();
    }

    private void p(Object obj) {
        o(obj);
        m(obj);
    }

    @Override // k2.a, k2.h
    public void a(Drawable drawable) {
        super.a(drawable);
        p(null);
        n(drawable);
    }

    @Override // k2.i, k2.a, k2.h
    public void d(Drawable drawable) {
        super.d(drawable);
        p(null);
        n(drawable);
    }

    @Override // k2.h
    public void f(Object obj, l2.b bVar) {
        if (bVar == null || !bVar.a(obj, this)) {
            p(obj);
        } else {
            m(obj);
        }
    }

    @Override // k2.i, k2.a, k2.h
    public void g(Drawable drawable) {
        super.g(drawable);
        Animatable animatable = this.f24587t;
        if (animatable != null) {
            animatable.stop();
        }
        p(null);
        n(drawable);
    }

    public void n(Drawable drawable) {
        ((ImageView) this.f24590m).setImageDrawable(drawable);
    }

    protected abstract void o(Object obj);

    @Override // g2.m
    public void onStart() {
        Animatable animatable = this.f24587t;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // g2.m
    public void onStop() {
        Animatable animatable = this.f24587t;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
