package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import t0.c;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: f, reason: collision with root package name */
    public static final a f3173f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Class[] f3174g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    private final Map f3175a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f3176b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f3177c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f3178d;

    /* renamed from: e, reason: collision with root package name */
    private final c.InterfaceC0188c f3179e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(rb.f fVar) {
            this();
        }

        public final y a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new y();
                }
                HashMap map = new HashMap();
                for (String str : bundle2.keySet()) {
                    rb.h.d(str, "key");
                    map.put(str, bundle2.get(str));
                }
                return new y(map);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (!((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true)) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new y(linkedHashMap);
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : y.f3174g) {
                rb.h.b(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public y() {
        this.f3175a = new LinkedHashMap();
        this.f3176b = new LinkedHashMap();
        this.f3177c = new LinkedHashMap();
        this.f3178d = new LinkedHashMap();
        this.f3179e = new c.InterfaceC0188c() { // from class: androidx.lifecycle.x
            @Override // t0.c.InterfaceC0188c
            public final Bundle a() {
                return y.e(this.f3172a);
            }
        };
    }

    public y(Map map) {
        rb.h.e(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3175a = linkedHashMap;
        this.f3176b = new LinkedHashMap();
        this.f3177c = new LinkedHashMap();
        this.f3178d = new LinkedHashMap();
        this.f3179e = new c.InterfaceC0188c() { // from class: androidx.lifecycle.x
            @Override // t0.c.InterfaceC0188c
            public final Bundle a() {
                return y.e(this.f3172a);
            }
        };
        linkedHashMap.putAll(map);
    }

    public static final y c(Bundle bundle, Bundle bundle2) {
        return f3173f.a(bundle, bundle2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle e(y yVar) {
        rb.h.e(yVar, "this$0");
        for (Map.Entry entry : ib.a0.j(yVar.f3176b).entrySet()) {
            yVar.f((String) entry.getKey(), ((c.InterfaceC0188c) entry.getValue()).a());
        }
        Set<String> setKeySet = yVar.f3175a.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(yVar.f3175a.get(str));
        }
        return androidx.core.os.d.a(hb.o.a("keys", arrayList), hb.o.a("values", arrayList2));
    }

    public final c.InterfaceC0188c d() {
        return this.f3179e;
    }

    public final void f(String str, Object obj) {
        rb.h.e(str, "key");
        if (!f3173f.b(obj)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't put value with type ");
            rb.h.b(obj);
            sb2.append(obj.getClass());
            sb2.append(" into saved state");
            throw new IllegalArgumentException(sb2.toString());
        }
        Object obj2 = this.f3177c.get(str);
        s sVar = obj2 instanceof s ? (s) obj2 : null;
        if (sVar != null) {
            sVar.k(obj);
        } else {
            this.f3175a.put(str, obj);
        }
        ac.a aVar = (ac.a) this.f3178d.get(str);
        if (aVar == null) {
            return;
        }
        aVar.setValue(obj);
    }
}
