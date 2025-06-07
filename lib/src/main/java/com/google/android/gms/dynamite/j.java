package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class j implements DynamiteModule.b {
    j() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0095b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0095b c0095b = new DynamiteModule.b.C0095b();
        int iA = aVar.a(context, str);
        c0095b.f5869a = iA;
        int i10 = 1;
        int i11 = 0;
        int iB = iA != 0 ? aVar.b(context, str, false) : aVar.b(context, str, true);
        c0095b.f5870b = iB;
        int i12 = c0095b.f5869a;
        if (i12 == 0) {
            if (iB == 0) {
                i10 = 0;
            }
            c0095b.f5871c = i10;
            return c0095b;
        }
        i11 = i12;
        if (iB < i11) {
            i10 = -1;
        }
        c0095b.f5871c = i10;
        return c0095b;
    }
}
