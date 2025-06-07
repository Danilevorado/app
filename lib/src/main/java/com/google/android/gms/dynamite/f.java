package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes.dex */
final class f implements DynamiteModule.b {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0095b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0095b c0095b = new DynamiteModule.b.C0095b();
        int iB = aVar.b(context, str, false);
        c0095b.f5870b = iB;
        c0095b.f5871c = iB != 0 ? 1 : 0;
        return c0095b;
    }
}
