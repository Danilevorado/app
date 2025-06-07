package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class d implements DynamiteModule.b {
    d() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0095b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0095b c0095b = new DynamiteModule.b.C0095b();
        int iB = aVar.b(context, str, true);
        c0095b.f5870b = iB;
        if (iB != 0) {
            c0095b.f5871c = 1;
        } else {
            int iA = aVar.a(context, str);
            c0095b.f5869a = iA;
            if (iA != 0) {
                c0095b.f5871c = -1;
            }
        }
        return c0095b;
    }
}
