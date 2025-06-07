package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class w33 {

    /* renamed from: a, reason: collision with root package name */
    private final t23 f16948a;

    /* renamed from: b, reason: collision with root package name */
    private final v33 f16949b;

    private w33(v33 v33Var) {
        s23 s23Var = s23.f15071n;
        this.f16949b = v33Var;
        this.f16948a = s23Var;
    }

    public static w33 b(int i10) {
        return new w33(new r33(4000));
    }

    public static w33 c(t23 t23Var) {
        return new w33(new p33(t23Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator g(CharSequence charSequence) {
        return this.f16949b.a(this, charSequence);
    }

    public final Iterable d(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new t33(this, charSequence);
    }

    public final List f(CharSequence charSequence) {
        Iterator itG = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itG.hasNext()) {
            arrayList.add((String) itG.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
