package androidx.lifecycle;

import androidx.lifecycle.b;
import androidx.lifecycle.j;
import java.lang.reflect.InvocationTargetException;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements l {

    /* renamed from: a, reason: collision with root package name */
    private final Object f3085a;

    /* renamed from: b, reason: collision with root package name */
    private final b.a f3086b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3085a = obj;
        this.f3086b = b.f3097c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.l
    public void d(n nVar, j.b bVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f3086b.a(nVar, bVar, this.f3085a);
    }
}
