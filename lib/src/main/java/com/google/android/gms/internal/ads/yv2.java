package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class yv2 implements vv2 {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f18287a = new int[2];

    @Override // com.google.android.gms.internal.ads.vv2
    public final JSONObject a(View view) {
        if (view == null) {
            return dw2.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f18287a);
        int[] iArr = this.f18287a;
        return dw2.a(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.vv2
    public final void b(View view, JSONObject jSONObject, uv2 uv2Var, boolean z10, boolean z11) {
        int i10;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z10) {
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    uv2Var.a(viewGroup.getChildAt(i11), this, jSONObject, z11);
                }
                return;
            }
            HashMap map = new HashMap();
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                View childAt = viewGroup.getChildAt(i12);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                ArrayList arrayList3 = (ArrayList) map.get((Float) arrayList2.get(i13));
                int size2 = arrayList3.size();
                int i14 = 0;
                while (true) {
                    i10 = i13 + 1;
                    if (i14 < size2) {
                        uv2Var.a((View) arrayList3.get(i14), this, jSONObject, z11);
                        i14++;
                    }
                }
                i13 = i10;
            }
        }
    }
}
