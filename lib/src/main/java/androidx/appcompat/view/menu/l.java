package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;
import androidx.core.view.w;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final Context f890a;

    /* renamed from: b, reason: collision with root package name */
    private final g f891b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f892c;

    /* renamed from: d, reason: collision with root package name */
    private final int f893d;

    /* renamed from: e, reason: collision with root package name */
    private final int f894e;

    /* renamed from: f, reason: collision with root package name */
    private View f895f;

    /* renamed from: g, reason: collision with root package name */
    private int f896g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f897h;

    /* renamed from: i, reason: collision with root package name */
    private m.a f898i;

    /* renamed from: j, reason: collision with root package name */
    private k f899j;

    /* renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f900k;

    /* renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f901l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l.this.e();
        }
    }

    static class b {
        static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public l(Context context, g gVar, View view, boolean z10, int i10) {
        this(context, gVar, view, z10, i10, 0);
    }

    public l(Context context, g gVar, View view, boolean z10, int i10, int i11) {
        this.f896g = 8388611;
        this.f901l = new a();
        this.f890a = context;
        this.f891b = gVar;
        this.f895f = view;
        this.f892c = z10;
        this.f893d = i10;
        this.f894e = i11;
    }

    private k a() {
        Display defaultDisplay = ((WindowManager) this.f890a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        b.a(defaultDisplay, point);
        k dVar = Math.min(point.x, point.y) >= this.f890a.getResources().getDimensionPixelSize(f.d.f23323a) ? new d(this.f890a, this.f895f, this.f893d, this.f894e, this.f892c) : new q(this.f890a, this.f891b, this.f895f, this.f893d, this.f894e, this.f892c);
        dVar.k(this.f891b);
        dVar.t(this.f901l);
        dVar.o(this.f895f);
        dVar.j(this.f898i);
        dVar.q(this.f897h);
        dVar.r(this.f896g);
        return dVar;
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        k kVarC = c();
        kVarC.u(z11);
        if (z10) {
            if ((androidx.core.view.e.b(this.f896g, w.B(this.f895f)) & 7) == 5) {
                i10 -= this.f895f.getWidth();
            }
            kVarC.s(i10);
            kVarC.v(i11);
            int i12 = (int) ((this.f890a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            kVarC.p(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        kVarC.show();
    }

    public void b() {
        if (d()) {
            this.f899j.dismiss();
        }
    }

    public k c() {
        if (this.f899j == null) {
            this.f899j = a();
        }
        return this.f899j;
    }

    public boolean d() {
        k kVar = this.f899j;
        return kVar != null && kVar.b();
    }

    protected void e() {
        this.f899j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f900k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f895f = view;
    }

    public void g(boolean z10) {
        this.f897h = z10;
        k kVar = this.f899j;
        if (kVar != null) {
            kVar.q(z10);
        }
    }

    public void h(int i10) {
        this.f896g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f900k = onDismissListener;
    }

    public void j(m.a aVar) {
        this.f898i = aVar;
        k kVar = this.f899j;
        if (kVar != null) {
            kVar.j(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f895f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f895f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }
}
