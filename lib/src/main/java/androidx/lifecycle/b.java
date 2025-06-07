package androidx.lifecycle;

import androidx.lifecycle.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class b {

    /* renamed from: c, reason: collision with root package name */
    static b f3097c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Map f3098a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f3099b = new HashMap();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Map f3100a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map f3101b;

        a(Map map) {
            this.f3101b = map;
            for (Map.Entry entry : map.entrySet()) {
                j.b bVar = (j.b) entry.getValue();
                List arrayList = (List) this.f3100a.get(bVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f3100a.put(bVar, arrayList);
                }
                arrayList.add((C0046b) entry.getKey());
            }
        }

        private static void b(List list, n nVar, j.b bVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0046b) list.get(size)).a(nVar, bVar, obj);
                }
            }
        }

        void a(n nVar, j.b bVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            b((List) this.f3100a.get(bVar), nVar, bVar, obj);
            b((List) this.f3100a.get(j.b.ON_ANY), nVar, bVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    static final class C0046b {

        /* renamed from: a, reason: collision with root package name */
        final int f3102a;

        /* renamed from: b, reason: collision with root package name */
        final Method f3103b;

        C0046b(int i10, Method method) {
            this.f3102a = i10;
            this.f3103b = method;
            method.setAccessible(true);
        }

        void a(n nVar, j.b bVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                int i10 = this.f3102a;
                if (i10 == 0) {
                    this.f3103b.invoke(obj, new Object[0]);
                } else if (i10 == 1) {
                    this.f3103b.invoke(obj, nVar);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f3103b.invoke(obj, nVar, bVar);
                }
            } catch (IllegalAccessException e5) {
                throw new RuntimeException(e5);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Failed to call observer method", e10.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0046b)) {
                return false;
            }
            C0046b c0046b = (C0046b) obj;
            return this.f3102a == c0046b.f3102a && this.f3103b.getName().equals(c0046b.f3103b.getName());
        }

        public int hashCode() {
            return (this.f3102a * 31) + this.f3103b.getName().hashCode();
        }
    }

    b() {
    }

    private a a(Class cls, Method[] methodArr) {
        int i10;
        a aVarC;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f3101b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f3101b.entrySet()) {
                e(map, (C0046b) entry.getKey(), (j.b) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            u uVar = (u) method.getAnnotation(u.class);
            if (uVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(n.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                j.b bVarValue = uVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(j.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (bVarValue != j.b.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new C0046b(i10, method), bVarValue, cls);
                z10 = true;
            }
        }
        a aVar = new a(map);
        this.f3098a.put(cls, aVar);
        this.f3099b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e5) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e5);
        }
    }

    private void e(Map map, C0046b c0046b, j.b bVar, Class cls) {
        j.b bVar2 = (j.b) map.get(c0046b);
        if (bVar2 == null || bVar == bVar2) {
            if (bVar2 == null) {
                map.put(c0046b, bVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0046b.f3103b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar2 + ", new value " + bVar);
    }

    a c(Class cls) {
        a aVar = (a) this.f3098a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class cls) {
        Boolean bool = (Boolean) this.f3099b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((u) method.getAnnotation(u.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f3099b.put(cls, Boolean.FALSE);
        return false;
    }
}
