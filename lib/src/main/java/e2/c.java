package e2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import e2.g;
import java.nio.ByteBuffer;
import java.util.List;
import n2.k;
import r1.l;

/* loaded from: classes.dex */
public class c extends Drawable implements g.b, Animatable {

    /* renamed from: m, reason: collision with root package name */
    private final a f23026m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f23027n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f23028o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f23029p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f23030q;

    /* renamed from: r, reason: collision with root package name */
    private int f23031r;

    /* renamed from: s, reason: collision with root package name */
    private int f23032s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f23033t;

    /* renamed from: u, reason: collision with root package name */
    private Paint f23034u;

    /* renamed from: v, reason: collision with root package name */
    private Rect f23035v;

    /* renamed from: w, reason: collision with root package name */
    private List f23036w;

    static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        final g f23037a;

        a(g gVar) {
            this.f23037a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public c(Context context, q1.a aVar, l lVar, int i10, int i11, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.b.c(context), aVar, i10, i11, lVar, bitmap)));
    }

    c(a aVar) {
        this.f23030q = true;
        this.f23032s = -1;
        this.f23026m = (a) k.d(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.f23035v == null) {
            this.f23035v = new Rect();
        }
        return this.f23035v;
    }

    private Paint h() {
        if (this.f23034u == null) {
            this.f23034u = new Paint(2);
        }
        return this.f23034u;
    }

    private void j() {
        List list = this.f23036w;
        if (list == null || list.size() <= 0) {
            return;
        }
        a5.a.a(this.f23036w.get(0));
        throw null;
    }

    private void l() {
        this.f23031r = 0;
    }

    private void n() {
        k.a(!this.f23029p, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f23026m.f23037a.f() != 1) {
            if (this.f23027n) {
                return;
            }
            this.f23027n = true;
            this.f23026m.f23037a.r(this);
        }
        invalidateSelf();
    }

    private void o() {
        this.f23027n = false;
        this.f23026m.f23037a.s(this);
    }

    @Override // e2.g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f23031r++;
        }
        int i10 = this.f23032s;
        if (i10 == -1 || this.f23031r < i10) {
            return;
        }
        j();
        stop();
    }

    public ByteBuffer c() {
        return this.f23026m.f23037a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f23029p) {
            return;
        }
        if (this.f23033t) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.f23033t = false;
        }
        canvas.drawBitmap(this.f23026m.f23037a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f23026m.f23037a.e();
    }

    public int f() {
        return this.f23026m.f23037a.f();
    }

    public int g() {
        return this.f23026m.f23037a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f23026m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f23026m.f23037a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f23026m.f23037a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f23026m.f23037a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f23027n;
    }

    public void k() {
        this.f23029p = true;
        this.f23026m.f23037a.a();
    }

    public void m(l lVar, Bitmap bitmap) {
        this.f23026m.f23037a.o(lVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f23033t = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        h().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        k.a(!this.f23029p, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f23030q = z10;
        if (!z10) {
            o();
        } else if (this.f23028o) {
            n();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f23028o = true;
        l();
        if (this.f23030q) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f23028o = false;
        o();
    }
}
