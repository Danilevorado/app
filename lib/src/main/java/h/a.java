package h;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.q0;
import androidx.core.content.res.k;
import h.b;
import h.d;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q.h;

/* loaded from: classes.dex */
public class a extends h.d {
    private static final String F = a.class.getSimpleName();
    private c A;
    private g B;
    private int C;
    private int D;
    private boolean E;

    private static class b extends g {

        /* renamed from: a, reason: collision with root package name */
        private final Animatable f23912a;

        b(Animatable animatable) {
            super();
            this.f23912a = animatable;
        }

        @Override // h.a.g
        public void c() {
            this.f23912a.start();
        }

        @Override // h.a.g
        public void d() {
            this.f23912a.stop();
        }
    }

    static class c extends d.a {
        q.d K;
        h L;

        c(c cVar, a aVar, Resources resources) {
            h hVar;
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                hVar = cVar.L;
            } else {
                this.K = new q.d();
                hVar = new h();
            }
            this.L = hVar;
        }

        private static long D(int i10, int i11) {
            return i11 | (i10 << 32);
        }

        int B(int[] iArr, Drawable drawable, int i10) {
            int iZ = super.z(iArr, drawable);
            this.L.k(iZ, Integer.valueOf(i10));
            return iZ;
        }

        int C(int i10, int i11, Drawable drawable, boolean z10) {
            int iA = super.a(drawable);
            long jD = D(i10, i11);
            long j10 = z10 ? 8589934592L : 0L;
            long j11 = iA;
            this.K.a(jD, Long.valueOf(j11 | j10));
            if (z10) {
                this.K.a(D(i11, i10), Long.valueOf(4294967296L | j11 | j10));
            }
            return iA;
        }

        int E(int i10) {
            if (i10 < 0) {
                return 0;
            }
            return ((Integer) this.L.g(i10, 0)).intValue();
        }

        int F(int[] iArr) {
            int iA = super.A(iArr);
            return iA >= 0 ? iA : super.A(StateSet.WILD_CARD);
        }

        int G(int i10, int i11) {
            return (int) ((Long) this.K.g(D(i10, i11), -1L)).longValue();
        }

        boolean H(int i10, int i11) {
            return (((Long) this.K.g(D(i10, i11), -1L)).longValue() & 4294967296L) != 0;
        }

        boolean I(int i10, int i11) {
            return (((Long) this.K.g(D(i10, i11), -1L)).longValue() & 8589934592L) != 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }

        @Override // h.d.a, h.b.d
        void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }
    }

    private static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.b f23913a;

        d(androidx.vectordrawable.graphics.drawable.b bVar) {
            super();
            this.f23913a = bVar;
        }

        @Override // h.a.g
        public void c() {
            this.f23913a.start();
        }

        @Override // h.a.g
        public void d() {
            this.f23913a.stop();
        }
    }

    private static class e extends g {

        /* renamed from: a, reason: collision with root package name */
        private final ObjectAnimator f23914a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f23915b;

        e(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i10 = z10 ? numberOfFrames - 1 : 0;
            int i11 = z10 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z10);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
            i.b.a(objectAnimatorOfInt, true);
            objectAnimatorOfInt.setDuration(fVar.a());
            objectAnimatorOfInt.setInterpolator(fVar);
            this.f23915b = z11;
            this.f23914a = objectAnimatorOfInt;
        }

        @Override // h.a.g
        public boolean a() {
            return this.f23915b;
        }

        @Override // h.a.g
        public void b() {
            this.f23914a.reverse();
        }

        @Override // h.a.g
        public void c() {
            this.f23914a.start();
        }

        @Override // h.a.g
        public void d() {
            this.f23914a.cancel();
        }
    }

    private static class f implements TimeInterpolator {

        /* renamed from: a, reason: collision with root package name */
        private int[] f23916a;

        /* renamed from: b, reason: collision with root package name */
        private int f23917b;

        /* renamed from: c, reason: collision with root package name */
        private int f23918c;

        f(AnimationDrawable animationDrawable, boolean z10) {
            b(animationDrawable, z10);
        }

        int a() {
            return this.f23918c;
        }

        int b(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f23917b = numberOfFrames;
            int[] iArr = this.f23916a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f23916a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f23916a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f23918c = i10;
            return i10;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f5) {
            int i10 = (int) ((f5 * this.f23918c) + 0.5f);
            int i11 = this.f23917b;
            int[] iArr = this.f23916a;
            int i12 = 0;
            while (i12 < i11 && i10 >= iArr[i12]) {
                i10 -= iArr[i12];
                i12++;
            }
            return (i12 / i11) + (i12 < i11 ? i10 / this.f23918c : 0.0f);
        }
    }

    private static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    a(c cVar, Resources resources) {
        super(null);
        this.C = -1;
        this.D = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static a l(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.m(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    p(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    q(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void o() {
        onStateChange(getState());
    }

    private int p(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayK = k.k(resources, theme, attributeSet, i.e.f24186h);
        int resourceId = typedArrayK.getResourceId(i.e.f24187i, 0);
        int resourceId2 = typedArrayK.getResourceId(i.e.f24188j, -1);
        Drawable drawableJ = resourceId2 > 0 ? q0.h().j(context, resourceId2) : null;
        typedArrayK.recycle();
        int[] iArrJ = j(attributeSet);
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableJ = xmlPullParser.getName().equals("vector") ? androidx.vectordrawable.graphics.drawable.g.c(resources, xmlPullParser, attributeSet, theme) : i.c.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableJ != null) {
            return this.A.B(iArrJ, drawableJ, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayK = k.k(resources, theme, attributeSet, i.e.f24189k);
        int resourceId = typedArrayK.getResourceId(i.e.f24192n, -1);
        int resourceId2 = typedArrayK.getResourceId(i.e.f24191m, -1);
        int resourceId3 = typedArrayK.getResourceId(i.e.f24190l, -1);
        Drawable drawableJ = resourceId3 > 0 ? q0.h().j(context, resourceId3) : null;
        boolean z10 = typedArrayK.getBoolean(i.e.f24193o, false);
        typedArrayK.recycle();
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableJ = xmlPullParser.getName().equals("animated-vector") ? androidx.vectordrawable.graphics.drawable.b.a(context, resources, xmlPullParser, attributeSet, theme) : i.c.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableJ == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.A.C(resourceId, resourceId2, drawableJ, z10);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    private boolean r(int i10) {
        int iC;
        int iG;
        g bVar;
        g gVar = this.B;
        if (gVar == null) {
            iC = c();
        } else {
            if (i10 == this.C) {
                return true;
            }
            if (i10 == this.D && gVar.a()) {
                gVar.b();
                this.C = this.D;
                this.D = i10;
                return true;
            }
            iC = this.C;
            gVar.d();
        }
        this.B = null;
        this.D = -1;
        this.C = -1;
        c cVar = this.A;
        int iE = cVar.E(iC);
        int iE2 = cVar.E(i10);
        if (iE2 == 0 || iE == 0 || (iG = cVar.G(iE, iE2)) < 0) {
            return false;
        }
        boolean zI = cVar.I(iE, iE2);
        g(iG);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(iE, iE2), zI);
        } else {
            if (!(current instanceof androidx.vectordrawable.graphics.drawable.b)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((androidx.vectordrawable.graphics.drawable.b) current);
        }
        bVar.c();
        this.B = bVar;
        this.D = iC;
        this.C = i10;
        return true;
    }

    private void s(TypedArray typedArray) {
        c cVar = this.A;
        cVar.f23936d |= i.c.b(typedArray);
        cVar.x(typedArray.getBoolean(i.e.f24182d, cVar.f23941i));
        cVar.t(typedArray.getBoolean(i.e.f24183e, cVar.f23944l));
        cVar.u(typedArray.getInt(i.e.f24184f, cVar.A));
        cVar.v(typedArray.getInt(i.e.f24185g, cVar.B));
        setDither(typedArray.getBoolean(i.e.f24180b, cVar.f23956x));
    }

    @Override // h.d, h.b
    void h(b.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.A = (c) dVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // h.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.B;
        if (gVar != null) {
            gVar.d();
            this.B = null;
            g(this.C);
            this.C = -1;
            this.D = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // h.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public c b() {
        return new c(this.A, this, null);
    }

    public void m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayK = k.k(resources, theme, attributeSet, i.e.f24179a);
        setVisible(typedArrayK.getBoolean(i.e.f24181c, true), true);
        s(typedArrayK);
        i(resources);
        typedArrayK.recycle();
        n(context, resources, xmlPullParser, attributeSet, theme);
        o();
    }

    @Override // h.d, h.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.E && super.mutate() == this) {
            this.A.r();
            this.E = true;
        }
        return this;
    }

    @Override // h.d, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int iF = this.A.F(iArr);
        boolean z10 = iF != c() && (r(iF) || g(iF));
        Drawable current = getCurrent();
        return current != null ? z10 | current.setState(iArr) : z10;
    }

    @Override // h.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        g gVar = this.B;
        if (gVar != null && (visible || z11)) {
            if (z10) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
