package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class i {

    /* renamed from: n, reason: collision with root package name */
    static final int f21069n = 1;

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f21070a;

    /* renamed from: b, reason: collision with root package name */
    private final TextPaint f21071b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21072c;

    /* renamed from: e, reason: collision with root package name */
    private int f21074e;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21081l;

    /* renamed from: d, reason: collision with root package name */
    private int f21073d = 0;

    /* renamed from: f, reason: collision with root package name */
    private Layout.Alignment f21075f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g, reason: collision with root package name */
    private int f21076g = Integer.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    private float f21077h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    private float f21078i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    private int f21079j = f21069n;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21080k = true;

    /* renamed from: m, reason: collision with root package name */
    private TextUtils.TruncateAt f21082m = null;

    static class a extends Exception {
    }

    private i(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f21070a = charSequence;
        this.f21071b = textPaint;
        this.f21072c = i10;
        this.f21074e = charSequence.length();
    }

    public static i b(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new i(charSequence, textPaint, i10);
    }

    public StaticLayout a() {
        if (this.f21070a == null) {
            this.f21070a = "";
        }
        int iMax = Math.max(0, this.f21072c);
        CharSequence charSequenceEllipsize = this.f21070a;
        if (this.f21076g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f21071b, iMax, this.f21082m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f21074e);
        this.f21074e = iMin;
        if (this.f21081l && this.f21076g == 1) {
            this.f21075f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f21073d, iMin, this.f21071b, iMax);
        builderObtain.setAlignment(this.f21075f);
        builderObtain.setIncludePad(this.f21080k);
        builderObtain.setTextDirection(this.f21081l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f21082m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f21076g);
        float f5 = this.f21077h;
        if (f5 != 0.0f || this.f21078i != 1.0f) {
            builderObtain.setLineSpacing(f5, this.f21078i);
        }
        if (this.f21076g > 1) {
            builderObtain.setHyphenationFrequency(this.f21079j);
        }
        return builderObtain.build();
    }

    public i c(Layout.Alignment alignment) {
        this.f21075f = alignment;
        return this;
    }

    public i d(TextUtils.TruncateAt truncateAt) {
        this.f21082m = truncateAt;
        return this;
    }

    public i e(int i10) {
        this.f21079j = i10;
        return this;
    }

    public i f(boolean z10) {
        this.f21080k = z10;
        return this;
    }

    public i g(boolean z10) {
        this.f21081l = z10;
        return this;
    }

    public i h(float f5, float f10) {
        this.f21077h = f5;
        this.f21078i = f10;
        return this;
    }

    public i i(int i10) {
        this.f21076g = i10;
        return this;
    }
}
