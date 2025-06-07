package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.ads.AdError;

/* loaded from: classes.dex */
class h1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1221a;

    /* renamed from: b, reason: collision with root package name */
    private final View f1222b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f1223c;

    /* renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f1224d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f1225e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f1226f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f1227g;

    h1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1224d = layoutParams;
        this.f1225e = new Rect();
        this.f1226f = new int[2];
        this.f1227g = new int[2];
        this.f1221a = context;
        View viewInflate = LayoutInflater.from(context).inflate(f.g.f23406s, (ViewGroup) null);
        this.f1222b = viewInflate;
        this.f1223c = (TextView) viewInflate.findViewById(f.f.f23380s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = f.i.f23420a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) throws Resources.NotFoundException {
        int height;
        int i12;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1221a.getResources().getDimensionPixelOffset(f.d.f23333k);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1221a.getResources().getDimensionPixelOffset(f.d.f23332j);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1221a.getResources().getDimensionPixelOffset(z10 ? f.d.f23335m : f.d.f23334l);
        View viewB = b(view);
        if (viewB == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f1225e);
        Rect rect = this.f1225e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1221a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1225e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.f1227g);
        view.getLocationOnScreen(this.f1226f);
        int[] iArr = this.f1226f;
        int i13 = iArr[0];
        int[] iArr2 = this.f1227g;
        iArr[0] = i13 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i10) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1222b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f1222b.getMeasuredHeight();
        int[] iArr3 = this.f1226f;
        int i14 = ((iArr3[1] + i12) - dimensionPixelOffset3) - measuredHeight;
        int i15 = iArr3[1] + height + dimensionPixelOffset3;
        if (!z10 ? measuredHeight + i15 <= this.f1225e.height() : i14 < 0) {
            layoutParams.y = i14;
        } else {
            layoutParams.y = i15;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((WindowManager) this.f1221a.getSystemService("window")).removeView(this.f1222b);
        }
    }

    boolean d() {
        return this.f1222b.getParent() != null;
    }

    void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) throws Resources.NotFoundException {
        if (d()) {
            c();
        }
        this.f1223c.setText(charSequence);
        a(view, i10, i11, z10, this.f1224d);
        ((WindowManager) this.f1221a.getSystemService("window")).addView(this.f1222b, this.f1224d);
    }
}
