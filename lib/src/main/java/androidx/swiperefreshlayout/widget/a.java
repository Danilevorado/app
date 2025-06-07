package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.w;

/* loaded from: classes.dex */
class a extends ImageView {

    /* renamed from: m, reason: collision with root package name */
    private Animation.AnimationListener f3849m;

    /* renamed from: n, reason: collision with root package name */
    int f3850n;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a, reason: collision with other inner class name */
    private class C0060a extends OvalShape {

        /* renamed from: m, reason: collision with root package name */
        private RadialGradient f3851m;

        /* renamed from: n, reason: collision with root package name */
        private Paint f3852n = new Paint();

        C0060a(int i10) {
            a.this.f3850n = i10;
            a((int) rect().width());
        }

        private void a(int i10) {
            float f5 = i10 / 2;
            RadialGradient radialGradient = new RadialGradient(f5, f5, a.this.f3850n, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f3851m = radialGradient;
            this.f3852n.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = a.this.getWidth() / 2;
            float height = a.this.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f3852n);
            canvas.drawCircle(width, height, r0 - a.this.f3850n, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f5, float f10) {
            super.onResize(f5, f10);
            a((int) f5);
        }
    }

    a(Context context, int i10) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f5 = getContext().getResources().getDisplayMetrics().density;
        int i11 = (int) (1.75f * f5);
        int i12 = (int) (0.0f * f5);
        this.f3850n = (int) (3.5f * f5);
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            w.w0(this, f5 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0060a(this.f3850n));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f3850n, i12, i11, 503316480);
            int i13 = this.f3850n;
            setPadding(i13, i13, i13, i13);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i10);
        w.s0(this, shapeDrawable);
    }

    private boolean a() {
        return true;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f3849m = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f3849m;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f3849m;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f3850n * 2), getMeasuredHeight() + (this.f3850n * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
        }
    }
}
