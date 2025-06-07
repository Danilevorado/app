package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    private TypedValue f965m;

    /* renamed from: n, reason: collision with root package name */
    private TypedValue f966n;

    /* renamed from: o, reason: collision with root package name */
    private TypedValue f967o;

    /* renamed from: p, reason: collision with root package name */
    private TypedValue f968p;

    /* renamed from: q, reason: collision with root package name */
    private TypedValue f969q;

    /* renamed from: r, reason: collision with root package name */
    private TypedValue f970r;

    /* renamed from: s, reason: collision with root package name */
    private final Rect f971s;

    /* renamed from: t, reason: collision with root package name */
    private a f972t;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f971s = new Rect();
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f971s.set(i10, i11, i12, i13);
        if (androidx.core.view.w.S(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f969q == null) {
            this.f969q = new TypedValue();
        }
        return this.f969q;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f970r == null) {
            this.f970r = new TypedValue();
        }
        return this.f970r;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f967o == null) {
            this.f967o = new TypedValue();
        }
        return this.f967o;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f968p == null) {
            this.f968p = new TypedValue();
        }
        return this.f968p;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f965m == null) {
            this.f965m = new TypedValue();
        }
        return this.f965m;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f966n == null) {
            this.f966n = new TypedValue();
        }
        return this.f966n;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f972t;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f972t;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f972t = aVar;
    }
}
