package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xv2 implements vv2 {

    /* renamed from: a, reason: collision with root package name */
    private final vv2 f17823a;

    public xv2(vv2 vv2Var) {
        this.f17823a = vv2Var;
    }

    @Override // com.google.android.gms.internal.ads.vv2
    public final JSONObject a(View view) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.vv2
    public final void b(View view, JSONObject jSONObject, uv2 uv2Var, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        mv2 mv2VarA = mv2.a();
        if (mv2VarA != null) {
            Collection collectionB = mv2VarA.b();
            int size = collectionB.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionB.iterator();
            while (it.hasNext()) {
                View viewF = ((cv2) it.next()).f();
                if (viewF != null && viewF.isAttachedToWindow() && viewF.isShown()) {
                    View view2 = viewF;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewF.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float fA = gw2.a(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i10 = size2 - 1;
                                    if (gw2.a((View) arrayList.get(i10)) <= fA) {
                                        break;
                                    } else {
                                        size2 = i10;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i11 = 0; i11 < size3; i11++) {
            uv2Var.a((View) arrayList.get(i11), this.f17823a, jSONObject, z11);
        }
    }
}
