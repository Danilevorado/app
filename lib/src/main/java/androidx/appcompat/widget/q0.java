package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: i, reason: collision with root package name */
    private static q0 f1343i;

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap f1345a;

    /* renamed from: b, reason: collision with root package name */
    private q.g f1346b;

    /* renamed from: c, reason: collision with root package name */
    private q.h f1347c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap f1348d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f1349e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1350f;

    /* renamed from: g, reason: collision with root package name */
    private f f1351g;

    /* renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f1342h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    private static final c f1344j = new c(6);

    static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.q0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return h.a.l(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e5) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e5);
                return null;
            }
        }
    }

    private static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.q0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e5) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e5);
                return null;
            }
        }
    }

    private static class c extends q.e {
        public c(int i10) {
            super(i10);
        }

        private static int j(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(j(i10, mode)));
        }

        PorterDuffColorFilter l(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(j(i10, mode)), porterDuffColorFilter);
        }
    }

    static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.q0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    i.c.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e5) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e5);
                }
            }
            return null;
        }
    }

    private interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface f {
        boolean a(Context context, int i10, Drawable drawable);

        PorterDuff.Mode b(int i10);

        Drawable c(q0 q0Var, Context context, int i10);

        ColorStateList d(Context context, int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    private static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.q0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.g.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e5) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e5);
                return null;
            }
        }
    }

    private void a(String str, e eVar) {
        if (this.f1346b == null) {
            this.f1346b = new q.g();
        }
        this.f1346b.put(str, eVar);
    }

    private synchronized boolean b(Context context, long j10, Drawable drawable) {
        boolean z10;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            q.d dVar = (q.d) this.f1348d.get(context);
            if (dVar == null) {
                dVar = new q.d();
                this.f1348d.put(context, dVar);
            }
            dVar.k(j10, new WeakReference(constantState));
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    private void c(Context context, int i10, ColorStateList colorStateList) {
        if (this.f1345a == null) {
            this.f1345a = new WeakHashMap();
        }
        q.h hVar = (q.h) this.f1345a.get(context);
        if (hVar == null) {
            hVar = new q.h();
            this.f1345a.put(context, hVar);
        }
        hVar.a(i10, colorStateList);
    }

    private void d(Context context) {
        if (this.f1350f) {
            return;
        }
        this.f1350f = true;
        Drawable drawableJ = j(context, i.d.f24178a);
        if (drawableJ == null || !q(drawableJ)) {
            this.f1350f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(Context context, int i10) throws Resources.NotFoundException {
        if (this.f1349e == null) {
            this.f1349e = new TypedValue();
        }
        TypedValue typedValue = this.f1349e;
        context.getResources().getValue(i10, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        f fVar = this.f1351g;
        Drawable drawableC = fVar == null ? null : fVar.c(this, context, i10);
        if (drawableC != null) {
            drawableC.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, jE, drawableC);
        }
        return drawableC;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized q0 h() {
        if (f1343i == null) {
            q0 q0Var = new q0();
            f1343i = q0Var;
            p(q0Var);
        }
        return f1343i;
    }

    private synchronized Drawable i(Context context, long j10) {
        q.d dVar = (q.d) this.f1348d.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) dVar.f(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.m(j10);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterK;
        c cVar = f1344j;
        porterDuffColorFilterK = cVar.k(i10, mode);
        if (porterDuffColorFilterK == null) {
            porterDuffColorFilterK = new PorterDuffColorFilter(i10, mode);
            cVar.l(i10, mode, porterDuffColorFilterK);
        }
        return porterDuffColorFilterK;
    }

    private ColorStateList n(Context context, int i10) {
        q.h hVar;
        WeakHashMap weakHashMap = this.f1345a;
        if (weakHashMap == null || (hVar = (q.h) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.f(i10);
    }

    private static void p(q0 q0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            q0Var.a("vector", new g());
            q0Var.a("animated-vector", new b());
            q0Var.a("animated-selector", new a());
            q0Var.a("drawable", new d());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.g) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable r(Context context, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        q.g gVar = this.f1346b;
        if (gVar == null || gVar.isEmpty()) {
            return null;
        }
        q.h hVar = this.f1347c;
        if (hVar != null) {
            String str = (String) hVar.f(i10);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f1346b.get(str) == null)) {
                return null;
            }
        } else {
            this.f1347c = new q.h();
        }
        if (this.f1349e == null) {
            this.f1349e = new TypedValue();
        }
        TypedValue typedValue = this.f1349e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1347c.a(i10, name);
                e eVar = (e) this.f1346b.get(name);
                if (eVar != null) {
                    drawableI = eVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableI != null) {
                    drawableI.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, jE, drawableI);
                }
            } catch (Exception e5) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e5);
            }
        }
        if (drawableI == null) {
            this.f1347c.a(i10, "appcompat_skip_skip");
        }
        return drawableI;
    }

    private Drawable v(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList colorStateListM = m(context, i10);
        if (colorStateListM == null) {
            f fVar = this.f1351g;
            if ((fVar == null || !fVar.e(context, i10, drawable)) && !x(context, i10, drawable) && z10) {
                return null;
            }
            return drawable;
        }
        if (i0.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableR = androidx.core.graphics.drawable.a.r(drawable);
        androidx.core.graphics.drawable.a.o(drawableR, colorStateListM);
        PorterDuff.Mode modeO = o(i10);
        if (modeO == null) {
            return drawableR;
        }
        androidx.core.graphics.drawable.a.p(drawableR, modeO);
        return drawableR;
    }

    static void w(Drawable drawable, x0 x0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (i0.a(drawable)) {
            if (!(drawable.mutate() == drawable)) {
                Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = x0Var.f1403d;
        if (z10 || x0Var.f1402c) {
            drawable.setColorFilter(g(z10 ? x0Var.f1400a : null, x0Var.f1402c ? x0Var.f1401b : f1342h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable j(Context context, int i10) {
        return k(context, i10, false);
    }

    synchronized Drawable k(Context context, int i10, boolean z10) {
        Drawable drawableR;
        d(context);
        drawableR = r(context, i10);
        if (drawableR == null) {
            drawableR = f(context, i10);
        }
        if (drawableR == null) {
            drawableR = androidx.core.content.a.e(context, i10);
        }
        if (drawableR != null) {
            drawableR = v(context, i10, z10, drawableR);
        }
        if (drawableR != null) {
            i0.b(drawableR);
        }
        return drawableR;
    }

    synchronized ColorStateList m(Context context, int i10) {
        ColorStateList colorStateListN;
        colorStateListN = n(context, i10);
        if (colorStateListN == null) {
            f fVar = this.f1351g;
            colorStateListN = fVar == null ? null : fVar.d(context, i10);
            if (colorStateListN != null) {
                c(context, i10, colorStateListN);
            }
        }
        return colorStateListN;
    }

    PorterDuff.Mode o(int i10) {
        f fVar = this.f1351g;
        if (fVar == null) {
            return null;
        }
        return fVar.b(i10);
    }

    public synchronized void s(Context context) {
        q.d dVar = (q.d) this.f1348d.get(context);
        if (dVar != null) {
            dVar.b();
        }
    }

    synchronized Drawable t(Context context, i1 i1Var, int i10) {
        Drawable drawableR = r(context, i10);
        if (drawableR == null) {
            drawableR = i1Var.a(i10);
        }
        if (drawableR == null) {
            return null;
        }
        return v(context, i10, false, drawableR);
    }

    public synchronized void u(f fVar) {
        this.f1351g = fVar;
    }

    boolean x(Context context, int i10, Drawable drawable) {
        f fVar = this.f1351g;
        return fVar != null && fVar.a(context, i10, drawable);
    }
}
