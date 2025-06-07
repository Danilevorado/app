package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class iw2 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f10196a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f10197b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f10198c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f10199d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet f10200e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet f10201f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f10202g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Map f10203h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    private boolean f10204i;

    public final View a(String str) {
        return (View) this.f10198c.get(str);
    }

    public final hw2 b(View view) {
        hw2 hw2Var = (hw2) this.f10197b.get(view);
        if (hw2Var != null) {
            this.f10197b.remove(view);
        }
        return hw2Var;
    }

    public final String c(String str) {
        return (String) this.f10202g.get(str);
    }

    public final String d(View view) {
        if (this.f10196a.size() == 0) {
            return null;
        }
        String str = (String) this.f10196a.get(view);
        if (str != null) {
            this.f10196a.remove(view);
        }
        return str;
    }

    public final HashSet e() {
        return this.f10201f;
    }

    public final HashSet f() {
        return this.f10200e;
    }

    public final void g() {
        this.f10196a.clear();
        this.f10197b.clear();
        this.f10198c.clear();
        this.f10199d.clear();
        this.f10200e.clear();
        this.f10201f.clear();
        this.f10202g.clear();
        this.f10204i = false;
    }

    public final void h() {
        this.f10204i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        Boolean bool;
        mv2 mv2VarA = mv2.a();
        if (mv2VarA != null) {
            for (cv2 cv2Var : mv2VarA.b()) {
                View viewF = cv2Var.f();
                if (cv2Var.j()) {
                    String strH = cv2Var.h();
                    if (viewF != null) {
                        String str = null;
                        if (viewF.isAttachedToWindow()) {
                            if (viewF.hasWindowFocus()) {
                                this.f10203h.remove(viewF);
                                bool = Boolean.FALSE;
                            } else if (this.f10203h.containsKey(viewF)) {
                                bool = (Boolean) this.f10203h.get(viewF);
                            } else {
                                Map map = this.f10203h;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(viewF, bool2);
                                bool = bool2;
                            }
                            if (bool.booleanValue()) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view = viewF;
                                while (true) {
                                    if (view == null) {
                                        this.f10199d.addAll(hashSet);
                                        break;
                                    }
                                    String strB = gw2.b(view);
                                    if (strB != null) {
                                        str = strB;
                                        break;
                                    } else {
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.f10200e.add(strH);
                            this.f10196a.put(viewF, strH);
                            for (ov2 ov2Var : cv2Var.i()) {
                                View view2 = (View) ov2Var.b().get();
                                if (view2 != null) {
                                    hw2 hw2Var = (hw2) this.f10197b.get(view2);
                                    if (hw2Var != null) {
                                        hw2Var.c(cv2Var.h());
                                    } else {
                                        this.f10197b.put(view2, new hw2(ov2Var, cv2Var.h()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f10201f.add(strH);
                            this.f10198c.put(strH, viewF);
                            this.f10202g.put(strH, str);
                        }
                    } else {
                        this.f10201f.add(strH);
                        this.f10202g.put(strH, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean j(View view) {
        if (!this.f10203h.containsKey(view)) {
            return true;
        }
        this.f10203h.put(view, Boolean.TRUE);
        return false;
    }

    public final int k(View view) {
        if (this.f10199d.contains(view)) {
            return 1;
        }
        return this.f10204i ? 2 : 3;
    }
}
