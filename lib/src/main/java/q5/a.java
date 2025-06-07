package q5;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import s5.g;
import s5.k;
import s5.n;

/* loaded from: classes.dex */
public class a extends Drawable implements n {

    /* renamed from: m, reason: collision with root package name */
    private b f26291m;

    static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        g f26292a;

        /* renamed from: b, reason: collision with root package name */
        boolean f26293b;

        public b(b bVar) {
            this.f26292a = (g) bVar.f26292a.getConstantState().newDrawable();
            this.f26293b = bVar.f26293b;
        }

        public b(g gVar) {
            this.f26292a = gVar;
            this.f26293b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }
    }

    private a(b bVar) {
        this.f26291m = bVar;
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f26291m = new b(this.f26291m);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f26291m;
        if (bVar.f26293b) {
            bVar.f26292a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f26291m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f26291m.f26292a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f26291m.f26292a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f26291m.f26292a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zB = q5.b.b(iArr);
        b bVar = this.f26291m;
        if (bVar.f26293b == zB) {
            return zOnStateChange;
        }
        bVar.f26293b = zB;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f26291m.f26292a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f26291m.f26292a.setColorFilter(colorFilter);
    }

    @Override // s5.n
    public void setShapeAppearanceModel(k kVar) {
        this.f26291m.f26292a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        this.f26291m.f26292a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f26291m.f26292a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f26291m.f26292a.setTintMode(mode);
    }
}
