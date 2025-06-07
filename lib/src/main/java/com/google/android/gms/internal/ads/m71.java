package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public class m71 {

    /* renamed from: a, reason: collision with root package name */
    private final int f11977a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11978b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11979c;

    /* renamed from: d, reason: collision with root package name */
    private final int f11980d;

    /* renamed from: e, reason: collision with root package name */
    private int f11981e;

    /* renamed from: f, reason: collision with root package name */
    private int f11982f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f11983g;

    /* renamed from: h, reason: collision with root package name */
    private final c63 f11984h;

    /* renamed from: i, reason: collision with root package name */
    private final c63 f11985i;

    /* renamed from: j, reason: collision with root package name */
    private final int f11986j;

    /* renamed from: k, reason: collision with root package name */
    private final int f11987k;

    /* renamed from: l, reason: collision with root package name */
    private final c63 f11988l;

    /* renamed from: m, reason: collision with root package name */
    private c63 f11989m;

    /* renamed from: n, reason: collision with root package name */
    private int f11990n;

    /* renamed from: o, reason: collision with root package name */
    private final HashMap f11991o;

    /* renamed from: p, reason: collision with root package name */
    private final HashSet f11992p;

    public m71() {
        this.f11977a = Integer.MAX_VALUE;
        this.f11978b = Integer.MAX_VALUE;
        this.f11979c = Integer.MAX_VALUE;
        this.f11980d = Integer.MAX_VALUE;
        this.f11981e = Integer.MAX_VALUE;
        this.f11982f = Integer.MAX_VALUE;
        this.f11983g = true;
        this.f11984h = c63.u();
        this.f11985i = c63.u();
        this.f11986j = Integer.MAX_VALUE;
        this.f11987k = Integer.MAX_VALUE;
        this.f11988l = c63.u();
        this.f11989m = c63.u();
        this.f11990n = 0;
        this.f11991o = new HashMap();
        this.f11992p = new HashSet();
    }

    protected m71(n81 n81Var) {
        this.f11977a = Integer.MAX_VALUE;
        this.f11978b = Integer.MAX_VALUE;
        this.f11979c = Integer.MAX_VALUE;
        this.f11980d = Integer.MAX_VALUE;
        this.f11981e = n81Var.f12493i;
        this.f11982f = n81Var.f12494j;
        this.f11983g = n81Var.f12495k;
        this.f11984h = n81Var.f12496l;
        this.f11985i = n81Var.f12498n;
        this.f11986j = Integer.MAX_VALUE;
        this.f11987k = Integer.MAX_VALUE;
        this.f11988l = n81Var.f12502r;
        this.f11989m = n81Var.f12503s;
        this.f11990n = n81Var.f12504t;
        this.f11992p = new HashSet(n81Var.f12510z);
        this.f11991o = new HashMap(n81Var.f12509y);
    }

    public final m71 d(Context context) {
        CaptioningManager captioningManager;
        if ((sv2.f15560a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f11990n = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f11989m = c63.v(sv2.E(locale));
            }
        }
        return this;
    }

    public m71 e(int i10, int i11, boolean z10) {
        this.f11981e = i10;
        this.f11982f = i11;
        this.f11983g = true;
        return this;
    }
}
