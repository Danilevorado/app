package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class b extends f implements Animatable {

    /* renamed from: n, reason: collision with root package name */
    private C0062b f3900n;

    /* renamed from: o, reason: collision with root package name */
    private Context f3901o;

    /* renamed from: p, reason: collision with root package name */
    private ArgbEvaluator f3902p;

    /* renamed from: q, reason: collision with root package name */
    private Animator.AnimatorListener f3903q;

    /* renamed from: r, reason: collision with root package name */
    ArrayList f3904r;

    /* renamed from: s, reason: collision with root package name */
    final Drawable.Callback f3905s;

    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            b.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.b$b, reason: collision with other inner class name */
    private static class C0062b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f3907a;

        /* renamed from: b, reason: collision with root package name */
        g f3908b;

        /* renamed from: c, reason: collision with root package name */
        AnimatorSet f3909c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList f3910d;

        /* renamed from: e, reason: collision with root package name */
        q.a f3911e;

        public C0062b(Context context, C0062b c0062b, Drawable.Callback callback, Resources resources) {
            if (c0062b != null) {
                this.f3907a = c0062b.f3907a;
                g gVar = c0062b.f3908b;
                if (gVar != null) {
                    Drawable.ConstantState constantState = gVar.getConstantState();
                    this.f3908b = (g) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    g gVar2 = (g) this.f3908b.mutate();
                    this.f3908b = gVar2;
                    gVar2.setCallback(callback);
                    this.f3908b.setBounds(c0062b.f3908b.getBounds());
                    this.f3908b.h(false);
                }
                ArrayList arrayList = c0062b.f3910d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f3910d = new ArrayList(size);
                    this.f3911e = new q.a(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = (Animator) c0062b.f3910d.get(i10);
                        Animator animatorClone = animator.clone();
                        String str = (String) c0062b.f3911e.get(animator);
                        animatorClone.setTarget(this.f3908b.d(str));
                        this.f3910d.add(animatorClone);
                        this.f3911e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f3909c == null) {
                this.f3909c = new AnimatorSet();
            }
            this.f3909c.playTogether(this.f3910d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3907a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    private static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f3912a;

        public c(Drawable.ConstantState constantState) {
            this.f3912a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f3912a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3912a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            b bVar = new b();
            Drawable drawableNewDrawable = this.f3912a.newDrawable();
            bVar.f3915m = drawableNewDrawable;
            drawableNewDrawable.setCallback(bVar.f3905s);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            b bVar = new b();
            Drawable drawableNewDrawable = this.f3912a.newDrawable(resources);
            bVar.f3915m = drawableNewDrawable;
            drawableNewDrawable.setCallback(bVar.f3905s);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b();
            Drawable drawableNewDrawable = this.f3912a.newDrawable(resources, theme);
            bVar.f3915m = drawableNewDrawable;
            drawableNewDrawable.setCallback(bVar.f3905s);
            return bVar;
        }
    }

    b() {
        this(null, null, null);
    }

    private b(Context context) {
        this(context, null, null);
    }

    private b(Context context, C0062b c0062b, Resources resources) {
        this.f3902p = null;
        this.f3903q = null;
        this.f3904r = null;
        a aVar = new a();
        this.f3905s = aVar;
        this.f3901o = context;
        if (c0062b != null) {
            this.f3900n = c0062b;
        } else {
            this.f3900n = new C0062b(context, c0062b, aVar, resources);
        }
    }

    public static b a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        b bVar = new b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    private void b(String str, Animator animator) {
        animator.setTarget(this.f3900n.f3908b.d(str));
        C0062b c0062b = this.f3900n;
        if (c0062b.f3910d == null) {
            c0062b.f3910d = new ArrayList();
            this.f3900n.f3911e = new q.a();
        }
        this.f3900n.f3910d.add(animator);
        this.f3900n.f3911e.put(animator, str);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f3900n.f3908b.draw(canvas);
        if (this.f3900n.f3909c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f3915m;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f3900n.f3908b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f3915m;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3900n.f3907a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3915m;
        return drawable != null ? androidx.core.graphics.drawable.a.e(drawable) : this.f3900n.f3908b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f3915m == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f3915m.getConstantState());
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f3915m;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3900n.f3908b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f3915m;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3900n.f3908b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f3915m;
        return drawable != null ? drawable.getOpacity() : this.f3900n.f3908b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        TypedArray typedArrayObtainAttributes;
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    typedArrayObtainAttributes = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f3892e);
                    int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        g gVarB = g.b(resources, resourceId, theme);
                        gVarB.h(false);
                        gVarB.setCallback(this.f3905s);
                        g gVar = this.f3900n.f3908b;
                        if (gVar != null) {
                            gVar.setCallback(null);
                        }
                        this.f3900n.f3908b = gVarB;
                    }
                } else if ("target".equals(name)) {
                    typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f3893f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3901o;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        b(string, d.i(context, resourceId2));
                    }
                } else {
                    continue;
                }
                typedArrayObtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f3900n.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f3915m;
        return drawable != null ? androidx.core.graphics.drawable.a.h(drawable) : this.f3900n.f3908b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f3915m;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3900n.f3909c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f3915m;
        return drawable != null ? drawable.isStateful() : this.f3900n.f3908b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3900n.f3908b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f3915m;
        return drawable != null ? drawable.setLevel(i10) : this.f3900n.f3908b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3915m;
        return drawable != null ? drawable.setState(iArr) : this.f3900n.f3908b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f3900n.f3908b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z10);
        } else {
            this.f3900n.f3908b.setAutoMirrored(z10);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3900n.f3908b.setColorFilter(colorFilter);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f5, float f10) {
        super.setHotspot(f5, f10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i10);
        } else {
            this.f3900n.f3908b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        } else {
            this.f3900n.f3908b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
        } else {
            this.f3900n.f3908b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f3900n.f3908b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f3900n.f3909c.isStarted()) {
                return;
            }
            this.f3900n.f3909c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f3915m;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3900n.f3909c.end();
        }
    }
}
