package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes.dex */
public final class mv2 {

    /* renamed from: c, reason: collision with root package name */
    private static final mv2 f12263c = new mv2();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f12264a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f12265b = new ArrayList();

    private mv2() {
    }

    public static mv2 a() {
        return f12263c;
    }

    public final Collection b() {
        return Collections.unmodifiableCollection(this.f12265b);
    }

    public final Collection c() {
        return Collections.unmodifiableCollection(this.f12264a);
    }

    public final void d(cv2 cv2Var) {
        this.f12264a.add(cv2Var);
    }

    public final void e(cv2 cv2Var) {
        boolean zG = g();
        this.f12264a.remove(cv2Var);
        this.f12265b.remove(cv2Var);
        if (!zG || g()) {
            return;
        }
        tv2.b().f();
    }

    public final void f(cv2 cv2Var) {
        boolean zG = g();
        this.f12265b.add(cv2Var);
        if (zG) {
            return;
        }
        tv2.b().e();
    }

    public final boolean g() {
        return this.f12265b.size() > 0;
    }
}
