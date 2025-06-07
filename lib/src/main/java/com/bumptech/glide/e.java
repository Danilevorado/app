package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final Map f5368a;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map f5369a = new HashMap();

        a() {
        }

        e b() {
            return new e(this);
        }
    }

    e(a aVar) {
        this.f5368a = Collections.unmodifiableMap(new HashMap(aVar.f5369a));
    }

    public boolean a(Class cls) {
        return this.f5368a.containsKey(cls);
    }
}
