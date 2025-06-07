package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.l;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f2110a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f2111b = new Object();

    static Bundle a(l.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = aVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.e() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(q qVar) {
        new Bundle();
        throw null;
    }

    private static Bundle[] c(q[] qVarArr) {
        if (qVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[qVarArr.length];
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            q qVar = qVarArr[i10];
            bundleArr[i10] = b(null);
        }
        return bundleArr;
    }
}
