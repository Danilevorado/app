package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class cv2 extends yu2 {

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f7092i = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    private final av2 f7093a;

    /* renamed from: b, reason: collision with root package name */
    private final zu2 f7094b;

    /* renamed from: d, reason: collision with root package name */
    private ww2 f7096d;

    /* renamed from: e, reason: collision with root package name */
    private zv2 f7097e;

    /* renamed from: c, reason: collision with root package name */
    private final List f7095c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private boolean f7098f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7099g = false;

    /* renamed from: h, reason: collision with root package name */
    private final String f7100h = UUID.randomUUID().toString();

    cv2(zu2 zu2Var, av2 av2Var) {
        this.f7094b = zu2Var;
        this.f7093a = av2Var;
        k(null);
        if (av2Var.d() == bv2.HTML || av2Var.d() == bv2.JAVASCRIPT) {
            this.f7097e = new aw2(av2Var.a());
        } else {
            this.f7097e = new cw2(av2Var.i(), null);
        }
        this.f7097e.j();
        mv2.a().d(this);
        rv2.a().d(this.f7097e.a(), zu2Var.b());
    }

    private final void k(View view) {
        this.f7096d = new ww2(view);
    }

    @Override // com.google.android.gms.internal.ads.yu2
    public final void b(View view, ev2 ev2Var, String str) {
        ov2 ov2Var;
        if (this.f7099g) {
            return;
        }
        if (!f7092i.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        Iterator it = this.f7095c.iterator();
        while (true) {
            if (!it.hasNext()) {
                ov2Var = null;
                break;
            } else {
                ov2Var = (ov2) it.next();
                if (ov2Var.b().get() == view) {
                    break;
                }
            }
        }
        if (ov2Var == null) {
            this.f7095c.add(new ov2(view, ev2Var, "Ad overlay"));
        }
    }

    @Override // com.google.android.gms.internal.ads.yu2
    public final void c() {
        if (this.f7099g) {
            return;
        }
        this.f7096d.clear();
        if (!this.f7099g) {
            this.f7095c.clear();
        }
        this.f7099g = true;
        rv2.a().c(this.f7097e.a());
        mv2.a().e(this);
        this.f7097e.c();
        this.f7097e = null;
    }

    @Override // com.google.android.gms.internal.ads.yu2
    public final void d(View view) {
        if (this.f7099g || f() == view) {
            return;
        }
        k(view);
        this.f7097e.b();
        Collection<cv2> collectionC = mv2.a().c();
        if (collectionC == null || collectionC.isEmpty()) {
            return;
        }
        for (cv2 cv2Var : collectionC) {
            if (cv2Var != this && cv2Var.f() == view) {
                cv2Var.f7096d.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yu2
    public final void e() {
        if (this.f7098f) {
            return;
        }
        this.f7098f = true;
        mv2.a().f(this);
        this.f7097e.h(tv2.b().a());
        this.f7097e.f(this, this.f7093a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View f() {
        return (View) this.f7096d.get();
    }

    public final zv2 g() {
        return this.f7097e;
    }

    public final String h() {
        return this.f7100h;
    }

    public final List i() {
        return this.f7095c;
    }

    public final boolean j() {
        return this.f7098f && !this.f7099g;
    }
}
