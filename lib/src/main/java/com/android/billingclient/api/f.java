package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private String f5207a;

    /* renamed from: b, reason: collision with root package name */
    private List f5208b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f5209a;

        /* renamed from: b, reason: collision with root package name */
        private List f5210b;

        /* synthetic */ a(k1.z zVar) {
        }

        public f a() {
            String str = this.f5209a;
            if (str == null) {
                throw new IllegalArgumentException("SKU type must be set");
            }
            if (this.f5210b == null) {
                throw new IllegalArgumentException("SKU list must be set");
            }
            f fVar = new f();
            fVar.f5207a = str;
            fVar.f5208b = this.f5210b;
            return fVar;
        }

        public a b(List list) {
            this.f5210b = new ArrayList(list);
            return this;
        }

        public a c(String str) {
            this.f5209a = str;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.f5207a;
    }

    public List b() {
        return this.f5208b;
    }
}
