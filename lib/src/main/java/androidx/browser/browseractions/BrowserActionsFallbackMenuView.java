package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import m.a;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: m, reason: collision with root package name */
    private final int f1531m;

    /* renamed from: n, reason: collision with root package name */
    private final int f1532n;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1531m = getResources().getDimensionPixelOffset(a.f25160b);
        this.f1532n = getResources().getDimensionPixelOffset(a.f25159a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1531m * 2), this.f1532n), 1073741824), i11);
    }
}
