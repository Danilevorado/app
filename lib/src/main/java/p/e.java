package p;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class e extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private float f25834a;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f25836c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f25837d;

    /* renamed from: e, reason: collision with root package name */
    private float f25838e;

    /* renamed from: h, reason: collision with root package name */
    private ColorStateList f25841h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f25842i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f25843j;

    /* renamed from: f, reason: collision with root package name */
    private boolean f25839f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f25840g = true;

    /* renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f25844k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f25835b = new Paint(5);

    e(ColorStateList colorStateList, float f5) {
        this.f25834a = f5;
        e(colorStateList);
        this.f25836c = new RectF();
        this.f25837d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f25841h = colorStateList;
        this.f25835b.setColor(colorStateList.getColorForState(getState(), this.f25841h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f25836c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f25837d.set(rect);
        if (this.f25839f) {
            this.f25837d.inset((int) Math.ceil(f.a(this.f25838e, this.f25834a, this.f25840g)), (int) Math.ceil(f.b(this.f25838e, this.f25834a, this.f25840g)));
            this.f25836c.set(this.f25837d);
        }
    }

    public ColorStateList b() {
        return this.f25841h;
    }

    float c() {
        return this.f25838e;
    }

    public float d() {
        return this.f25834a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f25835b;
        if (this.f25842i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f25842i);
            z10 = true;
        }
        RectF rectF = this.f25836c;
        float f5 = this.f25834a;
        canvas.drawRoundRect(rectF, f5, f5, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    void g(float f5, boolean z10, boolean z11) {
        if (f5 == this.f25838e && this.f25839f == z10 && this.f25840g == z11) {
            return;
        }
        this.f25838e = f5;
        this.f25839f = z10;
        this.f25840g = z11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f25837d, this.f25834a);
    }

    void h(float f5) {
        if (f5 == this.f25834a) {
            return;
        }
        this.f25834a = f5;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f25843j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f25841h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f25841h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f25835b.getColor();
        if (z10) {
            this.f25835b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f25843j;
        if (colorStateList2 == null || (mode = this.f25844k) == null) {
            return z10;
        }
        this.f25842i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f25835b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f25835b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f25843j = colorStateList;
        this.f25842i = a(colorStateList, this.f25844k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f25844k = mode;
        this.f25842i = a(this.f25843j, mode);
        invalidateSelf();
    }
}
