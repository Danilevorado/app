package k2;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n2.k;

/* loaded from: classes.dex */
public abstract class i extends k2.a {

    /* renamed from: r, reason: collision with root package name */
    private static boolean f24588r;

    /* renamed from: s, reason: collision with root package name */
    private static int f24589s = com.bumptech.glide.h.f5380a;

    /* renamed from: m, reason: collision with root package name */
    protected final View f24590m;

    /* renamed from: n, reason: collision with root package name */
    private final a f24591n;

    /* renamed from: o, reason: collision with root package name */
    private View.OnAttachStateChangeListener f24592o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f24593p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f24594q;

    static final class a {

        /* renamed from: e, reason: collision with root package name */
        static Integer f24595e;

        /* renamed from: a, reason: collision with root package name */
        private final View f24596a;

        /* renamed from: b, reason: collision with root package name */
        private final List f24597b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        boolean f24598c;

        /* renamed from: d, reason: collision with root package name */
        private ViewTreeObserverOnPreDrawListenerC0152a f24599d;

        /* renamed from: k2.i$a$a, reason: collision with other inner class name */
        private static final class ViewTreeObserverOnPreDrawListenerC0152a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: m, reason: collision with root package name */
            private final WeakReference f24600m;

            ViewTreeObserverOnPreDrawListenerC0152a(a aVar) {
                this.f24600m = new WeakReference(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = (a) this.f24600m.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(View view) {
            this.f24596a = view;
        }

        private static int c(Context context) {
            if (f24595e == null) {
                Display defaultDisplay = ((WindowManager) k.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f24595e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f24595e.intValue();
        }

        private int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f24598c && this.f24596a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f24596a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f24596a.getContext());
        }

        private int f() {
            int paddingTop = this.f24596a.getPaddingTop() + this.f24596a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f24596a.getLayoutParams();
            return e(this.f24596a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.f24596a.getPaddingLeft() + this.f24596a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f24596a.getLayoutParams();
            return e(this.f24596a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        private boolean i(int i10, int i11) {
            return h(i10) && h(i11);
        }

        private void j(int i10, int i11) {
            Iterator it = new ArrayList(this.f24597b).iterator();
            while (it.hasNext()) {
                ((g) it.next()).f(i10, i11);
            }
        }

        void a() {
            if (this.f24597b.isEmpty()) {
                return;
            }
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                j(iG, iF);
                b();
            }
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.f24596a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f24599d);
            }
            this.f24599d = null;
            this.f24597b.clear();
        }

        void d(g gVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                gVar.f(iG, iF);
                return;
            }
            if (!this.f24597b.contains(gVar)) {
                this.f24597b.add(gVar);
            }
            if (this.f24599d == null) {
                ViewTreeObserver viewTreeObserver = this.f24596a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0152a viewTreeObserverOnPreDrawListenerC0152a = new ViewTreeObserverOnPreDrawListenerC0152a(this);
                this.f24599d = viewTreeObserverOnPreDrawListenerC0152a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0152a);
            }
        }

        void k(g gVar) {
            this.f24597b.remove(gVar);
        }
    }

    public i(View view) {
        this.f24590m = (View) k.d(view);
        this.f24591n = new a(view);
    }

    private Object i() {
        return this.f24590m.getTag(f24589s);
    }

    private void j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f24592o;
        if (onAttachStateChangeListener == null || this.f24594q) {
            return;
        }
        this.f24590m.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f24594q = true;
    }

    private void k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f24592o;
        if (onAttachStateChangeListener == null || !this.f24594q) {
            return;
        }
        this.f24590m.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f24594q = false;
    }

    private void l(Object obj) {
        f24588r = true;
        this.f24590m.setTag(f24589s, obj);
    }

    @Override // k2.h
    public void b(g gVar) {
        this.f24591n.d(gVar);
    }

    @Override // k2.h
    public void c(g gVar) {
        this.f24591n.k(gVar);
    }

    @Override // k2.a, k2.h
    public void d(Drawable drawable) {
        super.d(drawable);
        j();
    }

    @Override // k2.h
    public j2.c e() {
        Object objI = i();
        if (objI == null) {
            return null;
        }
        if (objI instanceof j2.c) {
            return (j2.c) objI;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // k2.a, k2.h
    public void g(Drawable drawable) {
        super.g(drawable);
        this.f24591n.b();
        if (this.f24593p) {
            return;
        }
        k();
    }

    @Override // k2.h
    public void h(j2.c cVar) {
        l(cVar);
    }

    public String toString() {
        return "Target for: " + this.f24590m;
    }
}
