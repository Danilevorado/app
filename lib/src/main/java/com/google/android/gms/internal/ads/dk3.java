package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class dk3 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f7390a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f7391b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f7392c;

    protected dk3(Class cls, cl3... cl3VarArr) {
        this.f7390a = cls;
        HashMap map = new HashMap();
        for (int i10 = 0; i10 <= 0; i10++) {
            cl3 cl3Var = cl3VarArr[i10];
            if (map.containsKey(cl3Var.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(cl3Var.b().getCanonicalName())));
            }
            map.put(cl3Var.b(), cl3Var);
        }
        this.f7392c = cl3VarArr[0].b();
        this.f7391b = Collections.unmodifiableMap(map);
    }

    public ck3 a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract ms3 b();

    public abstract jz3 c(ww3 ww3Var);

    public abstract String d();

    public abstract void e(jz3 jz3Var);

    public int f() {
        return 1;
    }

    public final Class g() {
        return this.f7392c;
    }

    public final Class h() {
        return this.f7390a;
    }

    public final Object i(jz3 jz3Var, Class cls) {
        cl3 cl3Var = (cl3) this.f7391b.get(cls);
        if (cl3Var != null) {
            return cl3Var.a(jz3Var);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public final Set j() {
        return this.f7391b.keySet();
    }
}
